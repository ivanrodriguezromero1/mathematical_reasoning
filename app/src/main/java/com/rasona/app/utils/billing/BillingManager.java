package com.rasona.app.utils.billing;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import com.android.billingclient.api.*;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;

public class BillingManager implements PurchasesUpdatedListener {

    private static final String TAG = "BillingManager";
    private static final String SUBSCRIPTION_ID = "monthly-basic-plan";
    private final BillingClient billingClient;
    private final Context context;
    private boolean isSubscribed = false;

    public BillingManager(Context context) {
        this.context = context;
        billingClient = BillingClient.newBuilder(context)
                .setListener(this)
                .enablePendingPurchases()
                .build();
        connectToGooglePlay();
    }

    private void connectToGooglePlay() {
        try {
            billingClient.startConnection(new BillingClientStateListener() {
                @Override
                public void onBillingSetupFinished(@NotNull BillingResult billingResult) {
                    if (billingResult.getResponseCode() == BillingClient.BillingResponseCode.OK) {
                        Log.d(TAG, "Billing client setup finished successfully.");
                        checkSubscriptionStatus();
                    } else {
                        Log.e(TAG, "Error setting up billing client: " + billingResult.getDebugMessage());
                    }
                }

                @Override
                public void onBillingServiceDisconnected() {
                    Log.e(TAG, "Billing service disconnected. Attempting to reconnect...");
                    connectToGooglePlay();
                }
            });
        } catch (Exception e) {
            Log.e(TAG, "Failed to connect to Google Play for billing setup.", e);
            Toast.makeText(context, "Billing setup failed. Please try again later.", Toast.LENGTH_SHORT).show();
        }
    }

    private void checkSubscriptionStatus() {
        try {
            billingClient.queryPurchasesAsync(
                    QueryPurchasesParams.newBuilder().setProductType(BillingClient.ProductType.SUBS).build(),
                    (billingResult, purchases) -> {
                        isSubscribed = false;
                        if (billingResult.getResponseCode() == BillingClient.BillingResponseCode.OK && purchases != null) {
                            for (Purchase purchase : purchases) {
                                if (purchase.getProducts().contains(SUBSCRIPTION_ID) && purchase.getPurchaseState() == Purchase.PurchaseState.PURCHASED) {
                                    isSubscribed = true;
                                }
                            }
                        } else {
                            Log.e(TAG, "Failed to query purchases: " + billingResult.getDebugMessage());
                        }
                    }
            );
        } catch (Exception e) {
            Log.e(TAG, "Failed to check subscription status.", e);
            Toast.makeText(context, "Error checking subscription status.", Toast.LENGTH_SHORT).show();
        }
    }

    public void startSubscription(Activity activity) {
        try {
            List<QueryProductDetailsParams.Product> productList = Collections.singletonList(
                    QueryProductDetailsParams.Product.newBuilder()
                            .setProductId(SUBSCRIPTION_ID)
                            .setProductType(BillingClient.ProductType.SUBS)
                            .build()
            );

            QueryProductDetailsParams params = QueryProductDetailsParams.newBuilder()
                    .setProductList(productList)
                    .build();

            billingClient.queryProductDetailsAsync(params, (billingResult, productDetailsList) -> {
                if (billingResult.getResponseCode() == BillingClient.BillingResponseCode.OK && !productDetailsList.isEmpty()) {
                    ProductDetails productDetails = productDetailsList.get(0);

                    List<ProductDetails.SubscriptionOfferDetails> offerDetailsList = productDetails.getSubscriptionOfferDetails();
                    if (offerDetailsList != null && !offerDetailsList.isEmpty()) {
                        ProductDetails.SubscriptionOfferDetails offerDetails = offerDetailsList.get(0);

                        BillingFlowParams billingFlowParams = BillingFlowParams.newBuilder()
                                .setProductDetailsParamsList(
                                        Collections.singletonList(
                                                BillingFlowParams.ProductDetailsParams.newBuilder()
                                                        .setProductDetails(productDetails)
                                                        .setOfferToken(offerDetails.getOfferToken())
                                                        .build()
                                        )
                                )
                                .build();

                        billingClient.launchBillingFlow(activity, billingFlowParams);
                    } else {
                        Log.i(TAG, "No subscription offer details found for the product.");
                        activity.runOnUiThread(() ->
                                Toast.makeText(activity, "Subscription is not available at the moment.", Toast.LENGTH_SHORT).show()
                        );
                    }
                } else {
                    Log.i(TAG, "Failed to query product details: " + billingResult.getDebugMessage());
                    activity.runOnUiThread(() ->
                            Toast.makeText(activity, "Subscription is not available at the moment.", Toast.LENGTH_SHORT).show()
                    );
                }
            });
        } catch (Exception e) {
            Log.e(TAG, "Error starting subscription.", e);
            Toast.makeText(activity, "An error occurred while starting the subscription process.", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean isSubscribed() {
        return isSubscribed;
    }

    @Override
    public void onPurchasesUpdated(@NotNull BillingResult billingResult, List<Purchase> purchases) {
        try {
            if (billingResult.getResponseCode() == BillingClient.BillingResponseCode.OK && purchases != null) {
                for (Purchase purchase : purchases) {
                    if (purchase.getProducts().contains(SUBSCRIPTION_ID)) {
                        isSubscribed = true;
                        Log.d(TAG, "Purchase updated: User is subscribed.");
                    }
                }
            } else if (billingResult.getResponseCode() == BillingClient.BillingResponseCode.USER_CANCELED) {
                Log.d(TAG, "Purchase canceled by user.");
            } else {
                Log.e(TAG, "Purchase update failed: " + billingResult.getDebugMessage());
            }
        } catch (Exception e) {
            Log.e(TAG, "Error handling purchase update.", e);
            Toast.makeText(context, "An error occurred while updating purchases.", Toast.LENGTH_SHORT).show();
        }
    }
}

package com.rasona.rasona.utils.billing;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.android.billingclient.api.*;
import com.rasona.rasona.activities.ItemAdapter;

import java.util.Collections;
import java.util.List;

public class BillingManager implements PurchasesUpdatedListener {

    private static final String TAG = "BillingManager";
    private static final String SUBSCRIPTION_ID = "rasona_monthly_subscription";
    private final BillingClient billingClient;
    private final Context context;
    private boolean isSubscribed = false;
    private ItemAdapter adapter; // Store reference to adapter

    public BillingManager(Context context) {
        this.context = context;
        billingClient = BillingClient.newBuilder(context)
                .setListener(this)
                .enablePendingPurchases()
                .build();
        connectToGooglePlay();
    }

    private void connectToGooglePlay() {
        billingClient.startConnection(new BillingClientStateListener() {
            @Override
            public void onBillingSetupFinished(BillingResult billingResult) {
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
    }

    private void checkSubscriptionStatus() {
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
    }

    public void startSubscription(Activity activity, ItemAdapter adapter) {
        this.adapter = adapter; // Save reference to adapter
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
                    Log.e(TAG, "No subscription offer details found for the product.");
                }
            } else {
                Log.e(TAG, "Failed to query product details: " + billingResult.getDebugMessage());
            }
        });
    }

    public boolean isSubscribed() {
        return isSubscribed;
    }

    @Override
    public void onPurchasesUpdated(BillingResult billingResult, List<Purchase> purchases) {
        if (billingResult.getResponseCode() == BillingClient.BillingResponseCode.OK && purchases != null) {
            for (Purchase purchase : purchases) {
                if (purchase.getProducts().contains(SUBSCRIPTION_ID)) {
                    isSubscribed = true;
                    if (adapter != null) {
                        adapter.updateSubscriptionStatus(true);
                    }
                    Log.d(TAG, "Purchase updated: User is subscribed.");
                }
            }
        } else if (billingResult.getResponseCode() == BillingClient.BillingResponseCode.USER_CANCELED) {
            Log.d(TAG, "Purchase canceled by user.");
        } else {
            Log.e(TAG, "Purchase update failed: " + billingResult.getDebugMessage());
        }
    }
}

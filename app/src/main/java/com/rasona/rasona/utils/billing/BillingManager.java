package com.rasona.rasona.utils.billing;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.android.billingclient.api.*;

import java.util.Collections;
import java.util.List;

public class BillingManager implements PurchasesUpdatedListener {

    private static final String TAG = "BillingManager";
    private static final String SUBSCRIPTION_ID = "monthly_subscription";
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
                Log.e(TAG, "Billing service disconnected");
            }
        });
    }

    private void checkSubscriptionStatus() {
        Log.d(TAG, "Checking subscription status...");
        billingClient.queryPurchasesAsync(
                QueryPurchasesParams.newBuilder().setProductType(BillingClient.ProductType.SUBS).build(),
                (billingResult, purchases) -> {
                    Log.d(TAG, "queryPurchasesAsync response code: " + billingResult.getResponseCode());
                    isSubscribed = false;
                    if (billingResult.getResponseCode() == BillingClient.BillingResponseCode.OK && purchases != null) {
                        for (Purchase purchase : purchases) {
                            Log.d(TAG, "Purchase found: " + purchase.getProducts());
                            if (purchase.getProducts().contains(SUBSCRIPTION_ID) && purchase.getPurchaseState() == Purchase.PurchaseState.PURCHASED) {
                                isSubscribed = true;
                                Log.d(TAG, "User is subscribed.");
                            }
                        }
                    } else {
                        Log.e(TAG, "Failed to query purchases: " + billingResult.getDebugMessage());
                    }
                }
        );
    }

    public void startSubscription(Activity activity) {
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
            if (billingResult.getResponseCode() == BillingClient.BillingResponseCode.OK && productDetailsList != null && !productDetailsList.isEmpty()) {
                ProductDetails productDetails = productDetailsList.get(0);
                BillingFlowParams billingFlowParams = BillingFlowParams.newBuilder()
                        .setProductDetailsParamsList(
                                Collections.singletonList(
                                        BillingFlowParams.ProductDetailsParams.newBuilder()
                                                .setProductDetails(productDetails)
                                                .build()
                                )
                        )
                        .build();
                billingClient.launchBillingFlow(activity, billingFlowParams);
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
                }
            }
        }
    }
}

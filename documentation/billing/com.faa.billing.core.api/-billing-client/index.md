//[billing](../../../index.md)/[com.faa.billing.core.api](../index.md)/[BillingClient](index.md)

# BillingClient

class [BillingClient](index.md) : BillingServiceConnectionDelegate, BillingDataSourceDelegate

Creates an instance. After creation, it will not yet be ready to use. You must perform setup by calling .startSetup and wait for setup to complete. This constructor does not block and is safe to call from a UI thread.

#### Parameters

androidJvm

| | |
|---|---|
| billingClientSettings | [BillingClientSettings](../../com.faa.billing.core.settings/-billing-client-settings/index.md) Runtime settings for the [BillingClient](index.md). |

## Constructors

| | |
|---|---|
| [BillingClient](-billing-client.md) | [androidJvm]<br>constructor(billingClientSettings: [BillingClientSettings](../../com.faa.billing.core.settings/-billing-client-settings/index.md)) |

## Functions

| Name | Summary |
|---|---|
| [acknowledgePurchase](../acknowledge-purchase.md) | [androidJvm]<br>suspend fun [BillingClient](index.md).[acknowledgePurchase](../acknowledge-purchase.md)(params: [AcknowledgePurchaseParams](../-acknowledge-purchase-params/index.md)): [BillingResponseCode](../-billing-response-code/index.md) |
| [consumePurchase](../consume-purchase.md) | [androidJvm]<br>suspend fun [BillingClient](index.md).[consumePurchase](../consume-purchase.md)(params: [ConsumePurchaseParams](../-consume-purchase-params/index.md)): [BillingResponseCode](../-billing-response-code/index.md) |
| [queryProductDetails](../query-product-details.md) | [androidJvm]<br>suspend fun [BillingClient](index.md).[queryProductDetails](../query-product-details.md)(params: [QueryProductDetailsParams](../-query-product-details-params/index.md)): [ProductDetailsResult](../-product-details-result/index.md) |
| [queryPurchases](../query-purchases.md) | [androidJvm]<br>suspend fun [BillingClient](index.md).[queryPurchases](../query-purchases.md)(params: [QueryPurchasesParams](../../com.faa.billing.core.api.data.purchase.query/-query-purchases-params/index.md)): [PurchasesResult](../../com.faa.billing.core.api.data.purchase/-purchases-result/index.md) |

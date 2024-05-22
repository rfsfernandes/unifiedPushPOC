//[billing](../../../index.md)/[com.faa.billing.core.api](../index.md)/[BillingClient](index.md)

# BillingClient

class [BillingClient](index.md) : BillingServiceConnectionDelegate, BillingDataSourceDelegate

Creates an instance. After creation, it will not yet be ready to use. You must perform setup by calling .startSetup and wait for setup to complete. This constructor does not block and is safe to call from a UI thread.

#### Parameters

androidJvm

| | |
|---|---|
| billingClientSettings | [BillingClientSettings](../../com.faa.billing.core.settings/BillingClientSettings/index.md) Runtime settings for the [BillingClient](index.md). |

## Constructors

| | |
|---|---|
| [BillingClient](BillingClient.md) | constructor(billingClientSettings: [BillingClientSettings](../../com.faa.billing.core.settings/BillingClientSettings/index.md)) |

## Functions

| Name | Summary |
|---|---|
| [acknowledgePurchase](../acknowledgePurchase.md) | suspend fun [BillingClient](index.md).[acknowledgePurchase](../acknowledgePurchase.md)(params: [AcknowledgePurchaseParams](../AcknowledgePurchaseParams/index.md)): [BillingResponseCode](../BillingResponseCode/index.md) |
| [consumePurchase](../consumePurchase.md) | suspend fun [BillingClient](index.md).[consumePurchase](../consumePurchase.md)(params: [ConsumePurchaseParams](../-consumePurchase-params/index.md)): [BillingResponseCode](../BillingResponseCode/index.md) |
| [queryProductDetails](../queryProductDetails.md) | suspend fun [BillingClient](index.md).[queryProductDetails](../queryProductDetails.md)(params: [QueryProductDetailsParams](../-queryProductDetails-params/index.md)): [ProductDetailsResult](../ProductDetails-result/index.md) |
| [queryPurchases](../queryPurchases.md) | suspend fun [BillingClient](index.md).[queryPurchases](../queryPurchases.md)(params: [QueryPurchasesParams](../../com.faa.billing.core.api.data.purchase.query/QueryPurchasesParams/index.md)): [PurchasesResult](../../com.faa.billing.core.api.data.purchase/PurchasesResult/index.md) |

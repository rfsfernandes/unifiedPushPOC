//[billing](../../../../index.md)/[com.faa.billing.core.api](../../index.md)/[BillingResponseCode](../index.md)/[BILLING_UNAVAILABLE](index.md)

# BILLING_UNAVAILABLE

[androidJvm]\
[BILLING_UNAVAILABLE](index.md)

A user billing error occurred during processing.

Examples where this error may occur:

- 
   The user is in an unsupported country.
- 
   The user is an enterprise user and their enterprise admin has disabled users from making purchases.
- 
   The Billing service is unable to charge the user’s payment method.

Letting the user retry may succeed if the condition causing the error has changed (e.g. An enterprise user's admin has allowed purchases for the organization).

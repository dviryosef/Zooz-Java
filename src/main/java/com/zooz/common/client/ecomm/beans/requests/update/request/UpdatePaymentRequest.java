package com.zooz.common.client.ecomm.beans.requests.update.request;

import com.zooz.common.client.ecomm.control.CommonParameters;

/**
 * To update a payment use the updatePayment API call. This enables merchants to edit certain parameters attached to an existing token.
 * Should be used only after openPayment and before “authorize” calls.
 */
public class UpdatePaymentRequest extends AbstractUpdatePayment {

    /**
     * Instantiates a new Update payment request.
     *
     * @param paymentToken The token from "openPayment"
     * @param amount       The total amount to pay.
     * @param currencyCode The paid currency ISO code, for instance: USD, EUR, GBP
     * @param taxAmount    The tax amount of the payment.
     *                     Please note: amount = subtotal + taxAmount. This value will be used to calculate the subtotal for the invoice.
     * @param taxPercent   The tax percent of the payment
     */
    public UpdatePaymentRequest(String paymentToken, Double amount, String currencyCode, double taxAmount,Double taxPercent) {
        super(CommonParameters.updatePayment, paymentToken, amount, currencyCode, taxAmount,taxPercent);
    }
}

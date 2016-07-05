package com.zooz.common.client.ecomm.beans.requests.update.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zooz.common.client.ecomm.beans.Invoice;
import com.zooz.common.client.ecomm.control.CommonParameters;

/**
 * To update a payment and the corresponding invoice, use the updatePaymentAndInvoice API call
 * This enables merchants to edit certain aspects of the payment and add or edit an invoice.
 * Should be used only after openPayment and before “authorize” calls.
 */
public class UpdatePaymentAndInvoiceRequest extends AbstractUpdatePayment {
    /**
     * A Zooz invoice object.
     */
    @JsonProperty
    private Invoice invoice;

    /**
     * Instantiates a new Update payment and invoice request.
     *
     * @param paymentToken The token from "openPayment"
     * @param amount       The total amount to pay.
     * @param currencyCode The paid currency ISO code, for instance: USD, EUR, GBP
     * @param taxAmount    The tax amount of the transaction.
     *                     Please note: amount = subtotal + taxAmount. This value will be used to calculate the subtotal for the invoice.
     * @param invoice      A Zooz invoice object.
     */
    public UpdatePaymentAndInvoiceRequest(String paymentToken, Double amount, String currencyCode, double taxAmount, Invoice invoice) {
        super(CommonParameters.updatePaymentAndInvoice, paymentToken, amount, currencyCode, taxAmount);
        this.invoice = invoice;
    }

    /**
     * Instantiates a new Update payment and invoice request.
     *
     * @param paymentToken The token from "openPayment"
     * @param amount       The total amount to pay.
     * @param currencyCode The paid currency ISO code, for instance: USD, EUR, GBP
     * @param taxAmount    The tax amount of the transaction.
     *                     Please note: amount = subtotal + taxAmount. This value will be used to calculate the subtotal for the invoice.
     * @param taxPercent   The tax percent of the payment
     * @param invoice      A Zooz invoice object.
     *
     */
    public UpdatePaymentAndInvoiceRequest(String paymentToken, Double amount, String currencyCode, double taxAmount,Double taxPercent, Invoice invoice) {
        super(CommonParameters.updatePaymentAndInvoice, paymentToken, amount, currencyCode, taxAmount,taxPercent);
        this.invoice = invoice;
    }

    /**
     * Returns A Zooz invoice object.
     *
     * @return A Zooz invoice object.
     */
    public Invoice getInvoice() {
        return invoice;
    }

    /**
     * Sets a new invoice to the payment.
     *
     * @param invoice A Zooz invoice object.
     */
    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}

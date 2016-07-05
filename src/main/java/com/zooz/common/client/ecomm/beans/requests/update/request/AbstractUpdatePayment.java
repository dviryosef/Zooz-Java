package com.zooz.common.client.ecomm.beans.requests.update.request;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is the abstract class for all Zooz requests to update payment parameters.
 */
public abstract class AbstractUpdatePayment extends AbstractUpdate {
    /**
     * The amount to update the payment with.
     */
    @JsonProperty
    private Double amount;
    /**
     * The paid currency ISO code, for instance: USD, EUR, GBP.
     */
    @JsonProperty
    private String currencyCode;
    /**
     * The tax amount of the payment
     * Please note: amount = subtotal + taxAmount. This value will be used to calculate the subtotal for the invoice.
     */
    @JsonProperty
    private double taxAmount;

    /**
     * The tax percent of the payment
     * */
    @JsonProperty
    private Double taxPercentage;

    /**
     * Instantiates a new Abstract update payment.
     *
     * @param command      One of the Update API command
     * @param paymentToken The paymentToken from "openPayment"
     * @param amount       The amount to update the payment.
     * @param currencyCode The paid currency ISO code, for instance: USD, EUR, GBP
     * @param taxAmount    The tax amount of the payment
     *                     Please note: amount = subtotal + taxAmount. This value will be used to calculate the subtotal for the invoice.
     */
    protected AbstractUpdatePayment(String command, String paymentToken, Double amount, String currencyCode, double taxAmount) {
        super(command, paymentToken);
        this.amount = amount;
        this.currencyCode = currencyCode;
        this.taxAmount = taxAmount;
    }

    /**
     * Instantiates a new Abstract update payment.
     *
     * @param command       One of the Update API command
     * @param paymentToken  The paymentToken from "openPayment"
     * @param amount        The amount to update the payment.
     * @param currencyCode  The paid currency ISO code, for instance: USD, EUR, GBP
     * @param taxAmount    The tax amount of the payment
     *                     Please note: amount = subtotal + taxAmount. This value will be used to calculate the subtotal for the invoice.
     * @param taxPercentage The tax percent of the payment
     */
    protected AbstractUpdatePayment(String command, String paymentToken, Double amount, String currencyCode, double taxAmount,Double taxPercentage) {
        super(command, paymentToken);
        this.amount = amount;
        this.currencyCode = currencyCode;
        this.taxAmount = taxAmount;
        this.taxPercentage = taxPercentage;
    }

    /**
     * Gets the paid currency ISO code, for instance: USD, EUR, GBP.
     *
     * @return Value of The paid currency ISO code, for instance: USD, EUR, GBP.
     */
    public String getCurrencyCode() { return currencyCode; }

    /**
     * Sets new currency ISO code, for instance: USD, EUR, GBP.
     *
     * @param currencyCode New value of the paid currency ISO code, for instance: USD, EUR, GBP.
     */
    public void setCurrencyCode(String currencyCode) { this.currencyCode = currencyCode; }

    /**
     * Gets the amount to update the payment with.
     *
     * @return Value of The amount to update the payment.
     */
    public Double getAmount() { return amount; }

    /**
     * Sets new amount to the payment.
     *
     * @param amount New value of the amount to update the payment with.
     */
    public void setAmount(Double amount) { this.amount = amount; }

    /**
     * Gets the tax amount of the payment
     * Please note: amount = subtotal + taxAmount. This value will be used to calculate the subtotal for the invoice.
     *
     * @return Value of the tax amount of the payment Please note: amount = subtotal + taxAmount. This value will be used to calculate the subtotal for the invoice.
     */
    public double getTaxAmount() { return taxAmount; }

    /**
     * Sets new tax amount to the payment
     * Please note: amount = subtotal + taxAmount. This value will be used to calculate the subtotal for the invoice.
     *
     * @param taxAmount New value of The tax amount of the payment .Please note: amount = subtotal + taxAmount. This value will be used to calculate the subtotal for the invoice.
     */
    public void setTaxAmount(double taxAmount) { this.taxAmount = taxAmount; }


    /**
     * Gets the tax percentage of the payment
     *
     * @return the tax percentage
     */
    public Double getTaxPercentage() {
        return taxPercentage;
    }

    /**
     * Sets new tax percentage of the payment
     *
     * @param taxPercentage New value of The tax percentage of the payment
     */
    public void setTaxPercentage(Double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }
}

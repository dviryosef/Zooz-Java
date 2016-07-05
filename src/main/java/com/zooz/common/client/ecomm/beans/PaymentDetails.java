package com.zooz.common.client.ecomm.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The set of payment details used for the openPayment API call.
 * The amount and currency code fields are mandatory for opening a payment, all the other fields are optional.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentDetails extends AbstractJsonBean {
    /**
     * The total amount to pay.
     */
    @JsonProperty
    private Double amount;
    /**
     * The paid currency ISO code, for instance: USD, EUR, GBP
     */
    @JsonProperty
    private String currencyCode;
    /**
     * The tax amount of the payment.
     * Please note: amount = subtotal + taxAmount. This value will be used to calculate the subtotal for the invoice.
     */
    @JsonProperty
    private double taxAmount;
   /**
     * The tax percent of the payment.
     *
     */
    @JsonProperty
    private Double taxPercentage;

    /**
     * The invoice of the payment.
     */
    @JsonProperty
    private Invoice invoice;
    /**
     * The user details
     */
    @JsonProperty
    private User user;

    @JsonProperty
    private SubscriptionDetails subscriptionDetails;

    @JsonProperty
    private String merchantCustomData;

    /**
     * Payment details - constructor for mandatory fields.
     * there is an option to set any un-mandatory fields our API supports to the payment.
     *
     * @param amount       The total amount to pay.
     * @param currencyCode The paid currency ISO code, for instance: USD, EUR, GBP
     */
    public PaymentDetails(Double amount, String currencyCode) {
        this.amount = amount;
        this.currencyCode = currencyCode;
    }

    /**
     * Instantiates a new Payment details.
     */
    public PaymentDetails() {}


    /**
     * Gets the paid currency ISO code, for instance: USD, EUR, GBP.
     *
     * @return Value of the paid currency ISO code, for instance: USD, EUR, GBP.
     */
    public String getCurrencyCode() { return currencyCode; }

    /**
     * Sets new paid currency ISO code, for instance: USD, EUR, GBP.
     *
     * @param currencyCode New value of the paid currency ISO code, for instance: USD, EUR, GBP.
     */
    public void setCurrencyCode(String currencyCode) { this.currencyCode = currencyCode; }

    /**
     * Gets the user details.
     *
     * @return Value of the user details.
     */
    public User getUser() { return user; }

    /**
     * Sets new user details.
     *
     * @param user New value of the user details.
     */
    public void setUser(User user) { this.user = user; }

    /**
     * Gets the invoice of the payment.
     *
     * @return the invoice of the payment.
     */
    public Invoice getInvoice() { return invoice; }

    /**
     * Sets new invoice for the payment..
     *
     * @param invoice New value of the invoice of the payment.
     */
    public void setInvoice(Invoice invoice) { this.invoice = invoice; }

    /**
     * Gets the total amount to pay.
     *
     * @return Value of the total amount to pay.
     */
    public Double getAmount() { return amount; }

    /**
     * Sets new amount to pay.
     *
     * @param amount New value of the total amount to pay.
     */
    public void setAmount(Double amount) { this.amount = amount; }

    /**
     * Gets the tax amount of the payment.
     * Please note: amount = subtotal + taxAmount. This value will be used to calculate the subtotal for the invoice..
     *
     * @return Value of the tax amount of the payment.
     * Please note: amount = subtotal + taxAmount. This value will be used to calculate the subtotal for the invoice..
     */
    public double getTaxAmount() { return taxAmount; }

    /**
     * Sets new tax amount for the payment.
     * Please note: amount = subtotal + taxAmount. This value will be used to calculate the subtotal for the invoice..
     *
     * @param taxAmount New value of the tax amount of the payment.
     *                  Please note: amount = subtotal + taxAmount. This value will be used to calculate the subtotal for the invoice..
     */
    public void setTaxAmount(double taxAmount) { this.taxAmount = taxAmount; }

    /**
     * Gets the tax percent of the payment.
     * @return Value of the tax percent of the payment.
     */
    public Double getTaxPercentage() {
        return taxPercentage;
    }

    /**
     * Sets new tax percent for the payment.
     * @param taxPercentage New value of the tax percent of the payment.
     */
    public void setTaxPercentage(Double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public SubscriptionDetails getSubscriptionDetails() {
        return subscriptionDetails;
    }

    public void setSubscriptionDetails(SubscriptionDetails subscriptionDetails) {
        this.subscriptionDetails = subscriptionDetails;
    }


    public String getMerchantCustomData() {
        return merchantCustomData;
    }

    public void setMerchantCustomData(String merchantCustomData) {
        this.merchantCustomData = merchantCustomData;
    }
}

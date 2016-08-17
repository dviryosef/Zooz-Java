package com.zooz.common.client.ecomm.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by dviryoseff on 08/08/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SubscriptionPayment {

    /**
     * The timestamp of the payment.
     */
    @JsonProperty
    private String timestamp;
    /**
     * The subscriptionPaymentNumber of the payment inside the subscription plan.
     */
    @JsonProperty
    private int subscriptionPaymentNumber;
    /**
     * The payment token.
     */
    @JsonProperty
    private String paymentToken;
    /**
     * The payment status description.
     */
    @JsonProperty
    private String paymentStatus;
    /**
     * The payment status code.
     */
    @JsonProperty
    private int paymentStatusCode;


    /**
     * Returns the timestamp of payment.
     *
     * @return a timestamp of payment.
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the timestamp of the payment.
     *
     * @param timestamp a payment timestamp.
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Returns the subscriptionPaymentNumber of the payment inside the subscription plan.
     *
     * @return a subscriptionPaymentNumber of the payment inside the subscription plan.
     */
    public int getSubscriptionPaymentNumber() {
        return subscriptionPaymentNumber;
    }

    /**
     * Sets subscriptionPaymentNumber of the payment inside the subscription plan.
     *
     * @param subscriptionPaymentNumber a subscriptionPaymentNumber of the payment inside the subscription plan.
     */
    public void setSubscriptionPaymentNumber(int subscriptionPaymentNumber) {
        this.subscriptionPaymentNumber = subscriptionPaymentNumber;
    }

    /**
     * Returns the payment status description.
     *
     * @return a payment status description.
     */
    public String getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Sets the payment status description.
     *
     * @param paymentStatus a payment status description.
     */
    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    /**
     * Returns the payment status code.
     *
     * @return a payment status code.
     */
    public int getPaymentStatusCode() {
        return paymentStatusCode;
    }

    /**
     * Sets the payment status code.
     *
     * @param paymentStatusCode a payment status code.
     */
    public void setPaymentStatusCode(int paymentStatusCode) {
        this.paymentStatusCode = paymentStatusCode;
    }

    /**
     * Returns the payment token.
     *
     * @return a payment token.
     */
    public String getPaymentToken() {
        return paymentToken;
    }

    /**
     * Sets the payment token.
     *
     * @param paymentToken a payment token.
     */
    public void setPaymentToken(String paymentToken) {
        this.paymentToken = paymentToken;
    }

}

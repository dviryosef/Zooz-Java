package com.zooz.common.client.ecomm.beans.responses;

/**
 * User: lironyaffe
 * Date: 1/25/15
 * Time: 12:53 PM
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The GetSubscriptionDetailsResponse includes any of the response parameter returns for the corresponding requests:
 * GetSubscriptionDetailsRequest
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetSubscriptionDetailsResponse extends ZoozResponseObject {
    /**
     * endDate - The date the subscription will expire (format: dd/MM/yyyy)
     */
    @JsonProperty
    private Long endDate;
    /**
     * isSandbox - Whether the response comes from the Sandbox Server or Production Server
     */
    @JsonProperty
    private boolean isSandbox;
    /**
     * Subscription status should be one of the following:
     * Valid – Subscription is valid.
     * Expired – Subscription is no longer valid. There will be no more payments.
     * CanceledByMerchant – The subscription was canceled by the merchant and is no longer valid.
     */
    @JsonProperty
    private String subscriptionStatus;
    /**
     * startDate - The start date of the subscription in (format: dd/MM/yyyy)
     */
    @JsonProperty
    private String startDate;
    /**
     * recurring - The number of recurrences. This parameter will be set to (-1) for indefinite subscription
     */
    @JsonProperty
    private int recurring;
    /**
     * periodUnit - Subscription frequency unit.
     * Possible values: day, week, month, year
     */
    @JsonProperty
    private String periodUnit;
    /**
     * periodNumber - The number of period units between two payments.
     */
    @JsonProperty
    private int periodNumber;
    /**
     * numOfSuccessfulPayments - The number of successful recurring payments till now.
     */
    @JsonProperty
    private int numOfSuccessfulPayments;

    /**
     * subscriptionDescription - The description of the subscription
     */
    @JsonProperty
    private String subscriptionDescription;

    /**
     * The name of the processor that processes the transaction
     */
    @JsonProperty
    private String processorName;

    /**
     * The payment method that could be used for creating future subscriptions
     */
    @JsonProperty
    private String paymentMethodToken;

    /**
     * Get the end date of the subscription, when the subscription will expire
     *
     * @return endDate end date
     */
    public Long getEndDate() {
        return endDate;
    }

    /**
     * Set the end date of the subscription, when the subscription will expire
     *
     * @param endDate the end date
     */
    public void setEndDate(Long endDate) {
        this.endDate = endDate;
    }

    /**
     * Is sandbox.
     *
     * @return boolean value: true if it is sandBox and false if not
     */
    public boolean isSandbox() {
        return isSandbox;
    }

    /**
     * Set Is sandbox.
     *
     * @param isSandBox the is sand box
     */
    public void setSandbox(boolean isSandBox) {
        this.isSandbox = isSandBox;
    }

    /**
     * Get the status of the subscription{Valid, Expired, CanceledByMerchant}
     *
     * @return subscriptionStatus subscription status
     */
    public String getSubscriptionStatus() {
        return subscriptionStatus;
    }

    /**
     * Set the status of the subscription{Valid, Expired, CanceledByMerchant}
     *
     * @param subscriptionStatus the subscription status
     */
    public void setSubscriptionStatus(String subscriptionStatus) {
        this.subscriptionStatus = subscriptionStatus;
    }

    /**
     * Get the start date of the subscription, when the subscription will start
     *
     * @return startDate start date
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Set the start date of the subscription, when the subscription will start
     *
     * @param startDate the start date
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * Get The number of recurrences
     *
     * @return recurring recurring
     */
    public int getRecurring() {
        return recurring;
    }

    /**
     * set The number of recurrences
     *
     * @param recurring the recurring
     */
    public void setRecurring(int recurring) {
        this.recurring = recurring;
    }

    /**
     * Get The Subscription frequency unit{day, week, month, year}
     *
     * @return periodUnit period unit
     */
    public String getPeriodUnit() {
        return periodUnit;
    }

    /**
     * set The Subscription frequency unit{day, week, month, year}
     *
     * @param periodUnit the period unit
     */
    public void setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
    }

    /**
     * Get the number of period units between two payments
     *
     * @return periodNumber period number
     */
    public int getPeriodNumber() {
        return periodNumber;
    }

    /**
     * Set the number of period units between two payments
     *
     * @param periodNumber the period number
     */
    public void setPeriodNumber(int periodNumber) {
        this.periodNumber = periodNumber;
    }

    /**
     * Get the number of successful recurring payments till now
     *
     * @return numOfSuccessfulPayments num of successful payments
     */
    public int getNumOfSuccessfulPayments() {
        return numOfSuccessfulPayments;
    }

    /**
     * Set the number of successful recurring payments till now
     *
     * @param numOfSuccessfulPayments the num of successful payments
     */
    public void setNumOfSuccessfulPayments(int numOfSuccessfulPayments) {
        this.numOfSuccessfulPayments = numOfSuccessfulPayments;
    }

    /**
     * Get the description of the subscription
     *
     * @return subscriptionDescription subscription description
     */
    public String getSubscriptionDescription() {
        return subscriptionDescription;
    }

    /**
     * Set the description of the subscription
     *
     * @param subscriptionDescription the subscription description
     */
    public void setSubscriptionDescription(String subscriptionDescription) {
        this.subscriptionDescription = subscriptionDescription;
    }

    /**
     * Gets the name of the processor that processes the transaction
     *
     * @return processorName processor name
     */
    public String getProcessorName() {
        return processorName;
    }

    /**
     * Sets the name of the processor that processes the transaction
     *
     * @param processorName the processor name
     */
    public void setProcessorName(String processorName) {
        this.processorName = processorName;
    }


    /**
     *  Get payment methodthat could be used for creating future subscriptions
     * @return paymentMethodToken
     */
    public String getPaymentMethodToken() {
        return paymentMethodToken;
    }

    /**
     * Set paymentMethodToken that could be used for creating future subscriptions
     * @param paymentMethodToken
     */
    public void setPaymentMethodToken(String paymentMethodToken) {
        this.paymentMethodToken = paymentMethodToken;
    }
}

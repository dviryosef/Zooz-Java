package com.zooz.common.client.ecomm.beans.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The GetSubscriptionDetailsResponse includes any of the response parameter returns for the corresponding requests:
 * CreateSubscriptionPlanRequest and CancelSubscriptionRequest
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CancelSubscriptionResponse extends ZoozResponseObject {
    /**
     * Subscription status should be one of the following:
     * Valid – Subscription is valid.
     * Expired – Subscription is no longer valid. There will be no more payments.
     * CanceledByMerchant – The subscription was canceled by the merchant and is no longer valid.
     */
    @JsonProperty
    private String subscriptionStatus;

    /**
     * Get the status of the subscription{Valid, Expired, CanceledByMerchant }
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
}

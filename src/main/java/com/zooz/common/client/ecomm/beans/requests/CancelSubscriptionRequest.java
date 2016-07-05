package com.zooz.common.client.ecomm.beans.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.zooz.common.client.ecomm.beans.responses.CancelSubscriptionResponse;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;
import com.zooz.common.client.ecomm.control.CommonParameters;

/**
 * This call cancels a subscription
 */
public class CancelSubscriptionRequest extends AbstractZoozRequest {
    /**
     * Subscription Token is a unique identifier on ZooZ’s servers that is get from the response whether it’s from ZooZ’s
     * SDK response or callback response after the user subscribes
     */
    @JsonProperty
    private String subscriptionToken;

    /**
     * Instantiates a new CancelSubscriptionRequest request.
     *
     * @param subscriptionToken The subscriptionToken from "CreateSubscriptionPlan"
     */
    public CancelSubscriptionRequest(String subscriptionToken) {
        super(CommonParameters.cancelSubscription);
        this.subscriptionToken = subscriptionToken;
    }

    /**
     * Returns the subscriptionToken for the current authorized subscription.
     *
     * @return a subscription Token.
     */
    public String getSubscriptionToken() {
        return subscriptionToken;
    }

    /**
     * Sets the subscriptionToken for the current authorized subscription.
     *
     * @param subscriptionToken a subscriptionToken.
     */
    public void setSubscriptionToken(String subscriptionToken) {
        this.subscriptionToken = subscriptionToken;
    }

    /**
     * Used to return the response type corresponding to the request.
     *
     * @return the corresponding response type.
     */
    @Override
    @JsonIgnore
    public TypeReference<ZoozServerResponse<CancelSubscriptionResponse>> getResponseTypeReference() {
        return new TypeReference<ZoozServerResponse<CancelSubscriptionResponse>>() {
        };
    }

}
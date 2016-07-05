package com.zooz.common.client.ecomm.beans.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.zooz.common.client.ecomm.beans.responses.GetSubscriptionDetailsResponse;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;
import com.zooz.common.client.ecomm.control.CommonParameters;

/**
 * This call check a subscription status
 */
public class GetSubscriptionDetailsRequest extends AbstractZoozRequest {
    /**
     * Subscription Token is a unique identifier on ZooZ’s servers that is get from the response whether it’s from ZooZ’s
     * SDK response or callback response after the user subscribes
     */
    @JsonProperty
    private String subscriptionToken;

    /**
     * Instantiates a new CheckSubscriptionRequest request.
     *
     * @param subscriptionToken The subscriptionToken from "CreateSubscriptionPlan"
     */
    public GetSubscriptionDetailsRequest(String subscriptionToken) {
        super(CommonParameters.getSubscriptionDetails);
        this.subscriptionToken = subscriptionToken;
    }

    /**
     * Returns the subscriptionToken for the current subscription.
     *
     * @return a subscription Token.
     */
    public String getSubscriptionToken() {
        return subscriptionToken;
    }

    /**
     * Sets the subscriptionToken for the current subscription.
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
    public TypeReference<ZoozServerResponse<GetSubscriptionDetailsResponse>> getResponseTypeReference() {
        return new TypeReference<ZoozServerResponse<GetSubscriptionDetailsResponse>>() {
        };
    }

}
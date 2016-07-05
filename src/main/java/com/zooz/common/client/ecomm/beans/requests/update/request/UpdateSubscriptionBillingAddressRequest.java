package com.zooz.common.client.ecomm.beans.requests.update.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.zooz.common.client.ecomm.beans.Address;
import com.zooz.common.client.ecomm.beans.requests.AbstractZoozRequest;
import com.zooz.common.client.ecomm.beans.responses.UpdateResponse;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;
import com.zooz.common.client.ecomm.control.CommonParameters;

/**
 * Created by yaelmasri on 1/14/15.
 * In order to update the billing information for a specific subscription, use the UpdateSubscriptionBillingAddressRequest API call.
 * This enables merchants to add or edit billing address parameters.
 * Should be used only after createSubscriptionPlanRequest
 */
public class UpdateSubscriptionBillingAddressRequest extends AbstractZoozRequest {

    /**
     * Subscription Token is a unique identifier on ZooZ’s servers that is get from the response whether it’s from ZooZ’s
     * SDK response or callback response after the user subscribes
     */
    @JsonProperty
    private String subscriptionToken;

    /**
     * User's billing address
     */
    @JsonProperty
    private Address billingAddress;

    /**
     * Instantiates a new Update billing.
     *
     * @param subscriptionToken    The token from "createSubscriptionPlan"
     * @param billingAddress User's billing address
     */
    public UpdateSubscriptionBillingAddressRequest(String subscriptionToken, Address billingAddress) {
        super(CommonParameters.updateSubscriptionBillingAddress);
        this.subscriptionToken = subscriptionToken;
        this.billingAddress = billingAddress;
    }

    /**
     * Returns the billing Address.
     *
     * @return User's billing address
     */
    public Address getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the wanted billing address.
     *
     * @param billingAddress User's billing address
     */
    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
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
    @JsonIgnore
    public TypeReference<ZoozServerResponse<UpdateResponse>> getResponseTypeReference() {
        return new TypeReference<ZoozServerResponse<UpdateResponse>>() {
        };
    }
}

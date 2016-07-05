package com.zooz.common.client.ecomm.beans.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The CreateSubscriptionPlanResponse includes any of the response parameter returns for the corresponding requests.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateSubscriptionPlanResponse extends ZoozResponseObject {
    /**
     * The subscriptionToken that will be used for subsequent commands.
     * You can find the subscription details on the Developer"s portal,
     *  the Extended Server API and Ecom API by using this subscriptionToken.
     */
    @JsonProperty
    private String subscriptionToken;

    /**
     * Redirect for further processing flow.
     * For additional details please read: Appendix A - Handling Redirect URL.
     */
    @JsonProperty
    private String redirectUrl;

    /**
     * Instantiates a new create subscription plan response.
     *
     * @param subscriptionToken the subscription token
     */
    public CreateSubscriptionPlanResponse(String subscriptionToken) {

        this.subscriptionToken = subscriptionToken;
    }

    /**
     * Instantiates a new create subscription plan response.
     */
    public CreateSubscriptionPlanResponse() {
    }

    /**
     * Returns the subscription token.
     *
     * @return a subscription token.
     */
    public String getSubscriptionToken() {
        return subscriptionToken;
    }

    /**
     * Sets the subscription token.
     *
     * @param subscriptionToken a subscription token.
     */
    public void setSubscriptionToken(String subscriptionToken) {
        this.subscriptionToken = subscriptionToken;
    }

    /**
     * Gets the redirect url.
     *
     * @return the redirect url
     */
    public String getRedirectUrl() {
        return redirectUrl;
    }

    /**
     * Sets the redirect url.
     *
     * @param redirectUrl the redirect url
     */
    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }
}

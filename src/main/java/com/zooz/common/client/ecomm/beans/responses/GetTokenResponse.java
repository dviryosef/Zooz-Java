package com.zooz.common.client.ecomm.beans.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The GetTokenResponse includes any of the response parameter returns for the corresponding requests.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetTokenResponse extends ZoozResponseObject {
    /**
     * This token is used to add a payment method without opening a payment.
     */
    @JsonProperty
    private String customerToken;

    /**
     * Instantiates a new Get token response.
     *
     * @param customerToken a customer token.
     */
    public GetTokenResponse(String customerToken) {
        this.customerToken = customerToken;
    }

    /**
     * Instantiates a new Get token response.
     */
    public GetTokenResponse() {
    }

    /**
     * Returns the customer token.
     *
     * @return a customer token.
     */
    public String getCustomerToken() {
        return customerToken;
    }

    /**
     * Sets the customer token.
     *
     * @param customerToken a customer token.
     */
    public void setCustomerToken(String customerToken) {
        this.customerToken = customerToken;
    }
}

package com.zooz.common.client.ecomm.beans.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.zooz.common.client.ecomm.beans.responses.GetFundSourcesResponse;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;
import com.zooz.common.client.ecomm.control.CommonParameters;

/**
 * This call returns a list of all existing payment methods for a specific user.
 */
public class GetFundSourcesRequest extends AbstractZoozRequest {
    /**
     * customerLoginID is the customer's identifier at the merchant"s server.
     */
    @JsonProperty
    private String customerLoginID;
    /**
     * The token from "openPayment"
     */
    @JsonProperty
    private String paymentToken;

    /**
     * Instantiates a new Get fund sources request.
     * Used to get all fund sources for a specific customer login ID
     *
     * @param customerLoginID customerLoginID is the customer"s identifier at the merchant"s server.
     */
    public GetFundSourcesRequest(String customerLoginID) {
        super(CommonParameters.getPaymentMethods);
        this.customerLoginID = customerLoginID;
    }

    /**
     * Instantiates a new Get fund sources request.
     * Used to get all fund sources for a specific customer login ID with relevant status for a payment token.
     *
     * @param customerLoginID customerLoginID is the customer"s identifier at the merchant"s server.
     * @param paymentToken The token from "openPayment"
     */
    public GetFundSourcesRequest(String customerLoginID, String paymentToken) {
        super(CommonParameters.getPaymentMethods);
        this.customerLoginID = customerLoginID;
        this.paymentToken = paymentToken;
    }

    /**
     * Returns the customer login ID.
     *
     * @return the customer login ID.
     */
    public String getCustomerLoginID() {
        return customerLoginID;
    }

    /**
     * Sets the customer login ID.
     *
     * @param customerLoginID the customer login ID.
     */
    public void setCustomerLoginID(String customerLoginID) {
        this.customerLoginID = customerLoginID;
    }

    /**
     * Gets the payment token.
     *
     * @return the payment token
     */
    public String getPaymentToken() {
        return paymentToken;
    }

    /**
     * Sets the payment token.
     *
     * @param paymentToken the payment token
     */
    public void setPaymentToken(String paymentToken) {
        this.paymentToken = paymentToken;
    }

    /**
     * Used to return the response type corresponding to the request.
     *
     * @return the corresponding response type.
     */
    @Override
    @JsonIgnore
    public TypeReference<ZoozServerResponse<GetFundSourcesResponse>> getResponseTypeReference() {
        return new TypeReference<ZoozServerResponse<GetFundSourcesResponse>>() {
        };
    }
}

package com.zooz.common.client.ecomm.beans.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.zooz.common.client.ecomm.beans.responses.VoidResponse;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;
import com.zooz.common.client.ecomm.control.CommonParameters;

/**
 * This call cancels a specific pending authorized transaction, or tries to void a captured payment
 * if it was not settled already.
 * Please note that voiding a captured payment is not allowed by all acquirers and its success depends
 * on whether the settlement of this transaction was not yet set.
 */
public class VoidRequest extends AbstractZoozRequest {
    /**
     * The token from "openPayment"
     */
    @JsonProperty
    private String paymentToken;

    /**
     * Instantiates a new Void request.
     *
     * @param paymentToken The paymentToken from "openPayment"
     */
    public VoidRequest(String paymentToken) {
        super(CommonParameters.voidPayment);
        this.paymentToken = paymentToken;
    }

    /**
     * Returns the paymentToken for the current authorized payment.
     *
     * @return a payment token.
     */
    public String getPaymentToken() {
        return paymentToken;
    }

    /**
     * Sets the paymentToken for the current authorized payment.
     *
     * @param paymentToken a payment token.
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
    public TypeReference<ZoozServerResponse<VoidResponse>> getResponseTypeReference() {
        return new TypeReference<ZoozServerResponse<VoidResponse>>() {
        };
    }

}
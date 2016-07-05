package com.zooz.common.client.ecomm.beans.requests.update.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.zooz.common.client.ecomm.beans.requests.AbstractZoozRequest;
import com.zooz.common.client.ecomm.beans.responses.UpdateResponse;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;

/**
 * This is the abstract class for all Zooz update requests.
 * All updates can be requested only after the "openPayment" and before the “authorize” calls.
 */
public abstract class AbstractUpdate extends AbstractZoozRequest {
    /**
     * The paymentToken from "openPayment"
     */
    @JsonProperty
    private String paymentToken;

    /**
     * Instantiates a new Abstract update.
     *
     * @param command      One of the Update API command
     * @param paymentToken The token from "openPayment"
     */
    protected AbstractUpdate(String command, String paymentToken) {
        super(command);
        this.paymentToken = paymentToken;
    }

    /**
     * Gets the paymentToken from "openPayment".
     *
     * @return Value of The paymentToken from "openPayment".
     */
    public String getPaymentToken() { return paymentToken; }

    /**
     * Sets new paymentToken.
     *
     * @param paymentToken New value of The paymentToken from "openPayment".
     */
    public void setPaymentToken(String paymentToken) { this.paymentToken = paymentToken; }

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

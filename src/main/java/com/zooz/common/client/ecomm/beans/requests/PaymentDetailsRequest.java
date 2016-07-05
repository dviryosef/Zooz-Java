package com.zooz.common.client.ecomm.beans.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.zooz.common.client.ecomm.beans.responses.PaymentDetailsResponse;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;
import com.zooz.common.client.ecomm.control.CommonParameters;

/**
 * Get transaction details with Payment Token API allows you to retrieve complete transaction details and
 * transaction statuses before and/or after commit or refund. This call does not change the transaction state.
 * Using this method is the preferred way to verify the status and the details of a specific transaction.
 */
public class PaymentDetailsRequest extends AbstractZoozRequest {
    /**
     * The token from "openPayment"
     */
    private String paymentToken;

    /**
     * Instantiates a new Payment details request.
     *
     * @param paymentToken The token from "openPayment"
     */
    public PaymentDetailsRequest(String paymentToken) {
        super(CommonParameters.getPaymentDetails);
        this.paymentToken = paymentToken;
    }

    /**
     * Returns the paymentToken for the current authorized payment.
     * The paymentToken is the same paymentToken from "openPayment".
     *
     * @return a payment token.
     */
    public String getPaymentToken() {
        return paymentToken;
    }

    /**
     * Sets the paymentToken for the current authorized payment.
     * The paymentToken is the same paymentToken from "openPayment".
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
    public TypeReference<ZoozServerResponse<PaymentDetailsResponse>> getResponseTypeReference() {
        return new TypeReference<ZoozServerResponse<PaymentDetailsResponse>>() {
        };
    }
}

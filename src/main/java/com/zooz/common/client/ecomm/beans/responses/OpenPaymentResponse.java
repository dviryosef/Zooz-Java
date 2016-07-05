package com.zooz.common.client.ecomm.beans.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The OpenPaymentResponse includes any of the response parameter returns for the corresponding requests.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenPaymentResponse extends ZoozResponseObject {
    /**
     * The paymentToken that will be used for subsequent commands.
     * You can find the transaction details on the Developer"s portal,
     * and on the Extended Server API by using this paymentToken.
     */
    @JsonProperty
    private String paymentToken;
    private String paymentId;

    /**
     * Instantiates a new Open payment response.
     *
     * @param paymentToken a payment token.
     * @param paymentId    the payment id
     */
    public OpenPaymentResponse(String paymentToken, String paymentId) {

        this.paymentToken = paymentToken;
        this.paymentId = paymentId;
    }

    /**
     * Instantiates a new Open payment response.
     */
    public OpenPaymentResponse() {
    }

    /**
     * Returns the payment token.
     *
     * @return a payment token.
     */
    public String getPaymentToken() {
        return paymentToken;
    }

    /**
     * Sets the payment token.
     *
     * @param paymentToken a payment token.
     */
    public void setPaymentToken(String paymentToken) {
        this.paymentToken = paymentToken;
    }

    /**
     * Returns the payment ID.
     *
     * @return a payment ID.
     */
    public String getPaymentId() {
        return paymentId;
    }

    /**
     * Sets the payment ID.
     *
     * @param paymentId a payment ID.
     */
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
}

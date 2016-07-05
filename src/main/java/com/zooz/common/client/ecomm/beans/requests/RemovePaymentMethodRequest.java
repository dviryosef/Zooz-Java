package com.zooz.common.client.ecomm.beans.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.zooz.common.client.ecomm.beans.responses.RemovePaymentMethodResponse;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;
import com.zooz.common.client.ecomm.control.CommonParameters;

/**
 * This call removes an existing payment method for a specific user.
 */
public class RemovePaymentMethodRequest extends AbstractZoozRequest {
    /**
     * The customerLoginID is the customer's identifier at the merchant's server.
     */
    @JsonProperty
    private String customerLoginID;
    /**
     * Representation of the credit card in Zooz systems,
     * It returns on "getPaymentMethods" API call.
     */
    @JsonProperty
    private String paymentMethodToken;

    /**
     * Instantiates a new Remove payment method request.
     *
     * @param customerLoginID    customerLoginID is the customer's identifier at the merchant's server.
     * @param paymentMethodToken Representation of the credit card in Zooz systems,
     *                           It returns on "getPaymentMethods" API call.
     */
    public RemovePaymentMethodRequest(String customerLoginID, String paymentMethodToken) {
        super(CommonParameters.removePaymentMethod);
        this.customerLoginID = customerLoginID;
        this.paymentMethodToken = paymentMethodToken;
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
     * Returns the payment method token
     *
     * @return a payment method token
     */
    public String getPaymentMethodToken() {
        return paymentMethodToken;
    }

    /**
     * Sets the payment method token
     *
     * @param paymentMethodToken a payment method token
     */
    public void setPaymentMethodToken(String paymentMethodToken) {
        this.paymentMethodToken = paymentMethodToken;
    }

    /**
     * Used to return the response type corresponding to the request.
     *
     * @return the corresponding response type.
     */
    @Override
    @JsonIgnore
    public TypeReference<ZoozServerResponse<RemovePaymentMethodResponse>> getResponseTypeReference() {
        return new TypeReference<ZoozServerResponse<RemovePaymentMethodResponse>>() {
        };
    }

}

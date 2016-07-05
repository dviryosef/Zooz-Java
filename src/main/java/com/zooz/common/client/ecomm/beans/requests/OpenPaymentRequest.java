package com.zooz.common.client.ecomm.beans.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.zooz.common.client.ecomm.beans.CustomerDetails;
import com.zooz.common.client.ecomm.beans.PaymentDetails;
import com.zooz.common.client.ecomm.beans.responses.OpenPaymentResponse;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;
import com.zooz.common.client.ecomm.control.CommonParameters;

/**
 * In order to start the payment process, you need to use the openPayment API call.
 * This will open a request to Zooz server using a secure channel.
 * The openPayment call returns a payment token that will be used to uniquely identify the transaction later on.
 */
public class OpenPaymentRequest extends AbstractZoozRequest {
    /**
     * payment details of the payment
     */
    @JsonProperty
    private PaymentDetails paymentDetails;
    /**
     * customer details of the payment.
     */
    @JsonProperty
    private CustomerDetails customerDetails;

    /**
     * Instantiates a new Open payment request.
     *
     * @param paymentDetails  payment details of the payment.
     * @param customerDetails customer details of the payment.
     */
    public OpenPaymentRequest(PaymentDetails paymentDetails, CustomerDetails customerDetails) {
        super(CommonParameters.openPayment);
        this.paymentDetails = paymentDetails;
        this.customerDetails = customerDetails;
    }

    /**
     * Returns the payment details of the payment.
     *
     * @return payment details object.
     */
    public PaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    /**
     * Sets payment details of the payment.
     *
     * @param paymentDetails payment details object.
     */
    public void setPaymentDetails(PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    /**
     * Returns the customer details of the payment.
     *
     * @return customer details object.
     */
    public CustomerDetails getCustomerDetails() {
        return customerDetails;
    }

    /**
     * Sets the customer details of the payment.
     *
     * @param customerDetails customer details object.
     */
    public void setCustomerDetails(CustomerDetails customerDetails) {
        this.customerDetails = customerDetails;
    }

    /**
     * Used to return the response type corresponding to the request.
     *
     * @return the corresponding response type.
     */
    @Override
    @JsonIgnore
    public TypeReference<ZoozServerResponse<OpenPaymentResponse>> getResponseTypeReference() {
        return new TypeReference<ZoozServerResponse<OpenPaymentResponse>>() {
        };
    }
}

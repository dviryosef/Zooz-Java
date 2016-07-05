package com.zooz.common.client.ecomm.beans.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.zooz.common.client.ecomm.beans.CustomerDetails;
import com.zooz.common.client.ecomm.beans.PaymentDetails;
import com.zooz.common.client.ecomm.beans.PaymentMethod;
import com.zooz.common.client.ecomm.beans.responses.CreateSubscriptionPlanResponse;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;
import com.zooz.common.client.ecomm.control.CommonParameters;

/**
 * Created by yaelmasri on 1/14/15.
 */
public class CreateSubscriptionPlanRequest extends AbstractZoozRequest {
    /**
     * payment details of the subscription
     */
    @JsonProperty
    private PaymentDetails paymentDetails;
    /**
     * customer details of the subscription.
     */
    @JsonProperty
    private CustomerDetails customerDetails;

    /**
     * selected payment method
     */
    @JsonProperty
    private PaymentMethod paymentMethod;

    /**
     * Instantiates a new CreateSubscriptionPlanRequest
     *
     * @param paymentDetails  the payment details
     * @param customerDetails the customer details
     * @param paymentMethod   the payment method
     */
    public CreateSubscriptionPlanRequest(PaymentDetails paymentDetails, CustomerDetails customerDetails, PaymentMethod paymentMethod) {
        super(CommonParameters.createSubscriptionPlan);
        this.paymentDetails = paymentDetails;
        this.customerDetails = customerDetails;
        this.paymentMethod = paymentMethod;
    }


    /**
     * Returns the payment details of the subscription.
     *
     * @return payment details object.
     */
    public PaymentDetails getPaymentDetails() {
        return this.paymentDetails;
    }

    /**
     * Sets payment details of the subscription.
     *
     * @param paymentDetails payment details object.
     */
    public void setPaymentDetails(PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    /**
     * Returns the customer details of the subscription.
     *
     * @return customer details object.
     */
    public CustomerDetails getCustomerDetails() {
        return this.customerDetails;
    }

    /**
     * Sets the customer details of the subscription.
     *
     * @param customerDetails customer details object.
     */
    public void setCustomerDetails(CustomerDetails customerDetails) {
        this.customerDetails = customerDetails;
    }

    /**
     * Gets selected payment method.
     *
     * @return Value of selected payment method.
     */
    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets new selected payment method.
     *
     * @param paymentMethod New value of selected payment method.
     */
    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * Used to return the response type corresponding to the request.
     *
     * @return the corresponding response type.
     */
    @JsonIgnore
    public TypeReference<ZoozServerResponse<CreateSubscriptionPlanResponse>> getResponseTypeReference() {
        return new TypeReference<ZoozServerResponse<CreateSubscriptionPlanResponse>>() {
        };
    }
}

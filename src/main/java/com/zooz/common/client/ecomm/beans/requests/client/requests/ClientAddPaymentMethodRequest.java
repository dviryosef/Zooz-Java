package com.zooz.common.client.ecomm.beans.requests.client.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zooz.common.client.ecomm.beans.Address;
import com.zooz.common.client.ecomm.beans.client.beans.ClientPaymentMethod;
import com.zooz.common.client.ecomm.beans.client.beans.ClientPaymentMethodDetails;
import com.zooz.common.client.ecomm.beans.requests.AbstractAddPaymentMethodRequest;


/**
 * The type Client add payment method request.
 */
public class ClientAddPaymentMethodRequest extends AbstractAddPaymentMethodRequest {

    /**
     * The users billing address
     */
    @JsonProperty
    private Address billingAddress;

    /**
     * Instantiates a new Client add payment method request.
     *
     * @param paymentToken          the payment token
     * @param email                 the email
     * @param billingAddress        the billing address
     * @param paymentMethodDetails  the payment method details
     * @param rememberPaymentMethod the remember payment method
     *
     * @deprecated paymentMethodType should be a parameter, instead of hardcoded "CreditCard" replaced by ClientAddPaymentMethodRequest(String paymentToken, String email,
     * Address billingAddress, ClientPaymentMethodDetails paymentMethodDetails,
     * boolean rememberPaymentMethod, String paymentMethodType))
     */
    @Deprecated
    public ClientAddPaymentMethodRequest(String paymentToken, String email,
                                         Address billingAddress, ClientPaymentMethodDetails paymentMethodDetails,
                                         boolean rememberPaymentMethod) {

        super(paymentToken, email, new ClientPaymentMethod(paymentMethodDetails, rememberPaymentMethod));
        this.billingAddress = billingAddress;
    }

    /**
     * Instantiated a new ClientAddPaymentMethod Request
     *
     * @param paymentToken          the payment token
     * @param email                 the email
     * @param billingAddress        the billing address
     * @param paymentMethodDetails  the payment method details
     * @param rememberPaymentMethod the remember payment method
     * @param paymentMethodType     the payment method type - "CreditCard" / "PayPal"
     */
    public ClientAddPaymentMethodRequest(String paymentToken, String email,
                                         Address billingAddress, ClientPaymentMethodDetails paymentMethodDetails,
                                         boolean rememberPaymentMethod,String paymentMethodType) {

        super(paymentToken, email, new ClientPaymentMethod(paymentMethodDetails, rememberPaymentMethod,paymentMethodType));
        this.billingAddress = billingAddress;
    }

    /**
     * Gets the billing address.
     *
     * @return the billing address
     */
    public Address getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the billing address.
     *
     * @param billingAddress the billing address
     */
    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }
}

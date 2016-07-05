package com.zooz.common.client.ecomm.beans.addpaymentmethod.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by roykey on 10/13/15.
 */
public class AbstractPaymentMethod {

    @JsonProperty
    private AbstractConfiguration configuration;

    @JsonProperty
    private AbstractAddPaymentMethodDetails paymentMethodDetails;

    @JsonProperty
    private String paymentMethodType;

    /**
     * Instantiates a new Abstract payment method.
     *
     * @param configuration        the configuration
     * @param paymentMethodDetails the payment method details
     * @param paymentMethodType    the payment method type
     */
    public AbstractPaymentMethod(AbstractConfiguration configuration, AbstractAddPaymentMethodDetails paymentMethodDetails, String paymentMethodType) {
        this.configuration = configuration;
        this.paymentMethodDetails = paymentMethodDetails;
        this.paymentMethodType = paymentMethodType;
    }

    /**
     * Instantiates a new Abstract payment method.
     */
    public AbstractPaymentMethod() {
    }

    /**
     * Gets the configuration.
     *
     * @return the configuration
     */
    public AbstractConfiguration getConfiguration() {
        return configuration;
    }

    /**
     * Sets the configuration.
     *
     * @param configuration the configuration
     */
    public void setConfiguration(AbstractConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * Gets the payment method details.
     *
     * @return the payment method details
     */
    public AbstractAddPaymentMethodDetails getPaymentMethodDetails() {
        return paymentMethodDetails;
    }

    /**
     * Sets the payment method details.
     *
     * @param paymentMethodDetails the payment method details
     */
    public void setPaymentMethodDetails(AbstractAddPaymentMethodDetails paymentMethodDetails) {
        this.paymentMethodDetails = paymentMethodDetails;
    }

    /**
     * Gets the payment method type.
     *
     * @return the payment method type
     */
    public String getPaymentMethodType() {
        return paymentMethodType;
    }

    /**
     * Sets the payment method type.
     *
     * @param paymentMethodType the payment method type
     */
    public void setPaymentMethodType(String paymentMethodType) {
        this.paymentMethodType = paymentMethodType;
    }
}

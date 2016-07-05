package com.zooz.common.client.ecomm.beans.addpaymentmethod.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by roykey on 10/13/15.
 */
public abstract class AbstractConfiguration {

    /**
     * The Remember payment method.
     */
    @JsonProperty
    protected boolean rememberPaymentMethod;

    public AbstractConfiguration() {
    }

    /**
     * Instantiates a new Abstract configuration.
     *
     * @param rememberPaymentMethod the remember payment method
     */
    public AbstractConfiguration(boolean rememberPaymentMethod){
        this.rememberPaymentMethod = rememberPaymentMethod;
    }

    /**
     * Is remember payment method boolean.
     *
     * @return the boolean
     */
    public boolean isRememberPaymentMethod() {
        return rememberPaymentMethod;
    }

    /**
     * Sets the remember payment method.
     *
     * @param rememberPaymentMethod the remember payment method
     */
    public void setRememberPaymentMethod(boolean rememberPaymentMethod) {
        this.rememberPaymentMethod = rememberPaymentMethod;
    }

}

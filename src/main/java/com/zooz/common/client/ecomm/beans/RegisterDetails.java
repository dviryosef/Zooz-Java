package com.zooz.common.client.ecomm.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The set of registration details used for the getToken API call.
 * The currency code field is mandatory for detail registration, the billing address field is optional.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RegisterDetails extends AbstractJsonBean {
    /**
     * the paid currency ISO code, for instance: USD, EUR, GBP
     */
    @JsonProperty
    private String currencyCode;
    /**
     * the users billing address
     */
    @JsonProperty
    private Address billingAddress;

    /**
     * Register details - constructor for mandatory fields.
     * there is an option to set any un-mandatory fields our API supports to the register.
     *
     * @param currencyCode The paid currency ISO code, for instance: USD, EUR, GBP
     */
    public RegisterDetails(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * Instantiates a new Register details.
     */
    public RegisterDetails() {

    }

    /**
     * Gets the users billing address.
     *
     * @return Value of the users billing address.
     */
    public Address getBillingAddress() { return billingAddress; }

    /**
     * Sets the new users billing address.
     *
     * @param billingAddress New value of the users billing address.
     */
    public void setBillingAddress(Address billingAddress) { this.billingAddress = billingAddress; }

    /**
     * Gets the paid currency ISO code, for instance: USD, EUR, GBP.
     *
     * @return Value of the paid currency ISO code, for instance: USD, EUR, GBP.
     */
    public String getCurrencyCode() { return currencyCode; }

    /**
     * Sets the new paid currency ISO code, for instance: USD, EUR, GBP.
     *
     * @param currencyCode New value of the paid currency ISO code, for instance: USD, EUR, GBP.
     */
    public void setCurrencyCode(String currencyCode) { this.currencyCode = currencyCode; }
}

package com.zooz.common.client.ecomm.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The set of parameters included in a phone number.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Phone extends AbstractJsonBean {
    /**
     * The user's phone number country code
     */
    @JsonProperty
    private String countryCode;
    /**
     * The user's phone number, excluding the country code
     */
    @JsonProperty
    private String phoneNumber;

    /**
     * Instantiates a new Phone.
     *
     * @param countryCode User's phone number country code
     * @param phoneNumber User's phone number, excluding the country code
     */
    public Phone(String countryCode, String phoneNumber) {
        this.countryCode = countryCode;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Instantiates a new Phone.
     */
    public Phone() {
    }

    /**
     * Gets the user's phone number country code.
     *
     * @return Value of the user's phone number country code.
     */
    public String getCountryCode() { return countryCode; }

    /**
     * Sets the new user's phone number country code.
     *
     * @param countryCode New value of the user's phone number country code.
     */
    public void setCountryCode(String countryCode) { this.countryCode = countryCode; }

    /**
     * Gets the user's phone number, excluding the country code.
     *
     * @return Value of the user's phone number, excluding the country code.
     */
    public String getPhoneNumber() { return phoneNumber; }

    /**
     * Sets the new user's phone number, excluding the country code.
     *
     * @param phoneNumber New value of the user's phone number, excluding the country code.
     */
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
}

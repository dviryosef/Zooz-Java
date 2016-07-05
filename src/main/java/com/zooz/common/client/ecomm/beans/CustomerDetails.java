package com.zooz.common.client.ecomm.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The set of customer details, including the customer login ID and login name.
 * Customer details are used for openPayment and getToken API calls.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerDetails extends AbstractJsonBean {
    /**
     * the customer"s identifier at the merchant"s server, allowing one click checkout from all devices.
     */
    @JsonProperty
    private String customerLoginID;
    /**
     * the customer"s name at the merchant"s server. It is used mainly for filtering reports
     */
    @JsonProperty
    private String customerLoginName;

    /**
     * Instantiates a new Customer details.
     *
     * @param customerLoginID   customerLoginID is the customer"s identifier at the merchant"s server, allowing one click checkout from all devices.
     * @param customerLoginName customerLoginName is the customer"s name at the merchant"s server. It is used mainly for filtering reports
     */
    public CustomerDetails(String customerLoginID, String customerLoginName) {
        this.customerLoginID = customerLoginID;
        this.customerLoginName = customerLoginName;
    }

    /**
     * Instantiates a new Customer details.
     */
    public CustomerDetails() {
    }

    /**
     * Gets the customer login ID.
     *
     * @return the customer login ID
     */
    public String getCustomerLoginID() {
        return customerLoginID;
    }

    /**
     * Sets the customer login ID.
     *
     * @param customerLoginID the customer login iD
     */
    public void setCustomerLoginID(String customerLoginID) {
        this.customerLoginID = customerLoginID;
    }

    /**
     * Gets the customer login name.
     *
     * @return the customer login name
     */
    public String getCustomerLoginName() {
        return customerLoginName;
    }

    /**
     * Sets the customer login name.
     *
     * @param customerLoginName the customer login name
     */
    public void setCustomerLoginName(String customerLoginName) {
        this.customerLoginName = customerLoginName;
    }
}

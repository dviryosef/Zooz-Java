package com.zooz.common.client.ecomm.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Users' addresses for billing and shipping.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Addresses extends AbstractJsonBean {
    /**
     * User's billing address
     */
    @JsonProperty
    private Address billing;
    /**
     * User's shipping address
     */
    @JsonProperty
    private Address shipping;

    /**
     * Instantiates a new Addresses.
     *
     * @param billing  Users billing address
     * @param shipping Users shipping address
     */
    public Addresses(Address billing, Address shipping) {
        this.billing = billing;
        this.shipping = shipping;
    }

    /**
     * Instantiates a new Addresses.
     */
    public Addresses() {

    }

    /**
     * Gets the users billing address.
     *
     * @return Value of the users billing address.
     */
    public Address getBilling() { return billing; }

    /**
     * Sets the new users billing address.
     *
     * @param billing New value of the users billing address.
     */
    public void setBilling(Address billing) { this.billing = billing; }

    /**
     * Gets the users shipping address.
     *
     * @return Value of the users shipping address.
     */
    public Address getShipping() { return shipping; }

    /**
     * Sets the new users shipping address.
     *
     * @param shipping New value of the users shipping address.
     */
    public void setShipping(Address shipping) { this.shipping = shipping; }
}

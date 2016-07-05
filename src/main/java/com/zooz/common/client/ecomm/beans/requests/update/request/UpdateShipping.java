package com.zooz.common.client.ecomm.beans.requests.update.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zooz.common.client.ecomm.beans.Address;
import com.zooz.common.client.ecomm.control.CommonParameters;

/**
 * To update the shipping information for a specific payment, use the updateShipping API call.
 * This enables merchants to add or edit shipping address parameters.
 * Should be used only after openPayment and before “authorize” calls.
 */
public class UpdateShipping extends AbstractUpdate {
    /**
     * User's shipping address
     */
    @JsonProperty
    private Address shippingAddress;

    /**
     * Instantiates a new Update shipping.
     *
     * @param paymentToken    The token from "openPayment"
     * @param shippingAddress User's shipping address
     */
    public UpdateShipping(String paymentToken, Address shippingAddress) {
        super(CommonParameters.updateShipping, paymentToken);
        this.shippingAddress = shippingAddress;
    }

    /**
     * Returns the shipping Address.
     *
     * @return User's shipping address
     */
    public Address getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Sets the wanted shipping address.
     *
     * @param shippingAddress User's shipping address
     */
    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
}

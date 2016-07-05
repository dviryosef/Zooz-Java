package com.zooz.common.client.ecomm.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Invoice shipping details items
 */


@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceShippingDetailsItem extends InvoiceDetailItem {

    /**
     * The shipping method
     */
    @JsonProperty
    private String method;


    /**
     * Instantiates a new InvoiceDetailItem.
     *
     * @param name              Name of the item
     * @param amount            Price of the item
     * @param taxAmount         Tax amount for the item
     * @param taxPercentage        Tax percent for the item
     * @param method            the shipping method
     */
    public InvoiceShippingDetailsItem(String name, Double amount, Double taxAmount, Double taxPercentage, String method) {
        super(name,amount,taxAmount,taxPercentage);
        this.method = method;

    }

    /**
     * Instantiates a new InvoiceShippingDetailsItem.
     */
    public InvoiceShippingDetailsItem() {

    }


    /**
     * Gets the shipping method.
     *
     * @return Value of the shipping method.
     */
    public String getMethod() { return method; }

    /**
     * Sets new shipping method.
     *
     * @param method New value of the shipping method.
     */
    public void setMethod(String method ) { this.method = method; }




}

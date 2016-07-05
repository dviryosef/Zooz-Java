package com.zooz.common.client.ecomm.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zooz.common.client.ecomm.beans.AbstractJsonBean;

/**
 * Invoice detail items
 */


@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceDetailItem extends InvoiceDetailAmountItem {
    /**
     * The Name of the item
     */
    @JsonProperty
    private String name;


    /**
     * Instantiates a new InvoiceDetailItem.
     *
     * @param name              Name of the item
     * @param amount            Price of the item
     * @param taxAmount         Tax amount for the item
     * @param taxPercentage        Tax percent for the item
     */
    public InvoiceDetailItem(String name, Double amount, Double taxAmount, Double taxPercentage) {
        super(amount,taxAmount,taxPercentage);
        this.name = name;


    }

    /**
     * Instantiates a new InvoiceDetailItem.
     */
    public InvoiceDetailItem() {

    }

    /**
     * Gets the Name of the item.
     *
     * @return Value of the Name of the item.
     */
    public String getName() { return name; }

    /**
     * Sets new the Name of the item.
     *
     * @param name New value of the Name of the item.
     */
    public void setName(String name) { this.name = name; }


}

package com.zooz.common.client.ecomm.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zooz.common.client.ecomm.beans.AbstractJsonBean;

/**
 * Invoice detail items - used for refund and capture invoices
 */


@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceDetailAmountItem extends AbstractJsonBean {

    /**
     * The amount of the item
     */
    @JsonProperty
    private double amount;
    /**
     * The tax percent of the item
     */
    @JsonProperty
    private Double taxPercentage;
    /**
     * The tax amount for the item
     */
    @JsonProperty
    private Double taxAmount;


    /**
     * Instantiates a new InvoiceDetailAmountItem.
     *
     * @param amount            amount of the item
     * @param taxAmount         Tax amount for the item
     * @param taxPercentage        Tax percent for the item
     */
    public InvoiceDetailAmountItem( double amount, Double taxAmount, Double taxPercentage) {

        this.amount = amount;
        this.taxAmount = taxAmount;
        this.taxPercentage = taxPercentage;

    }

    /**
     * Instantiates a new InvoiceDetailAmountItem.
     */
    public InvoiceDetailAmountItem() {

    }


    /**
     * Gets the tax percent  of the item.
     *
     * @return Value of the tax percent of the item.
     */
    public Double getTaxPercentage() { return taxPercentage; }

    /**
     * Sets new tax percent for thr item.
     *
     * @param taxPercentage New value of the tax percent of thr item.
     */
    public void setTaxPercentage(Double taxPercentage ) { this.taxPercentage = taxPercentage; }

    /**
     * Gets the amount of the item.
     *
     * @return Value of the amount of the item.
     */
    public double getAmount() { return amount; }

    /**
     * Sets new amount for the item.
     *
     * @param amount New value of the amount of the item.
     */
    public void setAmount(double amount) { this.amount = amount; }

    /**
     * Gets the tax amount of the item.
     *
     * @return Value of the tax amount of the item.
     */
    public Double getTaxAmount() { return taxAmount; }

    /**
     * Sets new the tax amount for the item.
     *
     * @param taxAmount New value of the tax amount for the item.
     */
    public void setTaxAmount(Double taxAmount) { this.taxAmount = taxAmount; }



}

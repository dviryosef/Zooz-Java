package com.zooz.common.client.ecomm.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by yigalpinhasi on 8/24/15.
 * <p>
 * The set of parameters included in a Invoice Amount Item .
 * The InvoiceAmountItem id must appear in the payment invoice items id.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceAmountItem extends AbstractJsonBean {

    /**
     * The identifier for the item
     */
    @JsonProperty
    private String id;
    /**
     * The amount request of the item
     */
    @JsonProperty
    private double amount;


    /**
     * Instantiates a new Invoice amount item.
     */
    public InvoiceAmountItem() {

    }

    /**
     * Instantiates a new Invoice Amount item.
     *
     * @param id     the id
     * @param amount the amount
     */
    public InvoiceAmountItem(String id, double amount) {
        this.id = id;
        this.amount = amount;
    }


    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }


    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
        this.id = id;
    }


    /**
     * Gets amount.
     *
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }


    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }
}




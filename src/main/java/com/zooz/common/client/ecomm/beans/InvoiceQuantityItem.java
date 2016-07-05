package com.zooz.common.client.ecomm.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by adi topaz on 6/3/16.
 * <p>
 * The set of parameters included in a Invoice quantity Item .
 * The InvoiceQuantityItem id must appear in the payment invoice items id.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceQuantityItem extends AbstractJsonBean {

    /**
     * The identifier for the item
     */
    @JsonProperty
    private String id;
    /**
     * The amount request of the item
     */
    @JsonProperty
    private double quantity;


    /**
     * Instantiates a new Invoice quantity item.
     */
    public InvoiceQuantityItem() {

    }

    /**
     * Instantiates a new Invoice Quantity item.
     *
     * @param id       the id
     * @param quantity the quantity
     */
    public InvoiceQuantityItem(String id, double quantity) {
        this.id = id;
        this.quantity = quantity;
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
     * Gets quantity.
     *
     * @return the quantity
     */
    public double getQuantity() {
        return quantity;
    }


    /**
     * Sets quantity.
     *
     * @param quantity the quantity
     */
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}




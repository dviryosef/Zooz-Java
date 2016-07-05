package com.zooz.common.client.ecomm.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Invoice items refer to the parameters included in an invoice.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceItem extends AbstractJsonBean {
    /**
     * The Name of the item
     */
    @JsonProperty
    private String name;
    /**
     * The identifier for the item
     */
    @JsonProperty
    private String id;
    /**
     * The quantity of the item
     */
    @JsonProperty
    private double quantity;
    /**
     * The price of the item
     */
    @JsonProperty
    private double price;
    /**
     * The additional details for the item
     */
    @JsonProperty
    private String additionalDetails;
    /**
     * The tax amount for the item
     */
    @JsonProperty
    private double taxAmount;
    /**
     * The tax percent for the item
     */
    @JsonProperty
    private Double taxPercentage;

    /**
     * Instantiates a new Invoice item.
     *
     * @param name              Name of the item
     * @param id                Identifier for the item
     * @param quantity          Quantity of the item
     * @param price             Price of the item
     * @param additionalDetails Additional details for the item
     * @param taxAmount         Tax amount for the item
     */
    public InvoiceItem(String name, String id, double quantity, double price, String additionalDetails, double taxAmount) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.additionalDetails = additionalDetails;
        this.taxAmount = taxAmount;
    }

    /**
     * Instantiates a new Invoice item.
     *
     * @param name              Name of the item
     * @param id                Identifier for the item
     * @param quantity          Quantity of the item
     * @param price             Price of the item
     * @param additionalDetails Additional details for the item
     * @param taxAmount         Tax amount for the item
     * @param taxPercentage        Tax percent for the item
     */
    public InvoiceItem(String name, String id, double quantity, double price, String additionalDetails, double taxAmount,Double taxPercentage) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.additionalDetails = additionalDetails;
        this.taxAmount = taxAmount;
        this.taxPercentage = taxPercentage;
    }


    /**
     * Instantiates a new Invoice item.
     */
    public InvoiceItem() {

    }


    /**
     * Gets the identifier of the item.
     *
     * @return Value of the identifier of the item.
     */
    public String getId() { return id; }

    /**
     * Sets new identifier for thr item.
     *
     * @param id New value of the identifier of thr item.
     */
    public void setId(String id) { this.id = id; }

    /**
     * Gets the price of the item.
     *
     * @return Value of the price of the item.
     */
    public double getPrice() { return price; }

    /**
     * Sets new price for the item.
     *
     * @param price New value of the price of the item.
     */
    public void setPrice(double price) { this.price = price; }

    /**
     * Gets the additional details of the item.
     *
     * @return Value of the additional details of the item.
     */
    public String getAdditionalDetails() { return additionalDetails; }

    /**
     * Sets new additional details for the item.
     *
     * @param additionalDetails New value of the additional details for the item.
     */
    public void setAdditionalDetails(String additionalDetails) { this.additionalDetails = additionalDetails; }

    /**
     * Gets the tax amount of the item.
     *
     * @return Value of the tax amount of the item.
     */
    public double getTaxAmount() { return taxAmount; }

    /**
     * Sets new the tax amount for the item.
     *
     * @param taxAmount New value of the tax amount for the item.
     */
    public void setTaxAmount(double taxAmount) { this.taxAmount = taxAmount; }

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

    /**
     * Gets the quantity of the item.
     *
     * @return Value of the quantity of the item.
     */
    public double getQuantity() { return quantity; }

    /**
     * Sets new quantity for the item.
     *
     * @param quantity New value of the quantity of the item.
     */
    public void setQuantity(double quantity) { this.quantity = quantity; }

    /**
     * Gets the tax percent of the item.
     *
     * @return Value of the tax percent of the item.
     */
    public Double getTaxPercentage() { return taxPercentage; }

    /**
     * Sets new tax percent for the item.
     *
     * @param taxPercentage New value of the tax percent of the item.
     */
    public void setTaxPercentage(Double taxPercentage) { this.taxPercentage = taxPercentage; }
}

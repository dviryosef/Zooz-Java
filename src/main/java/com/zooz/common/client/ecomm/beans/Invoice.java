package com.zooz.common.client.ecomm.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * The set of invoice items that make up an invoice.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Invoice extends AbstractJsonBean {
    /**
     * Invoice identifier for the transaction
     */
    @JsonProperty
    private String number;
    /**
     * Attach additional details to the invoice
     */
    @JsonProperty
    private String additionalDetails;

    /**
     * Attached shipping details
     */
    @JsonProperty
    private InvoiceShippingDetailsItem shippingDetails;

    /**
     * Attached handling details
     */
    @JsonProperty
    private InvoiceDetailItem handlingDetails;

    /**
     * Attached discount details
     */
    @JsonProperty
    private InvoiceDetailItem discountDetails;
    /**
     * List of invoice Items
     */
    @JsonProperty
    private List<InvoiceItem> items;

    /**
     * Instantiates a new Invoice.
     *
     * @param number            Invoice identifier for the transaction
     * @param additionalDetails Additional details to the invoice
     * @param items             List of invoice Items
     */
    public Invoice(String number, String additionalDetails, List<InvoiceItem> items) {
        this.number = number;
        this.additionalDetails = additionalDetails;
        this.items = items;
    }

    /**
     * Instantiates a new Invoice with shipping,handling and discount details.
     *
     * @param number            Invoice identifier for the transaction
     * @param additionalDetails Additional details to the invoice
     * @param items             List of invoice Items
     * @param shippingDetails   shipping details of the invoice
     * @param handlingDetails   handling details of the invoice
     * @param discountDetails   discount details of the invoice
     */
    public Invoice(String number,
                   String additionalDetails,
                   List<InvoiceItem> items,
                   InvoiceShippingDetailsItem shippingDetails,
                   InvoiceDetailItem handlingDetails,
                   InvoiceDetailItem discountDetails) {
        this.number = number;
        this.additionalDetails = additionalDetails;
        this.items = items;
        this.shippingDetails = shippingDetails;
        this.handlingDetails = handlingDetails;
        this.discountDetails = discountDetails;
    }

    /**
     * Instantiates a new Invoice.
     */
    public Invoice() {
    }

    /**
     * Gets the number.
     *
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the number.
     *
     * @param number the number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Gets the additional details.
     *
     * @return the additional details
     */
    public String getAdditionalDetails() {
        return additionalDetails;
    }

    /**
     * Sets the additional details.
     *
     * @param additionalDetails the additional details
     */
    public void setAdditionalDetails(String additionalDetails) {
        this.additionalDetails = additionalDetails;
    }

    /**
     * Gets the items.
     *
     * @return the items
     */
    public List<InvoiceItem> getItems() {
        return items;
    }

    /**
     * Sets the items.
     *
     * @param items the items
     */
    public void setItems(List<InvoiceItem> items) {
        this.items = items;
    }

    /**
     * Gets the shipping details.
     *
     * @return the shipping details
     */
    public InvoiceShippingDetailsItem getShippingDetails() {
        return shippingDetails;
    }

    /**
     * Sets the shipping details.
     *
     * @param shippingDetails the shipping details
     */
    public void setShippingDetails(InvoiceShippingDetailsItem shippingDetails) {
        this.shippingDetails = shippingDetails;
    }

    /**
     * Gets the handlingDetails.
     *
     * @return the handling details
     */
    public InvoiceDetailItem getHandlingDetails() {
        return handlingDetails;
    }

    /**
     * Sets the handling details.
     *
     * @param handlingDetails the handling details
     */
    public void setHandlingDetails(InvoiceDetailItem handlingDetails) {
        this.handlingDetails = handlingDetails;
    }

    /**
     * Gets the discount details.
     *
     * @return the discount details
     */
    public InvoiceDetailItem getDiscountDetails() {
        return discountDetails;
    }

    /**
     * Sets the discount details.
     *
     * @param discountDetails the discount detailsi
     */
    public void setDiscountDetails(InvoiceDetailItem discountDetails) {
        this.discountDetails = discountDetails;
    }
}

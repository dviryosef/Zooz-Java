package com.zooz.common.client.ecomm.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * The set of invoice items that make up an invoice.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReferenceInvoice extends AbstractJsonBean {


    /**
     * Attached shipping details
     */
    @JsonProperty
    private InvoiceDetailAmountItem shippingDetails;

    /**
     * Attached handling details
     */
    @JsonProperty
    private InvoiceDetailAmountItem handlingDetails;

    /**
     * Attached discount details
     */
    @JsonProperty
    private InvoiceDetailAmountItem discountDetails;
    /**
     * List of invoice Items
     */
    @JsonProperty
    private List<InvoiceQuantityItem> items;
    /**
     * the invoiceNumber
     */
    @JsonProperty
    private String number;

    /**
     * Instantiates a new ReferenceInvoiceBase.
     *
     * @param shippingDetails   Invoice shipping amount details
     * @param handlingDetails   Invoice handling amount details
     * @param discountDetails   Invoice discount amount details
     * @param items             List of invoice Items
     */
    public ReferenceInvoice(InvoiceDetailAmountItem shippingDetails,
                            InvoiceDetailAmountItem handlingDetails,
                            InvoiceDetailAmountItem discountDetails,
                            List<InvoiceQuantityItem> items,
                            String number) {
        this.shippingDetails = shippingDetails;
        this.handlingDetails = handlingDetails;
        this.discountDetails = discountDetails;
        this.items = items;
        this.number = number;


    }


    /**
     * Instantiates a new ReferenceInvoice.
     */
    public ReferenceInvoice() {
    }

    /**
     * Gets the shipping amount details.
     *
     * @return the shipping amount details
     */
    public InvoiceDetailAmountItem getShippingDetails() {
        return shippingDetails;
    }

    /**
     * Sets the shipping amount details.
     *
     * @param shippingDetails the shipping amount details
     */
    public void setShippingAmountDetails(InvoiceDetailAmountItem shippingDetails) {
        this.shippingDetails = shippingDetails;
    }

    /**
     * Gets the handling amount details.
     *
     * @return the handling amount details
     */
    public InvoiceDetailAmountItem getHandlingDetails() {
        return handlingDetails;
    }

    /**
     * Sets the handling amount details.
     *
     * @param handlingDetails the handling amount details
     */
    public void setHandlingDetails(InvoiceDetailAmountItem handlingDetails) {
        this.handlingDetails = handlingDetails;
    }

    /**
     * Gets the discount amount details.
     *
     * @return the discount amount details
     */
    public InvoiceDetailAmountItem getDiscountDetails() {
        return discountDetails;
    }

    /**
     * Sets the discount amount details.
     *
     * @param discountDetails the discount amount details
     */
    public void setDiscountDetails(InvoiceDetailAmountItem discountDetails) {
        this.discountDetails = discountDetails;
    }

    /**
     * Gets the items.
     *
     * @return the items
     */
    public List<InvoiceQuantityItem> getItems() {
        return items;
    }

    /**
     * Sets the items.
     *
     * @param items the items
     */
    public void setItems(List<InvoiceQuantityItem> items) {
        this.items = items;
    }

}

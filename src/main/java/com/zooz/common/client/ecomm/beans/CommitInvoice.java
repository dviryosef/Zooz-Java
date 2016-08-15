package com.zooz.common.client.ecomm.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * The set of invoice items that make up an invoice.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CommitInvoice extends ReferenceInvoice {


    /**
     *  payment due date
     */
    @JsonProperty
    private String delayDate;


    /**
     * Instantiates a new CommitInvoice.
     *  @param shippingAmountDetails   Invoice shipping amount details
     * @param handlingAmountDetails   Invoice handling amount details
     * @param discountAmountDetails   Invoice discount amount details
     * @param items                   List of invoice Items
     * @param delayDate             The payment due date
     * @param number                invoice number
     */
    public CommitInvoice(InvoiceDetailAmountItem shippingAmountDetails,
                         InvoiceDetailAmountItem handlingAmountDetails,
                         InvoiceDetailAmountItem discountAmountDetails,
                         List<InvoiceQuantityItem> items,
                         String delayDate,
                         String number) {
        super(shippingAmountDetails,handlingAmountDetails,discountAmountDetails,items,number);
        this.delayDate = delayDate;
    }


    /**
     * Instantiates a new CommitInvoice.
     */
    public CommitInvoice() {
        super();
    }

    /**
     * Gets the payment due date.
     *
     * @return the payment due date
     */
    public String getDelayDate() {
        return delayDate;
    }

    /**
     * Sets the payment due date.
     *
     * @param delayDate the payment due date
     */
    public void setDelayDate(String delayDate) {
        this.delayDate = delayDate;
    }


}

package com.zooz.common.client.ecomm.beans.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.zooz.common.client.ecomm.beans.CommitInvoice;
import com.zooz.common.client.ecomm.beans.InvoiceAmountItem;
import com.zooz.common.client.ecomm.beans.responses.CommitResponse;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;
import com.zooz.common.client.ecomm.control.CommonParameters;

import java.util.List;

/**
 * This call performs payment capture, it captures the payment that was previously authorized.
 * CommitPayment can be called only on a previously authorized payment.
 * Please note that authorizations have an expiration period as defined by the acquirer.
 * Zooz tries automatically to create a new payment if the time has expired.
 * After the expiration time the success of the capture is not guaranteed.
 */
public class CommitRequest extends AbstractZoozRequest {
    /**
     * The token from "openPayment"
     */
    @JsonProperty
    private String paymentToken;
    /**
     * Optional, If supplied, then this is the amount to be captured,
     * Else, the original amount from "openPayment" will be captured.
     */
    @JsonProperty
    private Double amount;
    /**
     * The invoice to capture
     */
    @JsonProperty
    private CommitInvoice invoice;

    /**
     * List of captured invoice amount Items
     */
    @JsonProperty
    private List<InvoiceAmountItem> items;

    /**
     * Unique id that identify the commit request:
     * new id for a new commit request/ reused id for a retry request after timeout failure
     */
    @JsonProperty
    private String uniqueTransactionID;
    /**
     * Unique ID used to reconcile transactions, Received from processor
     * Note that this parameter might be different from "reconciliationId" parameter passed in the request due to processor changes.
     */
    @JsonProperty
    private String reconciliationId;

    /**
     * Instantiates a new Commit request.
     *
     * @param paymentToken The token from "openPayment"
     * @param amount       Optional. If supplied, then this is the amount to be captured. Else, the original amount from "openPayment" will be captured.
     * @deprecated - from now on use the constructor with  uniqueTransactionId
     */
    @Deprecated
    public CommitRequest(String paymentToken, Double amount) {
        super(CommonParameters.commitPayment);
        this.paymentToken = paymentToken;
        this.amount = amount;
    }


    /**
     * Instantiates a new Commit request with invoice - use for integration with invoice payment providers.
     *
     * @param paymentToken        The token from "openPayment"
     * @param amount              Optional. If supplied, then this is the amount to be captured. Else, the original amount  from "openPayment" will be captured.
     * @param uniqueTransactionID Unique id that identify the commit request:  new id for a new commit request/ reused id for a retry request after timeout failure
     * @param invoice             - the invoice items to capture along with shipping,handling,discount and payment due date.
     */
    public CommitRequest(String paymentToken, Double amount, String uniqueTransactionID,CommitInvoice invoice) {
        super(CommonParameters.commitPayment);
        this.paymentToken = paymentToken;
        this.amount = amount;
        this.uniqueTransactionID = uniqueTransactionID;
        this.invoice = invoice;
    }

    /**
     * Instantiates a new Commit request.
     *
     * @param paymentToken        The token from "openPayment"
     * @param amount              Optional. If supplied, then this is the amount to be captured. Else, the original amount from "openPayment" will be captured.
     * @param uniqueTransactionID Unique id that identify the commit request: new id for a new commit request/ reused id for a retry request after timeout failure
     */
    public CommitRequest(String paymentToken, Double amount, String uniqueTransactionID) {
        super(CommonParameters.commitPayment);
        this.paymentToken = paymentToken;
        this.amount = amount;
        this.uniqueTransactionID = uniqueTransactionID;
    }


    /**
     * Returns the paymentToken for the current authorized payment
     * The paymentToken is the same paymentToken from "openPayment".
     *
     * @return a payment token.
     */
    public String getPaymentToken() {
        return paymentToken;
    }

    /**
     * Sets the paymentToken for the current authorized payment.
     * The paymentToken is the same paymentToken from "openPayment".
     *
     * @param paymentToken a payment token.
     */
    public void setPaymentToken(String paymentToken) {
        this.paymentToken = paymentToken;
    }

    /**
     * The total amount to pay.
     *
     * @return the amount
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * The total amount to pay.
     *
     * @param amount the wanted amount.
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * Gets the unique transaction ID.
     *
     * @return the unique transaction ID
     */
    public String getUniqueTransactionID() {
        return uniqueTransactionID;
    }

    /**
     * Sets the unique transaction ID.
     *
     * @param uniqueTransactionID the unique transaction ID
     */
    public void setUniqueTransactionID(String uniqueTransactionID) {
        this.uniqueTransactionID = uniqueTransactionID;
    }

    /**
     * Gets the reconciliation id.
     *
     * @return the reconciliation id
     */
    public String getReconciliationId() {
        return reconciliationId;
    }

    /**
     * Sets the reconciliation id.
     *
     * @param reconciliationId the reconciliation id
     */
    public void setReconciliationId(String reconciliationId) {
        this.reconciliationId = reconciliationId;
    }

    /**
     * Returns the invoice for capture
     *
     * @return the invoice for capture
     */
    public CommitInvoice getInvoice() {
        return invoice;
    }

    /**
     * Sets the commit invoice
     *
     * @param invoice the invoice to commit
     */
    public void setInvoice(CommitInvoice invoice) {
        this.invoice = invoice;
    }

    /**
     * Gets items.
     *
     * @return items
     */
    public List<InvoiceAmountItem> getItems() {
        return items;
    }

    /**
     * Sets items.
     *
     * @param items the items
     */
    public void setItems(List<InvoiceAmountItem> items) {
        this.items = items;
    }

    /**
     * Used to return the response type corresponding to the request.
     *
     * @return the corresponding response type.
     */
    @Override
    @JsonIgnore
    public TypeReference<ZoozServerResponse<CommitResponse>> getResponseTypeReference() {
        return new TypeReference<ZoozServerResponse<CommitResponse>>() {
        };
    }
}

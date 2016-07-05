package com.zooz.common.client.ecomm.beans.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.zooz.common.client.ecomm.beans.InvoiceAmountItem;
import com.zooz.common.client.ecomm.beans.ReferenceInvoice;
import com.zooz.common.client.ecomm.beans.enums.RefundReason;
import com.zooz.common.client.ecomm.beans.responses.RefundResponse;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;
import com.zooz.common.client.ecomm.control.CommonParameters;

import java.util.List;

/**
 * This is the call for payment refunding; it refunds the payment previously captured. refundPayment can only be called on a previously captured payment.
 * Instead of refunding an entire payment, merchants can refund partial payment amounts, as different products from an order are returned.
 * Up to five refund transactions can be performed on the original payment; however, the total amount refunded cannot exceed the original payment amount authorized.
 * Note: Multiple refunds on same payment are not supported by all processors and need to be enabled on the Zooz backoffice.
 * Please note that refunds have expiration periods defined by the acquirer.
 * Zooz applies a six-month expiration period for refunding a payment.
 */
public class RefundRequest extends AbstractZoozRequest {
    /**
     * The token from "openPayment"
     */
    @JsonProperty
    private String paymentToken;
    /**
     * Optional, If supplied, then this is the amount to be refunded,
     * Else, the original amount from "openPayment" will be refunded.
     */
    @JsonProperty
    private Double amount;
    /**
     * Returns the reason for the refund.
     * the available reasons are mention in the "RefundReason" enum.
     */
    @JsonProperty
    private RefundReason refundReason;
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
     * List of invoice Items
     */
    @JsonProperty
    private List<InvoiceAmountItem> items;

    /**
     * Refund invoice
     */
    @JsonProperty
    private ReferenceInvoice invoice;

    /**
     * Zooz actionID
     */
    @JsonProperty
    private String actionID;

    /**
     * Instantiates a new Refund request.
     *
     * @param paymentToken The token from "openPayment"
     * @param amount Optional. If provided, then this is the amount to be refunded. Else, the captured amount will be refunded
     * @deprecated - from now on use the constructor with  uniqueTransactionId
     */
    @Deprecated
    public RefundRequest(String paymentToken, Double amount) {
        super(CommonParameters.refundPayment);
        this.paymentToken = paymentToken;
        this.amount = amount;
    }

    /**
     * Instantiates a new Refund request.
     *
     * @param paymentToken        The token from "openPayment"
     * @param amount              Optional. If supplied, then this is the amount to be captured. Else, the original amount from "openPayment" will be captured.
     * @param uniqueTransactionID Unique id that identify the commit request: new id for a new commit request/ reused id for a retry request after timeout failure
     */
    public RefundRequest(String paymentToken, Double amount, String uniqueTransactionID) {
        super(CommonParameters.refundPayment);
        this.paymentToken = paymentToken;
        this.amount = amount;
        this.uniqueTransactionID = uniqueTransactionID;
    }

    /**
     * Instantiates a new Refund request.
     *
     * @param paymentToken        The token from "openPayment"
     * @param amount              Optional. If supplied, then this is the amount to be captured. Else, the original amount from "openPayment" will be captured.
     * @param uniqueTransactionID Unique id that identify the commit request: new id for a new commit request/ reused id for a retry request after timeout failure
     * @param invoice             the refund invoice including the invoice items,shipping items amounts,hadling items amount, discount items amount and commit refence.
     * @param actionID            the action id retured in the capture response
     */
    public RefundRequest(String paymentToken, Double amount, String uniqueTransactionID,ReferenceInvoice invoice,String actionID) {
        super(CommonParameters.refundPayment);
        this.paymentToken = paymentToken;
        this.amount = amount;
        this.uniqueTransactionID = uniqueTransactionID;
        this.invoice = invoice;
        this.actionID = actionID;
    }

    /**
     * Gets payment token.
     *
     * @return the payment token
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
     * The total amount to refund.
     *
     * @return the amount
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * The total amount to refund.
     *
     * @param amount the wanted amount.
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * Returns the reason for the refund.
     * the available reasons are mention in the "RefundReason" enum.
     *
     * @return the refund reason
     */
    public RefundReason getRefundReason() {
        return refundReason;
    }

    /**
     * Sets the reason for the refund.
     * the available reasons are mention in the "RefundReason" enum.
     *
     * @param refundReason The reason for the refund.
     */
    public void setRefundReason(RefundReason refundReason) {
        this.refundReason = refundReason;
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
     * Gets items.
     *
     * @return invoice amount items
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
     * Gets refund invoice.
     *
     * @return Returns the invoice for
     */
    public ReferenceInvoice getRefundInvoice() {
        return invoice;
    }

    /**
     * Sets the refund invoice
     *
     * @param invoice the invoice to refund
     */
    public void setInvoice(ReferenceInvoice invoice) {
        this.invoice = invoice;
    }


    /**
     * Sets the zooz actionID
     *
     * @param actionID the zooz actionID
     */
    public void setActionID(String actionID) {
        this.actionID = actionID;
    }

    /**
     * Gets action id.
     *
     * @return Returns zooz Action id
     */
    public String getActionID() {
        return actionID;
    }


    /**
     * Used to return the response type corresponding to the request.
     *
     * @return the corresponding response type.
     */
    @Override
    @JsonIgnore
    public TypeReference<ZoozServerResponse<RefundResponse>> getResponseTypeReference() {
        return new TypeReference<ZoozServerResponse<RefundResponse>>() {
        };
    }
}

package com.zooz.common.client.ecomm.beans.requests.authorize.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zooz.common.client.ecomm.beans.Invoice;
import com.zooz.common.client.ecomm.beans.PaymentMethod;
import com.zooz.common.client.ecomm.control.CommonParameters;

/**
 * This is the abstract for performing a sale operation on a specified payment token for a specific payment method.
 */
public class AbstractSaleRequest extends AbstractUserPurchaseRequest {

    @JsonProperty
    private Double amount;

    /**
     * A Zooz invoice object.
     */
    @JsonProperty
    private Invoice invoice;

    /**
     * Unique id that identify the sale request.
     * Reused id for a retry request after timeout failure
     */
    @JsonProperty
    private String uniqueTransactionID;


    /**
     * Instantiates a new abstract sale request.
     *
     * @param paymentToken     the paymentToken from "openPayment"
     * @param paymentMethod    the selected payment method { CreditCard, AliPay, PayEase, PayPal }
     * @param amount           Optional. If supplied, then this is the amount to be captured. Else, the original amount
     *                         from "openPayment" will be captured.
     * @param invoice          a new invoice to the payment.
     * @param reconciliationId Unique ID used to reconcile transactions, Received from processor
     *                         Note that this parameter might be different from "reconciliationId" parameter passed in the request due to processor changes.
     * @deprecated replaced by constructor with an additional emailAddress parameter
     */
    @Deprecated
    protected AbstractSaleRequest(String paymentToken, PaymentMethod paymentMethod, Double amount, Invoice invoice, String reconciliationId) {
        this(paymentToken, null, paymentMethod, amount, invoice, reconciliationId);
    }

    /**
     * Instantiates a new abstract sale request with an IP address.
     *
     * @param paymentToken     the paymentToken from "openPayment"
     * @param ipAddress        IPv4 Address of the end user browser
     * @param paymentMethod    the selected payment method { CreditCard, AliPay, PayEase, PayPal }
     * @param amount           Optional. If supplied, then this is the amount to be captured. Else, the original amount
     *                         from "openPayment" will be captured.
     * @param invoice          a new invoice to the payment.
     * @param reconciliationId Unique ID used to reconcile transactions, Received from processor
     *                         Note that this parameter might be different from "reconciliationId" parameter passed in the request due to processor changes.               *
     * @deprecated replaced by constructor with an additional emailAddress parameter
     */
    @Deprecated
    protected AbstractSaleRequest(String paymentToken, String ipAddress, PaymentMethod paymentMethod, Double amount, Invoice invoice, String reconciliationId) {
        super(CommonParameters.sale, paymentToken, ipAddress, paymentMethod, reconciliationId, null);
        this.amount = amount;
        this.invoice = invoice;
    }

    /**
     * Instantiates a new abstract sale request with an IP address.
     *
     * @param paymentToken     the paymentToken from "openPayment"
     * @param ipAddress        IPv4 Address of the end user browser
     * @param paymentMethod    the selected payment method { CreditCard, AliPay, PayEase, PayPal }
     * @param amount           Optional. If supplied, then this is the amount to be captured. Else, the original amount
     *                         from "openPayment" will be captured.
     * @param invoice          a new invoice to the payment.
     * @param reconciliationId Unique ID used to reconcile transactions, Received from processor
     *                         Note that this parameter might be different from "reconciliationId" parameter passed in the request due to processor changes.
     * @param emailAddress     user email address
     */
    protected AbstractSaleRequest(String paymentToken, String ipAddress, PaymentMethod paymentMethod, Double amount, Invoice invoice, String reconciliationId, String emailAddress) {
        this(paymentToken, ipAddress, paymentMethod, amount, invoice, reconciliationId, emailAddress, null);
    }


    /**
     * Instantiates a new abstract sale request with an IP address.
     *
     * @param paymentToken        the paymentToken from "openPayment"
     * @param ipAddress           IPv4 Address of the end user browser
     * @param paymentMethod       the selected payment method { CreditCard, AliPay, PayEase, PayPal }
     * @param amount              Optional. If supplied, then this is the amount to be captured. Else, the original amount
     *                            from "openPayment" will be captured.
     * @param invoice             a new invoice to the payment.
     * @param reconciliationId    Unique ID used to reconcile transactions, Received from processor
     *                            Note that this parameter might be different from "reconciliationId" parameter passed in the request due to processor changes.
     * @param emailAddress        user email address
     * @param uniqueTransactionID Unique id that identify the sale request
     */
    protected AbstractSaleRequest(String paymentToken, String ipAddress, PaymentMethod paymentMethod, Double amount, Invoice invoice, String reconciliationId,
                                  String emailAddress, String uniqueTransactionID) {
        super(CommonParameters.sale, paymentToken, ipAddress, paymentMethod, reconciliationId, emailAddress);
        this.amount = amount;
        this.invoice = invoice;
        this.uniqueTransactionID = uniqueTransactionID;
    }

    /**
     * Returns A Zooz invoice object.
     *
     * @return A Zooz invoice object.
     */
    public Invoice getInvoice() {
        return invoice;
    }

    /**
     * Sets a new invoice to the payment.
     *
     * @param invoice A Zooz invoice object.
     */
    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
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
     * The uniqueTransactionID.
     *
     * @return the uniqueTransactionID
     */
    public String getUniqueTransactionID() {
        return uniqueTransactionID;
    }

    /**
     * The uniqueTransactionID.
     *
     * @param uniqueTransactionID the uniqueTransactionID.
     */
    public void setUniqueTransactionID(String uniqueTransactionID) {
        this.uniqueTransactionID = uniqueTransactionID;
    }

}

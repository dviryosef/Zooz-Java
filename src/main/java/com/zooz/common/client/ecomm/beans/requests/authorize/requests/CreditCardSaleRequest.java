package com.zooz.common.client.ecomm.beans.requests.authorize.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.zooz.common.client.ecomm.beans.Invoice;
import com.zooz.common.client.ecomm.beans.PaymentInstallment;
import com.zooz.common.client.ecomm.beans.PaymentMethod;
import com.zooz.common.client.ecomm.beans.ThreeDSecureAttributes;
import com.zooz.common.client.ecomm.beans.enums.PaymentMethodType;
import com.zooz.common.client.ecomm.beans.responses.SaleResponse;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;

/**
 * The sale request for credit card payments.
 */
public class CreditCardSaleRequest extends AbstractInstallmentsSaleRequest {

     /**
     * The payment installments details.
     */
    @JsonProperty
    private PaymentInstallment paymentInstallments;

    /**
     * Instantiates a new Credit card Sale request.
     *
     * @param paymentToken       The token from "openPayment"
     * @param paymentMethodToken The paymentMethodToken of the selected payment method.
     * @param cvvNumber          CVV number of the selected credit card.
     * @param amount             Optional. If supplied, then this is the amount to be captured. Else, the original amount
     *                           from "openPayment" will be captured.
     * @param invoice            a new invoice to the payment.
     * @param reconciliationId   Unique ID used to reconcile transactions, Received from processor
     *                           Note that this parameter might be different from "reconciliationId" parameter passed in the request due to processor changes.
     * @deprecated Replaced by constructor with an additional emailAddress parameter
     */
    @Deprecated
    public CreditCardSaleRequest(String paymentToken, String paymentMethodToken, String cvvNumber, Double amount, Invoice invoice, String reconciliationId) {
        super(paymentToken, null, new PaymentMethod(paymentMethodToken, PaymentMethodType.CreditCard, cvvNumber, null, false), amount, invoice, reconciliationId, null, null);
    }

    /**
     * Instantiates a new Credit card sale request with an IP address
     *
     * @param paymentToken       The token from "openPayment"
     * @param paymentMethodToken The paymentMethodToken of the selected payment method.
     * @param ipAddress          IPv4 Address of the end user browser
     * @param cvvNumber          CVV number of the selected credit card.
     * @param amount             Optional. If supplied, then this is the amount to be captured. Else, the original amount
     *                           from "openPayment" will be captured.
     * @param invoice            a new invoice to the payment.
     * @param reconciliationId   Unique ID used to reconcile transactions, Received from processor
     *                           Note that this parameter might be different from "reconciliationId" parameter passed in the request due to processor changes.
     * @deprecated Replaced by constructor with an additional emailAddress parameter
     */
    @Deprecated
    public CreditCardSaleRequest(String paymentToken, String paymentMethodToken, String ipAddress, String cvvNumber, Double amount, Invoice invoice, String reconciliationId) {
        super(paymentToken, ipAddress, new PaymentMethod(paymentMethodToken, PaymentMethodType.CreditCard, cvvNumber, null, false), amount, invoice, reconciliationId, null, null);
    }


    /**
     * Instantiates a new Credit card sale request with an IP address
     *
     * @param paymentToken       The token from "openPayment"
     * @param paymentMethodToken The paymentMethodToken of the selected payment method.
     * @param ipAddress          IPv4 Address of the end user browser
     * @param cvvNumber          CVV number of the selected credit card.
     * @param amount             Optional. If supplied, then this is the amount to be captured. Else, the original amount
     *                           from "openPayment" will be captured.
     * @param invoice            a new invoice to the payment.
     * @param reconciliationId   Unique ID used to reconcile transactions, Received from processor
     *                           Note that this parameter might be different from "reconciliationId" parameter passed in the request due to processor changes.
     * @param emailAddress       user email address
     */
    public CreditCardSaleRequest(String paymentToken, String paymentMethodToken, String ipAddress, String cvvNumber, Double amount, Invoice invoice, String reconciliationId,
                                 String emailAddress) {
        this (paymentToken, paymentMethodToken, ipAddress, cvvNumber, amount, invoice, reconciliationId, emailAddress, null);
    }

    /**
     * Instantiates a new Credit card sale request with an IP address
     *
     * @param paymentToken        The token from "openPayment"
     * @param paymentMethodToken  The paymentMethodToken of the selected payment method.
     * @param ipAddress           IPv4 Address of the end user browser
     * @param cvvNumber           CVV number of the selected credit card.
     * @param amount             Optional. If supplied, then this is the amount to be captured. Else, the original amount
     *                           from "openPayment" will be captured.
     * @param invoice             a new invoice to the payment.
     * @param reconciliationId   Unique ID used to reconcile transactions, Received from processor
     *                           Note that this parameter might be different from "reconciliationId" parameter passed in the request due to processor changes.
     * @param emailAddress        user email address
     * @param uniqueTransactionID Unique id that identify the sale request
     */
    public CreditCardSaleRequest(String paymentToken, String paymentMethodToken, String ipAddress, String cvvNumber, Double amount, Invoice invoice, String reconciliationId,
                                 String emailAddress, String uniqueTransactionID) {
        super(paymentToken, ipAddress, new PaymentMethod(paymentMethodToken, PaymentMethodType.CreditCard, cvvNumber, null, false), amount, invoice, reconciliationId,
                emailAddress, uniqueTransactionID);
    }


    /**
     * Instantiates a new Credit card sale request with an IP address
     *
     * @param paymentToken           The token from "openPayment"
     * @param paymentMethodToken     The paymentMethodToken of the selected payment method.
     * @param ipAddress              IPv4 Address of the end user browser
     * @param cvvNumber              CVV number of the selected credit card.
     * @param amount             Optional. If supplied, then this is the amount to be captured. Else, the original amount
*                           from "openPayment" will be captured.
     * @param invoice                a new invoice to the payment.
     * @param reconciliationId   Unique ID used to reconcile transactions, Received from processor
*                           Note that this parameter might be different from "reconciliationId" parameter passed in the request due to processor changes.
     * @param emailAddress           user email address
     * @param uniqueTransactionID    Unique id that identify the sale request
     * @param threeDSecureAttributes the three d secure attributes
     */
    public CreditCardSaleRequest(String paymentToken, String paymentMethodToken, String ipAddress, String cvvNumber, Double amount, Invoice invoice, String reconciliationId,
                                 String emailAddress, String uniqueTransactionID, ThreeDSecureAttributes threeDSecureAttributes) {
        super(paymentToken, ipAddress, new PaymentMethod(paymentMethodToken, PaymentMethodType.CreditCard, cvvNumber, null, false, threeDSecureAttributes), amount, invoice, reconciliationId,
                emailAddress, uniqueTransactionID);
    }


    /**
     * Gets the payment installments.
     *
     * @return Details of the payment installments.
     */
    public PaymentInstallment getPaymentInstallments() { return paymentInstallments; }

    /**
     * Sets payment installments.
     *
     * @param paymentInstallments payment installments.
     */
    public void setPaymentInstallments(PaymentInstallment paymentInstallments) { this.paymentInstallments = paymentInstallments; }

    /**
     * Used to return the response type corresponding to the request.
     *
     * @return the corresponding response type.
     */
    @JsonIgnore
    public TypeReference<ZoozServerResponse<SaleResponse>> getResponseTypeReference() {
        return new TypeReference<ZoozServerResponse<SaleResponse>>() {
        };
    }
}

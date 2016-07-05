package com.zooz.common.client.ecomm.beans.requests.authorize.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zooz.common.client.ecomm.beans.Invoice;
import com.zooz.common.client.ecomm.beans.PaymentInstallment;
import com.zooz.common.client.ecomm.beans.PaymentMethod;

/**
 * The sale request for eWallet having installments payments.
 */
public abstract class AbstractInstallmentsSaleRequest extends AbstractSaleRequest {

    /**
     * The payment installments details.
     */
    @JsonProperty
    private PaymentInstallment paymentInstallments;


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
    public AbstractInstallmentsSaleRequest(String paymentToken, String ipAddress, PaymentMethod paymentMethod, Double amount, Invoice invoice, String reconciliationId,
                                           String emailAddress, String uniqueTransactionID) {
        super(paymentToken, ipAddress, paymentMethod, amount, invoice, reconciliationId, emailAddress, uniqueTransactionID);
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

}

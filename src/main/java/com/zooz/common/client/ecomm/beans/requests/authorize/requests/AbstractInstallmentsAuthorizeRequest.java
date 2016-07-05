package com.zooz.common.client.ecomm.beans.requests.authorize.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zooz.common.client.ecomm.beans.PaymentInstallment;
import com.zooz.common.client.ecomm.beans.PaymentMethod;

/**
 * This is the abstract for authorizing a specified payment token for a specific payment method and Installments.
 */
public abstract class AbstractInstallmentsAuthorizeRequest extends AbstractAuthorizeRequest {

    /**
     * The payment installments details.
     */
    @JsonProperty
    private PaymentInstallment paymentInstallments;

    /**
     * Instantiates a new AbstractAuthorizeRequest.
     *
     * @param paymentToken     the paymentToken from "openPayment"
     * @param ipAddress        IPv4 Address of the end user browser
     * @param paymentMethod    the selected payment method { CreditCard, AliPay, PayEase, PayPal }
     * @param reconciliationId - The reconciliationId
     * @param emailAddress     - the user email address
     */
    protected AbstractInstallmentsAuthorizeRequest(String paymentToken, String ipAddress, PaymentMethod paymentMethod, String reconciliationId, String emailAddress) {
        super(paymentToken, ipAddress, paymentMethod, reconciliationId, emailAddress);
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

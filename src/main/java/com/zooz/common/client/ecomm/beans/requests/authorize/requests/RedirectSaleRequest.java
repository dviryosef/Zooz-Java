package com.zooz.common.client.ecomm.beans.requests.authorize.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.zooz.common.client.ecomm.beans.Invoice;
import com.zooz.common.client.ecomm.beans.PaymentMethod;
import com.zooz.common.client.ecomm.beans.PaymentMethodDetails;
import com.zooz.common.client.ecomm.beans.ThreeDSecureAttributes;
import com.zooz.common.client.ecomm.beans.enums.PaymentMethodType;
import com.zooz.common.client.ecomm.beans.responses.RedirectSaleResponse;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;

/**
 * The sale request for eWallet (such as AliPay or PayEase) payments.
 */
public class RedirectSaleRequest extends AbstractInstallmentsSaleRequest {

    /**
     * Instantiates a new Redirect sale request.
     *
     * @param paymentToken      The token from "openPayment"
     * @param redirectUrl       The URL for redirection after the user finishes the AliPay / PayEase website process
     * @param paymentMethodType The selected payment method type (AliPay, PayEase, PayPal).
     * @param amount            Optional. If supplied, then this is the amount to be captured. Else, the original amount
     *                          from "openPayment" will be captured.
     * @param invoice           a new invoice to the payment.
     * @param reconciliationId  Unique ID used to reconcile transactions, Received from processor
     *                          Note that this parameter might be different from "reconciliationId" parameter passed in the request due to processor changes.
     * @deprecated               Replaced by constructor with an additional emailAddress parameter
     */
    @Deprecated
    public RedirectSaleRequest(String paymentToken,
                               String redirectUrl,
                               PaymentMethodType paymentMethodType,
                               Double amount,
                               Invoice invoice,
                               String reconciliationId) {
        super(paymentToken, null, new PaymentMethod(paymentMethodType, redirectUrl), amount, invoice, reconciliationId, null, null);
    }

    /**
     * Instantiates a new Redirect sale request with an IP address.
     *
     * @param paymentToken      The token from "openPayment"
     * @param ipAddress         IPv4 address of the end user browser
     * @param redirectUrl       The URL for redirection after the user finishes the AliPay / PayEase website process
     * @param paymentMethodType The selected payment method type (AliPay, PayEase, PayPal).
     * @param amount            Optional. If supplied, then this is the amount to be captured. Else, the original amount
     *                          from "openPayment" will be captured.
     * @param invoice           a new invoice to the payment.
     * @param reconciliationId  Unique ID used to reconcile transactions, Received from processor
     *                          Note that this parameter might be different from "reconciliationId" parameter passed in the request due to processor changes.
     * @deprecated              Replaced by constructor with an additional emailAddress parameter
     */
    @Deprecated
    public RedirectSaleRequest(String paymentToken, String ipAddress, String redirectUrl, PaymentMethodType paymentMethodType, Double amount, Invoice invoice, String reconciliationId) {
        super(paymentToken, ipAddress, new PaymentMethod(paymentMethodType, redirectUrl), amount, invoice, reconciliationId, null, null);
    }

    /**
     * Instantiates a new Redirect sale request with an IP address.
     * @param paymentToken      The token from "openPayment"
     * @param ipAddress         IPv4 address of the end user browser
     * @param redirectUrl       The URL for redirection after the user finishes the AliPay / PayEase website process
     * @param paymentMethodType The selected payment method type (AliPay, PayEase, PayPal).
     * @param amount            Optional. If supplied, then this is the amount to be captured. Else, the original amount
     *                          from "openPayment" will be captured.
     * @param invoice           a new invoice to the payment.
     * @param reconciliationId  Unique ID used to reconcile transactions, Received from processor
     *                          Note that this parameter might be different from "reconciliationId" parameter passed in the request due to processor changes.
     * @param emailAddress      The user email address
     * @param uniqueTransactionID Unique id that identify the sale request
     */
    public RedirectSaleRequest(String paymentToken,
                               String ipAddress,
                               String redirectUrl,
                               PaymentMethodType paymentMethodType,
                               Double amount,
                               Invoice invoice,
                               String reconciliationId,
                               String emailAddress,
                               String uniqueTransactionID
                            ) {
        super(paymentToken,
                ipAddress,
                new PaymentMethod(paymentMethodType,redirectUrl),
                amount,
                invoice,
                reconciliationId,
                emailAddress,
                uniqueTransactionID);
    }


    /**
     * Instantiates a new Redirect sale request with an IP address.
     *
     * @param paymentToken      The token from "openPayment"
     * @param ipAddress         IPv4 address of the end user browser
     * @param redirectUrl       The URL for redirection after the user finishes the AliPay / PayEase website process
     * @param paymentMethodType The selected payment method type (AliPay, PayEase, PayPal).
     * @param amount            Optional. If supplied, then this is the amount to be captured. Else, the original amount
     *                          from "openPayment" will be captured.
     * @param invoice           a new invoice to the payment.
     * @param reconciliationId  Unique ID used to reconcile transactions, Received from processor
     *                          Note that this parameter might be different from "reconciliationId" parameter passed in the request due to processor changes.
     * @param emailAddress      The user email address
     */
    public RedirectSaleRequest(String paymentToken, String ipAddress, String redirectUrl, PaymentMethodType paymentMethodType, Double amount, Invoice invoice, String reconciliationId,
                               String emailAddress) {
        this(paymentToken, ipAddress, redirectUrl, paymentMethodType, amount, invoice, reconciliationId, emailAddress, null);
    }

    /**
     * Gets the payment subject.
     *
     * @return the payment subject
     */
    @JsonIgnore
    public String getPaymentSubject() {
        return ((PaymentMethodDetails)this.getPaymentMethod().getPaymentMethodDetails()).getPaymentSubject();
    }


    /**
     * Sets the payment subject.
     *
     * @param paymentSubject the payment subject
     */
    public void setPaymentSubject(String paymentSubject) {
        ((PaymentMethodDetails)this.getPaymentMethod().getPaymentMethodDetails()).setPaymentSubject(paymentSubject);
    }

    /**
     * Get the payment mode.
     *
     * @return the payment mode.
     */
    public String getPaymentMode() {
        return ((PaymentMethodDetails)this.getPaymentMethod().getPaymentMethodDetails()).getPaymentMode();
    }

    /**
     * Sets the payment mode.
     *
     * @param paymentMode the applicable mode for PayEase
     */
    public void setPaymentMode(String paymentMode) {
        ((PaymentMethodDetails)this.getPaymentMethod().getPaymentMethodDetails()).setPaymentMode(paymentMode);
    }
    /**
     * Used to return the response type corresponding to the request.
     *
     * @return the corresponding response type.
     */
    @JsonIgnore
    public TypeReference<ZoozServerResponse<RedirectSaleResponse>> getResponseTypeReference() {
        return new TypeReference<ZoozServerResponse<RedirectSaleResponse>>() {
        };
    }
}

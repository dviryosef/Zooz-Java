package com.zooz.common.client.ecomm.beans.requests.authorize.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.zooz.common.client.ecomm.beans.PaymentMethod;
import com.zooz.common.client.ecomm.beans.PaymentMethodDetails;
import com.zooz.common.client.ecomm.beans.enums.PaymentMethodType;
import com.zooz.common.client.ecomm.beans.responses.RedirectResponse;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;

/**
 * The authorization request for eWallet (such as AliPay or PayEase) payments .
 */
public class RedirectAuthorizeRequest extends AbstractInstallmentsAuthorizeRequest {

    /**
     * Instantiates a new Redirect authorize request.
     *
     * @param paymentToken      The token from "openPayment"
     * @param redirectUrl       The URL for redirection after the user finishes the AliPay / PayEase website process
     * @param paymentMethodType The selected payment method type (AliPay, PayEase, PayPal).
     */
    public RedirectAuthorizeRequest(String paymentToken, String redirectUrl, PaymentMethodType paymentMethodType) {
        super(paymentToken, null, new PaymentMethod(paymentMethodType, redirectUrl), null, null);
    }

    /**
     * Instantiates a new Redirect authorize request with an IP address.
     *
     * @param paymentToken      The token from "openPayment"
     * @param ipAddress         IPv4 address of the end user browser
     * @param redirectUrl       The URL for redirection after the user finishes the AliPay / PayEase website process
     * @param paymentMethodType The selected payment method type (AliPay, PayEase, PayPal).
     */
    public RedirectAuthorizeRequest(String paymentToken, String ipAddress, String redirectUrl, PaymentMethodType paymentMethodType) {
        super(paymentToken, ipAddress, new PaymentMethod(paymentMethodType, redirectUrl), null, null);
    }

    /**
     * Instantiates a new Redirect authorize request with an IP address.
     *
     * @param paymentToken      The token from "openPayment"
     * @param ipAddress         IPv4 address of the end user browser
     * @param redirectUrl       The URL for redirection after the user finishes the AliPay / PayEase website process
     * @param paymentMethodType The selected payment method type (AliPay, PayEase, PayPal).
     * @param reconciliationId  The reconciliation id to pass to processor
     * @deprecated              Replaced by constructor with an additional emailAddress parameter
     */
    @Deprecated
    public RedirectAuthorizeRequest(String paymentToken, String ipAddress, String redirectUrl, PaymentMethodType paymentMethodType, String reconciliationId) {
        super(paymentToken, ipAddress, new PaymentMethod(paymentMethodType, redirectUrl), reconciliationId, null);
    }


    /**
     * Instantiates a new Redirect authorize request with an IP address.
     *
     * @param paymentToken      The token from "openPayment"
     * @param ipAddress         IPv4 address of the end user browser
     * @param redirectUrl       The URL for redirection after the user finishes the AliPay / PayEase website process
     * @param paymentMethodType The selected payment method type (AliPay, PayEase, PayPal).
     * @param reconciliationId  The reconciliation id to pass to processor
     * @param emailAddress The user email address
     */
    public RedirectAuthorizeRequest(String paymentToken, String ipAddress, String redirectUrl, PaymentMethodType paymentMethodType, String reconciliationId, String emailAddress) {
        super(paymentToken, ipAddress, new PaymentMethod(paymentMethodType, redirectUrl), reconciliationId, emailAddress);
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
     * Is allow paypal credit card payment.
     *
     * @return the boolean
     */
    public boolean isAllowPayPalCreditCardPayment() {
        return ((PaymentMethodDetails)this.getPaymentMethod().getPaymentMethodDetails()).isAllowPayPalCreditCardPayment();
    }

    /**
     * Sets allow paypal credit card payment.
     *
     * @param allowPayPalCreditCardPayment the allow pay pal credit card payment
     */
    public void setAllowPayPalCreditCardPayment(boolean allowPayPalCreditCardPayment) {
        ((PaymentMethodDetails)this.getPaymentMethod().getPaymentMethodDetails()).setAllowPayPalCreditCardPayment(allowPayPalCreditCardPayment);
    }

    /**
     * Used to return the response type corresponding to the request.
     *
     * @return the corresponding response type.
     */
    @Override
    @JsonIgnore
    public TypeReference<ZoozServerResponse<RedirectResponse>> getResponseTypeReference() {
        return new TypeReference<ZoozServerResponse<RedirectResponse>>() {
        };
    }
}

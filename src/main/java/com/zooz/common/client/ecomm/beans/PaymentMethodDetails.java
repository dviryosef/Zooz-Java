package com.zooz.common.client.ecomm.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Payment method details refer to the parameters included in a payment method.
 * Certain parameters only apply for specific payment method types.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentMethodDetails extends AbstractPaymentMethodDetails {
    /**
     * CVV number of the selected credit card.
     */
    @JsonProperty
    private String cvvNumber;
    /**
     * The URL for redirection after the user finish the process on 3DSecure / AliPay / PayEase website
     */
    @JsonProperty
    private String redirectUrl;
    /**
     * States if the authorization should include 3DS flow
     */
    @JsonProperty
    private boolean authorize3DSecure;
    /**
     * The subject to appear on AliPay login screen
     */
    @JsonProperty
    private String paymentSubject;
    /**
     * PayEase payment mode
     */
    @JsonProperty
    private String paymentMode;
    /**
     * PayPal feature
     * Set allowPayPalCreditCardPayment if you would like to pay on paypal with a credit card (without a paypal account).
     */
    @JsonProperty
    private boolean allowPayPalCreditCardPayment;

    @JsonProperty
    private ThreeDSecureAttributes threeDSecureAttributes;

    /**
     * Use for AliPay, PayEase, PayPal.
     *
     * @param redirectUrl The URL for redirection after the user finish the process on AliPay / PayEase website
     */
    public PaymentMethodDetails(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    /**
     * Use for CreditCard (with/ without 3DSecure).
     *
     * @param cvvNumber CVV number of the selected credit card.
     * @param redirectUrl The URL for redirection after the user finish the process on 3DSecure website
     * @param authorize3DSecure States if the authorization should include 3DS flow
     */
    public PaymentMethodDetails(String cvvNumber, String redirectUrl, boolean authorize3DSecure) {
        this(redirectUrl);
        this.cvvNumber = cvvNumber;
        this.authorize3DSecure = authorize3DSecure;
    }

    /**
     * Gets the paymentSubject.
     *
     * @return Value of the paymentSubject.
     */
    public String getPaymentSubject() { return paymentSubject; }

    /**
     * Sets thenew paymentSubject.
     *
     * @param paymentSubject New value of the paymentSubject.
     */
    public void setPaymentSubject(String paymentSubject) { this.paymentSubject = paymentSubject; }

    /**
     * Gets the cvvNumber.
     *
     * @return Value of the cvvNumber.
     */
    public String getCvvNumber() { return cvvNumber; }

    /**
     * Sets thenew cvvNumber.
     *
     * @param cvvNumber New value of the cvvNumber.
     */
    public void setCvvNumber(String cvvNumber) { this.cvvNumber = cvvNumber; }

    /**
     * Gets the paymentMode.
     *
     * @return Value of the paymentMode.
     */
    public String getPaymentMode() { return paymentMode; }

    /**
     * Sets the new paymentMode.
     *
     * @param paymentMode New value of the paymentMode.
     */
    public void setPaymentMode(String paymentMode) { this.paymentMode = paymentMode; }

    /**
     * Gets the authorize3DSecure.
     *
     * @return Value of the authorize3DSecure.
     */
    public boolean isAuthorize3DSecure() { return authorize3DSecure; }

    /**
     * Sets thenew authorize3DSecure.
     *
     * @param authorize3DSecure New value of the authorize3DSecure.
     */
    public void setAuthorize3DSecure(boolean authorize3DSecure) { this.authorize3DSecure = authorize3DSecure; }

    /**
     * Gets the redirectUrl.
     *
     * @return Value of the redirectUrl.
     */
    public String getRedirectUrl() { return redirectUrl; }

    /**
     * Sets the new redirectUrl.
     *
     * @param redirectUrl New value of the redirectUrl.
     */
    public void setRedirectUrl(String redirectUrl) { this.redirectUrl = redirectUrl; }

    /**
     * Is allow paypal credit card payment.
     *
     * @return the boolean
     */
    public boolean isAllowPayPalCreditCardPayment() {
        return allowPayPalCreditCardPayment;
    }

    /**
     * Sets allow paypal credit card payment.
     *
     * @param allowPayPalCreditCardPayment the allow pay pal credit card payment
     */
    public void setAllowPayPalCreditCardPayment(boolean allowPayPalCreditCardPayment) {
        this.allowPayPalCreditCardPayment = allowPayPalCreditCardPayment;
    }

    public ThreeDSecureAttributes getThreeDSecureAttributes() {
        return threeDSecureAttributes;
    }

    public void setThreeDSecureAttributes(ThreeDSecureAttributes threeDSecureAttributes) {
        this.threeDSecureAttributes = threeDSecureAttributes;
    }
}

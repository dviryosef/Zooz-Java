package com.zooz.common.client.ecomm.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zooz.common.client.ecomm.beans.enums.PaymentMethodType;

/**
 * The set of parameters included in a payment method.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentMethod extends AbstractJsonBean {
    /**
     * The token representing the selected payment method.
     */
    @JsonProperty
    private String paymentMethodToken;
    /**
     * The type of the selected payment method.
     * These are the values: {CreditCard, AliPay, PayEase , PayPal}
     */
    @JsonProperty
    private PaymentMethodType paymentMethodType;
    /**
     * The payment method details
     */
    @JsonProperty
    private AbstractPaymentMethodDetails paymentMethodDetails;

    /**
     * Use for AliPay, PayEase, PayPal.
     *
     * @param paymentMethodType The type of the selected payment method.                          Those are the values:                          { AliPay, PayEase, PayPal}
     * @param redirectUrl       The URL for redirection after the user finish the process on AliPay / PayEase website
     */
    public PaymentMethod(PaymentMethodType paymentMethodType, String redirectUrl) {
        this.paymentMethodType = paymentMethodType;
        this.paymentMethodDetails = new PaymentMethodDetails(redirectUrl);
    }

    /**
     * Use for CreditCard (with/ without 3DSecure).
     *
     * @param paymentMethodToken     The token representing the selected payment method.
     * @param paymentMethodType      The type of the selected payment method . Those are the values:  { CreditCard }
     * @param cvvNumber              CVV number of the selected credit card.
     * @param redirectUrl            The URL for redirection after the user finish the process on AliPay / PayEase website
     * @param authorize3DSecure      true –  requires 3D secure authorization :false -  does not require 3D secure authorization
     * @param threeDSecureAttributes the three d secure attributes
     */
    public PaymentMethod(String paymentMethodToken, PaymentMethodType paymentMethodType, String cvvNumber, String redirectUrl, boolean authorize3DSecure, ThreeDSecureAttributes threeDSecureAttributes) {
        this.paymentMethodToken = paymentMethodToken;
        this.paymentMethodType = paymentMethodType;
        this.paymentMethodDetails = new PaymentMethodDetails(cvvNumber, redirectUrl, authorize3DSecure);
        ((PaymentMethodDetails)this.paymentMethodDetails).setThreeDSecureAttributes(threeDSecureAttributes);
    }

    /**
     * Use for CreditCard (with/ without 3DSecure).
     *
     * @param paymentMethodToken The token representing the selected payment method.
     * @param paymentMethodType  The type of the selected payment method .Those are the values:  { CreditCard }
     * @param cvvNumber          CVV number of the selected credit card.
     * @param redirectUrl        The URL for redirection after the user finish the process on AliPay / PayEase website
     * @param authorize3DSecure  true –  requires 3D secure authorization :false -  does not require 3D secure authorization
     */
    public PaymentMethod(String paymentMethodToken, PaymentMethodType paymentMethodType, String cvvNumber, String redirectUrl, boolean authorize3DSecure) {
        this.paymentMethodToken = paymentMethodToken;
        this.paymentMethodType = paymentMethodType;
        this.paymentMethodDetails = new PaymentMethodDetails(cvvNumber, redirectUrl, authorize3DSecure);
    }

    /**
     * Instantiates a new Payment method.
     *
     * @param paymentMethodType     the payment method type
     * @param paymentInstrumentName the payment instrument name
     * @param paymentNetwork        the payment network
     * @param transactionIdentifier the transaction identifier
     * @param data                  the data
     * @param applicationData       the application data
     * @param ephemeralPublicKey    the ephemeral public key
     * @param publicKeyHash         the public key hash
     * @param transactionId         the transaction id
     * @param signature             the signature
     * @param version               the version
     */
    public PaymentMethod(PaymentMethodType paymentMethodType, String paymentInstrumentName, String paymentNetwork, String transactionIdentifier, String data, String applicationData, String ephemeralPublicKey, String publicKeyHash, String transactionId, String signature, String version){
        this.paymentMethodType = paymentMethodType;
        this.paymentMethodDetails = new ApplePayPaymentMethodDetails(paymentInstrumentName, paymentNetwork, transactionIdentifier, data, applicationData, ephemeralPublicKey, publicKeyHash, transactionId, signature, version);
    }

    /**
     * Instantiates a new Payment method.
     *
     * @param paymentMethodType               the payment method type
     * @param paymentInstrumentName           the payment instrument name
     * @param paymentNetwork                  the payment network
     * @param transactionIdentifier           the transaction identifier
     * @param applicationPrimaryAccountNumber the application primary account number
     * @param applicationExpirationDate       the application expiration date
     * @param currencyCode                    the currency code
     * @param transactionAmount               the transaction amount
     * @param cardholderName                  the cardholder name
     * @param deviceManufacturerIdentifier    the device manufacturer identifier
     * @param paymentDataType                 the payment data type
     * @param onlinePaymentCryptogram         the online payment cryptogram
     * @param eciIndicator                    the eci indicator
     */
    public PaymentMethod(PaymentMethodType paymentMethodType, String paymentInstrumentName, String paymentNetwork, String transactionIdentifier, String applicationPrimaryAccountNumber,
                         String applicationExpirationDate, String currencyCode, String transactionAmount, String cardholderName,
                         String deviceManufacturerIdentifier, String paymentDataType, String onlinePaymentCryptogram, String eciIndicator){
        this.paymentMethodType = paymentMethodType;
        this.paymentMethodDetails = new ApplePayPaymentMethodDetails(paymentInstrumentName, paymentNetwork, transactionIdentifier, applicationPrimaryAccountNumber, applicationExpirationDate, currencyCode,
                transactionAmount, cardholderName, deviceManufacturerIdentifier, paymentDataType, onlinePaymentCryptogram, eciIndicator);
    }

    /**
     * Instantiates a new Payment method.
     */
    public PaymentMethod() {
    }

    /**
     * Instantiates a new Payment method.
     *
     * @param paymentMethodType            the payment method type
     * @param androidPayEncryptedMessage   the android pay encrypted message
     * @param androidPayEphemeralPublicKey the android pay ephemeral public key
     * @param androidPayTag                the android pay tag
     */
    public PaymentMethod(PaymentMethodType paymentMethodType, String androidPayEncryptedMessage, String androidPayEphemeralPublicKey, String androidPayTag) {
        this.paymentMethodType = paymentMethodType;
        this.paymentMethodDetails = new AndroidPayEncryptedPaymentMethodDetails(androidPayEncryptedMessage, androidPayEphemeralPublicKey, androidPayTag);
    }

    /**
     * Instantiates a new Payment method.
     *
     * @param paymentMethodType the payment method type
     * @param dpan              the dpan
     * @param expirationYear    the expiration year
     * @param expirationMonth   the expiration month
     * @param authMethod        the auth method
     * @param threeDSCryptogram the three ds cryptogram
     * @param threeDSIndicator  the three ds indicator
     */
    public PaymentMethod(PaymentMethodType paymentMethodType, String dpan, String expirationYear, String expirationMonth, String authMethod, String threeDSCryptogram, String threeDSIndicator) {
        this.paymentMethodType = paymentMethodType;
        this.paymentMethodDetails = new AndroidPayDecryptedPaymentMethodDetails(dpan, Integer.valueOf(expirationYear), Integer.valueOf(expirationMonth), authMethod, threeDSCryptogram, threeDSIndicator);
    }

    /**
     * Gets the payment method details.
     *
     * @return Value of The payment method details.
     */
    public AbstractPaymentMethodDetails getPaymentMethodDetails() { return paymentMethodDetails; }

    /**
     * Sets new payment method details.
     *
     * @param paymentMethodDetails New value of The payment method details.
     */
    public void setPaymentMethodDetails(AbstractPaymentMethodDetails paymentMethodDetails) { this.paymentMethodDetails = paymentMethodDetails; }

    /**
     * Gets the token representing the selected payment method.
     *
     * @return Value of the token representing the selected payment method.
     */
    public String getPaymentMethodToken() { return paymentMethodToken; }

    /**
     * Sets new token representing the selected payment method.
     *
     * @param paymentMethodToken New value of the token representing the selected payment method.
     */
    public void setPaymentMethodToken(String paymentMethodToken) { this.paymentMethodToken = paymentMethodToken; }

    /**
     * Gets the type of the selected payment method
     * Those are the values: {CreditCard}.
     *
     * @return Value of the type of the selected payment method. Those are the values: { CreditCard } .
     */
    public PaymentMethodType getPaymentMethodType() { return paymentMethodType; }

    /**
     * Sets new type of the selected payment method.
     * Those are the values: {CreditCard}.
     *
     * @param paymentMethodType New value of The type of the selected payment method . Those are the values: { CreditCar }.
     */
    public void setPaymentMethodType(PaymentMethodType paymentMethodType) { this.paymentMethodType = paymentMethodType; }
}

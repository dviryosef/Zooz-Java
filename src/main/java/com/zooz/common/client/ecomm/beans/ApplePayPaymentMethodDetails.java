package com.zooz.common.client.ecomm.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Alex on 3/15/15.
 */
public class ApplePayPaymentMethodDetails extends AbstractPaymentMethodDetails {

    @JsonProperty
    private String paymentInstrumentName;

    @JsonProperty
    private String paymentNetwork;

    @JsonProperty
    private String transactionIdentifier;

    @JsonProperty
    private AbstractApplePayPayment applePayPayment;

    /**
     * Instantiates a new Apple pay payment method details.
     *
     * @param paymentInstrumentName the payment instrument name
     * @param paymentNetwork the payment network
     * @param transactionIdentifier the transaction identifier
     * @param applicationPrimaryAccountNumber the application primary account number
     * @param applicationExpirationDate the application expiration date
     * @param currencyCode the currency code
     * @param transactionAmount the transaction amount
     * @param cardHolderName the card holder name
     * @param deviceManufacturerIdentifier the device manufacturer identifier
     * @param paymentDataType the payment data type
     * @param onlinePaymentCryptogram the online payment cryptogram
     * @param eciIndicator the eci indicator
     */
    public ApplePayPaymentMethodDetails(String paymentInstrumentName, String paymentNetwork, String transactionIdentifier, String applicationPrimaryAccountNumber, String applicationExpirationDate, String currencyCode,
                                        String transactionAmount, String cardHolderName, String deviceManufacturerIdentifier, String paymentDataType,
                                        String onlinePaymentCryptogram, String eciIndicator){

        this.paymentInstrumentName = paymentInstrumentName;
        this.paymentNetwork = paymentNetwork;
        this.transactionIdentifier = transactionIdentifier;

        applePayPayment = new ApplePayPayment(applicationPrimaryAccountNumber, applicationExpirationDate, currencyCode, transactionAmount, cardHolderName, deviceManufacturerIdentifier, paymentDataType, onlinePaymentCryptogram, eciIndicator);
    }

    /**
     * Instantiates a new Apple pay payment method details.
     *
     * @param paymentInstrumentName the payment instrument name
     * @param paymentNetwork the payment network
     * @param transactionIdentifier the transaction identifier
     * @param data the data
     * @param applicationData the application data
     * @param ephemeralPublicKey the ephemeral public key
     * @param publicKeyHash the public key hash
     * @param transactionId the transaction id
     * @param signature the signature
     * @param version the version
     */
    public ApplePayPaymentMethodDetails(String paymentInstrumentName, String paymentNetwork, String transactionIdentifier, String data, String applicationData, String ephemeralPublicKey, String publicKeyHash, String transactionId, String signature,
                                        String version){

        this.paymentInstrumentName = paymentInstrumentName;
        this.paymentNetwork = paymentNetwork;
        this.transactionIdentifier = transactionIdentifier;

        applePayPayment = new ApplePayEncryptedPayment(data, new ApplePayHeader(applicationData, ephemeralPublicKey, publicKeyHash, transactionId), signature, version);
    }

    /**
     * Gets apple pay payment.
     *
     * @return the apple pay payment
     */
    public AbstractApplePayPayment getApplePayPayment() {
        return applePayPayment;
    }

    /**
     * Sets apple pay payment.
     *
     * @param applePayPayment the apple pay payment
     */
    public void setApplePayPayment(AbstractApplePayPayment applePayPayment) {
        this.applePayPayment = applePayPayment;
    }

    /**
     * Gets payment instrument name.
     *
     * @return the payment instrument name
     */
    public String getPaymentInstrumentName() {
        return paymentInstrumentName;
    }

    /**
     * Sets payment instrument name.
     *
     * @param paymentInstrumentName the payment instrument name
     */
    public void setPaymentInstrumentName(String paymentInstrumentName) {
        this.paymentInstrumentName = paymentInstrumentName;
    }

    /**
     * Gets payment network.
     *
     * @return the payment network
     */
    public String getPaymentNetwork() {
        return paymentNetwork;
    }

    /**
     * Sets payment network.
     *
     * @param paymentNetwork the payment network
     */
    public void setPaymentNetwork(String paymentNetwork) {
        this.paymentNetwork = paymentNetwork;
    }

    /**
     * Gets transaction identifier.
     *
     * @return the transaction identifier
     */
    public String getTransactionIdentifier() {
        return transactionIdentifier;
    }

    /**
     * Sets transaction identifier.
     *
     * @param transactionIdentifier the transaction identifier
     */
    public void setTransactionIdentifier(String transactionIdentifier) {
        this.transactionIdentifier = transactionIdentifier;
    }
}

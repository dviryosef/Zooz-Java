package com.zooz.common.client.ecomm.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Alex on 3/15/15.
 */
public class ApplePayPayment extends AbstractApplePayPayment {

    @JsonProperty
    private String applicationPrimaryAccountNumber;

    @JsonProperty
    private String applicationExpirationDate;

    @JsonProperty
    private String currencyCode;

    @JsonProperty
    private String transactionAmount;

    @JsonProperty
    private String cardHolderName;

    @JsonProperty
    private String deviceManufacturerIdentifier;

    @JsonProperty
    private String paymentDataType;

    @JsonProperty
    private ApplePayPaymentData paymentData;

    /**
     * Instantiates a new Apple pay payment.
     *
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
    public ApplePayPayment(String applicationPrimaryAccountNumber, String applicationExpirationDate, String currencyCode,
                           String transactionAmount, String cardHolderName, String deviceManufacturerIdentifier, String paymentDataType,
                           String onlinePaymentCryptogram, String eciIndicator){

        this.applicationPrimaryAccountNumber = applicationPrimaryAccountNumber;
        this.applicationExpirationDate = applicationExpirationDate;
        this.currencyCode = currencyCode;
        this.transactionAmount = transactionAmount;
        this.cardHolderName = cardHolderName;
        this.deviceManufacturerIdentifier = deviceManufacturerIdentifier;
        this.paymentDataType = paymentDataType;

        this.paymentData = new ApplePayPaymentData(onlinePaymentCryptogram, eciIndicator);

    }

    /**
     * Gets application primary account number.
     *
     * @return the application primary account number
     */
    public String getApplicationPrimaryAccountNumber() {
        return applicationPrimaryAccountNumber;
    }

    /**
     * Sets application primary account number.
     *
     * @param applicationPrimaryAccountNumber the application primary account number
     */
    public void setApplicationPrimaryAccountNumber(String applicationPrimaryAccountNumber) {
        this.applicationPrimaryAccountNumber = applicationPrimaryAccountNumber;
    }

    /**
     * Gets application expiration date.
     *
     * @return the application expiration date
     */
    public String getApplicationExpirationDate() {
        return applicationExpirationDate;
    }

    /**
     * Sets application expiration date.
     *
     * @param applicationExpirationDate the application expiration date
     */
    public void setApplicationExpirationDate(String applicationExpirationDate) {
        this.applicationExpirationDate = applicationExpirationDate;
    }

    /**
     * Gets currency code.
     *
     * @return the currency code
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets currency code.
     *
     * @param currencyCode the currency code
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * Gets transaction amount.
     *
     * @return the transaction amount
     */
    public String getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * Sets transaction amount.
     *
     * @param transactionAmount the transaction amount
     */
    public void setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    /**
     * Gets card holder name.
     *
     * @return the card holder name
     */
    public String getCardHolderName() {
        return cardHolderName;
    }

    /**
     * Sets card holder name.
     *
     * @param cardHolderName the card holder name
     */
    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    /**
     * Gets device manufacturer identifier.
     *
     * @return the device manufacturer identifier
     */
    public String getDeviceManufacturerIdentifier() {
        return deviceManufacturerIdentifier;
    }

    /**
     * Sets device manufacturer identifier.
     *
     * @param deviceManufacturerIdentifier the device manufacturer identifier
     */
    public void setDeviceManufacturerIdentifier(String deviceManufacturerIdentifier) {
        this.deviceManufacturerIdentifier = deviceManufacturerIdentifier;
    }

    /**
     * Gets payment data type.
     *
     * @return the payment data type
     */
    public String getPaymentDataType() {
        return paymentDataType;
    }

    /**
     * Sets payment data type.
     *
     * @param paymentDataType the payment data type
     */
    public void setPaymentDataType(String paymentDataType) {
        this.paymentDataType = paymentDataType;
    }

    /**
     * Gets payment data.
     *
     * @return the payment data
     */
    public ApplePayPaymentData getPaymentData() {
        return paymentData;
    }

    /**
     * Sets payment data.
     *
     * @param paymentData the payment data
     */
    public void setPaymentData(ApplePayPaymentData paymentData) {
        this.paymentData = paymentData;
    }
}

package com.zooz.common.client.ecomm.beans.addpaymentmethod.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by roykey on 10/13/15.
 */
public abstract class AbstractAddPaymentMethodDetails {

    /**
     * The redirectUrl .
     */
    @JsonProperty
    protected String redirectUrl;

    /**
     * The Expiration date.
     */
    @JsonProperty
    protected String expirationDate;

    /**
     * The Card holder name.
     */
    @JsonProperty
    protected String cardHolderName;

    /**
     * The Cvv number.
     */
    @JsonProperty
    protected String cvvNumber;

    /**
     * The Card number.
     */
    @JsonProperty
    protected String cardNumber;

    /**
     * The User id number.
     */
    @JsonProperty
    protected String userIdNumber;

    /**
     * Instantiates a new Abstract add payment method details.
     *
     * @param cardHolderName the card holder name
     * @param cvvNumber      the cvv number
     * @param cardNumber     the card number
     */
    protected AbstractAddPaymentMethodDetails(String cardHolderName, String cvvNumber, String cardNumber) {
        this.cardHolderName = cardHolderName;
        this.cvvNumber = cvvNumber;
        this.cardNumber = cardNumber;
    }

    /**
     * Instantiated a new AbstractAddPayment method with redirectUrl
     *
     * @param redirectUrl the redirect url
     */
    protected AbstractAddPaymentMethodDetails(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    /**
     * Instantiates a new Abstract add payment method details.
     */
    public AbstractAddPaymentMethodDetails() {
    }

    /**
     * Gets the expiration date.
     *
     * @return the expiration date
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the expiration date.
     *
     * @param expirationDate the expiration date
     */
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * Gets the card holder name.
     *
     * @return the card holder name
     */
    public String getCardHolderName() {
        return cardHolderName;
    }

    /**
     * Sets the card holder name.
     *
     * @param cardHolderName the card holder name
     */
    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    /**
     * Gets the cvv number.
     *
     * @return the cvv number
     */
    public String getCvvNumber() {
        return cvvNumber;
    }

    /**
     * Sets the cvv number.
     *
     * @param cvvNumber the cvv number
     */
    public void setCvvNumber(String cvvNumber) {
        this.cvvNumber = cvvNumber;
    }

    /**
     * Gets the card number.
     *
     * @return the card number
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the card number.
     *
     * @param cardNumber the card number
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * Gets the user id number.
     *
     * @return the user id number
     */
    public String getUserIdNumber() {
        return userIdNumber;
    }

    /**
     * Sets the user id number.
     *
     * @param idNumber the id number
     */
    public void setUserIdNumber(String idNumber) {
        this.userIdNumber = idNumber;
    }


    /**
     * Gets the redirect url.
     *
     * @return the redirect url
     */
    public String getRedirectUrl() {
        return redirectUrl;
    }

    /**
     * Sets the redirect url.
     *
     * @param redirectUrl the redirect url
     */
    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }
}

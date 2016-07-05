package com.zooz.common.client.ecomm.beans.addpaymentmethod.beans.server;

import com.zooz.common.client.ecomm.beans.addpaymentmethod.beans.AbstractAddPaymentMethodDetails;

/**
 * The type Server payment method details.
 *
 * @author roykey
 */
public class ServerPaymentMethodDetails extends AbstractAddPaymentMethodDetails {

    /**
     * Instantiates a new Server payment method details for credit cards
     *
     * @param cardHolderName the card holder name
     * @param expirationDate the expiration date
     * @param cvvNumber      the cvv number
     * @param cardNumber     the card number
     */
    public ServerPaymentMethodDetails(String cardHolderName, String expirationDate, String cvvNumber, String cardNumber) {
        super(cardHolderName, cvvNumber, cardNumber);
        this.expirationDate = expirationDate;
    }

    /**
     * Instantiates a new Server payment method details for PayPal
     *
     * @param redirectUrl the redirectUrl
     */
    public ServerPaymentMethodDetails(String redirectUrl) {
        super(redirectUrl);
    }

    /**
     * Instantiates a new Server payment method details.
     */
    public ServerPaymentMethodDetails() {
    }
}

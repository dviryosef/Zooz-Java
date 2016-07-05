package com.zooz.common.client.ecomm.beans.client.beans;

import com.zooz.common.client.ecomm.beans.addpaymentmethod.beans.AbstractAddPaymentMethodDetails;

/**
 * The type Client payment method details.
 *
 * @author roykey
 */
public class ClientPaymentMethodDetails extends AbstractAddPaymentMethodDetails {

    /**
     * Instantiates a new Client payment method details.
     *
     * @param cardHolderName the card holder name
     * @param month          the month
     * @param year           the year
     * @param cvvNumber      the cvv number
     * @param cardNumber     the card number
     */
    public ClientPaymentMethodDetails(String cardHolderName, String month, String year, String cvvNumber, String cardNumber) {
        super(cardHolderName, cvvNumber, cardNumber);
        this.expirationDate = month + "/" + year;
    }

    /**
     * Instantiates a new Client payment method details.
     */
    public ClientPaymentMethodDetails() {
    }
}

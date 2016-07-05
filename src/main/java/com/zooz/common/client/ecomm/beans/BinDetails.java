package com.zooz.common.client.ecomm.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by yigalp on 25/02/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BinDetails {

    /**
     * credit card bin number attribute
     */
    @JsonProperty
    private String binNumber;

    /**
     * card type - credit/debit
     */
    @JsonProperty
    private String cardType;

    /**
     * credit card level - e.g - business card
     */
    @JsonProperty
    private String cardLevel;

    /**
     * credit card vendor name
     */
    @JsonProperty
    private String cardVendor;

    /**
     * card country code
     */
    @JsonProperty
    private String cardCountryCode;

    /**
     * card issuer name
     */
    @JsonProperty
    private String cardIssuer;

    public BinDetails() {

    }

    public String getBinNumber() {
        return binNumber;
    }

    public void setBinNumber(String binNumber) {
        this.binNumber = binNumber;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardLevel() {
        return cardLevel;
    }

    public void setCardLevel(String cardLevel) {
        this.cardLevel = cardLevel;
    }

    public String getCardVendor() {
        return cardVendor;
    }

    public void setCardVendor(String cardVendor) {
        this.cardVendor = cardVendor;
    }

    public String getCardCountryCode() {
        return cardCountryCode;
    }

    public void setCardCountryCode(String cardCountryCode) {
        this.cardCountryCode = cardCountryCode;
    }

    public String getCardIssuer() {
        return cardIssuer;
    }

    public void setCardIssuer(String cardIssuer) {
        this.cardIssuer = cardIssuer;
    }
}

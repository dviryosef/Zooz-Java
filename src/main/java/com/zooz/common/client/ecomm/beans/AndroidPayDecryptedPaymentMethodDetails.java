package com.zooz.common.client.ecomm.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by idantovi on 24/03/2016.
 */
public class AndroidPayDecryptedPaymentMethodDetails extends AbstractPaymentMethodDetails {

    @JsonProperty
    private String dpan;

    @JsonProperty
    private Integer expirationYear;

    @JsonProperty
    private Integer expirationMonth;

    @JsonProperty
    private String authMethod;

    @JsonProperty ("3dsCryptogram")
    private String threeDSCryptogram;

    @JsonProperty ("3dsEciIndicator")
    private String threeDSEciIndicator;

    public AndroidPayDecryptedPaymentMethodDetails(String dpan, Integer expirationYear, Integer expirationMonth, String authMethod, String threeDSCryptogram, String threeDSEciIndicator) {
        this.dpan = dpan;
        this.expirationYear = expirationYear;
        this.expirationMonth = expirationMonth;
        this.authMethod = authMethod;
        this.threeDSCryptogram = threeDSCryptogram;
        this.threeDSEciIndicator = threeDSEciIndicator;
    }

    public String getDpan() {
        return dpan;
    }

    public void setDpan(String dpan) {
        this.dpan = dpan;
    }

    public Integer getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(Integer expirationYear) {
        this.expirationYear = expirationYear;
    }

    public Integer getExpirationMonth() {
        return expirationMonth;
    }

    public void setExpirationMonth(Integer expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    public String getAuthMethod() {
        return authMethod;
    }

    public void setAuthMethod(String authMethod) {
        this.authMethod = authMethod;
    }

    public String getThreeDSCryptogram() {
        return threeDSCryptogram;
    }

    public void setThreeDSCryptogram(String threeDSCryptogram) {
        this.threeDSCryptogram = threeDSCryptogram;
    }

    public String getThreeDSEciIndicator() {
        return threeDSEciIndicator;
    }

    public void setThreeDSEciIndicator(String threeDSEciIndicator) {
        this.threeDSEciIndicator = threeDSEciIndicator;
    }
}

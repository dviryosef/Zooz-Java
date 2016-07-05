package com.zooz.common.client.ecomm.beans;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Lorin on 21/02/2016.
 *
 * ExternalRisk represents the risk score that were sent from DataCash.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalRisk {

    @JsonProperty
    private String bankResponseMessage;

    @JsonProperty
    private String screeningResponseCode;

    @JsonProperty
    private String bankResponseCode;

    @JsonProperty
    private String bankAdditionalMessages;

    @JsonProperty
    private String screeningTrxId;

    @JsonProperty
    private String screeningResponseMessage;

    @JsonProperty
    private String screeningCpiValue;

    @JsonProperty
    private String bankCpiValue;


    @JsonProperty
    private String screeningAdditionalMessages;


    public String getBankAdditionalMessages() {
        return bankAdditionalMessages;
    }

    public void setBankAdditionalMessages(String bankAdditionalMessages) {
        this.bankAdditionalMessages = bankAdditionalMessages;
    }

    public String getScreeningAdditionalMessages() {
        return screeningAdditionalMessages;
    }

    public void setScreeningAdditionalMessages(String screeningAdditionalMessages) {
        this.screeningAdditionalMessages = screeningAdditionalMessages;
    }

    public String getBankResponseMessage() {
        return bankResponseMessage;
    }

    public void setBankResponseMessage(String bankResponseMessage) {
        this.bankResponseMessage = bankResponseMessage;
    }

    public String getScreeningResponseCode() {
        return screeningResponseCode;
    }

    public void setScreeningResponseCode(String screeningResponseCode) {
        this.screeningResponseCode = screeningResponseCode;
    }

    public String getScreeningTrxId() {
        return screeningTrxId;
    }

    public String getBankResponseCode() {
        return bankResponseCode;
    }

    public void setBankResponseCode(String bankResponseCode) {
        this.bankResponseCode = bankResponseCode;
    }

    public void setScreeningTrxId(String screeningTrxId) {
        this.screeningTrxId = screeningTrxId;
    }

    public String getScreeningResponseMessage() {
        return screeningResponseMessage;
    }

    public void setScreeningResponseMessage(String screeningResponseMessage) {
        this.screeningResponseMessage = screeningResponseMessage;
    }

    public String getBankCpiValue() {
        return bankCpiValue;
    }

    public void setBankCpiValue(String bankCpiValue) {
        this.bankCpiValue = bankCpiValue;
    }


    public String getScreeningCpiValue() {
        return screeningCpiValue;
    }

    public void setScreeningCpiValue(String screeningCpiValue) {
        this.screeningCpiValue = screeningCpiValue;
    }

}

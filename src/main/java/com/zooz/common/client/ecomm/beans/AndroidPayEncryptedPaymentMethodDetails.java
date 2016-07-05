package com.zooz.common.client.ecomm.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by idantovi on 23/03/2016.
 */
public class AndroidPayEncryptedPaymentMethodDetails extends AbstractPaymentMethodDetails {

    @JsonProperty
    private String encryptedMessage;

    @JsonProperty
    private String ephemeralPublicKey;

    @JsonProperty
    private String tag;

    public AndroidPayEncryptedPaymentMethodDetails(String encryptedMessage, String ephemeralPublicKey, String tag) {
        this.encryptedMessage = encryptedMessage;
        this.ephemeralPublicKey = ephemeralPublicKey;
        this.tag = tag;
    }

    public String getEncryptedMessage() {
        return encryptedMessage;
    }

    public void setEncryptedMessage(String encryptedMessage) {
        this.encryptedMessage = encryptedMessage;
    }

    public String getEphemeralPublicKey() {
        return ephemeralPublicKey;
    }

    public void setEphemeralPublicKey(String ephemeralPublicKey) {
        this.ephemeralPublicKey = ephemeralPublicKey;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}

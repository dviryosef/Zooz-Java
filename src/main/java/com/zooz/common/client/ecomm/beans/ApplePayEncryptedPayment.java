package com.zooz.common.client.ecomm.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Alex on 3/15/15.
 */
public class ApplePayEncryptedPayment extends AbstractApplePayPayment {

    @JsonProperty
    private String data;


    @JsonProperty
    private ApplePayHeader header;


    @JsonProperty
    private String signature;


    @JsonProperty
    private String version;

    /**
     * Instantiates a new Apple pay encrypted payment.
     *
     * @param data the data
     * @param header the header
     * @param signature the signature
     * @param version the version
     */
    public ApplePayEncryptedPayment(String data, ApplePayHeader header, String signature, String version){
        this.data = data;
        this.header = header;
        this.signature = signature;
        this.version = version;
    }

    /**
     * Gets data.
     *
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * Gets header.
     *
     * @return the header
     */
    public ApplePayHeader getHeader() {
        return header;
    }

    /**
     * Sets header.
     *
     * @param header the header
     */
    public void setHeader(ApplePayHeader header) {
        this.header = header;
    }

    /**
     * Gets signature.
     *
     * @return the signature
     */
    public String getSignature() {
        return signature;
    }

    /**
     * Sets signature.
     *
     * @param signature the signature
     */
    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * Gets version.
     *
     * @return the version
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets version.
     *
     * @param version the version
     */
    public void setVersion(String version) {
        this.version = version;
    }
}

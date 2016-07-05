package com.zooz.common.client.ecomm.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Alex on 3/24/15.
 */
public class ApplePayHeader {

    @JsonProperty
    private String applicationData;

    @JsonProperty
    private String ephemeralPublicKey;

    @JsonProperty
    private String publicKeyHash;

    @JsonProperty
    private String transactionId;

    /**
     * Instantiates a new Apple pay header.
     *
     * @param applicationData the application data
     * @param ephemeralPublicKey the ephemeral public key
     * @param publicKeyHash the public key hash
     * @param transactionId the transaction id
     */
    public ApplePayHeader(String applicationData, String ephemeralPublicKey, String publicKeyHash, String transactionId){
        this.applicationData = applicationData;
        this.ephemeralPublicKey = ephemeralPublicKey;
        this.publicKeyHash = publicKeyHash;
        this.transactionId = transactionId;

    }

    /**
     * Gets transaction id.
     *
     * @return the transaction id
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets transaction id.
     *
     * @param transactionId the transaction id
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * Gets application data.
     *
     * @return the application data
     */
    public String getApplicationData() {
        return applicationData;
    }

    /**
     * Sets application data.
     *
     * @param applicationData the application data
     */
    public void setApplicationData(String applicationData) {
        this.applicationData = applicationData;
    }

    /**
     * Gets ephemeral public key.
     *
     * @return the ephemeral public key
     */
    public String getEphemeralPublicKey() {
        return ephemeralPublicKey;
    }

    /**
     * Sets ephemeral public key.
     *
     * @param ephemeralPublicKey the ephemeral public key
     */
    public void setEphemeralPublicKey(String ephemeralPublicKey) {
        this.ephemeralPublicKey = ephemeralPublicKey;
    }

    /**
     * Gets public key hash.
     *
     * @return the public key hash
     */
    public String getPublicKeyHash() {
        return publicKeyHash;
    }

    /**
     * Sets public key hash.
     *
     * @param publicKeyHash the public key hash
     */
    public void setPublicKeyHash(String publicKeyHash) {
        this.publicKeyHash = publicKeyHash;
    }
}

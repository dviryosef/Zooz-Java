package com.zooz.common.client.ecomm.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Fingerprint refer to the parameters included in an deviceFingerprint.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Fingerprint extends AbstractJsonBean {

    /**
     * The provider name.
     */
    @JsonProperty
    private String provider;

    /**
     * The provider “fingerprint” value.
     */
    @JsonProperty
    private String fingerprint;

    /**
     * Instantiates a new Fingerprint object.
     *
     * @param provider              The provider name.
     * @param fingerprint           The provider “fingerprint” value.
     */
    public Fingerprint(String provider, String fingerprint) {
        this.provider = provider;
        this.fingerprint = fingerprint;
    }

    /**
     * Instantiates a new Fingerprint object.
     */
    public Fingerprint() {

    }

    /**
     *  Get the provider name.
     *
     * @return provider name
     */
    public String getProvider() {
        return provider;
    }

    /**
     * Set the provider name.
     *
     * @param provider provider name.
     */
    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     *  Get the provider's fingerprint.
     *
     * @return The provider's fingerprint.
     */
    public String getFingerprint() {
        return fingerprint;
    }

    /**
     * Sets the provider's fingerprint.
     *
     * @param fingerprint   The provider's fingerprint.
     */
    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }
}

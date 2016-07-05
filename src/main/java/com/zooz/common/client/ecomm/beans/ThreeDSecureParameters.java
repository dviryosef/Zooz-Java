package com.zooz.common.client.ecomm.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ThreeDSecureParameters represents the parameters needed for the 3D Secure flow.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ThreeDSecureParameters extends AbstractJsonBean {
    /**
     * Access control server url
     */
    @JsonProperty
    private String acsUrl;
    /**
     * Merchant data identifier
     */
    @JsonProperty
    private String md;
    /**
     * Payer authentication request
     */
    @JsonProperty
    private String paReq;
    /**
     * ZooZ termination url
     */
    @JsonProperty
    private String termUrl;

    /**
     * Instantiates a new Three d secure parameters.
     *
     * @param acsUrl  Access control server url
     * @param md      Merchant data identifier
     * @param paReq   Payer Authentication Request
     * @param termUrl ZooZ termination url
     */
    public ThreeDSecureParameters(String acsUrl, String md, String paReq, String termUrl) {
        this.acsUrl = acsUrl;
        this.md = md;
        this.paReq = paReq;
        this.termUrl = termUrl;
    }

    /**
     * Instantiates a new Three d secure parameters.
     */
    public ThreeDSecureParameters() {
    }

    /**
     * Gets the access control server url.
     *
     * @return Value of the access control server url.
     */
    public String getAcsUrl() { return acsUrl; }

    /**
     * Sets new access control server url.
     *
     * @param acsUrl New value of the access control server url.
     */
    public void setAcsUrl(String acsUrl) { this.acsUrl = acsUrl; }

    /**
     * Gets the payer authentication request.
     *
     * @return Value of the payer Authentication Request.
     */
    public String getPaReq() { return paReq; }

    /**
     * Sets new payer Authentication Request.
     *
     * @param paReq New value of the payer Authentication Request.
     */
    public void setPaReq(String paReq) { this.paReq = paReq; }

    /**
     * Gets the merchant data identifier.
     *
     * @return Value of the merchant data identifier.
     */
    public String getMd() { return md; }

    /**
     * Sets new merchant data identifier.
     *
     * @param md New value of the merchant data identifier.
     */
    public void setMd(String md) { this.md = md; }

    /**
     * Gets the ZooZ termination url.
     *
     * @return Value of the ZooZ termination url.
     */
    public String getTermUrl() { return termUrl; }

    /**
     * Sets new ZooZ termination url.
     *
     * @param termUrl New value of the ZooZ termination url.
     */
    public void setTermUrl(String termUrl) { this.termUrl = termUrl; }
}

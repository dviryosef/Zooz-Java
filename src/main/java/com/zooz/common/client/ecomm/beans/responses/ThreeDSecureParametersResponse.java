package com.zooz.common.client.ecomm.beans.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ThreeDSecureParametersResponse class is used to send the Three D Secure parameters back to the client.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ThreeDSecureParametersResponse extends AuthorizeResponse {
    /**
     * Access the control server URL
     */
    @JsonProperty
    private String acsUrl;
    /**
     * Merchant Data Identifier
     */
    @JsonProperty
    private String md;
    /**
     * Payer Authentication Request
     */
    @JsonProperty
    private String paReq;
    /**
     * Zooz Termination URL
     */
    @JsonProperty
    private String termUrl;

    /**
     * Instantiates a new Three d secure parameters response.
     */
    public ThreeDSecureParametersResponse() {
    }

    /**
     * Gets the the Merchant Data Identifier.
     *
     * @return Value of Merchant Data Identifier.
     */
    public String getMd() { return md; }

    /**
     * Sets the new Merchant Data Identifier.
     *
     * @param md New value of Merchant Data Identifier.
     */
    public void setMd(String md) { this.md = md; }

    /**
     * Gets the Zooz Termination URL.
     *
     * @return Value of Zooz Termination URL.
     */
    public String getTermUrl() { return termUrl; }

    /**
     * Sets the new Zooz Termination URL.
     *
     * @param termUrl New value of Zooz Termination URL.
     */
    public void setTermUrl(String termUrl) { this.termUrl = termUrl; }

    /**
     * Gets the Payer Authentication Request.
     *
     * @return Value of Payer Authentication Request.
     */
    public String getPaReq() { return paReq; }

    /**
     * Sets the new Payer Authentication Request.
     *
     * @param paReq New value of Payer Authentication Request.
     */
    public void setPaReq(String paReq) { this.paReq = paReq; }

    /**
     * Gets the Access to the control server URL.
     *
     * @return Value of Access the control server URL.
     */
    public String getAcsUrl() { return acsUrl; }

    /**
     * Sets the new Access to the control server URL.
     *
     * @param acsUrl New value of Access the control server URL.
     */
    public void setAcsUrl(String acsUrl) { this.acsUrl = acsUrl; }
}

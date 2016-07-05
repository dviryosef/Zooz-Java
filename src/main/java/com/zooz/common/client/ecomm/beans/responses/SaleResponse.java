package com.zooz.common.client.ecomm.beans.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zooz.common.client.ecomm.beans.ExternalRisk;
import com.zooz.common.client.ecomm.beans.Risk;

/**
 * The SaleResponse includes any of the response parameter returns for the corresponding requests.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaleResponse extends CreditResponse {
    /**
     * Define the response type
     * Acceptable parameters:	saleCompletion  [SC]	AliPay [AP]
     * authorizeCompletion  - for regular authorization without using 3DSecure or AliPay
     * AliPay " for AliPay / PayEase response
     */
    @JsonProperty
    private String responseType;
    /**
     * Raw capture code as received from the acquirer.
     */
    @JsonProperty
    private String captureCode;

    /**
     * The processor slip Number
     */
    @JsonProperty
    private String slipNumber;

    /**
     * The risk that was returned by ZooZ Risk Engine
     */
    @JsonProperty
    private Risk risk;


    /**
     * The externalRisk
     */
    @JsonProperty
    private ExternalRisk externalRisk;

    /**
     * Instantiates a new Sale response.
     */
    public SaleResponse() {
    }

    /**
     * Gets the response type.
     *
     * @return the response type
     */
    public String getResponseType() {
        return responseType;
    }

    /**
     * Sets the response type.
     *
     * @param responseType the response type
     */
    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }

    /**
     * Returns the capture code
     *
     * @return a capture code
     */
    public String getCaptureCode() {
        return captureCode;
    }

    /**
     * Sets the capture code
     *
     * @param captureCode a capture code
     */
    public void setCaptureCode(String captureCode) {
        this.captureCode = captureCode;
    }

    /**
     * gets the risk
     * @return risk
     */
    public Risk getRisk() {
        return risk;
    }

    /**
     * Sets the risk
     * @param risk - the risk object
     */
    public void setRisk(Risk risk) {
        this.risk = risk;
    }

}

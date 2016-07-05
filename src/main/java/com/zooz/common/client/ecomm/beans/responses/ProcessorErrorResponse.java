package com.zooz.common.client.ecomm.beans.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProcessorErrorResponse {
    /**
     * Will return only on decline.
     * Represents the code of the decline as given from the issuer, processor, acquirer .
     */
    @JsonProperty
    private int declineCode;

    /**
     * Will return only on decline.
     * Will be the reason for the decline as given from the issuer, processor, acquirer .
     */
    @JsonProperty
    private String declineReason;

    /**
     * Instantiates a new ProcessorErrorResponse.
     */
    public ProcessorErrorResponse() {
    }

    public ProcessorErrorResponse(int errorCode, String errorReason) {
        this.declineCode = errorCode;
        this.declineReason = errorReason;
    }

    /**
     * Gets the decline code.
     *
     * @return the decline code
     */
    public int getDeclineCode() {
        return declineCode;
    }

    /**
     * Sets the decline code.
     *
     * @param declineCode the decline code
     */
    public void setDeclineCode(int declineCode) {
        this.declineCode = declineCode;
    }

    /**
     * Gets the decline reason.
     *
     * @return the decline reason
     */
    public String getDeclineReason() {
        return declineReason;
    }

    /**
     * Sets the decline reason.
     *
     * @param declineReason the decline reason
     */
    public void setDeclineReason(String declineReason) {
        this.declineReason = declineReason;
    }
}

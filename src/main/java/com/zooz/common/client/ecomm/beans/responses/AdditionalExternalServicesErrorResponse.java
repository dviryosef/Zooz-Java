package com.zooz.common.client.ecomm.beans.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This class is for external services responses like 'tax' - for adding more data regarding the error we received
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AdditionalExternalServicesErrorResponse {

    @JsonProperty
    private String errorCode;


    @JsonProperty
    private String errorMessage;


    public AdditionalExternalServicesErrorResponse() {
    }

    public AdditionalExternalServicesErrorResponse(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    /**
     * Gets the error code.
     *
     * @return the error code
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the error code.
     *
     * @param errorCode the error code
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }


    public String getErrorMessage() {
        return errorMessage;
    }


    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}

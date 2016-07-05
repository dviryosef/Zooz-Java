package com.zooz.common.client.ecomm.beans.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is the parent class of all Zooz external services responses.
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ZooZExternalServicesResponseObject extends ZoozResponseObject {
    /**
     *
     */
    @JsonProperty
    private AdditionalExternalServicesErrorResponse externalServiceError;

    public ZooZExternalServicesResponseObject() {
    }

    public ZooZExternalServicesResponseObject(AdditionalExternalServicesErrorResponse externalServiceError) {
        this.externalServiceError = externalServiceError;
    }

    public AdditionalExternalServicesErrorResponse getExternalServiceError() {
        return externalServiceError;
    }

    public void setExternalServiceError(AdditionalExternalServicesErrorResponse externalServiceError) {
        this.externalServiceError = externalServiceError;
    }
}

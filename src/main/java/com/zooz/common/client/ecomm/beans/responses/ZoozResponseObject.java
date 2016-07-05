package com.zooz.common.client.ecomm.beans.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is the parent class of all Zooz responses.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ZoozResponseObject {
    @JsonProperty
    private String errorDescription;
    @JsonProperty
    private String responseErrorCode;
    @JsonProperty
    private String customerMessage;

    /**
     * Instantiates a new Zooz response object.
     *
     * @param errorDescription  In case that the status code does not equal zero and there is more information about the
     *                          error, this field will contain the error description.
     * @param responseErrorCode In case that the status code does not equal zero, contains the specific code for
     *                          the error description.
     */
    public ZoozResponseObject(String errorDescription, String responseErrorCode) {
        this.errorDescription = errorDescription;
        this.responseErrorCode = responseErrorCode;
    }

    /**
     * Instantiates a new Zooz response object.
     *
     * @param errorDescription  In case that the status code does not equal zero and there is more information about the
     *                          error, this field will contain the error description.
     * @param responseErrorCode In case that the status code does not equal zero, contains the specific code for
     *                          the error description.
     * @param customerMessage In case that the status code does not equal zero, contains the specific message for the customer
     *
     */
    public ZoozResponseObject(String errorDescription, String responseErrorCode,String customerMessage) {
        this.errorDescription = errorDescription;
        this.responseErrorCode = responseErrorCode;
        this.customerMessage = customerMessage;
    }


    /**
     * Instantiates a new Zooz response object.
     */
    public ZoozResponseObject() {
    }

    /**
     * Gets error description.
     *
     * @return the error description
     */
    public String getErrorDescription() {
        return errorDescription;
    }

    /**
     * Sets error description.
     *
     * @param errorDescription the error description
     */
    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    /**
     * Gets response error code.
     *
     * @return the response error code
     */
    public String getResponseErrorCode() {
        return responseErrorCode;
    }

    /**
     * Sets response error code.
     *
     * @param responseErrorCode the response error code
     */
    public void setResponseErrorCode(String responseErrorCode) {
        this.responseErrorCode = responseErrorCode;
    }
    /**
     * Gets response customerMessage.
     *
     * @return the response error code
     */
    public String getCustomerMessage() {
        return customerMessage;
    }

    /**
     * Sets response customer message.
     *
     * @param customerMessage the response error code
     */
    public void setCustomerMessage(String customerMessage) {
        this.customerMessage = customerMessage;
    }

}



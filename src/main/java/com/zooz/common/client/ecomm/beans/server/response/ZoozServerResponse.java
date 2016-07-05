package com.zooz.common.client.ecomm.beans.server.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zooz.common.client.ecomm.beans.responses.ZoozResponseObject;

/**
 * All Zooz server responses contain two parameters: responseStatus and responseObject.
 *
 * @param <T> the type parameter
 */
public class ZoozServerResponse<T extends ZoozResponseObject> {
    /**
     * If code equals zero (0), the request succeeded
     * Otherwise, the request failed.
     */
    @JsonProperty
    private int responseStatus;
    /**
     * The object sent by the Zooz server
     * will be parsed according to the response set.
     */
    @JsonProperty
    private T responseObject;

    /**
     * Instantiates a new Zooz server response.
     *
     * @param responseStatus If code equals zero (0), the request succeeded.
     *                       Otherwise, the request failed.
     * @param responseObject The object sent by the Zooz server
     *                       will be parsed according to the response set.
     */
    public ZoozServerResponse(int responseStatus, T responseObject) {
        this.responseObject = responseObject;
        this.responseStatus = responseStatus;
    }

    /**
     * Instantiates a new Zooz server response.
     */
    public ZoozServerResponse() {
    }

    /**
     * Gets the response object.
     *
     * @return the response object
     */
    public T getResponseObject() {
        return responseObject;
    }


    /**
     * Sets the response object.
     *
     * @param responseObject the response object
     */
    public void setResponseObject(T responseObject) {

        this.responseObject = responseObject;
    }

    /**
     * Gets the response status.
     *
     * @return the response status
     */
    public int getResponseStatus() {
        return responseStatus;
    }


    /**
     * Sets the response status.
     *
     * @param responseStatus the response status
     */
    public void setResponseStatus(int responseStatus) {
        this.responseStatus = responseStatus;
    }

    public String toString() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(this);
        } catch (Exception e) {
            return "Error occurred in toString of JSON object" + e.getMessage();
        }
    }
}

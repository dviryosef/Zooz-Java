package com.zooz.common.client.ecomm.beans.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zooz.common.client.ecomm.beans.responses.ZoozResponseObject;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;


/**
 * This is the abstract class for all Zooz requests.
 * A Zooz request implements all of the Zooz API's calls in the eComm API document.
 *
 * @param <T> the type parameter
 */
public abstract class  AbstractZoozRequest<T extends ZoozResponseObject>  {
    /**
     * command for Zooz API's
     */
    @JsonProperty(required = true)
    private String command;
    /**
     * version for Zooz API's
     */
    @JsonProperty
    private String version = this.getClass().getPackage().getImplementationVersion();

    /**
     * Instantiates a new Abstract zooz request.
     *
     * @param command command for Zooz API's
     */
    protected AbstractZoozRequest(String command) {

        this.command = command;
    }

    /**
     * Returns the zooz command
     *
     * @return command for Zooz API's
     */
    public String getCommand() {
        return command;
    }

    /**
     * Sets the zooz command
     *
     * @param command command for Zooz API's.
     */
    public void setCommand(String command) {
        this.command = command;

    }

    /**
     * Gets response type reference.
     *
     * @return the response type reference
     */
    public TypeReference<ZoozServerResponse<T>> getResponseTypeReference() {
        return new TypeReference<ZoozServerResponse<T>>() {
        };
    }



    /**
     * Returns a String instance which represent the request.
     *
     * @return a string.
     */
    @Override
    public String toString() {
        try {

            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(this);
        } catch (Exception e) {
            return "Error occurred in toString of Request object" + e.getMessage();
        }
    }
}

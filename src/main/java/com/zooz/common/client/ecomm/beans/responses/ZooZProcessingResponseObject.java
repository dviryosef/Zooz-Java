package com.zooz.common.client.ecomm.beans.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is the parent class of all Zooz processing responses.
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ZooZProcessingResponseObject extends ZoozResponseObject {

    /**
     * will contain the declineCode and declineReason as returned from the processor, in case of a processor decline.
     */
    @JsonProperty
    private ProcessorErrorResponse processorError;

    public ZooZProcessingResponseObject() {
    }

    public ZooZProcessingResponseObject(ProcessorErrorResponse processorError) {
        this.processorError = processorError;
    }

    /**
     * Gets the processorError
     * @return the processorError
     */
    public ProcessorErrorResponse getProcessorError() {
        return processorError;
    }

    /**
     * Sets the processorError
     * @param processorError the processorError
     */
    public void setProcessorError(ProcessorErrorResponse processorError) {
        this.processorError = processorError;
    }
}

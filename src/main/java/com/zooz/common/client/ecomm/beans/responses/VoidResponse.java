package com.zooz.common.client.ecomm.beans.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The VoidResponse includes any of the response parameter returns for the corresponding requests.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class VoidResponse extends ZooZProcessingResponseObject {
    /**
     * Reference id for the request, received from the processor.
     */
    @JsonProperty
    private String voidReferenceId;

    /**
     * The processor slip Number
     */
    @JsonProperty
    private String slipNumber;

    /**
     * The name of the processor that processes the transaction
     */
    @JsonProperty
    private String processorName;

    /**
     * Instantiates a new Void response.
     */
    public VoidResponse() {
    }

    /**
     * Gets the void reference id.
     *
     * @return the void reference id
     */
    public String getVoidReferenceId() {
        return voidReferenceId;
    }

    /**
     * Sets the void reference id.
     *
     * @param voidReferenceId the void reference id
     */
    public void setVoidReferenceId(String voidReferenceId) {
        this.voidReferenceId = voidReferenceId;
    }


    /**
     * gets the processor slip number
     *
     * @return slipNumber slip number
     */
    public String getSlipNumber() {
         return slipNumber;
     }

    /**
     * sets the processor slip number
     *
     * @param slipNumber the slip number
     */
    public void setSlipNumber(String slipNumber) {
         this.slipNumber = slipNumber;
     }

    /**
     * Gets the name of the processor that processes the transaction
     *
     * @return processorName processor name
     */
    public String getProcessorName() {
        return processorName;
    }

    /**
     * Sets the name of the processor that processes the transaction
     *
     * @param processorName the processor name
     */
    public void setProcessorName(String processorName) {
        this.processorName = processorName;
    }
}


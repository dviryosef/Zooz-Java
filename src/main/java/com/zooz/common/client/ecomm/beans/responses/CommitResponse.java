package com.zooz.common.client.ecomm.beans.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;

import java.util.Map;

/**
 * The CommitResponse includes any of the response parameter returns for the corresponding requests.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CommitResponse extends ZooZProcessingResponseObject {
    /**
     * Raw capture code as received from the acquirer.
     */
    @JsonProperty
    private String captureCode;

     /**
     * The capture zooz action id.
     */
    @JsonProperty
    private String actionID;
    /**
     * Unique ID used to reconcile transactions, Received from processor
     * Note that this parameter might be different from "reconciliationId" parameter passed in the request due to processor changes.
     */
    @JsonProperty
    private String reconciliationId;

    /**
     * The name of the processor that processes the transaction
     */
    @JsonProperty
    private String processorName;



    /**
     * additional information provided by the payment service provider.
     */
    @JsonProperty
    private Map providerCustomData;

    /**
     * In case we get "duplicate" error - this object will contain the original commit response
     */
    @JsonProperty
    private ZoozServerResponse<CommitResponse> originalResponse;

    /**
     * Instantiates a new Commit response.
     */
    public CommitResponse() {
    }

    /**
     * Returns the capture ode
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
     * Gets the reconciliation id.
     *
     * @return the reconciliation id
     */
    public String getReconciliationId() {
        return reconciliationId;
    }

    /**
     * Sets the reconciliation id.
     *
     * @param reconciliationId the reconciliation id
     */
    public void setReconciliationId(String reconciliationId) {
        this.reconciliationId = reconciliationId;
    }

    /**
     * gets the name of the processor that processes the transaction
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

    /**
     * gets the original commit response
     *
     * @return original response
     */
    public ZoozServerResponse<CommitResponse> getOriginalResponse() {
        return originalResponse;
    }

    /**
     * additional information provided by the payment service provider.
     *
     * @return additional information provided by the payment service provider.
     */
    public Map getProviderCustomData() {
        return providerCustomData;
    }

    /**
     * sets the provider custom data
     *
     * @param providerCustomData the provider custom data
     */
    public void setProviderCustomData(Map providerCustomData) {
        this.providerCustomData = providerCustomData;
    }

    /**
     * sets the original commit response
     *
     * @param originalResponse the original response
     */
    public void setOriginalResponse(ZoozServerResponse<CommitResponse> originalResponse) {
        this.originalResponse = originalResponse;
    }

    /**
     * zooz action id.
     *
     * @return zooz action id.
     */
    public String getActionID() {
        return actionID;
    }

    /**
     * sets the original commit response
     *
     * @param actionID - the zooz action id
     */
    public void setActionID(String actionID) {
        this.actionID = actionID;
    }
}

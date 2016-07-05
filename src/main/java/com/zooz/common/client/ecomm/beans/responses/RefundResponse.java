package com.zooz.common.client.ecomm.beans.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;

/**
 * The RefundResponse includes any of the response parameter returns for the corresponding requests.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RefundResponse extends ZooZProcessingResponseObject {
    /**
     * Raw refund code as received from the acquirer.
     */
    @JsonProperty
    private String refundCode;
    /**
     * The amount refunded.
     */
    @JsonProperty
    private double refundAmount;
    /**
     * Unique ID used to reconcile transactions, Received from processor
     * Note that this parameter might be different from "reconciliationId" parameter passed in the request due to processor changes.
     */
    @JsonProperty
    private String reconciliationId;

    /**
     * The status of the refund.
     */
    @JsonProperty
    private String refundStatus;

    /**
     * In case we get "duplicate" error - this object will contain the original refund response
     */
    @JsonProperty
    private ZoozServerResponse<RefundResponse> originalResponse;

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
     * Instantiates a new Refund response.
     */
    public RefundResponse() {
    }

    /**
     * Gets the refund code.
     *
     * @return the refund code
     */
    public String getRefundCode() {
        return refundCode;
    }

    /**
     * Sets the refund code.
     *
     * @param refundCode the refund code
     */
    public void setRefundCode(String refundCode) {
        this.refundCode = refundCode;
    }

    /**
     * Gets the refund amount.
     *
     * @return the refund amount
     */
    public double getRefundAmount() {
        return refundAmount;
    }

    /**
     * Sets the refund amount.
     *
     * @param refundAmount the refund amount
     */
    public void setRefundAmount(double refundAmount) {
        this.refundAmount = refundAmount;
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
     * gets the original response
     *
     * @return original response
     */
    public ZoozServerResponse<RefundResponse> getOriginalResponse() {
        return originalResponse;
    }

    /**
     * sets the original refund response
     *
     * @param originalResponse the original response
     */
    public void setOriginalResponse(ZoozServerResponse<RefundResponse> originalResponse) {
        this.originalResponse = originalResponse;
    }

    /**
     * Gets refund status.
     *
     * @return the refund status
     */
    public String getRefundStatus() {
        return refundStatus;
    }

    /**
     * Sets refund status.
     *
     * @param refundStatus the refund status
     */
    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
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

package com.zooz.common.client.ecomm.beans.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zooz.common.client.ecomm.beans.Risk;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;

/**
 * The CreditResponse includes any of the response parameter returns for the corresponding requests.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreditResponse extends ZooZProcessingResponseObject {
    /**
     * Raw authorization code as received from the acquirer.
     */
    @JsonProperty
    private String authorizationCode;
    /**
     * Reference id for the request, received from the processor.
     */
    @JsonProperty
    private String processorReferenceId;
    /**
     * The MID (Merchant ID) associated to the payment.
     */
    @JsonProperty
    private String merchantId;
    /**
     * The processor response result code
     */
    @JsonProperty
    private Integer processorResultCode;
    /**
     * Unique ID used to reconcile transactions, Received from processor
     */
    @JsonProperty
    private String reconciliationId;
    /**
     * The processor slip Number
     */
    @JsonProperty
    private String slipNumber;
    /**
     * In case we get "duplicate" error - this object will contain the original credit response
     */
    @JsonProperty
    private ZoozServerResponse<CreditResponse> originalResponse;

    /**
     * The risk that was returned by ZooZ Risk Engine
     */
    @JsonProperty
    private Risk risk;

    /**
     * The name of the processor that processes the transaction
     */
    @JsonProperty
    private String processorName;

    /**
     * Instantiates a new Credit response.
     */
    public CreditResponse() {
    }


    /**
     * Gets the authorization code.
     *
     * @return the authorization code
     */
    public String getAuthorizationCode() {
        return authorizationCode;
    }

    /**
     * Sets the authorization code.
     *
     * @param authorizationCode the authorization code
     */
    public void setAuthorizationCode(String authorizationCode) {
        this.authorizationCode = authorizationCode;
    }

    /**
     * Gets the processor reference id.
     *
     * @return the processor reference id
     */
    public String getProcessorReferenceId() {
        return processorReferenceId;
    }

    /**
     * Sets the processor reference id.
     *
     * @param processorReferenceId the processor reference id
     */
    public void setProcessorReferenceId(String processorReferenceId) {
        this.processorReferenceId = processorReferenceId;
    }


    /**
     * Gets the merchant id.
     *
     * @return the merchant id
     */
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * Sets the merchant id.
     *
     * @param merchantId the merchant id
     */
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    /**
     * Gets processor result code
     *
     * @return processor result code
     */
    public Integer getProcessorResultCode() {
        return processorResultCode;
    }

    /**
     * set processor result code
     *
     * @param processorResultCode the processor result code
     */
    public void setProcessorResultCode(Integer processorResultCode) {
        this.processorResultCode = processorResultCode;
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
     * gets the original credit response
     *
     * @return the original credit response
     */
    public ZoozServerResponse<CreditResponse> getOriginalResponse() {
        return originalResponse;
    }


    /**
     * sets the original credit response
     *
     * @param originalResponse the original response
     */
    public void setOriginalResponse(ZoozServerResponse<CreditResponse> originalResponse) {
        this.originalResponse = originalResponse;
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
     * gets the risk
     *
     * @return risk risk
     */
    public Risk getRisk() {
        return risk;
    }

    /**
     * Sets the risk
     *
     * @param risk the risk
     */
    public void setRisk(Risk risk) {
        this.risk = risk;
    }

    /**
     * Gets The name of the processor that processes the transaction
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

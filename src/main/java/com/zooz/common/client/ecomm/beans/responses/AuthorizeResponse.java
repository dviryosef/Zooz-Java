package com.zooz.common.client.ecomm.beans.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zooz.common.client.ecomm.beans.ExternalRisk;
import com.zooz.common.client.ecomm.beans.Risk;
import com.zooz.common.client.ecomm.beans.ThreeDSecureParameters;

import java.util.Map;

/**
 * The AuthorizeResponse includes any of the response parameter returns for the corresponding requests.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthorizeResponse extends ZooZProcessingResponseObject {
    /**
     * Define the response type
     * Acceptable parameters:	authorizeCompletion  [AC]	3DSecure [3D]	AliPay [AP]
     * authorizeCompletion  - for regular authorization without using 3DSecure or AliPay
     * 3DSecure " for 3DSecure authentication response
     * AliPay " for AliPay / PayEase response
     */
    @JsonProperty
    private String responseType;
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
     * The parameters which is needed for Three D Secure flow.
     */
    @JsonProperty
    private ThreeDSecureParameters obj3DSecure;
    /**
     * Fraud detection response as received from the processor.
     */
    @JsonProperty
    private Map fraudDetectionResponse;
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
     * The processor response result code
     */
    @JsonProperty
    private String reconciliationId;

    /**
     * The processor slip Number
     */
    @JsonProperty
    private String slipNumber;

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

    @JsonProperty
    private ExternalRisk externalRisk;

    @JsonProperty
    private Map providerCustomData;

    /**
     * The raw response of the cv2Avs check
     */
    @JsonProperty
    private String cv2AvsRaw;

    /**
     * Instantiates a new Authorize response.
     */
    public AuthorizeResponse() {
    }

    /**
     * Gets the response type.
     *
     * @return the response type
     */
    public String getResponseType() {
        return responseType;
    }

    /**
     * Sets the response type.
     *
     * @param responseType the response type
     */
    public void setResponseType(String responseType) {
        this.responseType = responseType;
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
     * Gets the obj 3 d secure.
     *
     * @return the obj 3 d secure
     */
    public ThreeDSecureParameters getObj3DSecure() {
        return obj3DSecure;
    }

    /**
     * Sets the obj 3 d secure.
     *
     * @param obj3DSecure the obj 3 d secure
     */
    public void setObj3DSecure(ThreeDSecureParameters obj3DSecure) {
        this.obj3DSecure = obj3DSecure;
    }

    /**
     * Gets the fraud detection response.
     *
     * @return the fraud detection response
     */
    public Map getFraudDetectionResponse() {
        return fraudDetectionResponse;
    }

    /**
     * Sets the fraud detection response.
     *
     * @param fraudDetectionResponse the fraud detection response
     */
    public void setFraudDetectionResponse(Map fraudDetectionResponse) {
        this.fraudDetectionResponse = fraudDetectionResponse;
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
     * Gets reconciliation id.
     *
     * @return reconciliationId reconciliation id
     */
    public String getReconciliationId() {
        return reconciliationId;
    }

    /**
     * set reconciliation Id
     *
     * @param reconciliationId the reconciliation id
     */
    public void setReconciliationId(String reconciliationId) {
        this.reconciliationId = reconciliationId;
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

    public Map getProviderCustomData() {
        return providerCustomData;
    }

    public void setProviderCustomData(Map providerCustomData) {
        this.providerCustomData = providerCustomData;
    }

    /**
     * Gets the raw response of the cv2Avs check
     * @return the raw response of the cv2Avs check
     */
    public String getCv2AvsRaw() {
        return cv2AvsRaw;
    }

    /**
     * Sets the raw response of the cv2Avs check
     * @param cv2AvsRaw the raw response of the cv2Avs check
     */
    public void setCv2AvsRaw(String cv2AvsRaw) {
        this.cv2AvsRaw = cv2AvsRaw;
    }

}

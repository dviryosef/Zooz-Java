package com.zooz.common.client.ecomm.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by yaelmasri on 8/16/15.
 * This object represent the historical financial transaction
 * It contains transactionToken, type and status
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HistoryTransaction extends AbstractJsonBean {
    /**
     * The encrypted transactionId
     */
    @JsonProperty
    private String transactionToken;
    /**
     * The transaction type : Authorize / Capture / Refund / Void  /Credit / Charge
     */
    @JsonProperty
    private String type;
    /**
     * The transaction status: Succeed/ Failed / Pending
     */
    @JsonProperty
    private String status;

    /**
     * Gets the encrypted transactionId
     * @return the transactionToken
     */
    public String getTransactionToken() {
        return transactionToken;
    }

    /**
     * Sets the transactionToken
     *
     * @param transactionToken -  the encrypted transactionId
     */
    public void setTransactionToken(String transactionToken) {
        this.transactionToken = transactionToken;
    }
    /**
     * Gets the type of the financial transaction
     * @return the type of the financial transaction . The options are: {Authorize , Capture, Refund, Void, Credit, Charge}.
     */
    public String getType() {
        return type;
    }
    /**
     * Sets the type of the financial transaction
     *
     * @param type -  the type of the financial transaction . The options are: {Authorize , Capture, Refund, Void, Credit, Charge}.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets the status of the financial transaction
     * @return the type of the financial transaction . The options are: {Authorize , Capture, Refund, Void, Credit, Charge}.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the status of the financial transaction
     *
     * @param status -  the type of the financial transaction . The options are:  {Succeed, Pending , Failed}.
     */
    public void setStatus(String status) {
        this.status = status;
    }
}

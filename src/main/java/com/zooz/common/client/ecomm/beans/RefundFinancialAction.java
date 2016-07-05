package com.zooz.common.client.ecomm.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;


/**
 * The set of parameters included in a refund financial action.
 * Financial actions are used for capturing and refunding payments.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RefundFinancialAction extends FinancialAction {
    /**
     * The related capture actionid.
     */
    @JsonProperty
    private String captureActionID;


    /**
     * Instantiates a new Refund Financial action.
     */
    public RefundFinancialAction() {
    }

    /**
     * gets the capture action ID
     *
     * @return actionID capture action id
     */
    public String getCaptureActionID() {
        return captureActionID;
    }

    /**
     * sets the capture action ID
     *
     * @param captureActionID the capture action id
     */
    public void setCaptureActionID(String captureActionID) {
        this.captureActionID = captureActionID;
    }


}

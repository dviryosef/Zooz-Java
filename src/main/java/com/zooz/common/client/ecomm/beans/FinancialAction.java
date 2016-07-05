package com.zooz.common.client.ecomm.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;


/**
 * The set of parameters included in a financial action.
 * Financial actions are used for capturing and refunding payments.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FinancialAction extends AbstractJsonBean {
    /**
     * The financial action amount.
     */
    @JsonProperty
    private double amount;
    /**
     * Raw authorization code as received from the acquirer.
     */
    @JsonProperty
    private String referenceId;
    /**
     * The financial action date. Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT represented by this date.
     */
    @JsonProperty
    private long timestamp;
    /**
     * Unique ID used to reconcile transactions, Received from processor
     * Note that this parameter might be different from "reconciliationId" parameter passed in the request due to processor changes.
     */
    @JsonProperty
    private String reconciliationId;
    /**
     * The processor slip Number
     */
    @JsonProperty
    private String slipNumber;

    /**
     * The provider customer data
     */
    @JsonProperty
    private Map<Object, Object> providerCustomData;


    /**
     * actionID
     */
    @JsonProperty
    private String actionID;


    /**
     * The invoice
     */
    @JsonProperty
    private ReferenceInvoice invoice;


    /**
     * Gets invoice.
     *
     * @return the invoice
     */
    public ReferenceInvoice getInvoice() {
        return invoice;
    }

    /**
     * Sets invoice.
     *
     * @param invoice the invoice
     */
    public void setInvoice(ReferenceInvoice invoice) {
        this.invoice = invoice;
    }

    /**
     * Instantiates a new Financial action.
     */
    public FinancialAction() {
    }

    /**
     * Gets the financial action amount.
     *
     * @return Value of The financial action amount.
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets new financial action amount.
     *
     * @param amount New value of the financial action amount.
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Gets the financial action date
     * Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT represented by this date.
     *
     * @return Value of The financial action date. Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT represented by this date.
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * Sets new financial action date
     * Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT represented by this date.
     *
     * @param timestamp New value of The financial action date. Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT represented by this date.
     */
    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Gets raw authorization code as received from the acquirer.
     *
     * @return Value of Raw authorization code as received from the acquirer.
     */
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Sets raw authorization code as received from the acquirer.
     *
     * @param referenceId New value of raw authorization code as received from the acquirer.
     */
    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
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
     * gets the zooz action ID
     *
     * @return actionID action id
     */
    public String getActionID() {
        return actionID;
    }

    /**
     * sets the zooz action ID
     *
     * @param actionID the action id
     */
    public void setActionID(String actionID) {
        this.actionID = actionID;
    }

    /**
     * Gets provider custom data.
     *
     * @return the provider custom data
     */
    public Map<Object, Object> getProviderCustomData() {
        return providerCustomData;
    }

    /**
     * sets the provider custom data
     *
     * @param providerCustomData the provider custom data
     */
    public void setProviderCustomData(Map<Object, Object> providerCustomData) {
        this.providerCustomData = providerCustomData;
    }


}

package com.zooz.common.client.ecomm.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by rona on 6/25/15.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RiskResult {

    /**
     * The action. optional values:
     * PASS: Transaction passed risk-engine check
     * BLOCK: Transaction blocked by risk-engine
     * MANUAL_REVIEW: Transaction marked as blocked in learning-mode by risk-engine
     * BLOCK_LEARNING_MODE: Transaction marked as suspicious by risk-engine
     * INCOMPLETE_EXECUTION: Fraud check did not complete successfully
     */
    @JsonProperty
    private String action;

    /**
     * The context that ZooZ Risk Engine was called from. optional values: FDSPreAuth, FDSPostAuth, FDSPostSale, FDSPostCredit
     */
    @JsonProperty
    private String context;

    /**
     * The risk score that was returned from ZooZ Risk Engine
     */
    @JsonProperty
    private String riskScore;

    /**
     * The description for the action that was returned from ZooZ Risk Engine
     */
    @JsonProperty
    private String description;

    /**
     * The origin of the risk score that was returned from ZooZ Risk Engine
     */
    @JsonProperty
    private String riskScoreOrigin;

    /**
     * The determining rule of the action that was returned from ZooZ Risk Engine
     */
    @JsonProperty
    private String determiningRule;


    /**
     * Gets the action
     * @return the action
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the action
     * @param action action to set
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * Gets the context
     * @return the context
     */
    public String getContext() {
        return context;
    }

    /**
     * Sets the context
     * @param context the context to set
     */
    public void setContext(String context) {
        this.context = context;
    }

    /**
     * Gets the riskScore
     * @return the riskScore
     */
    public String getRiskScore() {
        return riskScore;
    }

    /**
     * Sets the riskScore
     * @param riskScore the riskScore to set
     */
    public void setRiskScore(String riskScore) {
        this.riskScore = riskScore;
    }

    /**
     * Get the description
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get the riskScoreOrigin
     * @return the riskScoreOrigin
     */
    public String getRiskScoreOrigin() {
        return riskScoreOrigin;
    }

    /**
     * Sets the riskScoreOrigin
     * @param riskScoreOrigin the riskScoreOrigin to set
     */
    public void setRiskScoreOrigin(String riskScoreOrigin) {
        this.riskScoreOrigin = riskScoreOrigin;
    }

    /**
     * Get the determiningRule
     * @return the determiningRule
     */
    public String getDeterminingRule() {
        return determiningRule;
    }

    /**
     * Sets the determiningRule
     * @param determiningRule the determiningRule to set
     */
    public void setDeterminingRule(String determiningRule) {
        this.determiningRule = determiningRule;
    }
}

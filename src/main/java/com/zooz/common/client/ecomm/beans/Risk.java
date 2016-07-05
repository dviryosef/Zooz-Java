package com.zooz.common.client.ecomm.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * The Risk class represents the responses from ZooZ Risk Engine for this payment
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Risk extends AbstractJsonBean {

    /**
     * the responses from ZooZ Risk Engine for this payment
     */
    @JsonProperty
    private List<RiskResult> results;

    /**
     * Gets the risk results
     * @return the risk results
     */
    public List<RiskResult> getResults() {
        return results;
    }

    /**
     * Sets the risk results
     * @param results the risk results to set
     */
    public void setResults(List<RiskResult> results) {
        this.results = results;
    }
}

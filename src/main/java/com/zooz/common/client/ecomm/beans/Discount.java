package com.zooz.common.client.ecomm.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by liramv on 8/2/15.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Discount extends AbstractJsonBean {

    /**
     * The discount code.
     */
    @JsonProperty
    private String code;

    /**
     * The discount rate.
     */
    @JsonProperty
    private double rate;

    /**
     * Instantiates a new Discount object.
     */
    public Discount() {

    }

    /**
     * Instantiates a new Discount object.
     * @param code - The discount code.
     * @param rate - The discount rate.
     */
    public Discount(String code, double rate) {
        this.code = code;
        this.rate = rate;
    }


    /**
     * Get the discount code.
     *
     * @return discount code
     */
    public String getCode() {
        return code;
    }

    /**
     * Set the discount code.
     *
     * @param code - Discount code.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Get the discount rate.
     * @return discount rate
     */
    public double getRate() {
        return rate;
    }

    /**
     * Set the discount rate.
     * @param rate - discount rate
     */
    public void setRate(double rate) {
        this.rate = rate;
    }
}

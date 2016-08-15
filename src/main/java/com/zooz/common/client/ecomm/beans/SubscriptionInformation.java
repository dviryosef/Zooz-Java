package com.zooz.common.client.ecomm.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by dviryoseff on 08/08/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SubscriptionInformation {
    /**
     * The startDate of the subscription (default = now )
     */
    @JsonProperty
    private String startDate;
    /**
     * The endDate of the subscription (default = now )
     */
    @JsonProperty
    private String endDate;
    /**
     * The paid periodUnit :day, week, month, year
     */
    @JsonProperty
    private String periodUnit;
    /**
     * The multiple of the recurring. for example if the periodUnit is month and the periodNumber is 2, the payment will
     * be once in 2 months.
     */
    @JsonProperty
    private String periodNumber;
    /**
     * The number of recurrences
     */
    @JsonProperty
    private String recurring;
    /**
     * the description of the subscription
     */
    @JsonProperty
    private String subscriptionDescription;
    /**
     * the token of the subscription
     */
    @JsonProperty
    private String subscriptionToken;

    public SubscriptionInformation(String startDate, String endDate, String periodUnit, String recurring, String periodNumber ,String subscriptionToken) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.periodUnit = periodUnit;
        this.recurring = recurring;
        this.periodNumber = periodNumber;
        this.subscriptionToken = subscriptionToken;
    }

    public SubscriptionInformation() {}


    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getPeriodUnit() {
        return periodUnit;
    }

    public void setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
    }

    public String getRecurring() {
        return recurring;
    }

    public void setRecurring(String recurring) {
        this.recurring = recurring;
    }

    public String getPeriodNumber() {
        return periodNumber;
    }

    public void setPeriodNumber(String periodNumber) {
        this.periodNumber = periodNumber;
    }

    public String getSubscriptionToken() {
        return subscriptionToken;
    }

    public void setSubscriptionToken(String subscriptionToken) {
        this.subscriptionToken = subscriptionToken;
    }

    public String getSubscriptionDescription() {
        return subscriptionDescription;
    }

    public void setSubscriptionDescription(String subscriptionDescription) {
        this.subscriptionDescription = subscriptionDescription;
    }
}

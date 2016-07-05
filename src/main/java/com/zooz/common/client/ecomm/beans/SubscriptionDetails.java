package com.zooz.common.client.ecomm.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by yaelmasri on 1/14/15.
 */
public class SubscriptionDetails extends AbstractJsonBean {
    /**
     * The startDate of the subscription (default = now )
     */
    @JsonProperty
    private String startDate;
    /**
     * The paid periodUnit :day, week, month, year
     */
    @JsonProperty
    private String periodUnit;
    /**
     * The number of recurrences
     */
    @JsonProperty
    private String recurring;
    /**
     * The multiple of the recurring. for example if the periodUnit is month and the periodNumber is 2, the payment will
     * be once in 2 months.
     */
    @JsonProperty
    private String periodNumber;
    /**
     * true for indefinite subscription, false otherwise
     */
    @JsonProperty
    private boolean isSubscriptionIndefinite;

    /**
     * the description of the subscription
     */
    @JsonProperty
    private String subscriptionDescription;

    public SubscriptionDetails(String startDate, String periodUnit, String recurring, String periodNumber ,boolean isSubscriptionIndefinite) {
        this.startDate = startDate;
        this.periodUnit = periodUnit;
        this.recurring = recurring;
        this.periodNumber = periodNumber;
        this.isSubscriptionIndefinite = isSubscriptionIndefinite;
    }

    /**
     * Instantiates a new Payment details.
     */
    public SubscriptionDetails() {}


    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
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

    public boolean isSubscriptionIndefinite() {
        return isSubscriptionIndefinite;
    }

    public void setSubscriptionIndefinite(boolean isSubscriptionIndefinite) {
        this.isSubscriptionIndefinite = isSubscriptionIndefinite;
    }

    public String getSubscriptionDescription() {
        return subscriptionDescription;
    }

    public void setSubscriptionDescription(String subscriptionDescription) {
        this.subscriptionDescription = subscriptionDescription;
    }
}

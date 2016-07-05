package com.zooz.common.client.ecomm.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The set of parameters included in a payment installment identity.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentInstallment extends AbstractJsonBean {

    /**
     * The number of installments
     */
    @JsonProperty
    private Integer numOfInstallments;
    /**
     * The amount of the first installment
     */
    @JsonProperty
    private Double firstInstallmentAmount;
    /**
     * The amount of the remaining installments
     */
    @JsonProperty
    private Double remainingInstallmentsAmount;

    /**
     * Instantiates a new Payment Installment.
     */
    public PaymentInstallment() {
    }

    /**
     * Instantiates a new User.
     *
     * @param numOfInstallments             Number of installments of the payment
     * @param firstInstallmentAmount        The amount of the first installment
     * @param remainingInstallmentsAmount   The amount of the remaining installments
     */
    public PaymentInstallment(Integer numOfInstallments, Double firstInstallmentAmount, Double remainingInstallmentsAmount) {
        this.numOfInstallments = numOfInstallments;
        this.firstInstallmentAmount = firstInstallmentAmount;
        this.remainingInstallmentsAmount = remainingInstallmentsAmount;
    }

    /**
     * Gets the user's first name.
     *
     * @return Value of the user's first name.
     */
    public Integer getNumOfInstallments() { return numOfInstallments; }

    /**
     * Sets the number of installments of the payment
     *
     * @param numOfInstallments Number of installments of the payment
     */
    public void setNumOfInstallments(Integer numOfInstallments) { this.numOfInstallments = numOfInstallments; }

    /**
     * Gets the amount of the first installment
     *
     * @return Value of the amount of the first installment
     */
    public Double getFirstInstallmentAmount() { return firstInstallmentAmount; }

    /**
     * Sets the amount of the first installment
     *
     * @param firstInstallmentAmount the amount of the first installment
     */
    public void setFirstInstallmentAmount(Double firstInstallmentAmount) { this.firstInstallmentAmount = firstInstallmentAmount; }

    /**
     * Gets the amount of the remaining installments
     *
     * @return Value of the amount of the remaining installments
     */
    public Double getRemainingInstallmentsAmount() { return remainingInstallmentsAmount; }

    /**
     * Sets number of the remaining installments
     *
     * @param remainingInstallmentsAmount The amount of the remaining installments
     */
    public void setRemainingInstallmentsAmount(Double remainingInstallmentsAmount) { this.remainingInstallmentsAmount = remainingInstallmentsAmount; }
}

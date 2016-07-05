package com.zooz.common.client.ecomm.beans.tax.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zooz.common.client.ecomm.beans.AbstractJsonBean;
import com.zooz.common.client.ecomm.beans.enums.JurisdictionType;
import com.zooz.common.client.ecomm.beans.enums.TaxType;

import java.math.BigDecimal;

/**
 * Tax details by jurisdiction. Information returned is dependent on the DetailLevel passed in the request.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaxDetail extends AbstractJsonBean {


    /**
     * 2-character ISO country code
     */
    @JsonProperty
    private String country;

    /**
     * State or province code
     */
    @JsonProperty
    private String region;

    /**
     * Jurisdiction Type. One of: Country, Composite, State, County, City, Special.
     */
    @JsonProperty
    private JurisdictionType jurisType;

    /**
     * Jurisdiction Code for the taxing jurisdiction
     */
    @JsonProperty
    private String jurisCode;

    /**
     * Tax Type - Sales or Seller’s Use
     */
    @JsonProperty
    private TaxType taxType;

    /**
     * The amount of the sale that is determined to be taxable.
     */
    @JsonProperty
    private BigDecimal taxable;

    /**
     * The tax rate for the jurisdiction.
     */
    @JsonProperty
    private BigDecimal rate;

    /**
     * RateType indicates the tax rate type.
     */
    @JsonProperty
    private String rateType;

    /**
     * The tax amount, either the calculated amount or an override amount
     */
    @JsonProperty
    private BigDecimal tax;

    /**
     * TaxCalculated indicates the tax calculated by AvaTax.
     * It will usually be the same as the Tax property, unless it has been overridden by a TaxAmount.
     */
    @JsonProperty
    private BigDecimal taxCalculated;

    /**
     * The portion of the detail that is not subject to taxes.
     */
    @JsonProperty
    private BigDecimal nonTaxable;

    /**
     * The portion of the detail that is exempt from taxes.
     */
    @JsonProperty
    private BigDecimal exemption;

    /**
     * Gets the jurisdiction name.
     */
    @JsonProperty
    private String jurisName;

    /**
     * It further defines the tax and jurisdiction.
     */
    @JsonProperty
    private String taxName;

    /**
     * Internal tax authority type identifier used by our returns engine.
     */
    @JsonProperty
    private int taxAuthorityType;

    /**
     * StateAssignedNo is the identifier given to the jurisdiction by the state. Not all states have these.
     */
    @JsonProperty
    private String stateAssignedNo;

    public TaxDetail() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public JurisdictionType getJurisType() {
        return jurisType;
    }

    public void setJurisType(JurisdictionType jurisType) {
        this.jurisType = jurisType;
    }

    public String getJurisCode() {
        return jurisCode;
    }

    public void setJurisCode(String jurisCode) {
        this.jurisCode = jurisCode;
    }

    public TaxType getTaxType() {
        return taxType;
    }

    public void setTaxType(TaxType taxType) {
        this.taxType = taxType;
    }

    public BigDecimal getTaxable() {
        return taxable;
    }

    public void setTaxable(BigDecimal taxable) {
        this.taxable = taxable;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public String getRateType() {
        return rateType;
    }

    public void setRateType(String rateType) {
        this.rateType = rateType;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getTaxCalculated() {
        return taxCalculated;
    }

    public void setTaxCalculated(BigDecimal taxCalculated) {
        this.taxCalculated = taxCalculated;
    }

    public BigDecimal getNonTaxable() {
        return nonTaxable;
    }

    public void setNonTaxable(BigDecimal nonTaxable) {
        this.nonTaxable = nonTaxable;
    }

    public BigDecimal getExemption() {
        return exemption;
    }

    public void setExemption(BigDecimal exemption) {
        this.exemption = exemption;
    }

    public String getJurisName() {
        return jurisName;
    }

    public void setJurisName(String jurisName) {
        this.jurisName = jurisName;
    }

    public String getTaxName() {
        return taxName;
    }

    public void setTaxName(String taxName) {
        this.taxName = taxName;
    }

    public int getTaxAuthorityType() {
        return taxAuthorityType;
    }

    public void setTaxAuthorityType(int taxAuthorityType) {
        this.taxAuthorityType = taxAuthorityType;
    }

    public String getStateAssignedNo() {
        return stateAssignedNo;
    }

    public void setStateAssignedNo(String stateAssignedNo) {
        this.stateAssignedNo = stateAssignedNo;
    }

}

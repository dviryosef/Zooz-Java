package com.zooz.common.client.ecomm.beans.tax.beans;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zooz.common.client.ecomm.beans.AbstractJsonBean;
import com.zooz.common.client.ecomm.beans.enums.AccountingMethod;
import com.zooz.common.client.ecomm.beans.enums.BoundaryLevel;

import java.math.BigDecimal;

/**
 * Created by yaelmasri on 2/28/16.
 * This class presents Taxes for a specific document Line that return in taxLines array on GetTaxResponse
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaxLine extends AbstractJsonBean {

    /**
     *Line Number
     */
    @JsonProperty
    private String no;

    /**
     * System Tax Code
     */
    @JsonProperty
    private String taxCode;

    /**
     * Is the item taxable?
     */
    @JsonProperty
    private boolean taxability;

    /**
     * The level of jurisdiction boundary precision used for the tax calculation.
     */
    @JsonProperty
    private BoundaryLevel boundaryLevel;

    /**
     * Discount amount applied to this line
     */
    @JsonProperty
    private BigDecimal discount;

    /**
     * The tax amount, either the calculated amount or an override amount
     */
    @JsonProperty
    private BigDecimal tax;

    /**
     * TaxCalculated indicates the tax calculated by AvaTax.
     * This will normally be the same as the Tax property unless it has been overridden by a TaxAmount.
     */
    @JsonProperty
    private BigDecimal taxCalculated;

    /**
     * Tax by jurisdiction. See TaxDetail properties below
     */
    @JsonProperty
    private TaxDetail[] taxDetails;

    /**
     * Applied ExemptionCertificateId for the Line.
     */
    @JsonProperty
    private int exemptCertId;

    /**
     * This is the accounting applied to the line. Since only Accrual accounting is currently supported, it is always Accrual.
     */
    @JsonProperty
    private AccountingMethod accountingMethod;

    /**
     * Indicates the value of TaxIncluded sent on the line of the GetTaxRequest.
     */
    @JsonProperty
    private boolean taxIncluded;

    public TaxLine() {
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public boolean isTaxability() {
        return taxability;
    }

    public void setTaxability(boolean taxability) {
        this.taxability = taxability;
    }

    public BoundaryLevel getBoundaryLevel() {
        return boundaryLevel;
    }

    public void setBoundaryLevel(BoundaryLevel boundaryLevel) {
        this.boundaryLevel = boundaryLevel;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
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

    public TaxDetail[] getTaxDetails() {
        return taxDetails;
    }

    public void setTaxDetails(TaxDetail[] taxDetails) {
        this.taxDetails = taxDetails;
    }

    public int getExemptCertId() {
        return exemptCertId;
    }

    public void setExemptCertId(int exemptCertId) {
        this.exemptCertId = exemptCertId;
    }

    public AccountingMethod getAccountingMethod() {
        return accountingMethod;
    }

    public void setAccountingMethod(AccountingMethod accountingMethod) {
        this.accountingMethod = accountingMethod;
    }

    public boolean isTaxIncluded() {
        return taxIncluded;
    }

    public void setTaxIncluded(boolean taxIncluded) {
        this.taxIncluded = taxIncluded;
    }
}

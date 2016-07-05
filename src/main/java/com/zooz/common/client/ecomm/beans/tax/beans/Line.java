package com.zooz.common.client.ecomm.beans.tax.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zooz.common.client.ecomm.beans.AbstractJsonBean;

import java.math.BigDecimal;

/**
 * Line is input property of the GetTaxRequest describing item lines.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Line extends AbstractJsonBean {

    /**
     * Required. Uniquely identifies the line item row.
     */
    @JsonProperty
    private String lineNo;

    /**
     * Required. At least one of OriginCode or DestinationCode must be declared either here or at document-level
     */
    @JsonProperty
    private String destinationCode;

    /**
     * Required. At least one of OriginCode or DestinationCode must be declared either here or at document-level
     *The line-level code that refers to the origin address. Line-level address codes will take precedence
     * over document-level address codes if both are present.
     */
    @JsonProperty
    private String originCode;

    /**
     *  Optional. Your item identifier, SKU, or UPC.
     */
    @JsonProperty
    private String itemCode;

    /**
     * Item quantity. The tax engine does NOT use this as a multiplier with price to get the Amount.
     */
    @JsonProperty
    private BigDecimal qty;

    /**
     * Total amount of item line (extended amount, qty * unit price)
     */
    @JsonProperty
    private BigDecimal amount;

    /**
     * Optional. AvaTax system tax code or custom tax code
     */
    @JsonProperty
    private String taxCode;

    /**
     * Optional. Same as document-level CustomerUsageType. See code options above in the GetTaxRequest elements.
     * More information about this value is available in the Avalara Help Center.
     */
    @JsonProperty
    private String customerUsageType;

    /**
     * Optional, unless you are bound by Streamlined Sales Tax requirements
     * Item description
     */
    @JsonProperty
    private String description;

    /**
     * Optional. True if the document level discount is applied to this line item
     */
    @JsonProperty
    private boolean discounted;

    /**
     * Optional. True if the tax is already included.
     */
    @JsonProperty
    private boolean taxIncluded;

    /**
     * Optional. Text reference. Use as needed.
     */
    @JsonProperty
    private String ref1;

    /**
     * Optional. Text reference. Use as needed.
     */
    @JsonProperty
    private String ref2;


    @JsonProperty
    private String businessIdentificationNo;

    /**
     * Optional. Exemption or certificate number for the client customer. Note: Any value set in this property will cause the
     * document or line to be exempted from tax calculation.
     */
    @JsonProperty
    private String exemptionNo;

    /**
     * Optional. Same as document-level TaxOverride. Use this if you only need to override individual lines.
     */
    @JsonProperty
    private TaxOverrideDef taxOverride;


    public Line(String lineNo, String destinationCode, String originCode, String itemCode, BigDecimal qty, BigDecimal amount, String taxCode, String customerUsageType, String description, boolean discounted, boolean taxIncluded, String ref1, String ref2, String businessIdentificationNo, String exemptionNo, TaxOverrideDef taxOverride) {
        this.lineNo = lineNo;
        this.destinationCode = destinationCode;
        this.originCode = originCode;
        this.itemCode = itemCode;
        this.qty = qty;
        this.amount = amount;
        this.taxCode = taxCode;
        this.customerUsageType = customerUsageType;
        this.description = description;
        this.discounted = discounted;
        this.taxIncluded = taxIncluded;
        this.ref1 = ref1;
        this.ref2 = ref2;
        this.businessIdentificationNo = businessIdentificationNo;
        this.exemptionNo = exemptionNo;
        this.taxOverride = taxOverride;
    }

    public Line() {
    }

    public String getLineNo() {
        return lineNo;
    }

    public void setLineNo(String lineNo) {
        this.lineNo = lineNo;
    }

    public String getDestinationCode() {
        return destinationCode;
    }

    public void setDestinationCode(String destinationCode) {
        this.destinationCode = destinationCode;
    }

    public String getOriginCode() {
        return originCode;
    }

    public void setOriginCode(String originCode) {
        this.originCode = originCode;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getCustomerUsageType() {
        return customerUsageType;
    }

    public void setCustomerUsageType(String customerUsageType) {
        this.customerUsageType = customerUsageType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getDiscounted() {
        return discounted;
    }

    public void setDiscounted(boolean discounted) {
        this.discounted = discounted;
    }

    public boolean getTaxIncluded() {
        return taxIncluded;
    }

    public void setTaxIncluded(boolean taxIncluded) {
        this.taxIncluded = taxIncluded;
    }

    public String getRef1() {
        return ref1;
    }

    public void setRef1(String ref1) {
        this.ref1 = ref1;
    }

    public String getRef2() {
        return ref2;
    }

    public void setRef2(String ref2) {
        this.ref2 = ref2;
    }

    public String getBusinessIdentificationNo() {
        return businessIdentificationNo;
    }

    public void setBusinessIdentificationNo(String businessIdentificationNo) {
        this.businessIdentificationNo = businessIdentificationNo;
    }

    public String getExemptionNo() {
        return exemptionNo;
    }

    public void setExemptionNo(String exemptionNo) {
        this.exemptionNo = exemptionNo;
    }

    public TaxOverrideDef getTaxOverride() {
        return taxOverride;
    }

    public void setTaxOverride(TaxOverrideDef taxOverride) {
        this.taxOverride = taxOverride;
    }


}

package com.zooz.common.client.ecomm.beans.tax.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zooz.common.client.ecomm.beans.AbstractJsonBean;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TaxOverrideDef extends AbstractJsonBean {

	/**
	 * Required.
	 * Tho optional values:
	 * TaxAmount: The TaxAmount overrides the total tax for the document. This is used for imported documents, returns,
	 * and layaways where the tax has already been calculated either by AvaTax or another means.
	 * Exemption: Exemption certificates are overridden making the document taxable.
	 * This may be used for situations where a normally exempt entity needs to be treated as not exempt.
	 * TaxDate: The TaxDate overrides the DocDate as the effective date used for tax calculation. This may effect rates, rules and other factors.
	 */
	@JsonProperty
	public String taxOverrideType;

	/**
	 * Required. This provides the reason for a tax override for audit purposes. Typical reasons include: “Return”, “Layaway”, “Imported”.
	 */
	@JsonProperty
	public String reason;

	/**
	 * must be numeric, required if TaxOverrideType is TaxAmount
	 * The overriding amount of tax to apply. This is distributed across all taxable rows.
	 */
	@JsonProperty
	public String taxAmount;

	/**
	 * must be valid date, required if TaxOverrideType is TaxDate
	 * The override tax date to use. This is used when the tax has been previously calculated as in the case of a layaway,
	 * return or other reason indicated by the Reason element.
	 * If the date is not overridden, then it should be set to the same as the DocDate.
	 */
	@JsonProperty
	public String taxDate;

	public TaxOverrideDef(String taxOverrideType, String reason, String taxAmount, String taxDate) {
		this.taxOverrideType = taxOverrideType;
		this.reason = reason;
		this.taxAmount = taxAmount;
		this.taxDate = taxDate;
	}

	public TaxOverrideDef() {
	}

	public String getTaxOverrideType() {
		return taxOverrideType;
	}

	public void setTaxOverrideType(String taxOverrideType) {
		this.taxOverrideType = taxOverrideType;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}

	public String getTaxDate() {
		return taxDate;
	}

	public void setTaxDate(String taxDate) {
		this.taxDate = taxDate;
	}

}

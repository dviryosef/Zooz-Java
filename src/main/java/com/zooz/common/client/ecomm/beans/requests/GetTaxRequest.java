package com.zooz.common.client.ecomm.beans.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.zooz.common.client.ecomm.beans.tax.beans.GetTaxRequestAddress;
import com.zooz.common.client.ecomm.beans.enums.DetailLevel;
import com.zooz.common.client.ecomm.beans.enums.DocType;
import com.zooz.common.client.ecomm.beans.enums.ServiceMode;
import com.zooz.common.client.ecomm.beans.responses.GetTaxResponse;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;
import com.zooz.common.client.ecomm.beans.tax.beans.Line;
import com.zooz.common.client.ecomm.beans.tax.beans.TaxOverrideDef;
import com.zooz.common.client.ecomm.control.CommonParameters;

import java.util.List;

/**
 * This call returns a response of calculated tax
 */
public class GetTaxRequest extends AbstractZoozRequest {


    /**
     * Required. The date on the invoice, purchase order, etc. Format dd/MM/yyyy.
     */
    @JsonProperty
    private String docDate;

    /**
     *  Required. The case-sensitive client application customer reference code. This is required since it is the key
     *  to the Exemption Certificate Management Service in the Admin Console.
     */
    @JsonProperty
    private String customerCode;

    @JsonProperty
    private List<GetTaxRequestAddress> taxAddresses;

    /**
     *  Required. Document line array. There is a limit of 15000 lines per document, but there must be at least one.
     */
    @JsonProperty
    private List<Line> lines;

    /**
     * Optional. While this is an optional field, serious consideration should be given to using it.
     * If no value is sent, AvaTax assigns a GUID value to keep the document unique.
     * This can make reconciliation a challenge.
     */
    @JsonProperty
    private String docCode;

    /**
     * Required.
     * The document type specifies the category of the document and affects how the document is
     * treated after a tax calculation.
     */
    @JsonProperty
    private DocType docType;

    /**
     * Optional. The case-sensitive code that identifies the company in the AvaTax account in which the document should be posted.
     * This code is declared during the company setup in the AvaTax Admin Console.
     * If no value is passed, the document will be assigned to the default company.
     * If a value is passed that does not match any company on on the account, an error is returned.
     */
    @JsonProperty
    private String companyCode;

    /**
     * Optional. Default is false.
     * Setting this property to True will prevent any further document state changes except
     * CancelTax which changes the state to Voided.
     */
    @JsonProperty
    private boolean commit;

    /**
     * Optional. Specifies the level of tax detail returned in the GetTaxResult.
     */
    @JsonProperty
    private DetailLevel detailLevel;

    /**
     * Optional. The client customer or usage type (or Entity Use Code)
     */
    @JsonProperty
    private String customerUsageType;

    /**
     * Optional. Exemption or certificate number for the client customer. Note: Any value set in this property will cause the
     * document or line to be exempted from tax calculation.
     */
    @JsonProperty
    private String exemptionNo;

    /**
     * Optional. The total discount to be applied to the line or lines identified by the Lines.Discounted property.
     * This may be used along with the line attribute Discounted in order to distribute a set discount amount
     * proportionally across the applicable document lines. This should be an amount, not a percent.
     */
    @JsonProperty
    private Double discount;

    /**
     * TaxOverride for the document - can be used to manually override components of the tax calculation.
     * Nested object describing any tax override applied to the document.
     * TaxOverride only needs to be included when there is need to override our tax calculation.
     * Most commonly on ReturnInvoices.
     * For each document, this may be done at either the document or line level, but not both on the same document.
     */
    @JsonProperty
    private TaxOverrideDef taxOverride;

    /**
     * Optional, unless the user needs VAT calculated
     * The buyer’s VAT id. Using this value will force VAT rules to be considered for the transaction. This may be set on
     * the document or the line. Note that this must be a valid VAT number,
     * and this field should not be used for any other purpose.
     */
    @JsonProperty
    private String businessIdentificationNo;

    /**
     * Optional. Purchase Order Number used to create the current document
     */
    @JsonProperty
    private String purchaseOrderNo;

    /**
     * Optional. PaymentDate indicates the date that a payment was received for the document. It is only applicable for
     * cash-basis accounting and does not need to be set.
     * The default value is 1900-01-01 which indicates no payment received.
     */
    @JsonProperty
    private String paymentDate;

    /**
     * Optional. Essentially a data field to record the original DocCode of an document if the current document
     * is a ReturnInvoice Document Type
     */
    @JsonProperty
    private String referenceCode;

    /**
     *
     */
    @JsonProperty
    private String posLaneCode;

    /**
     * Optional. 3 character ISO 4217 compliant currency code. If unspecified, a default of USD will be used.
     */
    @JsonProperty
    private String currencyCode;

    /**
     * Optional. Exchange Rate indicates the currency exchange rate from the transaction currency (indicated by CurrencyCode)
     * to the company’s base currency. Note: ExchangeRate need only be set if the transaction currency is
     * different that of the company’s base currency. Default is 1.0
     */
    @JsonProperty
    private Double exchangeRate;

    /**
     * Optional. ExchangeRateEffDate indicates the effective date of the exchange rate and works in tandem with ExchangeRate.
     * Default is the DocDate if null.
     */
    @JsonProperty
    private String exchangeRateEffDate;

    /**
     * required if outlet-based reporting is needed, otherwise optional
     Also referred to as a Store Location, Outlet Id, or Outlet code. Location code is a value assigned by some
     State jurisdictions that identifies a particular store location.
     These States may require tax liabilities to be broken out separately for each store Location
     */
    @JsonProperty
    private String locationCode;

    /**
     * Optional. The client application’s salesperson reference code. May also be used to identify a cash register.
     */
    @JsonProperty
    private String salespersonCode;

    /**
     * AvaTaxLocal function - provides the ability to control whether a tax is calculated locally or
     * AvaTax web service.
     * The default is Automatic which calculates locally unless a remote connection is necessary for
     * “send sales” not configured at the local server level.
     */
    @JsonProperty
    private ServiceMode serviceMode;


    /**
     * Gets doc date.
     *
     * @return the doc date
     */
    public String getDocDate() {
        return docDate;
    }

    /**
     * Sets doc date.
     *
     * @param docDate the doc date
     */
    public void setDocDate(String docDate) {
        this.docDate = docDate;
    }

    /**
     * Gets customer code.
     *
     * @return the customer code
     */
    public String getCustomerCode() {
        return customerCode;
    }

    /**
     * Sets customer code.
     *
     * @param customerCode the customer code
     */
    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    /**
     * Gets lines.
     *
     * @return the lines
     */
    public List<Line> getLines() {
        return lines;
    }

    /**
     * Sets lines.
     *
     * @param lines the lines
     */
    public void setLines(List<Line> lines) {
        this.lines = lines;
    }

    /**
     * Gets tax addresses.
     *
     * @return the tax addresses
     */
    public List<GetTaxRequestAddress> getTaxAddresses() {
        return taxAddresses;
    }

    /**
     * Sets tax addresses.
     *
     * @param taxAddresses the tax addresses
     */
    public void setTaxAddresses(List<GetTaxRequestAddress> taxAddresses) {
        this.taxAddresses = taxAddresses;
    }

    /**
     * Gets doc code.
     *
     * @return the doc code
     */
    public String getDocCode() {
        return docCode;
    }

    /**
     * Sets doc code.
     *
     * @param docCode the doc code
     */
    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

    /**
     * Gets doc type.
     *
     * @return the doc type
     */
    public DocType getDocType() {
        return docType;
    }

    /**
     * Sets doc type.
     *
     * @param docType the doc type
     */
    public void setDocType(DocType docType) {
        this.docType = docType;
    }

    /**
     * Gets company code.
     *
     * @return the company code
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * Sets company code.
     *
     * @param companyCode the company code
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    /**
     * Gets commit.
     *
     * @return the commit
     */
    public boolean getCommit() {
        return commit;
    }

    /**
     * Sets commit.
     *
     * @param commit the commit
     */
    public void setCommit(boolean commit) {
        this.commit = commit;
    }

    /**
     * Gets detail level.
     *
     * @return the detail level
     */
    public DetailLevel getDetailLevel() {
        return detailLevel;
    }

    /**
     * Sets detail level.
     *
     * @param detailLevel the detail level
     */
    public void setDetailLevel(DetailLevel detailLevel) {
        this.detailLevel = detailLevel;
    }

    /**
     * Gets customer usage type.
     *
     * @return the customer usage type
     */
    public String getCustomerUsageType() {
        return customerUsageType;
    }

    /**
     * Sets customer usage type.
     *
     * @param customerUsageType the customer usage type
     */
    public void setCustomerUsageType(String customerUsageType) {
        this.customerUsageType = customerUsageType;
    }

    /**
     * Gets exemption no.
     *
     * @return the exemption no
     */
    public String getExemptionNo() {
        return exemptionNo;
    }

    /**
     * Sets exemption no.
     *
     * @param exemptionNo the exemption no
     */
    public void setExemptionNo(String exemptionNo) {
        this.exemptionNo = exemptionNo;
    }

    /**
     * Gets discount.
     *
     * @return the discount
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     * Sets discount.
     *
     * @param discount the discount
     */
    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    /**
     * Gets tax override.
     *
     * @return the tax override
     */
    public TaxOverrideDef getTaxOverride() {
        return taxOverride;
    }

    /**
     * Sets tax override.
     *
     * @param taxOverride the tax override
     */
    public void setTaxOverride(TaxOverrideDef taxOverride) {
        this.taxOverride = taxOverride;
    }

    /**
     * Gets business identification no.
     *
     * @return the business identification no
     */
    public String getBusinessIdentificationNo() {
        return businessIdentificationNo;
    }

    /**
     * Sets business identification no.
     *
     * @param businessIdentificationNo the business identification no
     */
    public void setBusinessIdentificationNo(String businessIdentificationNo) {
        this.businessIdentificationNo = businessIdentificationNo;
    }

    /**
     * Gets purchase order no.
     *
     * @return the purchase order no
     */
    public String getPurchaseOrderNo() {
        return purchaseOrderNo;
    }

    /**
     * Sets purchase order no.
     *
     * @param purchaseOrderNo the purchase order no
     */
    public void setPurchaseOrderNo(String purchaseOrderNo) {
        this.purchaseOrderNo = purchaseOrderNo;
    }

    /**
     * Gets payment date.
     *
     * @return the payment date
     */
    public String getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets payment date.
     *
     * @param paymentDate the payment date
     */
    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    /**
     * Gets reference code.
     *
     * @return the reference code
     */
    public String getReferenceCode() {
        return referenceCode;
    }

    /**
     * Sets reference code.
     *
     * @param referenceCode the reference code
     */
    public void setReferenceCode(String referenceCode) {
        this.referenceCode = referenceCode;
    }

    /**
     * Gets pos lane code.
     *
     * @return the pos lane code
     */
    public String getPosLaneCode() {
        return posLaneCode;
    }

    /**
     * Sets pos lane code.
     *
     * @param posLaneCode the pos lane code
     */
    public void setPosLaneCode(String posLaneCode) {
        this.posLaneCode = posLaneCode;
    }

    /**
     * Gets currency code.
     *
     * @return the currency code
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets currency code.
     *
     * @param currencyCode the currency code
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * Gets exchange rate.
     *
     * @return the exchange rate
     */
    public Double getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets exchange rate.
     *
     * @param exchangeRate the exchange rate
     */
    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    /**
     * Gets exchange rate eff date.
     *
     * @return the exchange rate eff date
     */
    public String getExchangeRateEffDate() {
        return exchangeRateEffDate;
    }

    /**
     * Sets exchange rate eff date.
     *
     * @param exchangeRateEffDate the exchange rate eff date
     */
    public void setExchangeRateEffDate(String exchangeRateEffDate) {
        this.exchangeRateEffDate = exchangeRateEffDate;
    }

    /**
     * Gets location code.
     *
     * @return the location code
     */
    public String getLocationCode() {
        return locationCode;
    }

    /**
     * Sets location code.
     *
     * @param locationCode the location code
     */
    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    /**
     * Gets salesperson code.
     *
     * @return the salesperson code
     */
    public String getSalespersonCode() {
        return salespersonCode;
    }

    /**
     * Sets salesperson code.
     *
     * @param salespersonCode the salesperson code
     */
    public void setSalespersonCode(String salespersonCode) {
        this.salespersonCode = salespersonCode;
    }

    /**
     * Gets service mode.
     *
     * @return the service mode
     */
    public ServiceMode getServiceMode() {
        return serviceMode;
    }

    /**
     * Sets service mode.
     *
     * @param serviceMode the service mode
     */
    public void setServiceMode(ServiceMode serviceMode) {
        this.serviceMode = serviceMode;
    }

    /**
     * Instantiates a new Get Tax request.
     * Used to calculate tax
     *
     * @param docDate                  the doc date
     * @param customerCode             the customer code
     * @param taxAddresses             the tax addresses
     * @param lines                    the lines
     * @param docCode                  the doc code
     * @param docType                  the doc type
     * @param companyCode              the company code
     * @param commit                   the commit
     * @param detailLevel              the detail level
     * @param customerUsageType        the customer usage type
     * @param exemptionNo              the exemption no
     * @param discount                 the discount
     * @param taxOverride              the tax override
     * @param businessIdentificationNo the business identification no
     * @param purchaseOrderNo          the purchase order no
     * @param paymentDate              the payment date
     * @param referenceCode            the reference code
     * @param posLaneCode              the pos lane code
     * @param currencyCode             the currency code
     * @param exchangeRate             the exchange rate
     * @param exchangeRateEffDate      the exchange rate eff date
     * @param locationCode             the location code
     * @param salespersonCode          the salesperson code
     * @param serviceMode              the service mode
     */
    public GetTaxRequest( String docDate, String customerCode, List<GetTaxRequestAddress> taxAddresses, List<Line> lines, String docCode, DocType docType, String companyCode, boolean commit, DetailLevel detailLevel, String customerUsageType, String exemptionNo, Double discount, TaxOverrideDef taxOverride, String businessIdentificationNo, String purchaseOrderNo, String paymentDate, String referenceCode, String posLaneCode, String currencyCode, Double exchangeRate, String exchangeRateEffDate, String locationCode, String salespersonCode, ServiceMode serviceMode) {
        super(CommonParameters.getTax);
        this.docDate = docDate;
        this.customerCode = customerCode;
        this.taxAddresses = taxAddresses;
        this.lines = lines;
        this.docCode = docCode;
        this.docType = docType;
        this.companyCode = companyCode;
        this.commit = commit;
        this.detailLevel = detailLevel;
        this.customerUsageType = customerUsageType;
        this.exemptionNo = exemptionNo;
        this.discount = discount;
        this.taxOverride = taxOverride;
        this.businessIdentificationNo = businessIdentificationNo;
        this.purchaseOrderNo = purchaseOrderNo;
        this.paymentDate = paymentDate;
        this.referenceCode = referenceCode;
        this.posLaneCode = posLaneCode;
        this.currencyCode = currencyCode;
        this.exchangeRate = exchangeRate;
        this.exchangeRateEffDate = exchangeRateEffDate;
        this.locationCode = locationCode;
        this.salespersonCode = salespersonCode;
        this.serviceMode = serviceMode;
    }

    /**
     * Used to return the response type corresponding to the request.
     *
     * @return the corresponding response type.
     */
    @Override
    @JsonIgnore
    public TypeReference<ZoozServerResponse<GetTaxResponse>> getResponseTypeReference() {
        return new TypeReference<ZoozServerResponse<GetTaxResponse>>() {
        };
    }
}

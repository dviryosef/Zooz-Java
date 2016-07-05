package com.zooz.common.client.ecomm.beans.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zooz.common.client.ecomm.beans.enums.DocType;
import com.zooz.common.client.ecomm.beans.tax.beans.TaxAddress;
import com.zooz.common.client.ecomm.beans.tax.beans.TaxDetail;
import com.zooz.common.client.ecomm.beans.tax.beans.TaxLine;

import java.math.BigDecimal;
import java.util.Date;

/**
 * The GetTaxResponse includes any of the response parameter returns for the corresponding requests.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetTaxResponse extends ZooZExternalServicesResponseObject {

    public GetTaxResponse() {
    }

    /**
     * The DocumentType used in the GetTaxRequest
     */
    @JsonProperty
    private DocType docType;

    /**
     * The document code, if not supplied in the request the returned value is a GUID.
     */
    @JsonProperty
    private String docCode;

    /**
     * Date of invoice, sales order, purchase order, etc.
     */
    @JsonProperty
    private Date docDate;

    /**
     * The document’s status after the tax calculation. One of:
     * Temporary: GetTaxRequest, DocType = SalesOrder
     * Saved: GetTaxRequest, DocType = SalesInvoice
     * Posted: PostTaxRequest, Commit = false
     * Committed: PostTaxRequest, Commit = true or CommitTaxRequest on document in Posted state
     * Cancelled: CancelTaxRequest, CancelCode = DocVoided
     * Adjusted: AdjustTaxRequest
     */
    @JsonProperty
    private String docStatus;

    /**
     * Server timestamp of the request.
     */
    @JsonProperty
    private Date timestamp;

    /**
     * Sum of all line Amount values.
     */
    @JsonProperty
    private BigDecimal totalAmount;

    /**
     * Sum of all TaxLine discount amounts.
     */
    @JsonProperty
    private BigDecimal totalDiscount;

    /**
     * Total taxable amount.
     */
    @JsonProperty
    private BigDecimal totalTaxable;

    /**
     * Sum of all TaxLine tax amounts.
     */
    @JsonProperty
    private BigDecimal totalTax;

    /**
     * TotalTaxCalculated indicates the total tax calculated by AvaTax. This is usually the same as the TotalTax,
     * except when a tax override amount is specified. This is for informational purposes.
     * The TotalTax will still be used for reporting.
     */
    @JsonProperty
    private BigDecimal totalTaxCalculated;

    /**
     * Tax broken down by individual TaxLine.
     */
    @JsonProperty
    private TaxLine[] taxLines;

    /**
     * Array of resolved addresses used in the tax calculation.
     */
    @JsonProperty
    private TaxAddress[] taxAddresses;

    /**
     * Flag indicating if a Document has been locked by Avalara’s Managed Returns Service process.
     * Locked documents can not be modified and can not be cancelled because they have been reported on Tax Return.
     */
    @JsonProperty
    private boolean locked;

    /**
     * Current version of the document.
     */
    @JsonProperty
    private int version;

    /**
     * Tax Date is the date used to calculate tax on the Document.
     */
    @JsonProperty
    private Date taxDate;

    /**
     * Summary of the jurisdiction details for all item lines (returned for detail levels Summary and Line).
     */
    @JsonProperty
    private TaxDetail[] taxSummary;

    /**
     * The unique transaction ID assigned by AvaTax to this request/response set.
     * This value need only be retained for troubleshooting.
     */
    @JsonProperty
    private String transactionId;


    public DocType getDocType() {
        return docType;
    }

    public String getDocCode() {
        return docCode;
    }

    public Date getDocDate() {
        return docDate;
    }

    public String getDocStatus() {
        return docStatus;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public BigDecimal getTotalDiscount() {
        return totalDiscount;
    }

    public BigDecimal getTotalTaxable() {
        return totalTaxable;
    }

    public BigDecimal getTotalTax() {
        return totalTax;
    }

    public BigDecimal getTotalTaxCalculated() {
        return totalTaxCalculated;
    }

    public TaxLine[] getTaxLines() {
        return taxLines;
    }

    public TaxAddress[] getTaxAddresses() {
        return taxAddresses;
    }

    public boolean isLocked() {
        return locked;
    }

    public int getVersion() {
        return version;
    }

    public Date getTaxDate() {
        return taxDate;
    }

    public TaxDetail[] getTaxSummary() {
        return taxSummary;
    }

    public String getTransactionId() {
        return transactionId;
    }
}

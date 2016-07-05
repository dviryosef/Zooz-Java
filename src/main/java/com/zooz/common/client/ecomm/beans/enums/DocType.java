package com.zooz.common.client.ecomm.beans.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * This class represent the document type specifies the category of the document and affects how the document is
 * treated after a tax calculation. If no DocType is specified in the request, SalesOrder will be used.
 * The optional values are:
 * SalesOrder: This is a temporary document type and is not saved in tax history. GetTaxResult will return with a DocStatus of Temporary.
 * SalesInvoice: The document is a permanent invoice; document and tax calculation results are saved in the tax history. GetTaxResult will return with a DocStatus of Saved.
 * PurchaseOrder: This is a temporary document type and is not saved in tax history. GetTaxResult will return with a DocStatus of Temporary.
 * PurchaseInvoice : The document is a permanent invoice; document and tax calculation results are saved in the tax history. GetTaxResult will return with a DocStatus of Saved.
 * ReturnOrder: This is a temporary document type and is not saved in tax history. GetTaxResult will return with a DocStatus of Temporary.
 * ReturnInvoice: The document is a permanent sales return invoice; document and tax calculation results are saved in the tax history GetTaxResult will return with a DocStatus of Saved.
 */
public enum DocType {
    SalesOrder, SalesInvoice, ReturnOrder, ReturnInvoice, PurchaseOrder, PurchaseInvoice, ReverseChargeOrder, ReverseChargeInvoice;

    @JsonCreator
    public static DocType fromValue(String value) {
        return EnumCaseInsensitive.getEnumFromString(DocType.class, value);
    }

    @JsonValue
    public String toJson() {
        return name().toLowerCase();
    }
}
package com.zooz.common.client.ecomm.beans.requests.authorize.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.zooz.common.client.ecomm.beans.PaymentMethod;
import com.zooz.common.client.ecomm.beans.responses.CreditResponse;
import com.zooz.common.client.ecomm.beans.responses.RedirectResponse;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;
import com.zooz.common.client.ecomm.control.CommonParameters;

/**
 * This is the request for performing a credit operation on a specified payment token for a specific payment method.
 */
public class CreditRequest extends AbstractPurchaseRequest {

    /**
     * Unique id that identify the request.
     * Reused id for a retry request after timeout failure
     */
    @JsonProperty
    private String uniqueTransactionID;

    /**
     * Instantiates a new CreditRequest.
     *
     * @param paymentToken  the paymentToken from "openPayment"
     * @param paymentMethod the selected payment method { CreditCard }
     */
    public CreditRequest(String paymentToken, PaymentMethod paymentMethod) {
        super(CommonParameters.credit, paymentToken, paymentMethod);
    }

    /**
     * Instantiates a new CreditRequest.
     *
     * @param paymentToken     the paymentToken from "openPayment"
     * @param paymentMethod    the selected payment method { CreditCard }
     * @param reconciliationId Unique ID used to reconcile transactions, Received from processor
     *                         Note that this parameter might be different from "reconciliationId" parameter passed in the request due to processor changes.
     */
    public CreditRequest(String paymentToken, PaymentMethod paymentMethod, String reconciliationId) {
        super(CommonParameters.credit, paymentToken, paymentMethod, reconciliationId);
    }


    /**
     * The uniqueTransactionID.
     *
     * @param uniqueTransactionID the uniqueTransactionID.
     */
    public void setUniqueTransactionID(String uniqueTransactionID) {
        this.uniqueTransactionID = uniqueTransactionID;
    }

    /**
     * The uniqueTransactionID.
     *
     * @return the uniqueTransactionID
     */
    public String getUniqueTransactionID() {
        return uniqueTransactionID;
    }

    /**
     * Used to return the response type corresponding to the request.
     *
     * @return the corresponding response type.
     */
    @Override
    @JsonIgnore
    public TypeReference<ZoozServerResponse<CreditResponse>> getResponseTypeReference() {
        return new TypeReference<ZoozServerResponse<CreditResponse>>() {
        };
    }
}

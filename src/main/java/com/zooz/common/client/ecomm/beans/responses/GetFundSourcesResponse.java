package com.zooz.common.client.ecomm.beans.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zooz.common.client.ecomm.beans.FundSource;

import java.util.List;

/**
 * The GetFundSourcesResponse includes any of the response parameter returns for the corresponding requests.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetFundSourcesResponse extends ZoozResponseObject {
    /**
     * list of the payment methods attached to corresponding customer login Id.
     */
    @JsonProperty
    private List<FundSource> paymentMethods;

    /**
     * Instantiates a new GetFundSourcesResponse.
     */
    public GetFundSourcesResponse() {
    }

    /**
     * Returns a list of payment methods.
     *
     * @return a list of payment methods.
     */
    public List<FundSource> getPaymentMethods() {
        return paymentMethods;
    }

    /**
     * Sets a list of payment methods.
     *
     * @param paymentMethods a list of payment methods.
     */
    public void setPaymentMethods(List<FundSource> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }
}

package com.zooz.common.client.ecomm.beans.requests.client.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zooz.common.client.ecomm.beans.requests.AbstractZoozRequest;
import com.zooz.common.client.ecomm.control.CommonParameters;

public class ClientRemovePaymentMethodRequest extends AbstractZoozRequest {

	/**
	 * The token from "openPayment" / "getToken".
	 */
	@JsonProperty
	private String paymentToken;
	/**
	 * The payment method token to remove.
	 */
	@JsonProperty
	private String paymentMethodToken;

	public ClientRemovePaymentMethodRequest(String paymentToken,
                                            String paymentMethodToken) {
		super(CommonParameters.removePaymentMethod);
		this.paymentToken = paymentToken;
		this.paymentMethodToken = paymentMethodToken;
	}

    public String getPaymentToken() {
        return paymentToken;
    }

    public void setPaymentToken(String paymentToken) {
        this.paymentToken = paymentToken;
    }

    public String getPaymentMethodToken() {
        return paymentMethodToken;
    }

    public void setPaymentMethodToken(String paymentMethodToken) {
        this.paymentMethodToken = paymentMethodToken;
    }
}

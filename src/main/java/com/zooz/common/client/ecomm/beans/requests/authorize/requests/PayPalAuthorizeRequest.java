package com.zooz.common.client.ecomm.beans.requests.authorize.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.zooz.common.client.ecomm.beans.PaymentMethod;
import com.zooz.common.client.ecomm.beans.enums.PaymentMethodType;
import com.zooz.common.client.ecomm.beans.responses.AuthorizeResponse;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;

/**
 * The authorization request for paypal reference payments.
 */
public class PayPalAuthorizeRequest extends AbstractAuthorizeRequest {

        public PayPalAuthorizeRequest(String paymentToken, String ipAddress, String paymentMethodToken, String redirectUrl, String reconciliationId, String emailAddress) {
            super(paymentToken, ipAddress, new PaymentMethod(paymentMethodToken, PaymentMethodType.PayPal, null, redirectUrl, false), reconciliationId, emailAddress);
        }

    /**
     * Used to return the response type corresponding to the request.
     *
     * @return the corresponding response type.
     */
    @Override
    @JsonIgnore
    public TypeReference<ZoozServerResponse<AuthorizeResponse>> getResponseTypeReference() {
        return new TypeReference<ZoozServerResponse<AuthorizeResponse>>() {
        };
    }
}

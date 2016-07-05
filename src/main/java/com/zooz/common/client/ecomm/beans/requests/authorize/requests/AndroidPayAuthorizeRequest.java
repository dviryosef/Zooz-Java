package com.zooz.common.client.ecomm.beans.requests.authorize.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.zooz.common.client.ecomm.beans.PaymentMethod;
import com.zooz.common.client.ecomm.beans.enums.PaymentMethodType;
import com.zooz.common.client.ecomm.beans.responses.AuthorizeResponse;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;

/**
 * Created by idantovi on 23/03/2016.
 */
public class AndroidPayAuthorizeRequest extends AbstractAuthorizeRequest {

    /**
     * Instantiates a new Apple pay authorize request. Use this constructor to perform an Apple pay authorize request using decrypted apple pay data.
     *
     * @param paymentToken the payment token
     * @param ipAddress the payment instrument name
     * @param reconciliationId the payment network
     * @param emailAddress the transaction identifier
     * @param androidPayEncryptedMessage the data
     * @param androidPayEphemeralPublicKey the ephemeral public key
     * @param androidPayTag the application data
     */
    public AndroidPayAuthorizeRequest(String paymentToken, String ipAddress, String reconciliationId, String emailAddress, String androidPayEncryptedMessage, String androidPayEphemeralPublicKey, String androidPayTag) {
        super(paymentToken, ipAddress, new PaymentMethod(PaymentMethodType.AndroidPay, androidPayEncryptedMessage, androidPayEphemeralPublicKey, androidPayTag), reconciliationId, emailAddress);
    }

    /**
     * Instantiates a new Apple pay authorize request. Use this constructor to perform an Apple pay authorize request using decrypted apple pay data.
     *
     * @param paymentToken the payment token
     * @param ipAddress the payment instrument name
     * @param reconciliationId the payment network
     * @param emailAddress the transaction identifier
     * @param dpan the data
     * @param expirationYear the ephemeral public key
     * @param expirationMonth the application data
     * @param authMethod the data
     * @param threeDSCryptogram the ephemeral public key
     * @param threeDSIndicator the application data
     */
    public AndroidPayAuthorizeRequest(String paymentToken, String ipAddress, String reconciliationId, String emailAddress, String dpan, String expirationYear, String expirationMonth, String authMethod, String threeDSCryptogram, String threeDSIndicator) {
        super(paymentToken, ipAddress, new PaymentMethod(PaymentMethodType.AndroidPay, dpan, expirationYear, expirationMonth, authMethod, threeDSCryptogram, threeDSIndicator), reconciliationId, emailAddress);
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

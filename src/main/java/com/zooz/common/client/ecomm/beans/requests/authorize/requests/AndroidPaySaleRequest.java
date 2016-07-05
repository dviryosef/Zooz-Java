package com.zooz.common.client.ecomm.beans.requests.authorize.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.zooz.common.client.ecomm.beans.Invoice;
import com.zooz.common.client.ecomm.beans.PaymentMethod;
import com.zooz.common.client.ecomm.beans.enums.PaymentMethodType;
import com.zooz.common.client.ecomm.beans.responses.AuthorizeResponse;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;

/**
 * Created by Alex on 3/4/15.
 */
public class AndroidPaySaleRequest extends AbstractSaleRequest {

    /**
     * Instantiates a new Apple pay sale request. Use this constructor to perform an Apple pay sale request using encrypted apple pay data.
     *
     * @param paymentToken                 the payment token
     * @param ipAddress                    the ip address
     * @param amount                       the amount
     * @param invoice                      the invoice
     * @param reconciliationId             the reconciliation id
     * @param emailAddress                 the email address
     * @param uniqueTransactionID          the unique transaction iD
     * @param androidPayEncryptedMessage   the android pay encrypted message
     * @param androidPayEphemeralPublicKey the android pay ephemeral public key
     * @param androidPayTag                the android pay tag
     */
    public AndroidPaySaleRequest(String paymentToken, String ipAddress, Double amount, Invoice invoice, String reconciliationId, String emailAddress, String uniqueTransactionID, String androidPayEncryptedMessage, String androidPayEphemeralPublicKey, String androidPayTag) {
        super(paymentToken, ipAddress, new PaymentMethod(PaymentMethodType.AndroidPay, androidPayEncryptedMessage, androidPayEphemeralPublicKey, androidPayTag), amount, invoice, reconciliationId, emailAddress, uniqueTransactionID);
    }

    /**
     * Instantiates a new Apple pay sale request. Use this constructor to perform an Apple pay sale request using decrypted apple pay data.
     *
     * @param paymentToken        the payment token
     * @param ipAddress           the ip address
     * @param amount              the amount
     * @param invoice             the invoice
     * @param reconciliationId    the reconciliation id
     * @param emailAddress        the email address
     * @param uniqueTransactionID the unique transaction iD
     * @param dpan                the dpan
     * @param expirationYear      the expiration year
     * @param expirationMonth     the expiration month
     * @param authMethod          the auth method
     * @param threeDSCryptogram   the three ds cryptogram
     * @param threeDSIndicator    the three ds indicator
     */
    public AndroidPaySaleRequest(String paymentToken, String ipAddress, Double amount, Invoice invoice, String reconciliationId, String emailAddress, String uniqueTransactionID,
                                 String dpan, String expirationYear, String expirationMonth, String authMethod, String threeDSCryptogram, String threeDSIndicator) {
        super(paymentToken, ipAddress, new PaymentMethod(PaymentMethodType.AndroidPay, dpan, expirationYear, expirationMonth, authMethod, threeDSCryptogram, threeDSIndicator), amount, invoice, reconciliationId, emailAddress, uniqueTransactionID);
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

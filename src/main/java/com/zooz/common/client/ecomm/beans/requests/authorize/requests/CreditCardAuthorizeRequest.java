package com.zooz.common.client.ecomm.beans.requests.authorize.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.zooz.common.client.ecomm.beans.PaymentMethod;
import com.zooz.common.client.ecomm.beans.ThreeDSecureAttributes;
import com.zooz.common.client.ecomm.beans.enums.PaymentMethodType;
import com.zooz.common.client.ecomm.beans.responses.AuthorizeResponse;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;

/**
 * The authorization request for credit card payments.
 */
public class CreditCardAuthorizeRequest extends AbstractInstallmentsAuthorizeRequest {

    /**
     * Instantiates a new Credit card authorize request.
     *
     * @param paymentToken       The token from "openPayment"
     * @param paymentMethodToken The paymentMethodToken of the selected payment method.
     * @param cvvNumber          CVV number of the selected credit card.
     */
    public CreditCardAuthorizeRequest(String paymentToken, String paymentMethodToken, String cvvNumber) {
        super(paymentToken, null, new PaymentMethod(paymentMethodToken, PaymentMethodType.CreditCard, cvvNumber, null, false), null, null);
    }

    /**
     * Instantiates a new Credit card authorize request with an IP address
     *
     * @param paymentToken       The token from "openPayment"
     * @param paymentMethodToken The paymentMethodToken of the selected payment method.
     * @param ipAddress          IPv4 Address of the end user browser
     * @param cvvNumber          CVV number of the selected credit card.
     */
    public CreditCardAuthorizeRequest(String paymentToken, String paymentMethodToken, String ipAddress, String cvvNumber) {
        super(paymentToken, ipAddress, new PaymentMethod(paymentMethodToken, PaymentMethodType.CreditCard, cvvNumber, null, false), null, null);
    }


    /**
     * Instantiates a new CreditCardAuthorizeRequest.
     *
     * @param paymentToken       the paymentToken from "openPayment"
     * @param paymentMethodToken The paymentMethodToken of the selected payment method.
     * @param ipAddress          IPv4 Address of the end user browser
     * @param cvvNumber          CVV number of the selected credit card.
     * @param reconciliationId   The reconciliationId to pass to processor
     * @deprecated Replaced by constructor with an additional emailAddress parameter
     */
    @Deprecated
    public CreditCardAuthorizeRequest(String paymentToken, String paymentMethodToken, String ipAddress, String cvvNumber, String reconciliationId) {
        super(paymentToken, ipAddress, new PaymentMethod(paymentMethodToken, PaymentMethodType.CreditCard, cvvNumber, null, false), reconciliationId, null);
    }

    /**
     * Instantiates a new CreditCardAuthorizeRequest.
     *
     * @param paymentToken       the paymentToken from "openPayment"
     * @param paymentMethodToken The paymentMethodToken of the selected payment method.
     * @param ipAddress          IPv4 Address of the end user browser
     * @param cvvNumber          CVV number of the selected credit card.
     * @param reconciliationId   The reconciliationId to pass to processor
     * @param emailAddress       the user emailAddress
     */
    public CreditCardAuthorizeRequest(String paymentToken, String paymentMethodToken, String ipAddress, String cvvNumber, String reconciliationId, String emailAddress) {
        super(paymentToken, ipAddress, new PaymentMethod(paymentMethodToken, PaymentMethodType.CreditCard, cvvNumber, null, false), reconciliationId, emailAddress);
    }


    /**
     * Instantiates a new CreditCardAuthorizeRequest.
     *
     * @param paymentToken           the paymentToken from "openPayment"
     * @param paymentMethodToken     The paymentMethodToken of the selected payment method.
     * @param ipAddress              IPv4 Address of the end user browser
     * @param cvvNumber              CVV number of the selected credit card.
     * @param reconciliationId       The reconciliationId to pass to processor
     * @param emailAddress           the user emailAddress
     * @param redirectUrl            The URL for redirection after the user finish the process on 3DSecure / AliPay / PayEase website
     * @param threeDSecureAttributes the three d secure attributes
     */
    public CreditCardAuthorizeRequest(String paymentToken, String paymentMethodToken, String ipAddress, String cvvNumber, String reconciliationId, String emailAddress, String redirectUrl, ThreeDSecureAttributes threeDSecureAttributes) {
        super(paymentToken, ipAddress, new PaymentMethod(paymentMethodToken, PaymentMethodType.CreditCard, cvvNumber, redirectUrl, false, threeDSecureAttributes), reconciliationId, emailAddress);
    }

    /**
     * Instantiates a new CreditCardAuthorizeRequest.
     *
     * @param paymentToken       the paymentToken from "openPayment"
     * @param paymentMethodToken The paymentMethodToken of the selected payment method.
     * @param ipAddress          IPv4 Address of the end user browser
     * @param cvvNumber          CVV number of the selected credit card.
     * @param reconciliationId   The reconciliationId to pass to processor
     * @param emailAddress       the user emailAddress
     * @param redirectUrl        The URL for redirection after the user finish the process on 3DSecure / AliPay / PayEase website
     */
    public CreditCardAuthorizeRequest(String paymentToken, String paymentMethodToken, String ipAddress, String cvvNumber, String reconciliationId, String emailAddress, String redirectUrl) {
        super(paymentToken, ipAddress, new PaymentMethod(paymentMethodToken, PaymentMethodType.CreditCard, cvvNumber, redirectUrl, false), reconciliationId, emailAddress);
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

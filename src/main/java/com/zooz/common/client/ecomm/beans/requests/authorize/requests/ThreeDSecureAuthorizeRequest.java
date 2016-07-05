package com.zooz.common.client.ecomm.beans.requests.authorize.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.zooz.common.client.ecomm.beans.PaymentMethod;
import com.zooz.common.client.ecomm.beans.ThreeDSecureAttributes;
import com.zooz.common.client.ecomm.beans.enums.PaymentMethodType;
import com.zooz.common.client.ecomm.beans.responses.AuthorizeResponse;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;

/**
 * An authorization which is made through 3D secure, should use this kind of request.
 */
public class ThreeDSecureAuthorizeRequest extends AbstractAuthorizeRequest {

    /**
     * Instantiates a new Three d secure authorize request.
     *
     * @param paymentToken       The token from "openPayment"
     * @param paymentMethodToken The paymentMethodToken of the selected payment method.
     * @param redirectUrl        The URL for redirection after the user finish the process on AliPay / PayEase website
     * @param cvvNumber          CVV number of the selected credit card.
     */
    public ThreeDSecureAuthorizeRequest(String paymentToken, String paymentMethodToken, String redirectUrl, String cvvNumber) {
        super(paymentToken, new PaymentMethod(paymentMethodToken, PaymentMethodType.CreditCard, cvvNumber, redirectUrl, true));
    }

    /**
     * Instantiates a new Three d secure authorize request with IP address.
     *
     * @param paymentToken       The token from "openPayment"
     * @param paymentMethodToken The paymentMethodToken of the selected payment method.
     * @param ipAddress          IPv4 Address of the end user browser
     * @param redirectUrl        The URL for redirection after the user finish the process on AliPay / PayEase website
     * @param cvvNumber          CVV number of the selected credit card.
     */
    public ThreeDSecureAuthorizeRequest(String paymentToken, String paymentMethodToken, String ipAddress, String redirectUrl, String cvvNumber) {
        super(paymentToken, ipAddress, new PaymentMethod(paymentMethodToken, PaymentMethodType.CreditCard, cvvNumber, redirectUrl, true));
    }

    /**
     * Instantiates a new Three d secure authorize request with IP address.
     *
     * @param paymentToken       The token from "openPayment"
     * @param paymentMethodToken The paymentMethodToken of the selected payment method.
     * @param ipAddress          IPv4 Address of the end user browser
     * @param redirectUrl        The URL for redirection after the user finish the process on AliPay / PayEase website
     * @param cvvNumber          CVV number of the selected credit card.
     * @param reconciliationId   The reconciliation id to pass to processor
     * @deprecated               Replaced by constructor with an additional emailAddress parameter
     */
    @Deprecated
    public ThreeDSecureAuthorizeRequest(String paymentToken, String paymentMethodToken, String ipAddress, String redirectUrl, String cvvNumber, String reconciliationId) {
        super(paymentToken, ipAddress, new PaymentMethod(paymentMethodToken, PaymentMethodType.CreditCard, cvvNumber, redirectUrl, true), reconciliationId);
    }



    /**
     * Instantiates a new Three d secure authorize request with IP address.
     *
     * @param paymentToken       The token from "openPayment"
     * @param paymentMethodToken The paymentMethodToken of the selected payment method.
     * @param ipAddress          IPv4 Address of the end user browser
     * @param redirectUrl        The URL for redirection after the user finish the process on AliPay / PayEase website
     * @param cvvNumber          CVV number of the selected credit card.
     * @param reconciliationId   The reconciliation id to pass to processor
     * @param emailAddress       The email address
     */
    public ThreeDSecureAuthorizeRequest(String paymentToken, String paymentMethodToken, String ipAddress, String redirectUrl, String cvvNumber, String reconciliationId, String emailAddress) {
        super(paymentToken, ipAddress, new PaymentMethod(paymentMethodToken, PaymentMethodType.CreditCard, cvvNumber, redirectUrl, true), reconciliationId, emailAddress);
    }

    /**
     * Instantiates a new Three d secure authorize request with IP address.
     *
     * @param paymentToken       The token from "openPayment"
     * @param paymentMethodToken The paymentMethodToken of the selected payment method.
     * @param ipAddress          IPv4 Address of the end user browser
     * @param redirectUrl        The URL for redirection after the user finish the process on AliPay / PayEase website
     * @param cvvNumber          CVV number of the selected credit card.
     * @param reconciliationId   The reconciliation id to pass to processor
     * @param emailAddress       The email address
     * @param threeDSecureAttributes The 3D secure attribute as sent from the merchant
     */
    public ThreeDSecureAuthorizeRequest(String paymentToken, String paymentMethodToken, String ipAddress, String redirectUrl, String cvvNumber, String reconciliationId, String emailAddress, ThreeDSecureAttributes threeDSecureAttributes) {
        super(paymentToken, ipAddress, new PaymentMethod(paymentMethodToken, PaymentMethodType.CreditCard, cvvNumber, redirectUrl, true, threeDSecureAttributes), reconciliationId, emailAddress);
    }

    /**
     * Used to return the response type corresponding to the request.
     *
     * @return the corresponding response type.
     */
    @JsonIgnore
    public TypeReference<ZoozServerResponse<AuthorizeResponse>> getResponseTypeReference() {
        return new TypeReference<ZoozServerResponse<AuthorizeResponse>>() {
        };
    }
}

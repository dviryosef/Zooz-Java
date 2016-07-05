package com.zooz.common.client.ecomm.beans.requests.authorize.requests;

import com.zooz.common.client.ecomm.beans.PaymentMethod;
import com.zooz.common.client.ecomm.control.CommonParameters;

/**
 * This is the abstract for authorizing a specified payment token for a specific payment method.
 */
public abstract class AbstractAuthorizeRequest extends AbstractUserPurchaseRequest {

    /**
     * Instantiates a new abstract authorize request.
     *
     * @param paymentToken  the paymentToken from "openPayment"
     * @param paymentMethod the selected payment method { CreditCard, AliPay, PayEase, PayPal }
     */
    protected AbstractAuthorizeRequest(String paymentToken, PaymentMethod paymentMethod) {
        super(CommonParameters.authorizePayment, paymentToken, paymentMethod);
    }

    /**
     * Instantiates a new abstract authorize request with an IP address.
     *
     * @param paymentToken  the paymentToken from "openPayment"
     * @param ipAddress     IPv4 Address of the end user browser
     * @param paymentMethod the selected payment method { CreditCard, AliPay, PayEase, PayPal }
     */
    protected AbstractAuthorizeRequest(String paymentToken, String ipAddress, PaymentMethod paymentMethod) {
        super(CommonParameters.authorizePayment, paymentToken, ipAddress, paymentMethod);
    }


    /**
     * Instantiates a new AbstractAuthorizeRequest.
     *
     * @param paymentToken     the paymentToken from "openPayment"
     * @param ipAddress        IPv4 Address of the end user browser
     * @param paymentMethod    the selected payment method { CreditCard, AliPay, PayEase, PayPal }
     * @param reconciliationId - The reconciliationId
     * @deprecated replaced by constructor with an additional emailAddress parameter
     */
    @Deprecated
    protected AbstractAuthorizeRequest(String paymentToken, String ipAddress, PaymentMethod paymentMethod, String reconciliationId) {
        super(CommonParameters.authorizePayment, paymentToken, ipAddress, paymentMethod, reconciliationId);
    }

    /**
     * Instantiates a new AbstractAuthorizeRequest.
     *
     * @param paymentToken     the paymentToken from "openPayment"
     * @param ipAddress        IPv4 Address of the end user browser
     * @param paymentMethod    the selected payment method { CreditCard, AliPay, PayEase, PayPal }
     * @param reconciliationId - The reconciliationId
     * @param emailAddress     - the user email address
     */
    protected AbstractAuthorizeRequest(String paymentToken, String ipAddress, PaymentMethod paymentMethod, String reconciliationId, String emailAddress) {
        super(CommonParameters.authorizePayment, paymentToken, ipAddress, paymentMethod, reconciliationId, emailAddress);
    }


}

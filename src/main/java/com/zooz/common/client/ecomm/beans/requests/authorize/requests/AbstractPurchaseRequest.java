package com.zooz.common.client.ecomm.beans.requests.authorize.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zooz.common.client.ecomm.beans.Address;
import com.zooz.common.client.ecomm.beans.PaymentMethod;
import com.zooz.common.client.ecomm.beans.requests.AbstractZoozRequest;

/**
 * This is the abstract for performing a purchase operation (authorize/ sale/ credit) on a specified payment token for a specific payment method.
 */
public abstract class AbstractPurchaseRequest extends AbstractZoozRequest {

    /**
     * The token from "openPayment"
     */
    @JsonProperty
    private String paymentToken;
    /**
     * selected payment method {CreditCard, AliPay, PayEase, PayPal}
     */
    @JsonProperty
    private PaymentMethod paymentMethod;
    /**
     * Mail Order, Telephone Order.
     * This parameter indicates that the buyer is purchasing using the telephone or mail
     * and not the internet (eCommerce).
     */
    @JsonProperty
    private boolean isMOTO;

    /**
     * Unique ID used to reconcile transactions, passed to processor
     * Note that this parameter might be different from "reconciliationId" parameter passed in the request due to processor changes.
     */
    @JsonProperty
    private String reconciliationId;

    /**
     * Billing address details
     */
    @JsonProperty
    private Address billingAddress;

    /**
     * Instantiates a new AbstractPurchaseRequest.
     *
     * @param command       the command to perform - "authorizePayment" / "sale" / "credit"
     * @param paymentToken  the paymentToken from "openPayment"
     * @param paymentMethod the selected payment method { CreditCard, AliPay, PayEase, PayPal }
     */
    protected AbstractPurchaseRequest(String command, String paymentToken, PaymentMethod paymentMethod) {
        super(command);
        this.paymentToken = paymentToken;
        this.paymentMethod = paymentMethod;
    }

    /**
     * Instantiates a new AbstractPurchaseRequest.
     *
     * @param command          the command to perform - "authorizePayment" / "sale" / "credit"
     * @param paymentToken     the paymentToken from "openPayment"
     * @param paymentMethod    the selected payment method { CreditCard, AliPay, PayEase, PayPal }
     * @param reconciliationId - The reconciliationId to pass to processor
     * @deprecated replace constructor with additional emailAddress parameter
     */
    @Deprecated
    protected AbstractPurchaseRequest(String command, String paymentToken, PaymentMethod paymentMethod, String reconciliationId) {
        this(command, paymentToken, paymentMethod);
        this.reconciliationId = reconciliationId;
    }

    /**
     * Gets selected payment method {CreditCard, AliPay, PayEase, PayPal}.
     *
     * @return Value of selected payment method {CreditCard, AliPay, PayEase, PayPal}.
     */
    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets new selected payment method {CreditCard, AliPay, PayEase, PayPal}.
     *
     * @param paymentMethod New value of selected payment method {CreditCard, AliPay, PayEase, PayPal}.
     */
    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * Gets The paymentToken from "openPayment".
     *
     * @return Value of The paymentToken from "openPayment".
     */
    public String getPaymentToken() {
        return paymentToken;
    }

    /**
     * Sets new The paymentToken from "openPayment".
     *
     * @param paymentToken New value of The paymentToken from "openPayment".
     */
    public void setPaymentToken(String paymentToken) {
        this.paymentToken = paymentToken;
    }

    /**
     * Returns true if the buyer is purchasing using the telephone or mail
     * and not the internet (eCommerce),  otherwise false.
     *
     * @return whether the buyer is purchasing using the telephone or mail
     * and not the internet (eCommerce), otherwise false.
     */
    public boolean isMOTO() {
        return isMOTO;
    }

    /**
     * Set to true if the buyer is purchasing using the telephone or mail
     * and not the internet (eCommerce),  otherwise false.
     *
     * @param isMOTO New value of The isMOTO
     */
    public void setMOTO(boolean isMOTO) {
        this.isMOTO = isMOTO;
    }

    /**
     * Gets the reconciliation id.
     *
     * @return the reconciliation id
     */
    public String getReconciliationId() {
        return reconciliationId;
    }

    /**
     * Sets the reconciliation id.
     *
     * @param reconciliationId the reconciliation id
     */
    public void setReconciliationId(String reconciliationId) {
        this.reconciliationId = reconciliationId;
    }

    /**
     * Gets the billing address.
     *
     * @return the billing address
     */
    public Address getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the billing address.
     *
     * @param billingAddress the billing address
     */
    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }
}

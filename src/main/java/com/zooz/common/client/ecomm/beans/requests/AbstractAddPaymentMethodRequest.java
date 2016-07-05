package com.zooz.common.client.ecomm.beans.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.zooz.common.client.ecomm.beans.Fingerprint;
import com.zooz.common.client.ecomm.beans.addpaymentmethod.beans.AbstractPaymentMethod;
import com.zooz.common.client.ecomm.beans.responses.AddPaymentMethodResponse;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;
import com.zooz.common.client.ecomm.control.CommonParameters;

import java.util.List;

/**
 * Created by roykey on 10/13/15.
 */
public abstract class AbstractAddPaymentMethodRequest extends AbstractZoozRequest {

    /**
     * The token from "openPayment"/"getToken"
     */
    @JsonProperty
    protected String paymentToken;
    /**
     * The users e-mail address.
     */
    @JsonProperty
    protected String email;
    /**
     * The users payment method details.
     */
    @JsonProperty
    protected AbstractPaymentMethod paymentMethod;


    /**
     * The redirectUrl.
     */
    @JsonProperty
    protected String redirectUrl;

    /**
     * List of device fingerprints.
     */
    @JsonProperty
    protected List<Fingerprint> deviceFingerprint;

    /**
     * Instantiates a new Abstract add payment method request.
     *
     * @param paymentToken  the payment token
     * @param email         the email
     * @param paymentMethod the payment method
     */
    protected AbstractAddPaymentMethodRequest(String paymentToken,String email, AbstractPaymentMethod paymentMethod) {
        super(CommonParameters.addPaymentMethod);
        this.paymentToken = paymentToken;
        this.email = email;
        this.paymentMethod = paymentMethod;
    }

    /**
     * Gets the payment token.
     *
     * @return the payment token
     */
    public String getPaymentToken() {
        return paymentToken;
    }

    /**
     * Sets the payment token.
     *
     * @param paymentToken the payment token
     */
    public void setPaymentToken(String paymentToken) {
        this.paymentToken = paymentToken;
    }

    /**
     * Gets the email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the payment method.
     *
     * @return the payment method
     */
    public AbstractPaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the payment method.
     *
     * @param paymentMethod the payment method
     */
    public void setPaymentMethod(AbstractPaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * Gets the list of device fingerprints.
     *
     * @return device fingerprint
     */
    public List<Fingerprint> getDeviceFingerprint() {
        return deviceFingerprint;
    }

    /**
     * Sets the list of device fingerprints.
     *
     * @param deviceFingerprint the device fingerprint
     */
    public void setDeviceFingerprint(List<Fingerprint> deviceFingerprint) {
        this.deviceFingerprint = deviceFingerprint;
    }

    /**
     * Gets redirect url.
     *
     * @return the redirect url
     */
    public String getRedirectUrl() {
        return redirectUrl;
    }

    /**
     * Sets redirect url.
     *
     * @param redirectUrl the redirect url
     */
    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }
    /**
     * Used to return the response type corresponding to the request.
     *
     * @return the corresponding response type.
     */
    @Override
    @JsonIgnore
    public TypeReference<ZoozServerResponse<AddPaymentMethodResponse>> getResponseTypeReference() {
        return new TypeReference<ZoozServerResponse<AddPaymentMethodResponse>>() {
        };
    }
}

package com.zooz.common.client.ecomm.beans.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zooz.common.client.ecomm.beans.addpaymentmethod.beans.server.ServerConfiguration;
import com.zooz.common.client.ecomm.beans.addpaymentmethod.beans.server.ServerPaymentMethod;
import com.zooz.common.client.ecomm.beans.addpaymentmethod.beans.server.ServerPaymentMethodDetails;

/**
 * The type Add payment method request.
 */
public class ServerAddPaymentMethodRequest extends AbstractAddPaymentMethodRequest {

    @JsonProperty
    private String ipAddress;

    @JsonProperty
    private String userAgent;


    /**
     * Instantiates a new Server add payment method request.
     *
     * @param paymentToken         the payment token
     * @param email                the email
     * @param paymentMethodDetails the payment method details
     * @param serverConfiguration  the server configuration
     * @deprecated paymentMethodType should be a parameter instead of hardcoded "CreditCard" replaced by {@link #ServerAddPaymentMethodRequest(String paymentToken, String email, ServerPaymentMethodDetails paymentMethodDetails,
     * String paymentMethodType, ServerConfiguration serverConfiguration)}
     */
    @Deprecated
    public ServerAddPaymentMethodRequest(String paymentToken, String email, ServerPaymentMethodDetails paymentMethodDetails,
                                         ServerConfiguration serverConfiguration) {

        super(paymentToken, email, new ServerPaymentMethod(paymentMethodDetails, serverConfiguration));
    }

    /**
     * Instantiates a new Server add payment method request.
     *
     * @param paymentToken         the payment token
     * @param email                the email
     * @param paymentMethodDetails the payment method details
     * @param paymentMethodType    the payment method type - "CreditCard" / "PayPal"
     * @param serverConfiguration  the server configuration
     */
    public ServerAddPaymentMethodRequest(String paymentToken, String email, ServerPaymentMethodDetails paymentMethodDetails,
                                         String paymentMethodType, ServerConfiguration serverConfiguration) {

        super(paymentToken, email, new ServerPaymentMethod(paymentMethodDetails, serverConfiguration, paymentMethodType));

    }

    /**
     * Gets the userAgent
     *
     * @return the userAgent
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * sets the userAgent
     *
     * @param userAgent the user agent
     *
     */
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    /**
     * Gets the ipAddress
     *
     * @return the ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * sets the ipAddress
     *
     * @param ipAddress the ip address
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

}

package com.zooz.common.client.ecomm.beans.requests.authorize.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zooz.common.client.ecomm.beans.Discount;
import com.zooz.common.client.ecomm.beans.Fingerprint;
import com.zooz.common.client.ecomm.beans.PaymentMethod;

import java.util.List;
import java.util.Map;

/**
 * This is the abstract for performing a purchase operation by a user (authorize/ sale) on a specified payment token for a specific payment method.
 */
public abstract class AbstractUserPurchaseRequest extends AbstractPurchaseRequest {

    /**
     * browser user agent of the end user.
     */
    @JsonProperty
    private String userAgent;
    /**
     * IPv4 Address of the end user browser
     */
    @JsonProperty
    private String ipAddress;
    /**
     * merchant custom parameters data Map
     * used by specific providers of fraud detection. Not relevant for all payment processors,
     */
    @JsonProperty
    private Map<Object, Object> merchantCustomData;

    /**
     * the user email address
     */
    @JsonProperty
    private String emailAddress;

    /**
     * The shipping method for the user.
     */
    @JsonProperty
    private String shippingMethod;

    /**
     * The discount rates list for the user.
     */
    @JsonProperty
    private List<Discount> discountRates;

    /**
     * List of device fingerprints.
     */
    @JsonProperty
    private List<Fingerprint> deviceFingerprint;


    /**
     * Instantiates a new AbstractPurchaseRequest.
     *
     * @param command       the command to perform - "authorizePayment" / "sale"
     * @param paymentToken  the paymentToken from "openPayment"
     * @param paymentMethod the selected payment method { CreditCard, AliPay, PayEase, PayPal }
     */
    protected AbstractUserPurchaseRequest(String command, String paymentToken, PaymentMethod paymentMethod) {
        super(command, paymentToken, paymentMethod);
    }

    /**
     * Instantiates a new AbstractPurchaseRequest.
     *
     * @param command       the command to perform - "authorizePayment" / "sale"/ "credit"
     * @param paymentToken  the paymentToken from "openPayment"
     * @param ipAddress     IPv4 Address of the end user browser
     * @param paymentMethod the selected payment method { CreditCard, AliPay, PayEase, PayPal }
     */
    protected AbstractUserPurchaseRequest(String command, String paymentToken, String ipAddress, PaymentMethod paymentMethod) {
        this(command, paymentToken, ipAddress, paymentMethod, null);
    }

    /**
     * Instantiates a new AbstractPurchaseRequest.
     *
     * @param command          the command to perform - "authorizePayment" / "sale" / "credit"
     * @param paymentToken     the paymentToken from "openPayment"
     * @param ipAddress        IPv4 Address of the end user browser
     * @param paymentMethod    the selected payment method { CreditCard, AliPay, PayEase, PayPal }
     * @param reconciliationId - The reconciliationId to pass to processor
     */
    protected AbstractUserPurchaseRequest(String command, String paymentToken, String ipAddress, PaymentMethod paymentMethod, String reconciliationId) {
        this(command, paymentToken, ipAddress, paymentMethod, reconciliationId, null);

    }

    /**
     * Instantiates a new AbstractPurchaseRequest.
     *
     * @param command          the command to perform - "authorizePayment" / "sale" / "credit"
     * @param paymentToken     the paymentToken from "openPayment".
     * @param ipAddress        IPv4 Address of the end user browser*
     * @param paymentMethod    the selected payment method { CreditCard, AliPay, PayEase, PayPal }
     * @param reconciliationId - The reconciliationId to pass to processor
     * @param emailAddress     - the user emailAddress
     */
    protected AbstractUserPurchaseRequest(String command, String paymentToken, String ipAddress, PaymentMethod paymentMethod, String reconciliationId, String emailAddress) {
        super(command, paymentToken, paymentMethod, reconciliationId);
        this.ipAddress = ipAddress;
        this.emailAddress = emailAddress;
    }

    /**
     * Gets browser user agent of the end user.
     *
     * @return Value of browser user agent of the end user..
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * Sets new browser user agent of the end user..
     *
     * @param userAgent New value of browser user agent of the end user..
     */
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    /**
     * Gets IPv4 Address of the end user browser.
     *
     * @return Value of IPv4 Address of the end user browser.
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets new IPv4 Address of the end user browser.
     *
     * @param ipAddress New value of IPv4 Address of the end user browser.
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * Gets merchant custom parameters data Map
     * used by specific providers of fraud detection. Not relevant for all payment processors,.
     *
     * @return Value of merchant custom parameters data Map
     * used by specific providers of fraud detection. Not relevant for all payment processors,.
     */
    public Map<Object, Object> getMerchantCustomData() {
        return merchantCustomData;
    }

    /**
     * Sets new merchant custom parameters data Map
     * used by specific providers of fraud detection. Not relevant for all payment processors,.
     *
     * @param merchantCustomData New value of merchant custom parameters data Map
     *                           used by specific providers of fraud detection. Not relevant for all payment processors,.
     */
    public void setMerchantCustomData(Map<Object, Object> merchantCustomData) {
        this.merchantCustomData = merchantCustomData;
    }

    /**
     * get the email address
     *
     * @return the email address
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * set the email address
     *
     * @param emailAddress the user emailAddress
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Get the shipping method for the user.
     *
     * @return The shipping method for the user.
     */
    public String getShippingMethod() {
        return shippingMethod;
    }

    /**
     * Set the shipping method for the user.
     *
     * @param shippingMethod The shipping method for the user.
     */
    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    /**
     *  Get the discounts list for this user.
     *
     * @return discounts list for this user
     */
    public List<Discount> getDiscountRates() {
        return discountRates;
    }

    /**
     * Set the discounts list for this user.
     *
     * @param discountRates discounts list for this user
     */
    public void setDiscountRates(List<Discount> discountRates) {
        this.discountRates = discountRates;
    }

    /**
     * Get the device “fingerprints” .
     *
     * @return The device “fingerprints”
     */
    public List<Fingerprint> getDeviceFingerprint() {
        return deviceFingerprint;
    }

    /**
     * Set the device “fingerprints” .
     *
     * @param deviceFingerprint device “fingerprints”
     */
    public void setDeviceFingerprint(List<Fingerprint> deviceFingerprint) {
        this.deviceFingerprint = deviceFingerprint;
    }
}

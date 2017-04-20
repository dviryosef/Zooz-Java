package com.zooz.common.client.ecomm.beans.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zooz.common.client.ecomm.beans.DeviceInformation;
import com.zooz.common.client.ecomm.beans.FundSource;
import com.zooz.common.client.ecomm.beans.Risk;
import com.zooz.common.client.ecomm.beans.enums.NotificationStatus;
import com.zooz.common.client.ecomm.beans.enums.NotificationType;

import java.util.Map;
/**
 * Payment method IPN details
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentMethodIPN extends ZoozResponseObject implements ZoozIPNResponse {

    @JsonProperty("ipnType")
    private NotificationStatus notificationStatus;

    @JsonProperty("programId")
    private String programId;

    @JsonProperty("customerLoginID")
    private String customerLoginID;

    @JsonProperty("deviceInformation")
    private DeviceInformation deviceInformation;

    @JsonProperty("paymentMethod")
    private FundSource paymentMethod;

    @JsonProperty("errorDetails")
    private Map<Object, Object> errorObject;

    @JsonProperty("signature")
    private String signature;

    @JsonProperty("risk")
    private Risk risk;


    /**
     * Gets notification status.
     *
     * @return the notification status
     */
    public NotificationStatus getNotificationStatus() {
        return notificationStatus;
    }

    /**
     * sets the notification status
     *
     * @param notificationStatus the notification status
     */
    public void setNotificationStatus(NotificationStatus notificationStatus) {
        this.notificationStatus = notificationStatus;
    }

    /**
     * Gets program id.
     *
     * @return the program id
     */
    public String getProgramId() {
        return programId;
    }

    /**
     * sets the program id
     *
     * @param programId the program id
     */
    public void setProgramId(String programId) {
        this.programId = programId;
    }

    /**
     * Gets customer login id.
     *
     * @return the customer login id
     */
    public String getCustomerLoginID() {
        return customerLoginID;
    }

    /**
     * sets the customer login id
     *
     * @param customerLoginID the customer login id
     */
    public void setCustomerLoginID(String customerLoginID) {
        this.customerLoginID = customerLoginID;
    }

    /**
     * Gets device information.
     *
     * @return the device information
     */
    public DeviceInformation getDeviceInformation() {
        return deviceInformation;
    }

    /**
     * sets the device information
     *
     * @param mobileDeviceBean the mobile device bean
     */
    public void setDeviceInformation(DeviceInformation mobileDeviceBean) {
        this.deviceInformation = mobileDeviceBean;
    }

    /**
     * Gets payment method.
     *
     * @return the payment method token
     */
    public FundSource getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * sets the payment method token
     *
     * @param paymentMethod the payment method
     */
    public void setPaymentMethod(FundSource paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * Gets error details object.
     *
     * @return the error details object
     */
    public Map<Object, Object> getErrorDetailsObject() {
        return errorObject;
    }

    /**
     * set the error details object
     *
     * @param responseObject the response object
     */
    public void setErrorDetailsObject(Map<Object, Object> responseObject) {
        this.errorObject = responseObject;
    }

    /**
     * Gets signature.
     *
     * @return the signature
     */
    public String getSignature() {
        return signature;
    }

    /**
     * sets the signature
     *
     * @param signature the signature
     */
    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * gets the risk
     *
     * @return risk  - the risk
     */
    public Risk getRisk() {
        return risk;
    }

    /**
     * Sets the risk
     *
     * @param risk the risk
     */
    public void setRisk(Risk risk) {
        this.risk = risk;
    }

    @Override
    public NotificationType getIPNType() {
        return NotificationType.PaymentMethodIPN;
    }
}
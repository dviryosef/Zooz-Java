package com.zooz.common.client.ecomm.beans.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zooz.common.client.ecomm.beans.Address;
import com.zooz.common.client.ecomm.beans.BinDetails;
import com.zooz.common.client.ecomm.beans.Risk;

/**
 * The type Add payment method response.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AddPaymentMethodResponse extends ZooZProcessingResponseObject {
    
	@JsonProperty
	private String paymentMethodStatus;
	
	@JsonProperty
	private String paymentMethodToken;
	
	@JsonProperty
	private String cardHolderName;
	
	@JsonProperty
	private String expirationYear;
	
	@JsonProperty
	private String expirationMonth;
	
	@JsonProperty
	private String validDate;
	
	@JsonProperty
	private String subtype;
	
	@JsonProperty
	private String lastFourDigits;
	
	@JsonProperty
	private String binNumber;
	
	@JsonProperty
	private Address billingAddress;
	
	@JsonProperty
	private String paymentMethodType;
	
	@JsonProperty
    private String paymentMethodLastUsedTimestamp;

    @JsonProperty
    private String paymentMethodLastSuccessfulUsedTimestamp;

    @JsonProperty
    private Risk risk;

    @JsonProperty
    private String redirectUrl;

    @JsonProperty
    private BinDetails binDetails;

    @JsonProperty
    private String cv2AvsRaw;

    @JsonProperty
    private String processorName;
    /**
     * Instantiates a new Add payment method response.
     */
    public AddPaymentMethodResponse() {
	}

    /**
     * Gets the payment method status.
     *
     * @return the payment method status
     */
    public String getPaymentMethodStatus() {
        return paymentMethodStatus;
    }

    /**
     * Sets the payment method status.
     *
     * @param paymentMethodStatus the payment method status
     */
    public void setPaymentMethodStatus(String paymentMethodStatus) {
        this.paymentMethodStatus = paymentMethodStatus;
    }

    /**
     * Gets the payment method token.
     *
     * @return the payment method token
     */
    public String getPaymentMethodToken() {
        return paymentMethodToken;
    }

    /**
     * Sets the payment method token.
     *
     * @param paymentMethodToken the payment method token
     */
    public void setPaymentMethodToken(String paymentMethodToken) {
        this.paymentMethodToken = paymentMethodToken;
    }

    /**
     * Gets the card holder name.
     *
     * @return the card holder name
     */
    public String getCardHolderName() {
        return cardHolderName;
    }

    /**
     * Sets the card holder name.
     *
     * @param cardHolderName the card holder name
     */
    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    /**
     * Gets the expiration year.
     *
     * @return the expiration year
     */
    public String getExpirationYear() {
        return expirationYear;
    }

    /**
     * Sets the expiration year.
     *
     * @param expirationYear the expiration year
     */
    public void setExpirationYear(String expirationYear) {
        this.expirationYear = expirationYear;
    }

    /**
     * Gets the expiration month.
     *
     * @return the expiration month
     */
    public String getExpirationMonth() {
        return expirationMonth;
    }

    /**
     * Sets the expiration month.
     *
     * @param expirationMonth the expiration month
     */
    public void setExpirationMonth(String expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    /**
     * Gets the valid date.
     *
     * @return the valid date
     */
    public String getValidDate() {
        return validDate;
    }

    /**
     * Sets the valid date.
     *
     * @param validDate the valid date
     */
    public void setValidDate(String validDate) {
        this.validDate = validDate;
    }

    /**
     * Gets the subtype.
     *
     * @return the subtype
     */
    public String getSubtype() {
        return subtype;
    }

    /**
     * Sets the subtype.
     *
     * @param subtype the subtype
     */
    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    /**
     * Gets the last four digits.
     *
     * @return the last four digits
     */
    public String getLastFourDigits() {
        return lastFourDigits;
    }

    /**
     * Sets the last four digits.
     *
     * @param lastFourDigits the last four digits
     */
    public void setLastFourDigits(String lastFourDigits) {
        this.lastFourDigits = lastFourDigits;
    }

    /**
     * Gets the bin number.
     *
     * @return the bin number
     */
    public String getBinNumber() {
        return binNumber;
    }

    /**
     * Sets the bin number.
     *
     * @param binNumber the bin number
     */
    public void setBinNumber(String binNumber) {
        this.binNumber = binNumber;
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

    /**
     * Gets the payment method type.
     *
     * @return the payment method type
     */
    public String getPaymentMethodType() {
        return paymentMethodType;
    }

    /**
     * Sets the payment method type.
     *
     * @param paymentMethodType the payment method type
     */
    public void setPaymentMethodType(String paymentMethodType) {
        this.paymentMethodType = paymentMethodType;
    }

    /**
     * Gets the payment method last used timestamp.
     *
     * @return the payment method last used timestamp
     */
    public String getPaymentMethodLastUsedTimestamp() {
        return paymentMethodLastUsedTimestamp;
    }

    /**
     * Sets the payment method last used timestamp.
     *
     * @param paymentMethodLastUsedTimestamp the payment method last used timestamp
     */
    public void setPaymentMethodLastUsedTimestamp(String paymentMethodLastUsedTimestamp) {
        this.paymentMethodLastUsedTimestamp = paymentMethodLastUsedTimestamp;
    }

    /**
     * Gets the payment method last successful used timestamp.
     *
     * @return the payment method last successful used timestamp
     */
    public String getPaymentMethodLastSuccessfulUsedTimestamp() {
        return paymentMethodLastSuccessfulUsedTimestamp;
    }

    /**
     * Sets the payment method last successful used timestamp.
     *
     * @param paymentMethodLastSuccessfulUsedTimestamp the payment method last successful used timestamp
     */
    public void setPaymentMethodLastSuccessfulUsedTimestamp(String paymentMethodLastSuccessfulUsedTimestamp) {
        this.paymentMethodLastSuccessfulUsedTimestamp = paymentMethodLastSuccessfulUsedTimestamp;
    }

    /**
     * Gets the risk.
     *
     * @return the risk
     */
    public Risk getRisk() {
        return risk;
    }

    /**
     * Sets the risk.
     *
     * @param risk the risk
     */
    public void setRisk(Risk risk) {
        this.risk = risk;
    }

    /**
     * Gets the redirectUrl
     *
     * @return the redirectUrl
     */
    public String getRedirectUrl() {
        return redirectUrl;
    }

    /**
     * Set the redirectUrl
     *
     *  @param redirectUrl the redirectUrl
     */
    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public BinDetails getBinDetails() {
        return binDetails;
    }

    public void setBinDetails(BinDetails binDetails) {
        this.binDetails = binDetails;
    }

    /**
     * Gets the raw response of the cv2Avs check
     * @return the raw response of the cv2Avs check
     */
    public String getCv2AvsRaw() {
        return cv2AvsRaw;
    }

    /**
     * Sets the raw response of the cv2Avs check
     * @param cv2AvsRaw the raw response of the cv2Avs check
     */
    public void setCv2AvsRaw(String cv2AvsRaw) {
        this.cv2AvsRaw = cv2AvsRaw;
    }

    /**
     * gets the name of the processor that processes the transaction
     *
     * @return processorName processor name
     */
    public String getProcessorName() {
        return processorName;
    }

    /**
     * Sets the name of the processor that processes the transaction
     *
     * @param processorName the processor name
     */
    public void setProcessorName(String processorName) {
        this.processorName = processorName;
    }


}

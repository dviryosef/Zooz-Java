package com.zooz.common.client.ecomm.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * The set of parameters included in a fund source.
 * A fund source refers to a specific credit card's details.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FundSource extends AbstractJsonBean {
    /**
     * The Name on credit card.
     */
    @JsonProperty
    private String cardHolderName;
    /**
     * The expiration date of the credit card.
     * Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT represented by
     */
    @JsonProperty
    private long validDate;
    /**
     * The expiration month of the credit card.
     */
    @JsonProperty
    private String expirationMonth;
    /**
     * The expiration year of the credit card.
     */
    @JsonProperty
    private String expirationYear;
    /**
     * Those are the values:
     * {VISA, MasterCard, Maestro, AmericanExpress, Discover, Diners, JCB, UnionPay}
     */
    @JsonProperty
    private String subtype;
    /**
     * Representation of the credit card in Zooz systems.
     */
    @JsonProperty
    private String paymentMethodToken;
    /**
     * Last 4 digits, of the credit card.
     */
    @JsonProperty
    private String lastFourDigits;
    /**
     * Those are the values: {CreditCard, AliPay, PayEase}
     */
    @JsonProperty
    private String paymentMethodType;
    /**
     * BIN Number is composed of the first 6 digits of the credit card number.
     */
    @JsonProperty
    private String binNumber;
    /**
     * Users billing address
     */
    @JsonProperty
    private Address billingAddress;
    /**
     * The payment method status reflects the validity of the paying method
     * the expected values are:
     * 0 - valid
     * 1 - expired
     * 2 - not valid (in case the payment token is sent to the GetFundSource API,
     * this status indicates that this payment method is not supported by the app)
     */
    @JsonProperty
    private int paymentMethodStatus;

    /**
     * The Payment Method Last Used Timestamp
     */
    @JsonProperty
    private long paymentMethodLastUsedTimestamp;

    /**
     * The Payment Method Last Successful Used Timestamp
     */
    @JsonProperty
    private long paymentMethodLastSuccessfulUsedTimestamp;

    /**
     * Is Apple Pay fund source
     */
    @JsonProperty
    private boolean isApplePay;
    /**
     * The name of the processor that processes the transaction
     */
    @JsonProperty
    private String payerId;

    /**
     * The payer status
     */
    @JsonProperty
    private String payerStatus;

    /**
     * Payer email address
     */
    @JsonProperty
    private String email;

    @JsonProperty
    private List<String> billingAgreementsEmails;

    @JsonProperty
    private Map<String, String> additionalDetails;

    /**
     * The bin details attributes
     */
    @JsonProperty
    private BinDetails binDetails;


    /**
     * Instantiates a new Fund source.
     *
     * @param cardHolderName     Name on credit card.
     * @param validDate          The expiration date of the credit card.Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT represented by                            this date.
     * @param expirationMonth    the expiration month
     * @param expirationYear     the expiration year
     * @param subtype            Those are the values:{VISA, MasterCard, Maestro, AmericanExpress, Discover, Diners, JCB, UnionPay}
     * @param paymentMethodToken Representation of the credit card in Zooz systems.
     * @param lastFourDigits     Last 4 digits, of the credit card.
     * @param paymentMethodType  Those are the values:{CreditCard, AliPay, PayEase}
     * @param binNumber          BIN Number is composed of the first 6 digits of the credit card number.
     * @param billingAddress     Users billing address
     * @param payerStatus        paypal payer status
     *
     * @deprecated Use setters instead of the constructor
     */
    @Deprecated
    public FundSource(String cardHolderName, long validDate, String expirationMonth, String expirationYear, String subtype, String paymentMethodToken, String lastFourDigits, String paymentMethodType, String binNumber, Address billingAddress,String payerStatus) {
        this.cardHolderName = cardHolderName;
        this.validDate = validDate;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
        this.subtype = subtype;
        this.paymentMethodToken = paymentMethodToken;
        this.lastFourDigits = lastFourDigits;
        this.paymentMethodType = paymentMethodType;
        this.binNumber = binNumber;
        this.billingAddress = billingAddress;
        this.payerStatus = payerStatus;
    }

    /**
     * Instantiates a new Fund source.
     */
    public FundSource() {
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
     * Gets the valid date.
     *
     * @return the valid date
     */
    public long getValidDate() {
        return validDate;
    }

    /**
     * Sets the valid date.
     *
     * @param validDate the valid date
     */
    public void setValidDate(long validDate) {
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
     * Gets expiration month.
     *
     * @return the expiration month
     */
    public String getExpirationMonth() {
        return expirationMonth;
    }

    /**
     * Sets expiration month.
     *
     * @param expirationMonth the expiration month
     */
    public void setExpirationMonth(String expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    /**
     * Gets expiration year.
     *
     * @return the expiration year
     */
    public String getExpirationYear() {
        return expirationYear;
    }

    /**
     * Sets expiration year.
     *
     * @param expirationYear the expiration year
     */
    public void setExpirationYear(String expirationYear) {
        this.expirationYear = expirationYear;
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
     * Gets the payment method status.
     *
     * @return the payment method status
     */
    public int getPaymentMethodStatus() {
        return paymentMethodStatus;
    }

    /**
     * Sets the payment method status.
     *
     * @param paymentMethodStatus the payment method status
     */
    public void setPaymentMethodStatus(int paymentMethodStatus) {
        this.paymentMethodStatus = paymentMethodStatus;
    }

    /**
     * Gets payment method last used timestamp.
     *
     * @return payment method last used timestamp
     */
    public long getPaymentMethodLastUsedTimestamp() {
        return paymentMethodLastUsedTimestamp;
    }

    /**
     * Sets payment method last used timestamp.
     *
     * @param paymentMethodLastUsedTimestamp the payment method last used timestamp
     */
    public void setPaymentMethodLastUsedTimestamp(long paymentMethodLastUsedTimestamp) {
        this.paymentMethodLastUsedTimestamp = paymentMethodLastUsedTimestamp;
    }

    /**
     * Gets payment method last successful used timestamp.
     *
     * @return payment method last successful used timestamp
     */
    public long getPaymentMethodLastSuccessfulUsedTimestamp() {
        return paymentMethodLastSuccessfulUsedTimestamp;
    }

    /**
     * Sets payment method last successful used timestamp.
     *
     * @param paymentMethodLastSuccessfulUsedTimestamp the payment method last successful used timestamp
     */
    public void setPaymentMethodLastSuccessfulUsedTimestamp(long paymentMethodLastSuccessfulUsedTimestamp) {
        this.paymentMethodLastSuccessfulUsedTimestamp = paymentMethodLastSuccessfulUsedTimestamp;
    }

    /**
     * Gets is ApplePay payment.
     *
     * @return isApplePay boolean
     */
    public boolean isApplePay() { return isApplePay; }


    /**
     * Sets is ApplePay payment.
     *
     * @param isApplePay the is apple pay
     */
    public void setApplePay(boolean isApplePay) { this.isApplePay = isApplePay; }

    /**
     * Gets the PayerStatus.
     * PayerStatus is  the payer status in paypal.
     *
     * @return the PayerStatus
     */
    public String getPayerStatus() {
        return payerStatus;
    }

    /**
     * Sets the PayerStatus in paypal.
     * PayerStatus is a the payer status in paypal.
     *
     * @param payerStatus the status
     */
    public void setPayerStatus(String payerStatus) {
        this.payerStatus = payerStatus;
    }

    /**
     * Gets the PayerId.
     * PayerId is a Unique PayPal buyer account identification number.
     *
     * @return the PayerId
     */
    public String getPayerId() {
        return payerId;
    }

    /**
     * Sets the PayerId.
     * PayerId is a Unique PayPal buyer account identification number.
     *
     * @param payerId the payer id
     */
    public void setPayerId(String payerId) {
        this.payerId = payerId;
    }

    /**
     * Get the Payer email.
     * Email is a Unique PayPal buyer email account.
     * @return The payer email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the Payer email.
     * Email is a Unique PayPal buyer email account.
     * @param email The payer email
     */
    public void setEmail(String email) {
        this.email = email;
    }



    public List<String> getBillingAgreementsEmails() {
        return billingAgreementsEmails;
    }

    public void setBillingAgreementsEmails(List<String> billingAgreementsEmails) {
        this.billingAgreementsEmails = billingAgreementsEmails;
    }

    public Map<String, String> getAdditionalDetails() {
        return additionalDetails;
    }

    public BinDetails getBinDetails() {
        return binDetails;
    }

    public void setBinDetails(BinDetails binDetails) {
        this.binDetails = binDetails;
    }
}

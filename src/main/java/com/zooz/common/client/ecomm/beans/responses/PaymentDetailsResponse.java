package com.zooz.common.client.ecomm.beans.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zooz.common.client.ecomm.beans.*;
import com.zooz.common.client.ecomm.beans.enums.NotificationType;

import java.util.List;
import java.util.Map;

/**
 * The PaymentDetailsResponse includes any of the response parameter returns for the corresponding requests.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentDetailsResponse extends ZoozResponseObject implements ZoozIPNResponse {

    /**
     * Application name that created the payment.
     */
    @JsonProperty
    private String appName;
    /**
     * The app's ZooZUniqueID (bundleId)
     */
    @JsonProperty
    private String ZooZUniqueID;

    /**
     * The Program Id
     */
    @JsonProperty
    private String programId;

    /**
     * Payment ID is unique identifier on ZooZ"s servers as you get from the response whether it"s from ZooZ"s
     * SDK response or callback response, after the user authorized or commit a payment.
     */
    @JsonProperty
    private String paymentId;

    /**
     * Payment token as created on openPayment.
     */
    @JsonProperty
    private String paymentToken;

    /**
     * Whether the response comes from the Sandbox Server or Production Server.
     */
    @JsonProperty
    private boolean isSandbox;
    /**
     * code: 1004
     * The original payment that was refunded.
     * <p/>
     * "	"Refund due chargeback"
     * code: 1005
     * Refund payment due to chargeback received.
     * <p/>
     * "	"Charged Back"
     * code: 1006
     * The original payment that was charged back.
     * <p/>
     * "	"Refund"
     * code: 1007
     * Refund payment
     * <p/>
     * "	"Pending user payment completion"
     * code: 1008
     * Transaction is waiting for user action.
     * (Merchant cannot commit this payment)
     * <p/>
     * "	"Voided"
     * code: 1009
     * Payment has been voided by the merchant.
     * <p/>
     * "	"Payment Declined"
     * code: 1010
     * Payment was declined by the processor.
     * <p/>
     * "	"Refund Declined"
     * code: 1011
     * Refund payment was declined
     */
    @JsonProperty
    private String paymentStatus;
    /**
     * Refer to paymentStatus above
     */
    @JsonProperty
    private double paymentStatusCode;
    /**
     * The original payment amount.
     * Expected format:
     * dddddd.cc (e.g. 105.15)
     */

    @JsonProperty
    private double amount;
    /**
     * The actual paid amount.
     * Expected format:
     * dddddd.cc (e.g. 105.15)
     */
    @JsonProperty
    private double paidAmount;
    /**
     * The actual refunded amount.
     * Expected format:
     * dddddd.cc (e.g. 105.15)
     */
    @JsonProperty
    private double refundAmount;
    /**
     * The currency code used, for example: USD, EUR, GBP
     */
    @JsonProperty
    private String currencyCode;
    /**
     * The tax amount of the payment.
     * Please note: amount = subtotal + taxAmount. This value will be used to calculate the subtotal for the invoice.
     */
    @JsonProperty
    private double taxAmount;

    /**
     * The tax percentage of the payment.
     * Please note: amount = subtotal + taxPercentage*subtotal. This value will be used to calculate the subtotal for the invoice.
     */
    @JsonProperty
    private double taxPercentage;

    /**
     * ZooZ"s fee.
     * Expected format:
     * dddddd.cc (e.g. 105.15)
     */
    @JsonProperty
    private double zoozFee;
    /**
     * The creation date of the payment.
     * Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT represented by this date.
     */
    @JsonProperty
    private long paymentTimestamp;
    /**
     * customerLoginID is the customer’s identifier on the merchant’s server,
     * allowing one click checkout from all devices.
     */
    @JsonProperty
    private String customerLoginID;
    /**
     * The ip address of this payment.
     */
    @JsonProperty
    private String ipAddress;
    /**
     * The shipping method that was selected by the user for this payment.
     */
    @JsonProperty
    private String shippingMethod;
    /**
     * The price of the selected shipping method.
     */
    @JsonProperty
    private double shippingAmount;
    /**
     * The carrier code that matches the shipping method selected by the user
     */
    @JsonProperty
    private String shippingCarrierCode;
    /**
     * The carrier name that matches the shipping method selected by the user
     */
    @JsonProperty
    private String shippingCarrierName;
    /**
     * Payer's information
     */
    @JsonProperty
    private User user;
    /**
     * Payer's invoice
     */
    @JsonProperty
    private Invoice invoice;
    /**
     * Payer's addresses
     */
    @JsonProperty
    private Addresses addresses;
    /**
     * The riskScore represents the likelihood that a given payment is fraudulent. Merchants use the riskScore to
     * determine whether to accept, reject, manually review, or submit payments to complementary services
     * for further screening.
     * The riskScore is given as a percentage, and as such it ranges from 0.01 to 100.00. For example,
     * an order with a riskScore of 20.00 has a 20% chance of being fraudulent, while an order with a riskScore of
     * 0.10 has a 0.1% chance of being fraudulent.
     * If your order returns a risk score of –1, the risk score service is not active for your account, please contact Zooz support to activate the service.
     */
    @JsonProperty
    private double riskScore;
    /**
     * Raw authorization code as received from the acquirer.
     */
    @JsonProperty
    private String authorizationCode;
    /**
     * Reference id for the request, received from the processor.
     */
    @JsonProperty
    private String processorReferenceId;
    /**
     * The processor slip Number
     */
    @JsonProperty
    private String slipNumber;
    /**
     * The country from which the user performed the transaction, according to the ipAddress.
     */
    @JsonProperty
    private String country;
    /**
     * Can be one of the following:  Payment ,Refund, Chargeback.
     */
    @JsonProperty
    private String paymentType;

    /**
     * Payment mode (used by Klarna, BillPay, PayEase).
     */
    @JsonProperty
    private String paymentMode;

    /**
     * The MID (Merchant ID) associated to the payment.
     */
    @JsonProperty
    private String merchantId;
    /**
     * The terminal-ID associated to the payment.
     */
    @JsonProperty
    private String terminalId;

    @JsonProperty
    private Map<Object, Object> merchantCustomData;

    /**
     * The provider customer data
     */
    @JsonProperty
    private Map<Object, Object> providerCustomData;

    /**
     * Will return only on decline.
     * Represents the code of the decline.
     */
    @JsonProperty
    private int declineCode;
    /**
     * Will return only on decline.
     * Will be the reason for the decline as given from the issuer, processor, acquirer .
     */
    @JsonProperty
    private String declineReason;
    /**
     * Data sent by the card issuer that indicates the status of authentication.
     */
    @Deprecated
    @JsonProperty
    private String authResult;
    /**
     * The numeric commerce indicator.
     */
    @Deprecated
    @JsonProperty
    private String eci;
    /**
     * Payer Authentication Response status.
     */
    @Deprecated
    @JsonProperty
    private String paresStatus;
    /**
     * Cardholder Authentication Verification Value.
     */
    @Deprecated
    @JsonProperty
    private String cavv;
    /**
     * 3D secure flow status: 0 – Success, 1 - Failure
     */
    @Deprecated
    @JsonProperty
    private int threeDSecureStatus;
    /**
     * 3DS attributes (cavv, xid, eci and encoding)
     */
    @JsonProperty
    private ThreeDSecureAttributes threeDSecureAttributes;
    /**
     * Processor fraud Detection Response
     */
    @JsonProperty
    private Map fraudDetectionResponse;
    /**
     * Authorization avsCode response
     */
    @JsonProperty
    private String avsCode;
    /**
     * List of payment captures.
     */
    @JsonProperty
    private List<FinancialAction> captures;
    /**
     * List of payment refunds.
     */
    @JsonProperty
    private List<RefundFinancialAction> refunds;
    /**
     * The Payment Method
     */
    @JsonProperty
    private FundSource paymentMethod;

    /**
     * The processor response result code
     */
    @JsonProperty
    private Integer processorResultCode;

    @JsonProperty
    private String signature;

    /**
     * The Payment Installments Details
     */
    @JsonProperty
    private PaymentInstallment paymentInstallments;

    /**
     * Unique ID used to reconcile transactions, that was sent/ Received from processor
     * Note that this parameter might be different from "reconciliationId" parameter passed in the request due to processor changes.
     */
    @JsonProperty
    private String reconciliationId;

    /**
     * The risk that was returned by ZooZ Risk Engine
     */
    @JsonProperty
    private Risk risk;

    /**
     * The name of the processor that processes the transaction
     */
    @JsonProperty
    private String processorName;

    /**
     * List of history transaction.
     */
    @JsonProperty
    private List<HistoryTransaction> history;

    /**
     * The mobile device information (device Id, device name and os version)
     */
    @JsonProperty
    private DeviceInformation deviceInformation;

    @JsonProperty
    private ExternalRisk externalRisk;

    /**
     * Instantiates a new Payment details response.
     */
    public PaymentDetailsResponse() {
    }


    /**
     * Gets the app name.
     *
     * @return the app name
     */
    public String getAppName() {
        return appName;
    }

    /**
     * Sets the app name.
     *
     * @param appName the app name
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * gets the ZooZUniqueID (bundleID)
     *
     * @return zoo z unique id
     */
    public String getZooZUniqueID() {
        return ZooZUniqueID;
    }

    /**
     * sets the ZooZUniqueID (bundleID)
     *
     * @param zooZUniqueID the zoo z unique id
     */
    public void setZooZUniqueID(String zooZUniqueID) {
        this.ZooZUniqueID = zooZUniqueID;
    }

    /**
     * gets the Program Id
     *
     * @return program id
     */
    public String getProgramId() {
        return programId;
    }

    /**
     * sets the Program Id
     *
     * @param programId the program id
     */
    public void setProgramId(String programId) {
        this.programId = programId;
    }

    /**
     * Gets the payment id.
     *
     * @return the payment id
     */
    public String getPaymentId() {
        return paymentId;
    }

    /**
     * Sets the payment id.
     *
     * @param paymentId the payment id
     */
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }


    /**
     * Gets the paymentToken as created on openPayment call
     *
     * @return Zooz paymentToken
     */
    public String getPaymentToken() {
        return paymentToken;
    }


    /**
     * Sets the paymentToken (should not be called by client code)
     *
     * @param paymentToken the token to set
     */
    public void setPaymentToken(String paymentToken) {
        this.paymentToken = paymentToken;
    }

    /**
     * Is sandbox.
     *
     * @return the boolean
     */
    public boolean isSandbox() {
        return isSandbox;
    }

    /**
     * Sets the sandbox.
     *
     * @param isSandbox the is sandbox
     */
    public void setSandbox(boolean isSandbox) {
        this.isSandbox = isSandbox;
    }

    /**
     * Gets the payment status.
     *
     * @return the payment status
     */
    public String getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Sets the payment status.
     *
     * @param paymentStatus the payment status
     */
    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    /**
     * Gets the payment status code.
     *
     * @return the payment status code
     */
    public double getPaymentStatusCode() {
        return paymentStatusCode;
    }

    /**
     * Sets the payment status code.
     *
     * @param paymentStatusCode the payment status code
     */
    public void setPaymentStatusCode(double paymentStatusCode) {
        this.paymentStatusCode = paymentStatusCode;
    }

    /**
     * Gets the amount.
     *
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets the amount.
     *
     * @param amount the amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Gets the paid amount.
     *
     * @return the paid amount
     */
    public double getPaidAmount() {
        return paidAmount;
    }

    /**
     * Sets the paid amount.
     *
     * @param paidAmount the paid amount
     */
    public void setPaidAmount(double paidAmount) {
        this.paidAmount = paidAmount;
    }

    /**
     * Gets the refund amount.
     *
     * @return the refund amount
     */
    public double getRefundAmount() {
        return refundAmount;
    }

    /**
     * Sets the refund amount.
     *
     * @param refundAmount the refund amount
     */
    public void setRefundAmount(double refundAmount) {
        this.refundAmount = refundAmount;
    }

    /**
     * Gets the currency code.
     *
     * @return the currency code
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the currency code.
     *
     * @param currencyCode the currency code
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * Gets the tax amount.
     *
     * @return the tax amount
     */
    public double getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the tax amount.
     *
     * @param taxAmount the tax amount
     */
    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    /**
     * Gets the tax percentage.
     *
     * @return the tax percentage
     */
    public double getTaxPercentage() {
        return taxPercentage;
    }

    /**
     * Sets the tax percentage.
     *
     * @param taxPercentage the tax percentage
     */
    public void setTaxPercentage(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }


    /**
     * Gets the zooz fee.
     *
     * @return the zooz fee
     */
    public double getZoozFee() {
        return zoozFee;
    }

    /**
     * Sets the zooz fee.
     *
     * @param zoozFee the zooz fee
     */
    public void setZoozFee(double zoozFee) {
        this.zoozFee = zoozFee;
    }

    /**
     * Gets the payment timestamp.
     *
     * @return the payment timestamp
     */
    public long getPaymentTimestamp() {
        return paymentTimestamp;
    }

    /**
     * Sets the payment timestamp.
     *
     * @param paymentTimestamp the payment timestamp
     */
    public void setPaymentTimestamp(long paymentTimestamp) {
        this.paymentTimestamp = paymentTimestamp;
    }

    /**
     * Gets the customer login iD.
     *
     * @return the customer login iD
     */
    public String getCustomerLoginID() {
        return customerLoginID;
    }

    /**
     * Sets the customer login iD.
     *
     * @param customerLoginID the customer login iD
     */
    public void setCustomerLoginID(String customerLoginID) {
        this.customerLoginID = customerLoginID;
    }

    /**
     * Gets the ip address.
     *
     * @return the ip address
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the ip address.
     *
     * @param ipAddress the ip address
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * Gets the shipping method.
     *
     * @return the shipping method
     */
    public String getShippingMethod() {
        return shippingMethod;
    }

    /**
     * Sets the shipping method.
     *
     * @param shippingMethod the shipping method
     */
    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    /**
     * Gets the shipping amount.
     *
     * @return the shipping amount
     */
    public double getShippingAmount() {
        return shippingAmount;
    }

    /**
     * Sets the shipping amount.
     *
     * @param shippingAmount the shipping amount
     */
    public void setShippingAmount(double shippingAmount) {
        this.shippingAmount = shippingAmount;
    }

    /**
     * Gets the shipping carrier code.
     *
     * @return the shipping carrier code
     */
    public String getShippingCarrierCode() {
        return shippingCarrierCode;
    }

    /**
     * Sets the shipping carrier code.
     *
     * @param shippingCarrierCode the shipping carrier code
     */
    public void setShippingCarrierCode(String shippingCarrierCode) {
        this.shippingCarrierCode = shippingCarrierCode;
    }

    /**
     * Gets the shipping carrier name.
     *
     * @return the shipping carrier name
     */
    public String getShippingCarrierName() {
        return shippingCarrierName;
    }

    /**
     * Sets the shipping carrier name.
     *
     * @param shippingCarrierName the shipping carrier name
     */
    public void setShippingCarrierName(String shippingCarrierName) {
        this.shippingCarrierName = shippingCarrierName;
    }

    /**
     * Gets the user.
     *
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the user.
     *
     * @param user the user
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Gets the invoice.
     *
     * @return the invoice
     */
    public Invoice getInvoice() {
        return invoice;
    }

    /**
     * Sets the invoice.
     *
     * @param invoice the invoice
     */
    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    /**
     * Gets the addresses.
     *
     * @return the addresses
     */
    public Addresses getAddresses() {
        return addresses;
    }

    /**
     * Sets the addresses.
     *
     * @param addresses the addresses
     */
    public void setAddresses(Addresses addresses) {
        this.addresses = addresses;
    }

    /**
     * Gets the risk score.
     *
     * @return the risk score
     */
    public double getRiskScore() {
        return riskScore;
    }

    /**
     * Sets the risk score.
     *
     * @param riskScore the risk score
     */
    public void setRiskScore(double riskScore) {
        this.riskScore = riskScore;
    }

    /**
     * Gets the authorization code.
     *
     * @return the authorization code
     */
    public String getAuthorizationCode() {
        return authorizationCode;
    }

    /**
     * Sets the authorization code.
     *
     * @param authorizationCode the authorization code
     */
    public void setAuthorizationCode(String authorizationCode) {
        this.authorizationCode = authorizationCode;
    }

    /**
     * Gets the processor reference id.
     *
     * @return the processor reference id
     */
    public String getProcessorReferenceId() {
        return processorReferenceId;
    }

    /**
     * Sets the processor reference id.
     *
     * @param processorReferenceId the processor reference id
     */
    public void setProcessorReferenceId(String processorReferenceId) {
        this.processorReferenceId = processorReferenceId;
    }

    /**
     * gets the processor slip number
     *
     * @return slipNumber slip number
     */
    public String getSlipNumber() {
        return slipNumber;
    }

    /**
     * sets the processor slip number
     *
     * @param slipNumber the slip number
     */
    public void setSlipNumber(String slipNumber) {
        this.slipNumber = slipNumber;
    }

    /**
     * Gets the country.
     *
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the country.
     *
     * @param country the country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Gets the payment type.
     *
     * @return the payment type
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the payment type.
     *
     * @param paymentType the payment type
     */
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }


    /**
     * Gets the payment mode (used by Klarna, BillPay, PayEase).
     *
     * @return the payment type
     */
    public String getPaymentMode() {
        return paymentMode;
    }

    /**
     * Sets the payment mode (used by Klarna, BillPay, PayEase).
     *
     * @param paymentMode the payment mode
     */
    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }


    /**
     * Gets the merchant id.
     *
     * @return the merchant id
     */
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * Sets the merchant id.
     *
     * @param merchantId the merchant id
     */
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    /**
     * Gets the terminal id.
     *
     * @return the terminal id
     */
    public String getTerminalId() {
        return terminalId;
    }

    /**
     * Sets the terminal id.
     *
     * @param terminalId the terminal id
     */
    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }


    /**
     * Gets merchant custom data.
     *
     * @return the merchant custom data
     */
    public Map<Object, Object> getMerchantCustomData() {
        return merchantCustomData;
    }

    /**
     * Sets merchant custom data.
     *
     * @param merchantCustomData the merchant custom data
     */
    public void setMerchantCustomData(Map<Object, Object> merchantCustomData) {
        this.merchantCustomData = merchantCustomData;
    }

    /**
     * Gets merchant custom data.
     *
     * @return the provider custom data
     */
    public Map<Object, Object> getProviderCustomData() {
        return providerCustomData;
    }

    /**
     * Sets merchant custom data.
     *
     * @param providerCustomData the provider custom data
     */
    public void setProviderCustomData(Map<Object, Object> providerCustomData) {
        this.providerCustomData = providerCustomData;
    }

    /**
     * Gets the decline code.
     *
     * @return the decline code
     */
    public int getDeclineCode() {
        return declineCode;
    }

    /**
     * Sets the decline code.
     *
     * @param declineCode the decline code
     */
    public void setDeclineCode(int declineCode) {
        this.declineCode = declineCode;
    }

    /**
     * Gets the decline reason.
     *
     * @return the decline reason
     */
    public String getDeclineReason() {
        return declineReason;
    }

    /**
     * Sets the decline reason.
     *
     * @param declineReason the decline reason
     */
    public void setDeclineReason(String declineReason) {
        this.declineReason = declineReason;
    }

    /**
     * Gets the auth result.
     *
     * @return the auth result
     */
    @Deprecated
    public String getAuthResult() {
        return authResult;
    }

    /**
     * Sets the auth result.
     *
     * @param authResult the auth result
     */
    @Deprecated
    public void setAuthResult(String authResult) {
        this.authResult = authResult;
    }

    /**
     * Gets the eci.
     *
     * @return the eci
     */
    @Deprecated
    public String getEci() {
        return eci;
    }

    /**
     * Sets the eci.
     *
     * @param eci the eci
     */
    @Deprecated
    public void setEci(String eci) {
        this.eci = eci;
    }

    /**
     * Gets the pares status.
     *
     * @return the pares status
     */
    @Deprecated
    public String getParesStatus() {
        return paresStatus;
    }

    /**
     * Sets the pares status.
     *
     * @param paresStatus the pares status
     */
    @Deprecated
    public void setParesStatus(String paresStatus) {
        this.paresStatus = paresStatus;
    }

    /**
     * Gets the cavv.
     *
     * @return the cavv
     */
    @Deprecated
    public String getCavv() {
        return cavv;
    }

    /**
     * Sets the cavv.
     *
     * @param cavv the cavv
     */
    @Deprecated
    public void setCavv(String cavv) {
        this.cavv = cavv;
    }

    /**
     * Gets the three d secure status.
     *
     * @return the three d secure status
     */
    @Deprecated
    public int getThreeDSecureStatus() {
        return threeDSecureStatus;
    }

    /**
     * Sets the three d secure status.
     *
     * @param threeDSecureStatus the three d secure status
     */
    @Deprecated
    public void setThreeDSecureStatus(int threeDSecureStatus) {
        this.threeDSecureStatus = threeDSecureStatus;
    }

    /**
     * Gets the fraud detection response.
     *
     * @return the fraud detection response
     */
    public Map getFraudDetectionResponse() {
        return fraudDetectionResponse;
    }

    /**
     * Sets the fraud detection response.
     *
     * @param fraudDetectionResponse the fraud detection response
     */
    public void setFraudDetectionResponse(Map fraudDetectionResponse) {
        this.fraudDetectionResponse = fraudDetectionResponse;
    }


    /**
     * Gets the avs code.
     *
     * @return the avs code
     */
    public String getAvsCode() {
        return avsCode;
    }

    /**
     * Sets the avs code.
     *
     * @param avsCode the avs code
     */
    public void setAvsCode(String avsCode) {
        this.avsCode = avsCode;
    }

    /**
     * Gets the captures.
     *
     * @return the captures
     */
    public List<FinancialAction> getCaptures() {
        return captures;
    }

    /**
     * Sets the captures.
     *
     * @param captures the captures
     */
    public void setCaptures(List<FinancialAction> captures) {
        this.captures = captures;
    }

    /**
     * Gets the refunds.
     *
     * @return the refunds
     */
    public List<RefundFinancialAction> getRefunds() {
        return refunds;
    }

    /**
     * Sets the refunds.
     *
     * @param refunds the refunds
     */
    public void setRefunds(List<RefundFinancialAction> refunds) {
        this.refunds = refunds;
    }

    /**
     * Gets the payment method.
     *
     * @return the payment method
     */
    public FundSource getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the payment method.
     *
     * @param paymentMethod the payment method
     */
    public void setPaymentMethod(FundSource paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    /**
     * Gets the processor result code.
     *
     * @return the processor result code
     */
    public Integer getProcessorResultCode() {
        return processorResultCode;
    }

    /**
     * Sets the processor result code.
     *
     * @param processorResultCode the processor result code
     */
    public void setProcessorResultCode(Integer processorResultCode) {
        this.processorResultCode = processorResultCode;
    }

    /**
     * Gets the payment installments details.
     *
     * @return the payment installments details
     */
    public PaymentInstallment getPaymentInstallments() {
        return paymentInstallments;
    }

    /**
     * Sets the payment installments details.
     *
     * @param paymentInstallments the payment installment
     */
    public void setPaymentInstallments(PaymentInstallment paymentInstallments) {
        this.paymentInstallments = paymentInstallments;
    }

    /**
     * get the ipn signature
     *
     * @return signature
     */
    public String getSignature() {
        return signature;
    }

    /**
     * set the ipn signature
     *
     * @param signature the signature
     */
    public void setSignature(String signature) {
        this.signature = signature;
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

    /**
     * Gets the name of the processor that processes the transaction
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

    /**
     * Gets the historyList - the list of history transactions
     *
     * @return the history list - the list of history transactions
     */
    public List<HistoryTransaction> getHistory() {
        return history;
    }

    /**
     * Sets the history - the list of history transactions
     *
     * @param history - the list of history transactions
     */
    public void setHistory(List<HistoryTransaction> history) {
        this.history = history;
    }


    /**
     * Gets mobile device information
     *
     * @return Mobile device information (mobile device Id, mobile device name, os version)
     */
    public DeviceInformation getDeviceInformation() {
        return deviceInformation;
    }

    /**
     * Sets the mobile device information
     *
     * @param mobileDevice Mobile device information
     */
    public void setDeviceInformation(DeviceInformation mobileDevice) {
        this.deviceInformation = mobileDevice;
    }

    /**
     * gets the three d secure attributes
     *
     * @return three d secure attributes (xid, cavv, eci, encoding)
     */
    public ThreeDSecureAttributes getThreeDSecureAttributes() {
        return threeDSecureAttributes;
    }

    /**
     * Sets the three d secure attributes
     *
     * @param threeDSecureAttributes three d secure attributes (xid, cavv, eci, encoding)
     */
    public void setThreeDSecureAttributes(ThreeDSecureAttributes threeDSecureAttributes) {
        this.threeDSecureAttributes = threeDSecureAttributes;
    }

    /**
     * gets the external Risk parameters
     *
     * @return external Risk parameters
     */
    public ExternalRisk getExternalRisk() {
        return externalRisk;
    }

    /**
     * Sets the external Risk parameters
     * * @param ExternalRisk all the external Risk Parameters
     *
     * @param externalRisk the external risk
     */
    public void setExternalRisk(ExternalRisk externalRisk) {
        this.externalRisk = externalRisk;
    }

    @Override
    public NotificationType getIPNType() {
        return NotificationType.PaymentIPN;
    }
}

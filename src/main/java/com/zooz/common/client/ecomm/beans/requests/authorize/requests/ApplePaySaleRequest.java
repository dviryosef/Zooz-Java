package com.zooz.common.client.ecomm.beans.requests.authorize.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.zooz.common.client.ecomm.beans.Invoice;
import com.zooz.common.client.ecomm.beans.PaymentMethod;
import com.zooz.common.client.ecomm.beans.enums.PaymentMethodType;
import com.zooz.common.client.ecomm.beans.responses.AuthorizeResponse;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;

/**
 * Created by Alex on 3/4/15.
 */
public class ApplePaySaleRequest extends AbstractSaleRequest {

    /**
     * Instantiates a new Apple pay sale request. Use this constructor to perform an Apple pay sale request using encrypted apple pay data.
     *
     * @param paymentToken the payment token
     * @param ipAddress the ip address
     * @param amount the amount
     * @param invoice the invoice
     * @param reconciliationId the reconciliation id
     * @param emailAddress the email address
     * @param uniqueTransactionID the unique transaction iD
     * @param paymentInstrumentName the payment instrument name
     * @param paymentNetwork the payment network
     * @param transactionIdentifier the transaction identifier
     * @param data the data
     * @param applicationData the application data
     * @param ephemeralPublicKey the ephemeral public key
     * @param publicKeyHash the public key hash
     * @param transactionId the transaction id
     * @param signature the signature
     * @param version the version
     */
    public ApplePaySaleRequest(String paymentToken, String ipAddress, Double amount, Invoice invoice, String reconciliationId, String emailAddress, String uniqueTransactionID, String paymentInstrumentName,
                               String paymentNetwork, String transactionIdentifier, String data, String applicationData, String ephemeralPublicKey,
                               String publicKeyHash, String transactionId, String signature, String version) {
        super(paymentToken, ipAddress, new PaymentMethod(PaymentMethodType.ApplePayEncrypted, paymentInstrumentName, paymentNetwork, transactionIdentifier, data,
                applicationData, ephemeralPublicKey, publicKeyHash, transactionId, signature, version), amount, invoice, reconciliationId, emailAddress, uniqueTransactionID);
    }

    /**
     * Instantiates a new Apple pay sale request. Use this constructor to perform an Apple pay sale request using decrypted apple pay data.
     *
     * @param paymentToken the payment token
     * @param ipAddress the ip address
     * @param amount the amount
     * @param invoice the invoice
     * @param reconciliationId the reconciliation id
     * @param emailAddress the email address
     * @param uniqueTransactionID the unique transaction iD
     * @param paymentInstrumentName the payment instrument name
     * @param paymentNetwork the payment network
     * @param transactionIdentifier the transaction identifier
     * @param applicationPrimaryAccountNumber the application primary account number
     * @param applicationExpirationDate the application expiration date
     * @param currencyCode the currency code
     * @param transactionAmount the transaction amount
     * @param cardholderName the cardholder name
     * @param deviceManufacturerIdentifier the device manufacturer identifier
     * @param paymentDataType the payment data type
     * @param onlinePaymentCryptogram the online payment cryptogram
     * @param eciIndicator the eci indicator
     */
    public ApplePaySaleRequest(String paymentToken, String ipAddress, Double amount, Invoice invoice, String reconciliationId, String emailAddress, String uniqueTransactionID, String paymentInstrumentName,
                               String paymentNetwork, String transactionIdentifier, String applicationPrimaryAccountNumber, String applicationExpirationDate,
                               String currencyCode, String transactionAmount, String cardholderName, String deviceManufacturerIdentifier, String paymentDataType,
                               String onlinePaymentCryptogram, String eciIndicator) {
        super(paymentToken, ipAddress, new PaymentMethod(PaymentMethodType.ApplePay, paymentInstrumentName, paymentNetwork, transactionIdentifier, applicationPrimaryAccountNumber, applicationExpirationDate,
                currencyCode, transactionAmount, cardholderName, deviceManufacturerIdentifier, paymentDataType, onlinePaymentCryptogram, eciIndicator), amount, invoice, reconciliationId, emailAddress, uniqueTransactionID);
    }

    /**
     * Used to return the response type corresponding to the request.
     *
     * @return the corresponding response type.
     */
    @Override
    @JsonIgnore
    public TypeReference<ZoozServerResponse<AuthorizeResponse>> getResponseTypeReference() {
        return new TypeReference<ZoozServerResponse<AuthorizeResponse>>() {
        };
    }
}

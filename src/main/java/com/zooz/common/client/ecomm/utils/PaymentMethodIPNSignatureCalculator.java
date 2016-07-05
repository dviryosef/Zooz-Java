package com.zooz.common.client.ecomm.utils;

import java.util.TreeMap;

/**
 * Utility class for calculating a Payment Method IPN authentication signature.
 * The calculated signature is the one that is found on the 'signature' attribute of a JSON IPN.
 *
 * IPN authentication signature is support on Payment Method IPN version 0.0.0 or later.
 */
public class PaymentMethodIPNSignatureCalculator extends IPNSignatureCalculator {


    public static final String PROGRAM_ID = "programId";
    public static final String CUSTOMER_LOGIN_ID = "customerLoginID";
    public static final String PAYMENT_METHOD_TOKEN = "paymentMethodToken";
    public static final String PAYMENT_METHOD_LAST_USED_TIMESTAMP = "paymentMethodLastUsedTimestamp";
    public static final String MERCHANT_SERVER_API_KEY = "merchantServerApiKey";
    private final String programId;
    private final String customerLoginID;
    private final String paymentMethodToken;
    private final String paymentMethodLastUsed;
    private final String merchantServerApiKey;

    /**
     * Creates an instance using explicit passing of parameters.
     *
     * @param programId             the program id
     * @param customerLoginID       the customer login id using the payment method
     * @param paymentMethodToken    the payment method token
     * @param paymentMethodLastUsed the last used date of the payment method
     * @param merchantServerApiKey  the merchant server api key
     */
    public PaymentMethodIPNSignatureCalculator(String programId,
                                               String customerLoginID,
                                               String paymentMethodToken,
                                               String paymentMethodLastUsed,
                                               String merchantServerApiKey) {

        this.programId = programId;
        this.customerLoginID = customerLoginID;
        this.paymentMethodToken = paymentMethodToken;
        this.paymentMethodLastUsed = paymentMethodLastUsed;
        this.merchantServerApiKey = merchantServerApiKey;
    }

    /**
     * Calculates a hash using SHA-256 as the IPN authentication code using the parameters passed
     * in the C'tor.
     *
     * @return the hashed string
     * @throws Exception in case sha-256 hashing has encountered a problem.
     */
    public String getSignature() throws Exception {
        TreeMap<String, String> valuesMap = new TreeMap<String, String>();

        valuesMap.put(PROGRAM_ID, programId);
        valuesMap.put(CUSTOMER_LOGIN_ID, customerLoginID);
        valuesMap.put(PAYMENT_METHOD_TOKEN, paymentMethodToken);
        if (paymentMethodLastUsed != null) {
            valuesMap.put(PAYMENT_METHOD_LAST_USED_TIMESTAMP, paymentMethodLastUsed);
        }
        valuesMap.put(MERCHANT_SERVER_API_KEY, merchantServerApiKey);

        return hashStringMap(valuesMap);
    }
}

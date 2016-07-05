package com.zooz.common.client.ecomm.utils;

import java.util.TreeMap;

/**
 * Utility class for calculating a Payment IPN authentication signature.
 * The calculated signature is the one that is found on the 'signature' attribute of a JSON IPN.
 *
 * IPN authentication signature is support on Payment IPN version 2.0.0 or later.
 */
public class PaymentIPNSignatureCalculator extends IPNSignatureCalculator {

    private double amount;
    private String paymentId;
    private Long   paymentMethodLastUsedTimestamp;
    private String paymentMethodToken;
    private String processorReferenceId;
    private String merchantServerApiKey;

    private static final String AMOUNT_ATTRIBUTE = "amount";
    private static final String PAYMENT_ID_ATTRIBUTE = "paymentId";
    private static final String PAYMENT_METHOD_LAST_USED_TIMESTAMP_ATTRIBUTE = "paymentMethodLastUsedTimestamp";
    private static final String PAYMENT_METHOD_TOKEN = "paymentMethodToken";
    private static final String PROCESSOR_REFERENCE_ID = "processorReferenceId";
    private static final String MERCHANT_SERVER_API_KEY = "merchantServerApiKey";

    /**
     * Creates an instance using explicit passing of parameters.
     *
     * @param amount                         the amount of the IPN
     * @param paymentId                      the payment Id of the IPN
     * @param paymentMethodLastUsedTimestamp the Last Used Timestamp payment method on the IPN
     * @param paymentMethodToken             the payment Method Token of the IPN
     * @param processorReferenceId           the processor ReferenceId of the IPN
     * @param merchantServerApiKey           the account's server API-key
     */
    public PaymentIPNSignatureCalculator(double amount, String paymentId, Long paymentMethodLastUsedTimestamp,
                                         String paymentMethodToken, String processorReferenceId, String merchantServerApiKey) {
        this.amount = amount;
        this.paymentId = paymentId;
        this.paymentMethodLastUsedTimestamp = paymentMethodLastUsedTimestamp;
        this.paymentMethodToken = paymentMethodToken;
        this.processorReferenceId = processorReferenceId;
        this.merchantServerApiKey = merchantServerApiKey;
    }

    @Override
    public String toString() {
        return "IPNHashCodeCalculator{" +
                "amount='" + amount + '\'' +
                ", paymentId='" + paymentId + '\'' +
                ", paymentMethodLastUsedTimestamp='" + paymentMethodLastUsedTimestamp + '\'' +
                ", paymentMethodToken='" + paymentMethodToken + '\'' +
                ", processorReferenceId='" + processorReferenceId + '\'' +
                ", merchantServerApiKey='" + merchantServerApiKey + '\'' +
                '}';
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

        valuesMap.put(AMOUNT_ATTRIBUTE, String.format("%.2f", amount));
        valuesMap.put(PAYMENT_ID_ATTRIBUTE, paymentId);

        if (paymentMethodLastUsedTimestamp != null) {
            valuesMap.put(PAYMENT_METHOD_LAST_USED_TIMESTAMP_ATTRIBUTE, paymentMethodLastUsedTimestamp.toString());
        }

        valuesMap.put(PAYMENT_METHOD_TOKEN, paymentMethodToken);
        valuesMap.put(PROCESSOR_REFERENCE_ID, processorReferenceId);
        valuesMap.put(MERCHANT_SERVER_API_KEY, merchantServerApiKey);

        return hashStringMap(valuesMap);
    }
}

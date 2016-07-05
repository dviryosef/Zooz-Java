package com.zooz.common.client.ecomm.utils;

import java.util.Map;

/**
 * Utility class for calculating an IPN authentication signature.
 * The calculated signature is the one that is found on the 'signature' attribute of a JSON IPN.
 *
 */
public abstract class IPNSignatureCalculator {

    /**
     * Creates an instance
     */
    public IPNSignatureCalculator() {
    }


    /**
     * Calculates a hash using SHA-256 as the IPN authentication code using the parameters passed
     * in the C'tor.
     *
     * @return the hashed string
     * @throws Exception in case sha-256 hashing has encountered a problem.
     */
    public abstract String getSignature() throws Exception;

    /**
     * Calculate a SHA-256 hash using a map of strings.
     * The string values in the map are concatenated by the order of the map's entrySet.
     * If you use this method, make sure the map you pass is one that sorts the keys alphabetically.
     *
     * @param valuesMap a map of string values that sorts its keys alphabetically
     * @return a SHA-256 hash of the concatenation of all values.
     * @throws Exception in case sha-256 hashing has encountered a problem.
     */
    public final static String hashStringMap(Map<String, String> valuesMap) throws Exception {

        StringBuilder strBuilder = new StringBuilder();

        for (Map.Entry<String, String> entry : valuesMap.entrySet()) {
            strBuilder.append((entry.getValue() != null ? entry.getValue() : ""));
        }

        return ChecksumUtils.sha256(strBuilder.toString());
    }
}

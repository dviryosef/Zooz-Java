package com.zooz.common.client.ecomm.utils;

import java.util.UUID;

/**
 * This class generates a unique transaction ID for each transaction.
 */
public class UniqueTransactionId {
    
    /**
     * Generates a unique transaction ID
     * @return UniqueTransactionId
     */
    public static String generateId() {
        UUID uniqueTransactionId = UUID.randomUUID();
        return uniqueTransactionId.toString();
    }

}

/*
 * The information in this document is proprietary
 *  to TactusMobile and the TactusMobile Product Development.
 *  It may not be used, reproduced or disclosed without
 *  the written approval of the General Manager of
 *  TactusMobile Product Development.
 *
 *  PRIVILEGED AND CONFIDENTIAL
 *  TACTUS MOBILE PROPRIETARY INFORMATION
 *  REGISTRY SENSITIVE INFORMATION
 *
 *  Copyright (c) 2010 TactusMobile, Inc.  All rights reserved.
 */

package com.zooz.common.client.ecomm.utils;

import java.security.MessageDigest;

/**
 * User: Eyal Kotler
 * Date: Feb 27, 2013
 * Time: 5:26:08 PM
 */
public class ChecksumUtils {


    public static String sha256(String base) throws Exception {

        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(base.getBytes());
        StringBuffer hexString = new StringBuffer();

        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }

        return hexString.toString();
    }

}

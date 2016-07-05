package com.zooz.common.client.ecomm.beans.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Created by yaelmasri on 2/7/16.
 *
 * AvaTaxLocal function - provides the ability to control whether a tax is calculated locally or AvaTax web service.
 * The default is Automatic which calculates locally unless a remote connection is necessary for “send sales”
 * not configured at the local server level.
 *
 * The optional values are:
 * Automatic
 * Local
 * Remote
 */
public enum ServiceMode {
    Automatic, Local, Remote;

    @JsonCreator
    public static ServiceMode fromValue(String value) {
        return EnumCaseInsensitive.getEnumFromString(ServiceMode.class, value);
    }

    @JsonValue
    public String toJson() {
        return name().toLowerCase();
    }

}
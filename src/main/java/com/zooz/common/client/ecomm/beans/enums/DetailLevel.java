package com.zooz.common.client.ecomm.beans.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Created by yaelmasri on 2/7/16.
 *
 * This class specifies the level of detail to return.
 * The optional values are:
 * Summary - summarizes document and jurisdiction detail with no line breakout
 * Document - only document detail
 * Line - document and line detail
 * Tax - document, line and jurisdiction detail
 */
public enum DetailLevel {
    Tax, Document, Line, Diagnostic;

    @JsonCreator
    public static DetailLevel fromValue(String value){
        return EnumCaseInsensitive.getEnumFromString(DetailLevel.class, value);
    }

    @JsonValue
    public String toJson(){
        return name().toLowerCase();
    }


}
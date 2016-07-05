package com.zooz.common.client.ecomm.beans.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Created by yaelmasri on 3/29/16.
 *
 * This class represent the Jurisdiction Type. One of: Country, Composite, State, County, City, Special.
 */
public enum JurisdictionType {
    Composite, Country, State, County, City, Special;

    @JsonCreator
    public static JurisdictionType fromValue(String value){
        return EnumCaseInsensitive.getEnumFromString(JurisdictionType.class, value);
    }

    @JsonValue
    public String toJson(){
        return name().toLowerCase();
    }
}

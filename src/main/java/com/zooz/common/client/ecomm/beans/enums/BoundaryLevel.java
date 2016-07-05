package com.zooz.common.client.ecomm.beans.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Created by yaelmasri on 2/28/16.
 * This class represent the level of jurisdiction boundary precision used for the tax calculation.
 */
public enum BoundaryLevel {
    Address, Zip9, Zip5;

    @JsonCreator
    public static BoundaryLevel fromValue(String value){
        return EnumCaseInsensitive.getEnumFromString(BoundaryLevel.class, value);
    }

    @JsonValue
    public String toJson(){
        return name().toLowerCase();
    }




}

package com.zooz.common.client.ecomm.beans.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Represent the taxType in the TaxDetail
 */
public enum TaxType {
    Sales, Use, ConsumerUse, Output, Input, Nonrecoverable, Fee, Rental, Excise,;

    @JsonCreator
      public static TaxType fromValue(String value){
    return EnumCaseInsensitive.getEnumFromString(TaxType.class, value);
}

    @JsonValue
    public String toJson(){
        return name().toLowerCase();
    }

}

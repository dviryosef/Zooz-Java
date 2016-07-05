package com.zooz.common.client.ecomm.beans.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Created by yaelmasri on 2/28/16.
 */
public enum AccountingMethod {
    Accrual, Cash;

    @JsonCreator
    public static AccountingMethod fromValue(String value){
        return EnumCaseInsensitive.getEnumFromString(AccountingMethod.class, value);
    }

    @JsonValue
    public String toJson(){
        return name().toLowerCase();
    }




}

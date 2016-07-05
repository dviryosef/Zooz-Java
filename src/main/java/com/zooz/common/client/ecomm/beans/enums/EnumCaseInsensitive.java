package com.zooz.common.client.ecomm.beans.enums;

/**
 * Created by yaelmasri on 3/2/16.
 *
 * This class is a util for making an enum being case insensitive
 */
public class EnumCaseInsensitive {


    public static <T extends  Enum<T>> T getEnumFromString(Class<T> enumClass, String value){
        if(enumClass == null) {
            throw  new IllegalArgumentException("enumClass can't be null.");
        }
        if(value == null){
            return null;
        }
        for(Enum<?> enumValue : enumClass.getEnumConstants()){
            if(enumValue.toString().equalsIgnoreCase(value)){
                return (T) enumValue;
            }
        }
        StringBuilder supportedValues = new StringBuilder();
        boolean bFirstTime = true;

        for(Enum<?> enumValue : enumClass.getEnumConstants()){
            supportedValues.append(bFirstTime ? "" : ", ").append(enumValue);
            bFirstTime = false;
        }
        throw new IllegalArgumentException(value + "is invalid value. Supported values are " +  supportedValues);
    }
}

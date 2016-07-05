package com.zooz.common.client.ecomm.beans;

import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * The type Abstract json bean.
 */
public abstract class AbstractJsonBean {

    @Override
    public String toString() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(this);
        } catch (Exception e) {
            return "Error occurred in toString of Request object" + e.getMessage();
        }
    }
}

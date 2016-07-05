package com.zooz.common.client.ecomm.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Alex on 3/15/15.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class AbstractPaymentMethodDetails extends AbstractJsonBean {
}

package com.zooz.common.client.ecomm.beans.client.beans;

import com.zooz.common.client.ecomm.beans.addpaymentmethod.beans.AbstractConfiguration;

public class ClientConfiguration extends AbstractConfiguration {

    public ClientConfiguration(boolean rememberPaymentMethod) {
        super(rememberPaymentMethod);
    }

    public ClientConfiguration() {
    }
}

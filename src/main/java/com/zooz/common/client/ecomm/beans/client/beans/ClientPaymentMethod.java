package com.zooz.common.client.ecomm.beans.client.beans;

import com.zooz.common.client.ecomm.beans.addpaymentmethod.beans.AbstractPaymentMethod;

/**
 * The type Client payment method.
 *
 * @author roykey
 */
public class ClientPaymentMethod extends AbstractPaymentMethod {


	/**
	 * Instantiates a new Client payment method.
	 *
	 * @param paymentMethodDetails  the payment method details
	 * @param rememberPaymentMethod the remember payment method
	 *
	 * @deprecated paymentMethodType should be a parameter, instead of hardcoded "CreditCard" replaced by ClientPaymentMethod(ClientPaymentMethodDetails paymentMethodDetails, boolean rememberPaymentMethod, String paymentMethodType)
	 */
	@Deprecated
	public ClientPaymentMethod(ClientPaymentMethodDetails paymentMethodDetails, boolean rememberPaymentMethod) {
		super(new ClientConfiguration(rememberPaymentMethod),paymentMethodDetails,"CreditCard");
	}

	/**
	 * Instantiated a new ClientPaymentMethod method
	 *
	 * @param paymentMethodDetails  the payment method details
	 * @param rememberPaymentMethod the remember payment method
	 * @param paymentMethodType     the payment method type
	 */
	public ClientPaymentMethod(ClientPaymentMethodDetails paymentMethodDetails, boolean rememberPaymentMethod, String paymentMethodType) {
		super(new ClientConfiguration(rememberPaymentMethod),paymentMethodDetails,paymentMethodType);
	}

	/**
	 * Instantiates a new Client payment method.
	 */
	public ClientPaymentMethod() {
    }
}

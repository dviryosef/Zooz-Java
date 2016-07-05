package com.zooz.common.client.ecomm.beans.addpaymentmethod.beans.server;

import com.zooz.common.client.ecomm.beans.addpaymentmethod.beans.AbstractPaymentMethod;

/**
 * The type Server payment method.
 *
 * @author roykey
 */
public class ServerPaymentMethod extends AbstractPaymentMethod {

	/**
	 * Instantiates a new Server payment method.
	 *
	 * @param paymentMethodDetails the payment method details
	 * @param serverConfiguration  the server configuration
	 *
	 * @deprecated paymentMethodType should be a parameter, instead of hardcoded "CreditCard" replaced by {@link #ServerPaymentMethod(ServerPaymentMethodDetails paymentMethodDetails, ServerConfiguration serverConfiguration, String paymentMethodType)}
	 */
	@Deprecated
	public ServerPaymentMethod(ServerPaymentMethodDetails paymentMethodDetails, ServerConfiguration serverConfiguration) {
		super(serverConfiguration ,paymentMethodDetails,"CreditCard");
	}

	/**
	 * Instantiates a new Server payment method.
	 *
	 * @param paymentMethodDetails the payment method details
	 * @param serverConfiguration  the server configuration
	 * @param paymentMethodType    the payment method type - "CreditCard" / "PayPal"
	 */
	public ServerPaymentMethod(ServerPaymentMethodDetails paymentMethodDetails, ServerConfiguration serverConfiguration, String paymentMethodType) {
		super(serverConfiguration ,paymentMethodDetails,paymentMethodType);
	}

	/**
	 * Instantiates a new Server payment method.
	 */
	public ServerPaymentMethod() {
    }
}

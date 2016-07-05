package com.zooz.common.client.ecomm.utils;

import com.zooz.common.client.ecomm.beans.responses.PaymentDetailsResponse;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by roykey on 11/5/15.
 */
public class PaymentDetailsSignatureCalculatorTest {

    private static final String EXPECTED_SIGNATURE = "5bfcf5d45cf11785f32901b3aa94817942bc58123c2f44fbcbcd3a202adec4fa";
    private static final String MERCHANT_SECRET_KEY = "RFVLSDLWPMSMSHG3TFNOVGLOVD";

    @Test
    public void paymentMethodIsNull() throws Exception {

        PaymentDetailsResponse paymentDetailsResponse = new PaymentDetailsResponse();

        paymentDetailsResponse.setAmount(10);
        paymentDetailsResponse.setPaymentId("12345");
        paymentDetailsResponse.setProcessorReferenceId("12345");

        PaymentDetailsSignatureCalculator paymentDetailsSignatureCalculator = new PaymentDetailsSignatureCalculator(paymentDetailsResponse, MERCHANT_SECRET_KEY);

        String actualSignature = paymentDetailsSignatureCalculator.getSignature();

        Assert.assertEquals("Signatures aren't equals", EXPECTED_SIGNATURE, actualSignature);

    }

    @Test(expected = NullPointerException.class)
    public void paymentDetailsResponseIsNull(){

        PaymentDetailsResponse paymentDetailsResponse = null;
        PaymentDetailsSignatureCalculator paymentDetailsSignatureCalculator = new PaymentDetailsSignatureCalculator(paymentDetailsResponse, MERCHANT_SECRET_KEY);

    }
}

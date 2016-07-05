package com.zooz.common.client.ecomm.beans;

/**
 * Created by Alex on 3/15/15.
 */
public class ApplePayPaymentData extends AbstractJsonBean {

    private String onlinePaymentCryptogram;
    private String eciIndicator;

    /**
     * Instantiates a new Apple pay payment data.
     *
     * @param onlinePaymentCryptogram the online payment cryptogram
     * @param eciIndicator the eci indicator
     */
    public ApplePayPaymentData(String onlinePaymentCryptogram, String eciIndicator){
        this.onlinePaymentCryptogram = onlinePaymentCryptogram;
        this.eciIndicator = eciIndicator;
    }

    /**
     * Gets online payment cryptogram.
     *
     * @return the online payment cryptogram
     */
    public String getOnlinePaymentCryptogram() {
        return onlinePaymentCryptogram;
    }

    /**
     * Sets online payment cryptogram.
     *
     * @param onlinePaymentCryptogram the online payment cryptogram
     */
    public void setOnlinePaymentCryptogram(String onlinePaymentCryptogram) {
        this.onlinePaymentCryptogram = onlinePaymentCryptogram;
    }

    /**
     * Gets eci indicator.
     *
     * @return the eci indicator
     */
    public String getEciIndicator() {
        return eciIndicator;
    }

    /**
     * Sets eci indicator.
     *
     * @param eciIndicator the eci indicator
     */
    public void setEciIndicator(String eciIndicator) {
        this.eciIndicator = eciIndicator;
    }
}

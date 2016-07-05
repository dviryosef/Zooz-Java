package com.zooz.common.client.ecomm.beans;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by meytals on 31/12/2015.
 *
 * ThreeDSecureAttributes represents the attributes that were sent from the merchant.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ThreeDSecureAttributes {


    @JsonProperty
    private String xid;

    @JsonProperty
    private String cavv;

    @JsonProperty
    private String eciFlag;

    @JsonProperty
    private String encoding;

    public String getXid() {
        return xid;
    }

    public ThreeDSecureAttributes() {
    }

    public ThreeDSecureAttributes(String xid, String cavv, String eciFlag, String encoding) {
        this.xid = xid;
        this.cavv = cavv;
        this.eciFlag = eciFlag;
        this.encoding = encoding;
    }

    public void setXid(String xid) {
        this.xid = xid;
    }

    public String getCavv() {
        return cavv;
    }

    public void setCavv(String cavv) {
        this.cavv = cavv;
    }

    public String getEciFlag() {
        return eciFlag;
    }

    public void setEciFlag(String eciFlag) {
        this.eciFlag = eciFlag;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }
}

package com.zooz.common.client.ecomm.beans;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by idantovi on 19/01/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeviceInformation {

    @JsonIgnore
    private final String DEVICE_ID = "id";
    @JsonIgnore
    private final String DEVICE_NAME = "name";
    @JsonIgnore
    private final String OS_VERSION = "osVersion";

    /**
     * The mobile device Id in ZooZ
     */
    @JsonProperty (DEVICE_ID)
    private Integer id;

    /**
     * The mobile device name
     */
    @JsonProperty (DEVICE_NAME)
    private String name;

    /**
     * The mobile device OS version
     */
    @JsonProperty (OS_VERSION)
    private String osVersion;

    //for the json parser
    public DeviceInformation() { }

    /**
     * Gets the mobile device ID in ZooZ
     * @return the mobile device ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the mobile device ID
     * @param mobileDeviceId mobile device ID
     */
    public void setId(Integer mobileDeviceId) {
        this.id = mobileDeviceId;
    }

    /**
     * Gets the mobile device name
     * @return mobile device name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the mobile device name
     * @param mobileDeviceName mobile device name
     */
    public void setName(String mobileDeviceName) {
        this.name = mobileDeviceName;
    }

    /**
     * Gets the mobile device OS version
     * @return mobile device OS version
     */
    public String getOsVersion() {
        return osVersion;
    }

    /**
     * Sets the mobile device OS version
     * @param mobileDeviceOsVersion OS version
     */
    public void setOsVersion(String mobileDeviceOsVersion) {
        this.osVersion = mobileDeviceOsVersion;
    }

}

package com.zooz.common.client.ecomm.beans.tax.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zooz.common.client.ecomm.beans.AbstractJsonBean;

/**
 * Input property of GetTaxRequest representing addresses needed for tax calculations.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetTaxRequestAddress extends AbstractJsonBean {

    //Address can be determined for tax calculation by Line1, City, Region, PostalCode, Country OR Latitude/Longitude OR TaxRegionId

    /**
     * Required. Reference code uniquely identifying this address instance.
     */
    @JsonProperty
    private String addressCode;

    /**
     * Address line 1, required if Latitude and Longitude are not provided.
     */
    @JsonProperty
    private String line1;

    /**
     * Optional. Address line 2
     */
    @JsonProperty
    private String line2;

    /**
     * Optional. Address line 3
     */
    @JsonProperty
    private String line3;

    /**
     * City name, required unless PostalCode is specified and/or Latitude and Longitude are provided.
     */
    @JsonProperty
    private String city;

    /**
     * State, province, or region name. Required unless City is specified and/or Latitude and Longitude are provided.
     */
    @JsonProperty
    private String region;

    /**
     *  optional unless City and Region are not specified
     */
    @JsonProperty
    private String postalCode;

    /**
     * Country code. If not provided, will default to “US”.
     */
    @JsonProperty
    private String country;

    /**
     * Optional. Geographic latitude. If Latitude is defined, it is expected that the longitude field will also be provided.
     * Failure to do so will result in operation error.
     */
    @JsonProperty
    private String latitude;

    /**
     * Optional. Geographic longitude. If Longitude is defined, it is expected that the latitude field will also be provided.
     * Fail to do so will result in operation error.
     */
    @JsonProperty
    private String longitude;

    /**
     * Optional. AvaTax tax region identifier. If a non-zero value is entered into TaxRegionId, other fields will be ignored
     */
    @JsonProperty
    private int taxRegionId;

    public GetTaxRequestAddress(String addressCode, String line1, String line2, String line3, String city, String region, String postalCode, String country, String latitude, String longitude, int taxRegionId) {
        this.addressCode = addressCode;
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
        this.city = city;
        this.region = region;
        this.postalCode = postalCode;
        this.country = country;
        this.latitude = latitude;
        this.longitude = longitude;
        this.taxRegionId = taxRegionId;
    }

    public GetTaxRequestAddress(){

    }


    public String getAddressCode() {
        return addressCode;
    }

    public void setAddressCode(String addressCode) {
        this.addressCode = addressCode;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getLine3() {
        return line3;
    }

    public void setLine3(String line3) {
        this.line3 = line3;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public int getTaxRegionId() {
        return taxRegionId;
    }

    public void setTaxRegionId(int taxRegionId) {
        this.taxRegionId = taxRegionId;
    }
}

package com.zooz.common.client.ecomm.beans.tax.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zooz.common.client.ecomm.beans.AbstractJsonBean;

import java.math.BigDecimal;

/**
 * Created by yaelmasri on 3/29/16.
 *
 * TaxAddress represents canonical addresses used in tax calculation.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaxAddress extends AbstractJsonBean {

    /**
     * Canonical street address
     */
    @JsonProperty
    private String address;

    /**
     * Reference code uniquely identifying this address instance. AddressCode will always correspond
     * to an address code supplied to in the address collection provided in the request.
     */
    @JsonProperty
    private String addressCode;

    /**
     * City name
     */
    @JsonProperty
    private String city;

    /**
     * State or region name
     */
    @JsonProperty
    private String region;

    /**
     * Country code, as ISO 3166-1 (Alpha-2) country code (e.g. “US”)
     */
    @JsonProperty
    private String country;

    /**
     * Postal code
     */
    @JsonProperty
    private String postalCode;

    /**
     * Geographic latitude. Latitude is only defined if input address was a geographic point.
     */
    @JsonProperty
    private BigDecimal latitude;

    /**
     * Geographic longitude. Longitude is only defined if input address was a geographic point.
     */
    @JsonProperty
    private BigDecimal longitude;

    /**
     * AvaTax tax region identifier
     */
    @JsonProperty
    private String taxRegionId;

    /**
     * Tax jurisdiction code
     */
    @JsonProperty
    private String jurisCode;

    public TaxAddress() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressCode() {
        return addressCode;
    }

    public void setAddressCode(String addressCode) {
        this.addressCode = addressCode;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public String getTaxRegionId() {
        return taxRegionId;
    }

    public void setTaxRegionId(String taxRegionId) {
        this.taxRegionId = taxRegionId;
    }

    public String getJurisCode() {
        return jurisCode;
    }

    public void setJurisCode(String jurisCode) {
        this.jurisCode = jurisCode;
    }
}




package com.zooz.common.client.ecomm.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The set of the parameters included in an address.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Address extends AbstractJsonBean {
    /**
     * User's billing/shipping country code.
     */
    @JsonProperty
    private String countryCode;
    /**
     * User's billing/shipping state
     */
    @JsonProperty
    private String state;
    /**
     * User's billing/shipping city address
     */
    @JsonProperty
    private String city;
    /**
     * User's billing/shipping street address1
     */
    @JsonProperty
    private String address1;
    /**
     * User's billing/shipping street address2
     */
    @JsonProperty
    private String address2;
    /**
     * User's billing/shipping street address3
     */
    @JsonProperty
    private String address3;
    /**
     * User's billing/shipping zip code
     */
    @JsonProperty
    private String zipCode;
    /**
     * User's first name
     */
    @JsonProperty
    private String firstName;
    /**
     * User's last name
     */
    @JsonProperty
    private String lastName;
    /**
     * User's phone
     */
    @JsonProperty
    private Phone phone;
    /**
     * User's gender ( Male / Female )
     */
    @JsonProperty
    private String gender;
    /**
     * User's title
     */
    @JsonProperty
    private String title;
    /**
     * User's salutation
     */
    @JsonProperty
    private String salutation;

    /**
     * Instantiates a new Address.
     *
     * @param countryCode User's billing/shipping country code.
     *                    Country code should be in ISO 3166 format.
     * @param state       User's billing/shipping state
     * @param city        User's billing/shipping city address
     * @param address1    User's billing/shipping street address1
     * @param address2    User's billing/shipping street address2
     * @param address3    User's billing/shipping street address3
     * @param zipCode     User's billing/shipping zip code
     * @param firstName   User's first name
     * @param lastName    User's last name
     * @param phone       User's phone
     *
     * @deprecated please use the new Address constructor (which includes "gender" and "title" fields)
     */
    @Deprecated
    public Address(String countryCode, String state, String city, String address1, String address2, String address3, String zipCode, String firstName, String lastName, Phone phone) {
        this.countryCode = countryCode;
        this.state = state;
        this.city = city;
        this.zipCode = zipCode;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    /**
     * Instantiates a new Address.
     *  @param countryCode User's billing/shipping country code.
     *                    Country code should be in ISO 3166 format.
     * @param state       User's billing/shipping state
     * @param city        User's billing/shipping city address
     * @param address1    User's billing/shipping street address1
     * @param address2    User's billing/shipping street address2
     * @param address3    User's billing/shipping street address3
     * @param zipCode     User's billing/shipping zip code
     * @param firstName   User's first name
     * @param lastName    User's last name
     * @param phone       User's phone
     * @param title       User's title
     * @param gender      User's gender ( Male / Female )
     */
    public Address(String countryCode, String state, String city, String address1, String address2, String address3, String zipCode, String firstName, String lastName, Phone phone, String title, String gender) {
        this.gender = gender;
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.countryCode = countryCode;
        this.state = state;
        this.city = city;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.zipCode = zipCode;
    }
    /**
     * Instantiates a new Address.
     *  @param countryCode User's billing/shipping country code.
     *                    Country code should be in ISO 3166 format.
     * @param state       User's billing/shipping state
     * @param city        User's billing/shipping city address
     * @param address1    User's billing/shipping street address1
     * @param address2    User's billing/shipping street address2
     * @param address3    User's billing/shipping street address3
     * @param zipCode     User's billing/shipping zip code
     * @param firstName   User's first name
     * @param lastName    User's last name
     * @param phone       User's phone
     * @param title       User's title
     * @param gender      User's gender ( Male / Female )
     * @param salutation  User's salutation ( Mr / Mrs / ... )
     */
    public Address(String countryCode, String state, String city, String address1, String address2, String address3, String zipCode, String firstName, String lastName, Phone phone, String title, String gender,String salutation) {
        this.gender = gender;
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.countryCode = countryCode;
        this.state = state;
        this.city = city;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.zipCode = zipCode;
        this.salutation = salutation;
    }


    /**
     * Instantiates a new Address.
     */
    public Address() {
    }


    /**
     * Gets the user's billing/shipping country code.
     *
     * @return Value of the user's billing/shipping country.
     */
    public String getCountryCode() { return countryCode; }

    /**
     * Sets the new user's billing/shipping country code.
     *
     * @param countryCode New value of the user's billing/shipping country.
     */
    public void setCountryCode(String countryCode) { this.countryCode = countryCode; }

    /**
     * Gets the user's billing/shipping city address.
     *
     * @return Value of the user's billing/shipping city address.
     */
    public String getCity() { return city; }

    /**
     * Sets the new user's billing/shipping city address.
     *
     * @param city New value of the user's billing/shipping city address.
     */
    public void setCity(String city) { this.city = city; }

    /**
     * Gets the user's billing/shipping street address1.
     *
     * @return Value of the user's billing/shipping street address1.
     */
    public String getAddress1() { return address1; }

    /**
     * Sets the new user's billing/shipping street address1.
     *
     * @param address1 New value of the user's billing/shipping street address1.
     */
    public void setAddress1(String address1) { this.address1 = address1; }

    /**
     * Gets the user's billing/shipping street address2.
     *
     * @return Value of the user's billing/shipping street address2.
     */
    public String getAddress2() { return address2; }

    /**
     * Sets the new user's billing/shipping street address2.
     *
     * @param address2 New value of the user's billing/shipping street address2.
     */
    public void setAddress2(String address2) { this.address2 = address2; }

    /**
     * Gets the user's billing/shipping street address3.
     *
     * @return Value of the user's billing/shipping street address3.
     */
    public String getAddress3() { return address3; }

    /**
     * Sets the new user's billing/shipping street address3.
     *
     * @param address3 New value of the user's billing/shipping street address3.
     */
    public void setAddress3(String address3) { this.address3 = address3; }

    /**
     * Gets the user's billing/shipping state.
     *
     * @return Value of the user's billing/shipping state.
     */
    public String getState() { return state; }

    /**
     * Sets the new user's billing/shipping state.
     *
     * @param state New value of the user's billing/shipping state.
     */
    public void setState(String state) { this.state = state; }

    /**
     * Gets the user's billing/shipping zip code.
     *
     * @return Value of the user's billing/shipping zip code.
     */
    public String getZipCode() { return zipCode; }

    /**
     * Sets the new user's billing/shipping zip code.
     *
     * @param zipCode New value of the user's billing/shipping zip code.
     */
    public void setZipCode(String zipCode) { this.zipCode = zipCode; }

    /**
     * Gets the user's last name.
     *
     * @return Value of the user's billing/shipping last name.
     */
    public String getLastName() { return lastName; }

    /**
     * Sets the new user's last name.
     *
     * @param lastName New value of the user's billing/shipping last name.
     */
    public void setLastName(String lastName) { this.lastName = lastName; }

    /**
     * Gets the user's first name.
     *
     * @return Value of the user's billing/shipping first name.
     */
    public String getFirstName() { return firstName; }

    /**
     * Sets the new user's first name.
     *
     * @param firstName New value of the user's billing/shipping first name.
     */
    public void setFirstName(String firstName) { this.firstName = firstName; }
    /**
     * Gets the user's billing/shipping phone.
     *
     * @return Value of the user's billing/shipping phone.
     */
    public Phone getPhone() { return phone; }

    /**
     * Sets the new user's billing/shipping phone.
     *
     * @param phone New value of the user's billing/shipping phone.
     */
    public void setPhone(Phone phone) { this.phone = phone; }

    /**
     * Gets the user's title.
     *
     * @return Value of the user's title.
     */
    public String getTitle() { return title; }

    /**
     * Sets the new user's title.
     *
     * @param title New value of the user's title.
     */
    public void setTitle(String title) { this.title = title; }

    /**
     * Gets the user's gender ( Male / Female ).
     *
     * @return Value of the user's gender ( Male / Female ).
     */
    public String getGender() { return gender; }

    /**
     * Sets the new user's gender ( Male / Female ).
     *
     * @param gender New value of the user's gender ( Male / Female ).
     */
    public void setGender(String gender) { this.gender = gender; }

    /**
     * Gets the user's salutation .
     *
     * @return Value of the user's salutation ( Mr / Mrs /Mis  etc).
     */
    public String getSalutation() { return salutation; }

    /**
     * Sets the new user's salutation .
     *
     * @param salutation New value of the user's salutation ( Mr / Mrs /Mis  etc ).
     */
    public void setSalutation(String salutation) { this.salutation = salutation; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (address1 != null ? !address1.equals(address.address1) : address.address1 != null) return false;
        if (address2 != null ? !address2.equals(address.address2) : address.address2 != null) return false;
        if (address3 != null ? !address3.equals(address.address3) : address.address3 != null) return false;
        if (city != null ? !city.equals(address.city) : address.city != null) return false;
        if (countryCode != null ? !countryCode.equals(address.countryCode) : address.countryCode != null) return false;
        if (gender != null ? !gender.equals(address.gender) : address.gender != null) return false;
        if (title != null ? !title.equals(address.title) : address.title != null) return false;
        if (firstName != null ? !firstName.equals(address.firstName) : address.firstName != null) return false;
        if (lastName != null ? !lastName.equals(address.lastName) : address.lastName != null) return false;
        if (phone != null ? !phone.equals(address.phone) : address.phone != null) return false;
        if (state != null ? !state.equals(address.state) : address.state != null) return false;
        if (zipCode != null ? !zipCode.equals(address.zipCode) : address.zipCode != null) return false;
        if (salutation != null ? !salutation.equals(address.salutation) : address.salutation != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = countryCode != null ? countryCode.hashCode() : 0;
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (address1 != null ? address1.hashCode() : 0);
        result = 31 * result + (address2 != null ? address2.hashCode() : 0);
        result = 31 * result + (address3 != null ? address3.hashCode() : 0);
        result = 31 * result + (zipCode != null ? zipCode.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (salutation != null ? salutation.hashCode() : 0);
        return result;
    }
}

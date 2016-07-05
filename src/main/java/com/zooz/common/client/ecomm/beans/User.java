package com.zooz.common.client.ecomm.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The set of parameters included in a user identity.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class User extends AbstractJsonBean {
    /**
     * the user's first name
     */
    @JsonProperty
    private String firstName;
    /**
     * the user's last name
     */
    @JsonProperty
    private String lastName;
    /**
     * the user's phone
     */
    @JsonProperty
    private Phone phone;
    /**
     * the user's email address
     */
    @JsonProperty
    private String email;
    /**
     * the additional details for the user
     */
    @JsonProperty
    private String additionalDetails;
    /**
     * the user's ID number
     * Please notice that the users ID number should be 5-12 digits.
     */
    @JsonProperty
    private String idNumber;
    /**
     * the user's birth Date in format dd/mm/yyyy
     */
    @JsonProperty
    private String birthDay;
    /**
     * the user's language in iso code
     */
    @JsonProperty
    private String language;
    /**
     * the user's billing/shipping address
     */
    @JsonProperty
    private Addresses addresses;

    /**
     * Instantiates a new User.
     *
     * @param firstName         User's first name
     * @param lastName          User's last name
     * @param phone             User's phone
     * @param email             User's email address
     * @param additionalDetails Additional details for the user
     * @param idNumber          User's ID number
     * @param addresses         User's billing/shipping address
     */
    public User(String firstName, String lastName, Phone phone, String email, String additionalDetails, String idNumber, Addresses addresses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.additionalDetails = additionalDetails;
        this.idNumber = idNumber;
        this.addresses = addresses;
    }

    /**
     * Instantiates a new User.
     *
     * @param firstName         User's first name
     * @param lastName          User's last name
     * @param phone             User's phone
     * @param email             User's email address
     * @param additionalDetails Additional details for the user
     * @param idNumber          User's ID number
     * @param addresses         User's billing/shipping address
     * @param birthDay          User's birthday
     * @param language         User's Language
     */
    public User(String firstName, String lastName, Phone phone, String email, String additionalDetails, String idNumber, String language,String birthDay,Addresses addresses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.additionalDetails = additionalDetails;
        this.idNumber = idNumber;
        this.addresses = addresses;
        this.birthDay = birthDay;
        this.language = language;
    }

    /**
     * Instantiates a new User.
     */
    public User() {

    }

    /**
     * Gets the user's first name.
     *
     * @return Value of the user's first name.
     */
    public String getFirstName() { return firstName; }

    /**
     * sets the new user's first name.
     *
     * @param firstName New value of the user's first name.
     */
    public void setFirstName(String firstName) { this.firstName = firstName; }

    /**
     * Gets the user's email address.
     *
     * @return Value of the user's email address.
     */
    public String getEmail() { return email; }

    /**
     * sets the new user's email address.
     *
     * @param email New value of the user's email address.
     */
    public void setEmail(String email) { this.email = email; }

    /**
     * Gets the user's ID number.
     *
     * @return Value of the user's ID number.
     */
    public String getIdNumber() { return idNumber; }

    /**
     * sets the new user's ID number.
     *
     * @param idNumber New value of the user's ID number.
     */
    public void setIdNumber(String idNumber) { this.idNumber = idNumber; }

    /**
     * Gets the additional details for the user.
     *
     * @return Value of the additional details for the user.
     */
    public String getAdditionalDetails() { return additionalDetails; }

    /**
     * sets the new additional details for the user.
     *
     * @param additionalDetails New value of the additional details for the user.
     */
    public void setAdditionalDetails(String additionalDetails) { this.additionalDetails = additionalDetails; }

    /**
     * Gets the user's last name.
     *
     * @return Value of the user's last name.
     */
    public String getLastName() { return lastName; }

    /**
     * sets the new user's last name.
     *
     * @param lastName New value of the user's last name.
     */
    public void setLastName(String lastName) { this.lastName = lastName; }

    /**
     * Gets the user's phone.
     *
     * @return Value of the user's phone.
     */
    public Phone getPhone() { return phone; }

    /**
     * sets the new user's phone.
     *
     * @param phone New value of the user's phone.
     */
    public void setPhone(Phone phone) { this.phone = phone; }

    /**
     * Gets the user's birthDay.
     *
     * @return Value of the user's birthDay.
     */
    public String getBirthDay() { return birthDay; }

    /**
     * sets the new user's birth Date.
     *
     * @param birthDay New value of the user's birthDay.
     */
    public void setBirthDay(String birthDay) { this.birthDay = birthDay; }

    /**
     * Gets the user's language.
     *
     * @return Value of the user's language.
     */
    public String getLanguage() { return language; }

    /**
     * sets the new user's language.
     *
     * @param language New value of the user's language.
     */
    public void setLanguage(String language) { this.language = language; }

    /**
     * Gets the user's billing/shipping address.
     *
     * @return Value of the user's billing/shipping address.
     */
    public Addresses getAddresses() { return addresses; }

    /**
     * sets the new user's billing/shipping address.
     *
     * @param addresses New value of the user's billing/shipping address.
     */
    public void setAddresses(Addresses addresses) { this.addresses = addresses; }
}

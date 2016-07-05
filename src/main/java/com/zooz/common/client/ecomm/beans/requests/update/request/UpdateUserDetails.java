package com.zooz.common.client.ecomm.beans.requests.update.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zooz.common.client.ecomm.beans.User;
import com.zooz.common.client.ecomm.control.CommonParameters;

/**
 * To update the user details for a specific payment, use the updateUserDetails API call. This enables merchants to add or edit user details parameters.
 * Should be used only after openPayment and before “authorize” calls.
 */
public class UpdateUserDetails extends AbstractUpdate {
    /**
     * Zooz user details object
     */
    @JsonProperty
    private User user;

    /**
     * Instantiates a new Update user details.
     *
     * @param paymentToken The token from "openPayment"
     * @param user         Zooz user details object
     */
    public UpdateUserDetails(String paymentToken, User user) {
        super(CommonParameters.updateUserDetails, paymentToken);
        this.user = user;
    }

    /**
     * Returns the User details.
     *
     * @return Zooz user details object
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the wanted User details.
     *
     * @param user Zooz user details object
     */
    public void setUser(User user) {
        this.user = user;
    }
}

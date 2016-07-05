package com.zooz.common.client.ecomm.beans.responses;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * the RedirectSaleResponse includes any of the response parameter returns for the RedirectSaleRequest.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RedirectSaleResponse extends SaleResponse {

    /**
     * the form data that needs to submit from web page and redirects to payease.
     */
    @JsonProperty
    private String formData;
    /**
     * Redirect for further processing flow.
     * For additional details please read: Appendix A - Handling Redirect URL.
     */
    @JsonProperty
    private String redirectUrl;


    /**
     * the form data that needs to submit from web page and redirects to payease.
     *
     * @return String with an HTML formData
     */
    public String getFormData() {
        return formData;
    }

    /**
     * sets the form data that needs to submit from web page and redirects to payease.
     *
     * @param formData the form data
     */
    public void setFormData(String formData) {
        this.formData = formData;
    }

    /**
     * Gets the redirect url.
     *
     * @return the redirect url
     */
    public String getRedirectUrl() {
        return redirectUrl;
    }

    /**
     * Sets the redirect url.
     *
     * @param redirectUrl the redirect url
     */
    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }
}

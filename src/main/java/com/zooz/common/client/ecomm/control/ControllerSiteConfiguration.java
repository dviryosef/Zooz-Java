package com.zooz.common.client.ecomm.control;

import org.apache.http.HttpHost;
import org.apache.http.client.config.RequestConfig;

/**
 * Created by Zooz
 * User: ronenm
 * Date: May 20, 2014
 * Time: 11:28:40 AM
 */
public class ControllerSiteConfiguration {

    private String zoozServer, programKey, programId;
    private RequestConfig reqConfig;

    /**
     * Constructor with default configuration and zooz site.
     *
     * @param zoozServer    the zooz server
     * @param programKey    the program key
     * @param programId     the program id
     */
    public ControllerSiteConfiguration(String zoozServer, String programKey, String programId) {
        this(zoozServer, programKey, programId, null);
        reqConfig = createDefaultRequestConfig();
    }


    /**
     * Constructor with custom request config object for setting the proxy and timeouts
     *
     * @param zoozServer    the zooz server
     * @param programKey        the program key
     * @param programId  the program id
     * @param requestConfig the request config
     */
    public ControllerSiteConfiguration(String zoozServer, String programKey, String programId, RequestConfig requestConfig) {
        this.zoozServer = zoozServer;
        this.programKey = programKey;
        this.programId = programId;
        reqConfig = requestConfig;
    }


    private RequestConfig createDefaultRequestConfig() {

        return RequestConfig.custom()
                .setSocketTimeout(CommonParameters.HTTP_TIMEOUT_CONNECTION)
                .setConnectTimeout(CommonParameters.HTTP_TIMEOUT_CONNECTION)
                .setConnectionRequestTimeout(CommonParameters.HTTP_TIMEOUT_CONNECTION)
                .build();
    }


    /**
     * Gets request config.
     *
     * @return the request config
     */
    public RequestConfig getRequestConfig() {
        return reqConfig;
    }

    /**
     * Gets zooz server.
     *
     * @return the zooz server
     */
    public String getZoozServer() {
        return zoozServer;
    }

    /**
     * Sets zooz server.
     *
     * @param zoozServer the zooz server
     */
    public void setZoozServer(String zoozServer) {
        this.zoozServer = zoozServer;
    }

    /**
     * Gets app key.
     *
     * @return the app key
     */
    public String getProgramKey() {
        return programKey;
    }

    /**
     * Sets app key.
     *
     * @param programKey the app key
     */
    public void setProgramKey(String programKey) {
        this.programKey = programKey;
    }

    /**
     * Gets site unique id.
     *
     * @return the site unique id
     */
    public String getProgramId() {
        return programId;
    }

    /**
     * Sets site unique id.
     *
     * @param programId the site unique id
     */
    public void setProgramId(String programId) {
        this.programId = programId;
    }

    /**
     * Gets socket timeout.
     *
     * @return the socket timeout
     */
    public int getSocketTimeout() {
        return reqConfig.getSocketTimeout();
    }

    /**
     * Set timeout in milliseconds
     *
     * @param socketTimeout     milliseconds
     * @param requestTimeout    milliseconds
     * @param connectionTimeout milliseconds
     */
    public void setTimeouts(int socketTimeout, int requestTimeout, int connectionTimeout) {
        reqConfig = RequestConfig.copy(reqConfig)
                .setSocketTimeout(socketTimeout)
                .setConnectTimeout(requestTimeout)
                .setConnectionRequestTimeout(connectionTimeout)
                .build();
    }

    /**
     * Gets request timeout.
     *
     * @return the request timeout
     */
    public int getRequestTimeout() {
        return reqConfig.getConnectionRequestTimeout();
    }

    /**
     * Gets connect timeout.
     *
     * @return the connect timeout
     */
    public int getConnectTimeout() {
        return reqConfig.getConnectTimeout();
    }

    /**
     * Gets proxy host.
     *
     * @return the proxy host
     */
    public HttpHost getProxyHost() {
        return reqConfig.getProxy();
    }

    /**
     * Sets proxy host.
     *
     * @param proxyHost the proxy host
     */
    public void setProxyHost(HttpHost proxyHost) {
        reqConfig = RequestConfig.copy(reqConfig).setProxy(proxyHost).build();
    }
}


package com.zooz.common.client.ecomm.control;

import com.fasterxml.jackson.core.type.TypeReference;
import com.zooz.common.client.ecomm.beans.requests.AbstractZoozRequest;
import org.apache.http.conn.HttpClientConnectionManager;


/**
 * The type Single site controller.
 */
public class SingleSiteController extends Controller {
    private ControllerSiteConfiguration siteConfig;

    /**
     * Instantiates a new Single site controller.
     *
     * @param programId zooz program id
     * @param programKey       zooz program key
     * @param zoozServer   zooz server
     */
    public SingleSiteController(String programId, String programKey, String zoozServer) {
        this(new ControllerSiteConfiguration(zoozServer, programKey, programId));
    }

    /**
     * Instantiates a new Single site controller.
     *
     * @param config the configuration
     */
    public SingleSiteController(ControllerSiteConfiguration config) {
        super();
        siteConfig = config;
    }

    /**
     * Instantiates a new Single site controller.
     *
     * @param config            the config
     * @param connectionManager the connection manager
     */
    public SingleSiteController(ControllerSiteConfiguration config, HttpClientConnectionManager connectionManager) {
        super(connectionManager);
        siteConfig = config;
    }

    /**
     * Send request.
     *
     * @param <T>     one of the type parameter exending ZoozResponseObject
     * @param request the zooz request
     * @param typeRef the type ref
     *
     * @return the t
     *
     * @throws Exception the exception
     */
    public <T> T sendRequest(AbstractZoozRequest request, TypeReference<T> typeRef) throws Exception {
        return sendRequest(siteConfig, request, typeRef);
    }

    /**
     * Send request.
     *
     * @param request the request
     *
     * @return raw zooz response as sent from zooz servers.
     *
     * @throws Exception the exception
     */
    public String sendRequest(AbstractZoozRequest request) throws Exception {
        return sendRequest(siteConfig, request);
    }
}

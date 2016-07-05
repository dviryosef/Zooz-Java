package com.zooz.common.client.ecomm.control;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zooz.common.client.ecomm.beans.requests.AbstractZoozRequest;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Developer: Roy Keynan
 *
 * The Controller wraps the HttpClient, sends the eCommerce API requests to the Zooz server, and parses the JSon responses to Java classes.
 * The set of requests can be found in the "requests" package and the set of responses can be found in the "responses" package.
 */
public class Controller {

    private static final String JSON = "JSon";
    private final CloseableHttpClient httpClient;

    Logger log = Logger.getLogger(Controller.class.getName());

    /**
     * Constructor with its own propriety default connection manager
     */
    public Controller() {

        /* Its advised in EJB container to use BasicHttpClientConnectionManager and not the pooling manager */
        PoolingHttpClientConnectionManager connManager = new PoolingHttpClientConnectionManager();
        connManager.setMaxTotal(200);
        this.httpClient = HttpClients.custom().setConnectionManager(connManager).build();

        /* HttpClient documentation advises to use for PoolingHttpClientConnectionManager the following http connection monitor to clean long time idle cons
        We left this not active at the moment, as EJB and Servlet containers might invoke differently this Thread.
         */
//        Thread t = new Thread(new HttpClientConnectionsMonitor(connManager));
//        t.setDaemon(true);
//        t.start();
    }

    /**
     * Use this constructor to pass the controller your own custom connection manager
     *
     * @param connectionManager the connection pooling manager to use for this HTTP client
     */
    public Controller(HttpClientConnectionManager connectionManager) {
        this.httpClient = HttpClients.custom().setConnectionManager(connectionManager).build();
    }


    /**
     * Sends an Http request to Zooz Server.
     *
     * @param config  configuration for this http call
     * @param request - The specific request objects
     *
     * @return JSon string
     *
     * @throws IOException for any http or parse error
     */
    public String sendRequest(ControllerSiteConfiguration config, AbstractZoozRequest request) throws IOException {

        String response = null;
        HttpPost httPost = new HttpPost(config.getZoozServer() + CommonParameters.zoozPaymentAPIUrl);
        try {

            httPost.setHeader(CommonParameters.ZOOZ_RESPONSE_TYPE_HEADER, JSON);

            httPost.setHeader(CommonParameters.ZOOZ_PROGRAM_KEY, config.getProgramKey());
            httPost.setHeader(CommonParameters.ZOOZ_PROGRAM_ID, config.getProgramId());

            ObjectMapper mapper = new ObjectMapper();
            mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
            StringEntity input = new StringEntity(mapper.writeValueAsString(request), ContentType.APPLICATION_JSON);


            httPost.setEntity(input);

            httPost.setConfig(config.getRequestConfig());
            HttpResponse httpRes = httpClient.execute(httPost);

            response = EntityUtils.toString(httpRes.getEntity());

            validateResponse(response, httpRes);


        }catch(IOException ioe){
            logError("IO Exception in Zooz http controller, " + ioe.getMessage(), ioe);
            throw ioe;

        } finally {
            httPost.releaseConnection();
        }
        return response;
    }

    /**
     * log errors on the http response
     * @param response the received response string
     * @param httpRes the received response object
     */
    protected void validateResponse(String response, HttpResponse httpRes) {
        validateLineStatus(response, httpRes);

        validateContentType(response, httpRes);
    }

	protected void validateContentType(String response, HttpResponse httpRes) {
		ContentType contentType = getContentType(httpRes);
        if(contentType == null || contentType.getMimeType() == null || !contentType.getMimeType().contains("json")){
            String mimeType = (contentType == null) ? null : contentType.getMimeType();
            logError("Content type not match json: " + mimeType + " response:" + response);
        }
	}

	protected ContentType getContentType(HttpResponse httpRes) {
		return ContentType.get(httpRes.getEntity());
	}

	protected void validateLineStatus(String response, HttpResponse httpRes) {
		StatusLine line = httpRes.getStatusLine();
        if(line == null || !(line.getStatusCode() >= 200 && line.getStatusCode() < 300)){
            logError("Http status code, " + line + " response:" + response);
        }
	}

    /**
     * Sends an Http request to Zooz Server.
     *
     * @param <T>     ZoozServerResponse Type
     * @param config  the config
     * @param request - The specific request objects
     * @param typeRef the Type reference for structured response
     *
     * @return ZoozServerResponse  parsed
     *
     * @throws IOException for any http or parse error
     */
    public <T> T sendRequest(ControllerSiteConfiguration config, AbstractZoozRequest request, TypeReference<T> typeRef) throws IOException {
        String responseStr = sendRequest(config, request);
        return parseResponse(responseStr, typeRef);
    }


    /**
     * Simple method to parse Zooz server responses to ZoozServerResponse classes
     *
     * @param <T> the Type response to return in the format of ZoozServerResponse
     * @param responseStr the response as string
     * @param typeRef the type reference of the json response class
     *
     * @return ZoozServerResponse
     *
     * @throws IOException on Object mapper errors
     */
    public <T> T parseResponse(String responseStr, TypeReference<T> typeRef) throws IOException {
        try{
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            return mapper.readValue(responseStr, typeRef);
        }catch(IOException ioe){
            logError("Failed parsing json IO: " + ioe.getMessage() + "\nraw data: " + responseStr);
            throw ioe;

        }catch(Exception e){
            logError("Failed parsing json: " + e.getMessage() + "\nraw data: " + responseStr, e);
            throw new IOException("Failed parsing json: " + e.getMessage()  +"\nraw data: " + responseStr, e);
        }
    }

    protected void logError(String message){
        log.severe(message);
    }

    protected void logError(String message, Exception e){
        log.log(Level.SEVERE, message, e);
    }
}
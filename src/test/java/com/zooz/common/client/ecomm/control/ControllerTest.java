package com.zooz.common.client.ecomm.control;

import com.fasterxml.jackson.core.type.TypeReference;
import com.zooz.common.client.ecomm.beans.Address;
import com.zooz.common.client.ecomm.beans.CustomerDetails;
import com.zooz.common.client.ecomm.beans.RegisterDetails;
import com.zooz.common.client.ecomm.beans.Risk;
import com.zooz.common.client.ecomm.beans.requests.AbstractZoozRequest;
import com.zooz.common.client.ecomm.beans.requests.GetTokenRequest;
import com.zooz.common.client.ecomm.beans.responses.GetTokenResponse;
import com.zooz.common.client.ecomm.beans.responses.VoidResponse;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;
import org.apache.http.conn.ConnectTimeoutException;
import org.junit.*;
import org.junit.rules.TestName;

import java.io.IOException;

/**
 * Created by Zooz
 * User: ronenm
 * Date: Jun 6, 2014
 * Time: 12:09:23 AM
 */
public class ControllerTest {

    static ControllerSiteConfiguration defaultWorkingSiteConfig;

    static GetTokenRequest defaultOpenPaymentRequest;


    @Rule
    public TestName name = new TestName();


    @BeforeClass
    public static void setup() throws IOException {
        defaultWorkingSiteConfig = new ControllerSiteConfiguration("https://sandbox.zooz.co", "c2e2e708-2aa0-427e-9217-ecf5feae4f80", "com.zooz.Caap.sample");
        CustomerDetails ad = new CustomerDetails("UnitTestCutomser", "UnitTestCutomser 1");
        RegisterDetails rd = new RegisterDetails("USD");
        rd.setBillingAddress(new Address("IL", "你好", "שלום", "français", "русский", "русский", "日本", "English", "None", null));
        System.out.println("Bill address: " + rd.getBillingAddress());
        defaultOpenPaymentRequest = new GetTokenRequest(rd, ad);
    }

    @AfterClass
    public static void tearDown() {

    }

    @Before
    public void beforeEachTest() {

    }

    /**
     * test failure parse requests
     */
    @Test
    public void parseResponse_testFailParse() {
        Controller controller = new SingleSiteController(defaultWorkingSiteConfig);


        try {
            ZoozServerResponse<VoidResponse> o = controller.parseResponse("bla bla", new TypeReference<ZoozServerResponse<VoidResponse>>() {
            });
            System.out.println("Object: " + o);

            Assert.fail("Expected exception thrown on wrong JSON");

        } catch (IOException ioe) {
            System.out.println("Expected error: " + ioe.getMessage());
            Assert.assertTrue("Expected IOException", true);
        } catch (Exception e) {
            Assert.fail("Wrong exception, " + e);

        }

    }

    @Test
    public void sendRequest_successAPICall() {
        Controller controller = new Controller();

        ZoozServerResponse<GetTokenResponse> opr = null;
        try {
            opr = controller.sendRequest(defaultWorkingSiteConfig, defaultOpenPaymentRequest, defaultOpenPaymentRequest.getResponseTypeReference());

        } catch (IOException e) {
            Assert.fail("IOE Exception on network -  expected success call " + e.getMessage());
        }

        System.out.println("response: " + opr);
        Assert.assertNotNull("Fail to receive token", opr.getResponseStatus());

    }

    @Test(expected = ConnectTimeoutException.class)
    public void sendRequest_failOnTimeout() throws IOException {
        Controller controller = new Controller();

        //removed https to http = should timeout
        ControllerSiteConfiguration timedOutConfig = new ControllerSiteConfiguration("http://sandbox.zooz.co", "c2e2e708-2aa0-427e-9217-ecf5feae4f80", "com.zooz.Caap.sample");
        timedOutConfig.setTimeouts(3000, 3, 3000);


        ZoozServerResponse<GetTokenResponse> opr = null;

        opr = controller.sendRequest(timedOutConfig, defaultOpenPaymentRequest, defaultOpenPaymentRequest.getResponseTypeReference());

        System.out.println("response: " + opr);
        Assert.fail("expected to fail on timeout");


    }


    @Test
    public void parsingSuccessOnUnknownAttributeOnResponse() {
        Controller controller = new SingleSiteController(defaultWorkingSiteConfig);
        String riskStr = "{\n" +
                "      \"results\" : [\n" +
                "        {\n" +
                "          \"action\" : \"BLOCK\",\n" +
                "          \"riskScore\" : \"1000\",\n" +
                "          \"determiningRule\" : \"feedzai usd\",\n" +
                "          \"context\" : \"FDSPostAuth\",\n" +
                "          \"newAttribute\" : \"newAttribute value\",\n" +
                "          \"riskScoreOrigin\" : \"Feedzai\",\n" +
                "          \"description\" : \"Transaction blocked by risk-engine.\"\n" +
                "        }\n" +
                "      ]\n" +
                "    }";

        Risk o = null;
        try {
            o = controller.parseResponse(riskStr, new TypeReference<Risk>() {
            });
        } catch (IOException e) {
            Assert.fail("Operation should succeed but got exception: " + e);
        }
        System.out.println("Object: " + o);
    }


    public void testAbstractTypeResponse() {
        CustomerDetails ad = new CustomerDetails("UnitTestCutomser", "UnitTestCutomser 1");
        RegisterDetails rd = new RegisterDetails("USD");
        rd.setBillingAddress(new Address("IL", "你好", "שלום", "français", "русский", "русский", "日本", "English", "None", null));

        AbstractZoozRequest request = new GetTokenRequest(rd, ad);

    }
}

package com.zooz.common.client.ecomm.beans.responses;

import com.fasterxml.jackson.core.type.TypeReference;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;
import com.zooz.common.client.ecomm.control.Controller;
import org.junit.*;
import org.junit.rules.TestName;

import java.io.IOException;


/**
 * Tests parsing of openpayment responses
 */
public class OpenPaymentTest extends ResponseTestBase<OpenPaymentResponse>{






    @Rule
    public TestName name = new TestName();


    @BeforeClass
    public static void setup() throws IOException {



    }

    @AfterClass
    public static void tearDown() {

    }

    @Before
    public void beforeEachTest() {

    }

    /**
     * Tests parsing of openpayment responses.
     * The test reads files with json strings from ./src/test/resources/v_[version_number]/openpaymentresponse.
     * To read files from a different location add -DdataDir=[path_to_data]. The data directory should be in the same structure as in the resource directory.
     */
    @Test
    public void parseResponse_openPayment() {

        basicFlow(OpenPaymentResponse.class.getSimpleName());

    }




    @Override
    public ZoozServerResponse<OpenPaymentResponse> getResponseObject(String json,Controller controller) throws IOException {
        ZoozServerResponse<OpenPaymentResponse> o;
        o = controller.parseResponse(json, new TypeReference<ZoozServerResponse<OpenPaymentResponse>>() {

        });
        return o;
    }

    @Override
    public void checkAdditionalSuccessFields(ZoozResponseObject o, String fileName) {
        OpenPaymentResponse res = (OpenPaymentResponse)o;
        Assert.assertNotNull("payment token should not be null " + fileName, res.getPaymentToken());
        Assert.assertNotNull("payment id should not be null " + fileName, res.getPaymentId());
    }

    @Override
    public void checkAdditionalErrorFields(ZoozResponseObject o, String fileName) {
        OpenPaymentResponse res = (OpenPaymentResponse)o;
        Assert.assertNull("payment token should be null " + fileName, res.getPaymentToken());
        Assert.assertNull("payment id should be null " + fileName, res.getPaymentId());

    }
}


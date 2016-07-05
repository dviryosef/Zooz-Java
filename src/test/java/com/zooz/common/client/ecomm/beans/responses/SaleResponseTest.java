package com.zooz.common.client.ecomm.beans.responses;

import com.fasterxml.jackson.core.type.TypeReference;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;
import com.zooz.common.client.ecomm.control.Controller;
import org.junit.*;
import org.junit.rules.TestName;

import java.io.IOException;

/**
 * Tests parsing of Sale responses
 */
public class SaleResponseTest extends ResponseTestBase<SaleResponse>{

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
     * Tests parsing of Sale responses.
     * The test reads files with json strings from ./src/test/resources/v_[version_number]/saleresponse.
     * To read files from a different location add -DdataDir=[path_to_data]. The data directory should be in the same structure as in the resource directory.
     */
    @Test
    public void parseResponse_Sale() {

        basicFlow(SaleResponse.class.getSimpleName());

    }

    @Override
    public ZoozServerResponse<SaleResponse> getResponseObject(String json, Controller controller) throws IOException {
        ZoozServerResponse<SaleResponse> o;
        o = controller.parseResponse(json, new TypeReference<ZoozServerResponse<SaleResponse>>() {

        });
        return o;
    }

    @Override
    public void checkAdditionalSuccessFields(ZoozResponseObject o, String fileName) {
        SaleResponse res = (SaleResponse)o;
        Assert.assertNull("error should be null " + fileName, res.getResponseErrorCode());
        Assert.assertNull("error description should be null " + fileName, res.getErrorDescription());
        Assert.assertNotNull("payment type should not be null " + fileName, res.getResponseType());
        Assert.assertNotNull("Merchantid should not be null " + fileName, res.getMerchantId());
        Assert.assertNotNull("processorname should not be null " + fileName, res.getProcessorName());

        checkRisk(res.getRisk(),fileName);

    }

    @Override
    public void checkAdditionalErrorFields(ZoozResponseObject o, String fileName) {

    }
}
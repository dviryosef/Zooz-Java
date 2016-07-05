package com.zooz.common.client.ecomm.beans.responses;

import com.fasterxml.jackson.core.type.TypeReference;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;
import com.zooz.common.client.ecomm.control.Controller;
import org.junit.*;
import org.junit.rules.TestName;

import java.io.IOException;

/**
 * Tests parsing of Refund responses.
 */
public class RefundResponseTest extends ResponseTestBase<RefundResponse>{

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
     * Tests parsing of Refund responses.
     * The test reads files with json strings from ./src/test/resources/v_[version_number]/refundresponse.
     * To read files from a different location add -DdataDir=[path_to_data]. The data directory should be in the same structure as in the resource directory.
     */
    @Test
    public void parseResponse_Refund() {

        basicFlow(RefundResponse.class.getSimpleName());

    }

    @Override
    public ZoozServerResponse<RefundResponse> getResponseObject(String json, Controller controller) throws IOException {
        ZoozServerResponse<RefundResponse> o;
        o = controller.parseResponse(json, new TypeReference<ZoozServerResponse<RefundResponse>>() {

        });
        return o;
    }

    @Override
    public void checkAdditionalSuccessFields(ZoozResponseObject o, String fileName) {
        RefundResponse res = (RefundResponse)o;
        Assert.assertNull("error should be null " + fileName, res.getResponseErrorCode());
        Assert.assertNull("error description should be null " + fileName, res.getErrorDescription());
        Assert.assertNotNull("amount should not be null " + fileName, res.getRefundAmount());
        Assert.assertNotNull("ReconciliationId should not be null " + fileName, res.getReconciliationId());
        Assert.assertNotNull("processorname should not be null " + fileName, res.getProcessorName());


    }

    @Override
    public void checkAdditionalErrorFields(ZoozResponseObject o, String fileName) {

    }
}

package com.zooz.common.client.ecomm.beans.responses;

import com.fasterxml.jackson.core.type.TypeReference;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;
import com.zooz.common.client.ecomm.control.Controller;
import org.junit.*;
import org.junit.rules.TestName;

import java.io.IOException;

/**
 * Tests parsing of SubsriptionDetails responses
 */
public class GetSubScriptionResponseTest extends ResponseTestBase<GetSubscriptionDetailsResponse> {

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
     * Tests parsing of SubsriptionDetails responses.
     * The test reads files with json strings from ./src/test/resources/v_[version_number]/getsubscriptiondetailsresponse.
     * To read files from a different location add -DdataDir=[path_to_data]. The data directory should be in the same structure as in the resource directory.
     */
    @Test
    public void parseResponse_SubscriptionDetails() {

        basicFlow(GetSubscriptionDetailsResponse.class.getSimpleName());

    }

    @Override
    public ZoozServerResponse<GetSubscriptionDetailsResponse> getResponseObject(String json, Controller controller) throws IOException {
        ZoozServerResponse<GetSubscriptionDetailsResponse> o;
        o = controller.parseResponse(json, new TypeReference<ZoozServerResponse<GetSubscriptionDetailsResponse>>() {

        });
        return o;
    }

    @Override
    public void checkAdditionalSuccessFields(ZoozResponseObject o, String fileName) {
        GetSubscriptionDetailsResponse res = (GetSubscriptionDetailsResponse)o;
        Assert.assertNotNull("subscription status should not be null " + fileName, res.getSubscriptionStatus());
        Assert.assertNotNull("processor name should not be null " + fileName, res.getProcessorName());
        Assert.assertNotNull("end date should not be null " + fileName, res.getEndDate());
        Assert.assertNotNull("start date should not be null " + fileName, res.getStartDate());
        Assert.assertNotNull("recurring should not be null " + fileName, res.getRecurring());


    }

    @Override
    public void checkAdditionalErrorFields(ZoozResponseObject o, String fileName) {

    }
}

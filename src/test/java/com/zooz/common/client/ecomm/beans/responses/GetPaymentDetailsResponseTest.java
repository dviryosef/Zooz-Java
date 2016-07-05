package com.zooz.common.client.ecomm.beans.responses;

import com.fasterxml.jackson.core.type.TypeReference;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;
import com.zooz.common.client.ecomm.control.Controller;
import com.zooz.common.client.ecomm.utils.IPNFactory;
import org.json.JSONException;
import org.junit.*;
import org.junit.rules.TestName;

import java.io.IOException;

/**
 * Tests parsing of GetPaymentDetails responses
 */
public class GetPaymentDetailsResponseTest extends ResponseTestBase<PaymentDetailsResponse> {

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
     * Tests parsing of GetPaymentDetails responses.
     * The test reads files with json strings from ./src/test/resources/v_[version_number]/paymentdetailsresponse.
     * To read files from a different location add -DdataDir=[path_to_data]. The data directory should be in the same structure as in the resource directory.
     */
    @Test
    public void parseResponse_paymentDetails() {

        basicFlow(PaymentDetailsResponse.class.getSimpleName());

    }

    @Override
    public ZoozServerResponse<PaymentDetailsResponse> getResponseObject(String json, Controller controller) throws IOException {
        ZoozServerResponse<PaymentDetailsResponse> o;
        o = controller.parseResponse(json, new TypeReference<ZoozServerResponse<PaymentDetailsResponse>>() {

        });

        return o;
    }

    @Override
    public void checkAdditionalSuccessFields(ZoozResponseObject o, String fileName) throws JSONException {
        PaymentDetailsResponse res = (PaymentDetailsResponse)o;
        checkPaymentDetails(res, fileName);
    }

    @Override
    public void checkAdditionalErrorFields(ZoozResponseObject o, String fileName) {

    }
}

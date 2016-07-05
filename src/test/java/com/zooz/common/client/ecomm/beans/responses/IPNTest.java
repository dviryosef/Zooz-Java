package com.zooz.common.client.ecomm.beans.responses;

import com.zooz.common.client.ecomm.beans.PaymentDetails;
import com.zooz.common.client.ecomm.beans.enums.NotificationType;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;
import com.zooz.common.client.ecomm.control.Controller;
import com.zooz.common.client.ecomm.utils.IPNFactory;
import org.json.JSONException;
import org.junit.*;
import org.junit.rules.TestName;

import java.io.IOException;

/**
 * Tests parsing of IPN notifications
 */
public class IPNTest extends ResponseTestBase<ZoozResponseObject>{

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
     * Tests parsing of IPN notifications.
     * The test reads files with json strings from ./src/test/resources/v_[version_number]/paymentdetails.
     * To read files from a different location add -DdataDir=[path_to_data]. The data directory should be in the same structure as in the resource directory.
     */
    @Test
    public void parseResponse_IPNDetails() {

        basicFlow(PaymentDetails.class.getSimpleName());

    }

    @Override
    public ZoozServerResponse<ZoozResponseObject> getResponseObject(String json, Controller controller) throws IOException {
        IPNFactory factory = new IPNFactory();
        ZoozIPNResponse ipnResponse = factory.getIPNResponse(json, controller);
        ZoozResponseObject res;
        if (ipnResponse.getIPNType() == NotificationType.PaymentIPN) {
            res = (PaymentDetailsResponse)ipnResponse;
        } else {
            res = (PaymentMethodIPN)ipnResponse;
        }


        return new ZoozServerResponse<ZoozResponseObject>(0,res);

    }

    @Override
    public void checkAdditionalSuccessFields(ZoozResponseObject o, String fileName) throws JSONException {
        if (o instanceof PaymentDetailsResponse) {
            PaymentDetailsResponse res = (PaymentDetailsResponse)o;
            checkPaymentDetails(res, fileName);
        } else if (o instanceof PaymentMethodIPN) {
            PaymentMethodIPN res = (PaymentMethodIPN)o;
            checkPaymentMethodDetails(res, fileName);
        }
    }

    @Override
    public void checkAdditionalErrorFields(ZoozResponseObject o, String fileName) {

    }
}


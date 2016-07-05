package com.zooz.common.client.ecomm.beans.responses;


import com.fasterxml.jackson.core.type.TypeReference;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;
import com.zooz.common.client.ecomm.control.Controller;
import org.junit.*;
import org.junit.rules.TestName;

import java.io.IOException;

/**
 * Tests parsing of AddPaymentMethods responses
 */
public class AddPaymentMethodResponseTest  extends ResponseTestBase<AddPaymentMethodResponse> {

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
     * Tests parsing of AddPaymentMethods responses.
     * The test reads files with json strings from ./src/test/resources/v_[version_number]/addpaymentmethodresponse.
     * To read files from a different location add -DdataDir=[path_to_data]. The data directory should be in the same structure as in the resource directory.
     */
    @Test
    public void parseResponse_AddPaymentMethodResponse() {

        basicFlow(AddPaymentMethodResponse.class.getSimpleName());

    }

    @Override
    public ZoozServerResponse<AddPaymentMethodResponse> getResponseObject(String json, Controller controller) throws IOException {
        ZoozServerResponse<AddPaymentMethodResponse> o;
        o = controller.parseResponse(json, new TypeReference<ZoozServerResponse<AddPaymentMethodResponse>>() {

        });
        return o;
    }

    @Override
    public void checkAdditionalSuccessFields(ZoozResponseObject o, String fileName) {

        AddPaymentMethodResponse res = (AddPaymentMethodResponse)o;
        Assert.assertNotNull("payment token should not be null " + fileName, res.getBinNumber());
        Assert.assertNotNull("payment last 4 digits should not be null " + fileName, res.getLastFourDigits());
        Assert.assertNotNull("payment id should not be null " + fileName, res.getExpirationMonth());
        Assert.assertNotNull("payment method token should not be null " + fileName, res.getPaymentMethodToken());
        Assert.assertNotNull("payment method type should not be null " + fileName, res.getPaymentMethodType());


    }

    @Override
    public void checkAdditionalErrorFields(ZoozResponseObject o, String fileName) {

        AddPaymentMethodResponse res = (AddPaymentMethodResponse)o;
        Assert.assertNull("payment token should be null " + fileName, res.getBinNumber());
        Assert.assertNull("payment id should be null " + fileName, res.getExpirationMonth());
        Assert.assertNull("payment method token should not be null " + fileName, res.getPaymentMethodToken());
        Assert.assertNull("payment method type should not be null " + fileName, res.getPaymentMethodType());
        Assert.assertNull("payment last 4 digits should be null " + fileName, res.getLastFourDigits());
        Assert.assertNull("payment method risk should be null " + fileName, res.getRisk());

    }
}

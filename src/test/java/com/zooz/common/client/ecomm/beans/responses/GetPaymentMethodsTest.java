package com.zooz.common.client.ecomm.beans.responses;

import com.fasterxml.jackson.core.type.TypeReference;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;
import com.zooz.common.client.ecomm.control.Controller;
import org.junit.*;
import org.junit.rules.TestName;

import java.io.IOException;

/**
 * Tests parsing of GetPaymentMethods responses
 */
public class GetPaymentMethodsTest extends ResponseTestBase<GetFundSourcesResponse> {

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
     * Tests parsing of GetPaymentMethods responses.
     * The test reads files with json strings from ./src/test/resources/v_[version_number]/getfundsourcesresponse.
     * To read files from a different location add -DdataDir=[path_to_data]. The data directory should be in the same structure as in the resource directory.
     */
    @Test
    public void parseResponse_GetPaymentMethods() {

        basicFlow(GetFundSourcesResponse.class.getSimpleName());

    }

    @Override
    public ZoozServerResponse<GetFundSourcesResponse> getResponseObject(String json, Controller controller) throws IOException {
        ZoozServerResponse<GetFundSourcesResponse> o;
        o = controller.parseResponse(json, new TypeReference<ZoozServerResponse<GetFundSourcesResponse>>() {

        });
        return o;
    }

    @Override
    public void checkAdditionalSuccessFields(ZoozResponseObject o, String fileName) {
        GetFundSourcesResponse res = (GetFundSourcesResponse)o;
        checkPaymentMethods(res.getPaymentMethods(),fileName);


    }

    @Override
    public void checkAdditionalErrorFields(ZoozResponseObject o, String fileName) {

    }
}


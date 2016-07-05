package com.zooz.common.client.ecomm.beans.responses;

import com.fasterxml.jackson.core.type.TypeReference;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;
import com.zooz.common.client.ecomm.control.Controller;
import org.junit.*;
import org.junit.rules.TestName;

import java.io.IOException;

/**
 * Tests parsing of Authorize responses
 */
public class AuthorizeResponseTest extends ResponseTestBase<AuthorizeResponse> {

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
     * Tests parsing of Authorize responses.
     * The test reads files with json strings from ./src/test/resources/v_[version_number]/authorizeresponse.
     * To read files from a different location add -DdataDir=[path_to_data]. The data directory should be in the same structure as in the resource directory.
     */
    @Test
    public void parseResponse_Authorize() {

        basicFlow(AuthorizeResponse.class.getSimpleName());

    }

    @Override
    public ZoozServerResponse<AuthorizeResponse> getResponseObject(String json, Controller controller) throws IOException {
        ZoozServerResponse<AuthorizeResponse> o;
        o = controller.parseResponse(json, new TypeReference<ZoozServerResponse<AuthorizeResponse>>() {

        });
        return o;
    }

    @Override
    public void checkAdditionalSuccessFields(ZoozResponseObject o, String fileName) {
        AuthorizeResponse res = (AuthorizeResponse)o;
        Assert.assertNotNull("payment type should not be null " + fileName, res.getResponseType());
        if (res.getResponseType().contains("3DSecure")) {
            Assert.assertNotNull("ObjThreeDSecure should not be null " + fileName, res.getObj3DSecure().getAcsUrl());
            Assert.assertNotNull("AcsUrl should not be null " + fileName, res.getObj3DSecure().getAcsUrl());
            Assert.assertNotNull("md should not be null " + fileName, res.getObj3DSecure().getMd());
            Assert.assertNotNull("paReq should not be null " + fileName, res.getObj3DSecure().getPaReq());
            Assert.assertNotNull("term url should not be null " + fileName, res.getObj3DSecure().getTermUrl());
        } else {
            Assert.assertNotNull("authorization code should not be null " + fileName, res.getAuthorizationCode());
        }
         Assert.assertNotNull("processor name should not be null " + fileName, res.getProcessorName());

        checkRisk(res.getRisk(),fileName);

    }

    @Override
    public void checkAdditionalErrorFields(ZoozResponseObject o, String fileName) {

    }
}


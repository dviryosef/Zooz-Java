package com.zooz.common.client.ecomm.beans.responses;

import com.fasterxml.jackson.core.type.TypeReference;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;
import com.zooz.common.client.ecomm.control.Controller;
import org.junit.*;
import org.junit.rules.TestName;

import java.io.IOException;

/**
 * Tests parsing of Redirect responses
 */
public class RedirectResponseTest extends ResponseTestBase<RedirectResponse>{

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
     * Tests parsing of Redirect responses
     * The test reads files with json strings from ./src/test/resources/v_[version_number]/redirectresponse
     * To read files from a different location add -DdataDir=[path_to_data]. The data directory should be in the same structure as in the resource directory.
     */
    @Test
    public void parseResponse_Redirect() {

        basicFlow(RedirectResponse.class.getSimpleName());

    }

    @Override
    public ZoozServerResponse<RedirectResponse> getResponseObject(String json, Controller controller) throws IOException {
        ZoozServerResponse<RedirectResponse> o;
        o = controller.parseResponse(json, new TypeReference<ZoozServerResponse<RedirectResponse>>() {

        });
        return o;
    }

    @Override
    public void checkAdditionalSuccessFields(ZoozResponseObject o, String fileName) {
        RedirectResponse res = (RedirectResponse)o;
        Assert.assertNull("error should be null " + fileName, res.getResponseErrorCode());
        Assert.assertNull("error description should be null " + fileName, res.getErrorDescription());
        Assert.assertNotNull("payment type should not be null " + fileName, res.getResponseType());
        Assert.assertTrue("redirect url or form data should not be null " + fileName, res.getRedirectUrl() != null || res.getFormData() != null);
        Assert.assertNotNull("processor name should not be null " + fileName, res.getProcessorName());


        checkRisk(res.getRisk(),fileName);

    }

    @Override
    public void checkAdditionalErrorFields(ZoozResponseObject o, String fileName) {

    }
}


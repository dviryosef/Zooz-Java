package com.zooz.common.client.ecomm.beans.responses;

import com.fasterxml.jackson.core.type.TypeReference;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;
import com.zooz.common.client.ecomm.control.Controller;
import org.junit.*;
import org.junit.rules.TestName;

import java.io.IOException;

/**
 * Tests parsing of Credit responses
 */
public class CreditResponseTest extends ResponseTestBase<CreditResponse> {

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

    public CreditResponseTest()
    {

    }
    /**
     * Tests parsing of Credit responses.
     * The test reads files with json strings from ./src/test/resources/v_[version_number]/creditresponse.
     * To read files from a different location add -DdataDir=[path_to_data]. The data directory should be in the same structure as in the resource directory.
     */
    @Test
    public void parseResponse_Credit() {

        basicFlow(CreditResponse.class.getSimpleName());

    }

    @Override
    public ZoozServerResponse<CreditResponse> getResponseObject(String json, Controller controller) throws IOException {
        ZoozServerResponse<CreditResponse> o;
        o = controller.parseResponse(json, new TypeReference<ZoozServerResponse<CreditResponse>>() {

        });
        return o;
    }

    @Override
    public void checkAdditionalSuccessFields(ZoozResponseObject o, String fileName) {
        CreditResponse res = (CreditResponse)o;
        Assert.assertNotNull("merchant id should not be null " + fileName, res.getMerchantId());
        Assert.assertNotNull("Reconciliation Id should not be null " + fileName, res.getReconciliationId());
        Assert.assertNotNull("processor name should not be null " + fileName, res.getProcessorName());
        checkRisk(res.getRisk(),fileName);

    }

    @Override
    public void checkAdditionalErrorFields(ZoozResponseObject o, String fileName) {

    }
}

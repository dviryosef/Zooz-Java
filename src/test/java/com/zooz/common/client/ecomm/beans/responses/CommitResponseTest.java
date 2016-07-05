package com.zooz.common.client.ecomm.beans.responses;

import com.fasterxml.jackson.core.type.TypeReference;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;
import com.zooz.common.client.ecomm.control.Controller;
import org.junit.*;
import org.junit.rules.TestName;

import java.io.IOException;

/**
 * Tests parsing of Commit responses
 */
public class CommitResponseTest extends ResponseTestBase<CommitResponse> {

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
     * Tests parsing of Commit responses.
     * The test reads files with json strings from ./src/test/resources/v_[version_number]/commitresponse.
     * To read files from a different location add -DdataDir=[path_to_data]. The data directory should be in the same structure as in the resource directory.
     */
    @Test
    public void parseResponse_Commit() {

        basicFlow(CommitResponse.class.getSimpleName());

    }

    @Override
    public ZoozServerResponse<CommitResponse> getResponseObject(String json, Controller controller) throws IOException {
        ZoozServerResponse<CommitResponse> o;
        o = controller.parseResponse(json, new TypeReference<ZoozServerResponse<CommitResponse>>() {

        });
        return o;
    }

    @Override
    public void checkAdditionalSuccessFields(ZoozResponseObject o, String fileName) {
        CommitResponse res = (CommitResponse)o;
        Assert.assertNotNull("processor name should not be null " + fileName, res.getProcessorName());

    }

    @Override
    public void checkAdditionalErrorFields(ZoozResponseObject o, String fileName) {

    }
}



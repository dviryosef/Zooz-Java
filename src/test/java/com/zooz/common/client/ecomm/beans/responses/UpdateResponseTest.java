package com.zooz.common.client.ecomm.beans.responses;

import com.fasterxml.jackson.core.type.TypeReference;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;
import com.zooz.common.client.ecomm.control.Controller;
import org.junit.*;
import org.junit.rules.TestName;

import java.io.IOException;

/**
 * Tests parsing of update responses
 */
public class UpdateResponseTest extends ResponseTestBase<UpdateResponse>{






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
     * Tests parsing of update responses.
     * The test reads files with json strings from ./src/test/resources/v_[version_number]/updateresponse.
     * To read files from a different location add -DdataDir=[path_to_data]. The data directory should be in the same structure as in the resource directory.
     */
    @Test
    public void parseResponse_Update() {

        basicFlow(UpdateResponse.class.getSimpleName());

    }




    @Override
    public ZoozServerResponse<UpdateResponse> getResponseObject(String json,Controller controller) throws IOException {
        ZoozServerResponse<UpdateResponse> o;
        o = controller.parseResponse(json, new TypeReference<ZoozServerResponse<UpdateResponse>>() {

        });
        return o;
    }

    @Override
    public void checkAdditionalSuccessFields(ZoozResponseObject o, String fileName) {

    }

    @Override
    public void checkAdditionalErrorFields(ZoozResponseObject o, String fileName) {



    }
}

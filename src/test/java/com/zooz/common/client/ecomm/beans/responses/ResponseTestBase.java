package com.zooz.common.client.ecomm.beans.responses;

import com.zooz.common.client.ecomm.beans.FundSource;
import com.zooz.common.client.ecomm.beans.Risk;
import com.zooz.common.client.ecomm.beans.RiskResult;
import com.zooz.common.client.ecomm.beans.server.response.ZoozServerResponse;
import com.zooz.common.client.ecomm.control.Controller;
import com.zooz.common.client.ecomm.control.ControllerSiteConfiguration;
import com.zooz.common.client.ecomm.control.SingleSiteController;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Assert;
import org.skyscreamer.jsonassert.JSONCompare;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.skyscreamer.jsonassert.JSONCompareResult;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Base class for all response unit tests
 */
public abstract class ResponseTestBase<T extends ZoozResponseObject> {

    public static final String TEST_DATA_LOCATION = "./src/test/resources/";

    protected static String testDir = null;
    protected static ControllerSiteConfiguration defaultWorkingSiteConfig;

    public ResponseTestBase()
    {
        defaultWorkingSiteConfig = new ControllerSiteConfiguration("https://localhost:8080", "c2e2e708-2aa0-427e-9217-ecf5feae4f80", "com.zooz.Caap.sample");
        testDir = System.getProperty("dataDir");

        if (testDir == null)
            testDir = TEST_DATA_LOCATION;

        if(!testDir.endsWith("/"))
        {
            testDir = testDir + "/";
        }
    }



    public void basicFlow(String classname) {

        Map<String,List<String>> responseList = null;
        try {
            responseList = getResponseTestData(classname);
        } catch (IOException e) {
            Assert.fail("unable to open test file :" + e);
        }
        if(responseList == null)
            return;
        Controller controller = new SingleSiteController(defaultWorkingSiteConfig);
        int numObjects = 0;
        for (Map.Entry<String,List<String>> pair : responseList.entrySet()) {
            //Map.Entry<String,List<String>> pair = (Map.Entry<String,List<String>>) o1;
            List<String> items =  pair.getValue();
            for (String item : items) {
                numObjects++;
                try {
                    ZoozServerResponse<T> o = getResponseObject(item, controller);

                    JSONObject data = new JSONObject(o.toString());
                    JSONObject first = new JSONObject(item);
                    JSONCompareResult compRes = JSONCompare.compareJSON(first, data, JSONCompareMode.LENIENT);
                    Assert.assertTrue(compRes.getMessage(),compRes.getFieldFailures().size() == 0);

                    Assert.assertNotNull("response status is null " + pair.getKey(), o.getResponseStatus());
                    Assert.assertNotNull("response object is null " + pair.getKey(), o.getResponseObject());

                    if (o.getResponseStatus() == 0) {
                        Assert.assertNull("error should be null " + pair.getKey(), o.getResponseObject().getResponseErrorCode());
                        Assert.assertNull("error description should be null " + pair.getKey(), o.getResponseObject().getErrorDescription());
                        checkAdditionalSuccessFields(o.getResponseObject(), pair.getKey());

                    } else {
                        Assert.assertNotNull("response error code is null " + pair.getKey(), o.getResponseObject().getResponseErrorCode());
                        Assert.assertNotNull("error description should not  be null " + pair.getKey(), o.getResponseObject().getErrorDescription());
                        checkAdditionalErrorFields(o.getResponseObject(), pair.getKey());
                    }


                } catch (Exception e) {
                    Assert.fail("problem in parsing " + classname + " in file: " + pair.getKey() + " json: " + item + " Exception: " + e);

                }
            }
        }
        System.out.println(classname + " - Parsed: " + numObjects + " Responses Successfully");
    }

    public abstract ZoozServerResponse<T> getResponseObject(String json,Controller controller)throws IOException;

    public abstract void  checkAdditionalSuccessFields(ZoozResponseObject o,String fileName) throws JSONException;

    public abstract void  checkAdditionalErrorFields(ZoozResponseObject o,String fileName);

    protected Map<String,List<String>> getResponseTestData(String name) throws IOException {
        File file = new File(testDir);
        String[] directories = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File current, String name) {
                return new File(current, name).isDirectory();
            }
        });

        HashMap<String, List<String>> myEntries = new HashMap<String, List<String>>();

        for(String directory:directories) {
            File dir = new File(testDir + directory + '/'+ name.toLowerCase());
            File[] files = dir.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return !(new File(dir, name).isHidden()) && !(new File(dir, name).isDirectory());
                }
            });


            if (files == null)
                continue;

            for (File f : files) {

                ArrayList<String> newList = new ArrayList<String>();
                myEntries.put(directory + "_" + f.getName() , newList);
                System.out.println("reading from file " + f.getAbsolutePath());

                FileInputStream fis = new FileInputStream(f);

                //Construct BufferedReader from InputStreamReader
                BufferedReader br = new BufferedReader(new InputStreamReader(fis));


                try {


                    String nextLine;
                    while ((nextLine = br.readLine()) != null) {
                        myEntries.get(directory + "_" + f.getName()).add(nextLine);
                    }
                } finally {

                        br.close();


                }
            }
        }
        return myEntries;

    }

    protected void checkPaymentDetails(PaymentDetailsResponse o,String fileName) throws JSONException {



            Assert.assertNotNull("payment method should not be null " + fileName, o.getPaymentMethod());
            Assert.assertNotNull("payment type should not be null " + fileName, o.getPaymentType());
            Assert.assertNotNull("appname  should not be null " + fileName, o.getAppName());
            Assert.assertNotNull("program id should not be null " + fileName, o.getProgramId());
            Assert.assertNotNull("payment status should not be null " + fileName, o.getPaymentStatus());
            Assert.assertNotNull("currency code should not be null " + fileName, o.getCurrencyCode());
            Assert.assertNotNull("is sandbox should not be null " + fileName, o.isSandbox());
            Assert.assertNotNull("payment status code should not be null " + fileName, o.getPaymentStatusCode());
            Assert.assertNotNull("amount should not be null " + fileName, o.getAmount());
            Assert.assertNotNull("tax amount should not be null " + fileName, o.getTaxAmount());
            checkRisk(o.getRisk(),fileName);



    }

    protected void checkPaymentMethodDetails(PaymentMethodIPN o,String fileName) throws JSONException {
        Assert.assertNotNull("payment method Token should not be null " + fileName, o.getPaymentMethod());
        Assert.assertNotNull("program id should not be null " + fileName, o.getProgramId());
    }

    protected void checkRisk(Risk risks,String fileName)
    {
        if(risks == null)
            return;
        for(RiskResult risk: risks.getResults())
        {
            Assert.assertNotNull("Risk action should not be null " + fileName, risk.getAction());
            Assert.assertNotNull("Risk score should not be null " + fileName, risk.getRiskScore());
            Assert.assertNotNull("Risk context should not be null " + fileName, risk.getContext());
            Assert.assertNotNull("Risk description should not be null " + fileName, risk.getDescription());
            //Assert.assertNotNull("Risk detrmining rule should not be null " + pair.getKey(), risk.getDeterminingRule());
            //Assert.assertNotNull("Risk score origin should not be null " + pair.getKey(), risk.getRiskScoreOrigin());
        }
    }

    protected void checkPaymentMethods(List<FundSource> paymentMethods,String fileName)
    {
        if(paymentMethods == null)
            return;
        for(FundSource fundSource: paymentMethods)
        {
            Assert.assertNotNull("payment token should not be null " + fileName, fundSource.getPaymentMethodToken());
            Assert.assertNotNull("valid date should not be null " + fileName, fundSource.getValidDate());
            Assert.assertNotNull("payment method status should not be null " + fileName, fundSource.getPaymentMethodStatus());

        }
    }




}

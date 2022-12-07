package Org.testing.Testcases;

import java.io.IOException;
import java.util.Properties;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Org.testing.ResponseValidation.responseValidation;
import Org.testing.testSteps.HTTPsMethods;
import Org.testing.utilities.JsonHandle;
import Org.testing.utilities.JsonParsingUsingOrgJson;
import Org.testing.utilities.Propertieshandle;
import Org.testing.utilities.Reports;
import io.restassured.response.Response;

public class TC1_Postrequest 
{
	public static String returnIDvalue;
	public void testcase1() throws IOException 
	{
		
		ExtentReports report=Reports.extentRepo();				//ExtentReport class
		ExtentTest test=report.startTest("TC3_GetOrgParserequest");	//ExtentTest
			
	
	
		Properties pr=Propertieshandle.ReadProperties("../API_FrameWork/URI.properties");
		String bodydata=JsonHandle.ReadJson("../API_FrameWork/src/test/java/Org/testing/Resource/inputPayload.json");
		HTTPsMethods http=new HTTPsMethods(pr);
		Response res=http.PostMethod(bodydata, "QA_URI_Selenium");
		
		test=responseValidation.Statuscodevalidation(201, res, test);	//calling the StautsValidation method from responseValidation class
		
		
		returnIDvalue=JsonParsingUsingOrgJson.parseJson(res.asString(), "id");
		
		
		report.endTest(test);
		report.flush();
	}
}
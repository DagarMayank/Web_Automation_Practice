package Org.testing.Testcases;

import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Org.testing.ResponseValidation.responseValidation;
import Org.testing.testSteps.HTTPsMethods;
import Org.testing.utilities.JsonParsingUsingOrgJson;
import Org.testing.utilities.Propertieshandle;
import Org.testing.utilities.Reports;
import io.restassured.response.Response;

public class TC3_GetOrgParsing 
{
	public void testcase3() throws IOException
	{
		String expectedFirstname="Mayank";
		ExtentReports report=Reports.extentRepo();				//ExtentReport class
		ExtentTest test=report.startTest("TC3_GetOrgParserequest");	//ExtentTest
		
		
		
		Properties pr=Propertieshandle.ReadProperties("../API_FrameWork/URI.properties");
		HTTPsMethods http= new HTTPsMethods(pr);
		Response res=http.Getparse("QA_URI_API");
		
		test=responseValidation.Statuscodevalidation(201, res, test);	//calling the StautsValidation method from responseValidation class
		
		
		String obj=JsonParsingUsingOrgJson.responseParse(res.toString(),"id");
		System.out.println((int)obj.trim().charAt(0));
	
		String ActualFirstName=res.jsonPath().get(".firstname");	//we are getting the name using the jsonpath by online JsonpathEvalutor

		Assert.assertEquals(ActualFirstName, expectedFirstname); 		//this is hard Assertion 
		
		 test=responseValidation.datavalidation(expectedFirstname, ActualFirstName, test); //this is soft assertion we are creating the class
		 //of response validation and comparing the data by calling the datavalidation method.
	
		 report.endTest(test);
		 report.flush();		//for saving the data 
	}
}

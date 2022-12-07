package Org.testing.ResponseValidation;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.restassured.response.Response;

public class responseValidation
{
	public static ExtentTest Statuscodevalidation(int expectedStatusCode , Response res, ExtentTest test)
	{
		if (expectedStatusCode==res.statusCode()) 
		{
				test.log(LogStatus.PASS, "Status code is matching the expected the result");
			
		}
		else 
		{
				test.log(LogStatus.FAIL, "Status code is not matching the expected result");
		}
		return test;
	}
	public static ExtentTest datavalidation(String expectedName, String ActualName, ExtentTest test)
	{
		if (expectedName.equals(ActualName)) 
		{
				test.log(LogStatus.PASS, "Actual Name is matching the expected the result");
			
		}
		else 
		{
				test.log(LogStatus.FAIL, "Actual Name is not  matching the expected the result");
		}
		return test;
	}	
	
}	

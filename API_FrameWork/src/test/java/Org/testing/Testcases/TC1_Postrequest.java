package Org.testing.Testcases;

import java.io.IOException;
import java.util.Properties;


import Org.testing.testSteps.HTTPsMethods;
import Org.testing.utilities.JsonHandle;
import Org.testing.utilities.JsonParsingUsingOrgJson;
import Org.testing.utilities.Propertieshandle;
import io.restassured.response.Response;

public class TC1_Postrequest 
{
	public static String returnIDvalue;
	public void testcase1() throws IOException 
	{
		Properties pr=Propertieshandle.ReadProperties("../API_FrameWork/URI.properties");
		String bodydata=JsonHandle.ReadJson("../API_FrameWork/src/test/java/Org/testing/Resource/inputPayload.json");
		HTTPsMethods http=new HTTPsMethods(pr);
		Response res=http.PostMethod(bodydata, "QA_URI_Selenium");
		returnIDvalue=JsonParsingUsingOrgJson.parseJson(res.asString(), "id");
	
	}
}
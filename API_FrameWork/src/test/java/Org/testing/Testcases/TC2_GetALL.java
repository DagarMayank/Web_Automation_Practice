package Org.testing.Testcases;

import java.io.IOException;
import java.util.Properties;

import Org.testing.testSteps.HTTPsMethods;
import Org.testing.utilities.Propertieshandle;

public class TC2_GetALL
{
	public void testcase2() throws IOException 
	{
	Properties pr=Propertieshandle.ReadProperties("../API_FrameWork/URI.properties");
	HTTPsMethods http= new HTTPsMethods(pr);
	http.GetAll("QA_URI_Selenium");
	
			
	}
}
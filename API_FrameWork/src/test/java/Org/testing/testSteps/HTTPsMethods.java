package Org.testing.testSteps;

import static io.restassured.RestAssured.*;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class HTTPsMethods 
{
	Properties pr;		//global variable

	public HTTPsMethods(Properties pr2) {
		this.pr =pr2;
	}


    public Response PostMethod(String bodydata,String urikey)
	{
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(bodydata)
				.when()
				.post(pr.getProperty(urikey));
		System.out.println("Status code is "+res.statusCode());
		System.out.println(res.asString());
		return res;
	}
    
    public void GetAll(String urikey)
    {
    	Response res=given().contentType(ContentType.JSON).when().get(pr.getProperty(urikey));
    	System.out.println("Status code is "+res.statusCode());
    	System.out.println(res.asString());
    }
    public Response Getparse(String urikey)
    {
    	Response res=given().contentType(ContentType.JSON).when().get(pr.getProperty(urikey));
    	System.out.println("Status code is "+res.statusCode());
    	return res;
    }
    
}

package org.Testing.testCases;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TC2_OrgJsonGetMethod 
{
	@Test
	public  void testcase() 
	{
	
	   	Response res=
	   			given()
	   			.contentType(ContentType.JSON)
	   			.when()
	   			.get("http://localhost:3000/SeleniumStudent");
	   	
	   	System.out.println("Status code is "+res.statusCode());
	   	System.out.println(res.asString());
		
		
		
	}
}

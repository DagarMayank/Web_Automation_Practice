package org.Testing.testCases;

import static io.restassured.RestAssured.*;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TC1_OrgJsonPostRequest 
{	
		@Test
		public void testcase() 
		{
				JSONObject ob=new JSONObject();
				ob.put("Firstname", "Ankit");
				ob.put("lastname", "Attri");
				ob.put("Designation", "Rohtak");
				
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(ob.toString())
				.when()
				.post("http://localhost:3000/SeleniumStudent");
		
		System.out.println("Status Code is  "+res.statusCode());
		}
}

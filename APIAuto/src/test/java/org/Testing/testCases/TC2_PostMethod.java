package org.Testing.testCases;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TC2_PostMethod 
{
	@Test
	public void testcase() throws IOException   
	{
		
		File f=new File("../APIAuto/target/BodyData.json");
		FileReader fr=new FileReader(f);
		JSONTokener j=new JSONTokener(fr);			//reading the json file
		JSONObject jb=new JSONObject(j);			//storing the data in object
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(jb.toString())
		.when()
		.post("http://localhost:3000/ApiStudent");
	
		System.out.println("Status code is "+res.statusCode());
		System.out.println("Response data is "+res.asString());
	}
}

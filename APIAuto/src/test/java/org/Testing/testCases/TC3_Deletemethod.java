package org.Testing.testCases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class TC3_Deletemethod 
{
	@Test
	public void testcase() throws FileNotFoundException 
	{
		File f=new File("../APIAuto/target/BodyData.json");
		FileReader fr=new FileReader(f);
		JSONTokener x=new JSONTokener(fr);
		JSONObject jb=new JSONObject(x);
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(jb.toString())
		.when()
		.patch("http://localhost:3000/ApiStudent/6?Designation=Marketing Sales Head");
	
		System.out.println("Status code is ");
		System.out.println(res.statusCode());
		System.out.println(res.asString());
	}
}

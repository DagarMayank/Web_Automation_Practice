package Org.testing.TestScripts;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TC1_GetMethod 
{
	 public static void main(String[] args) {
		Response res=
		 given()
		 .contentType(ContentType.JSON)
		 .when()
		 .get("http://localhost:3000/ApiStudent");
		
		System.out.println("Status code is "+res.statusCode());
	 }
}

package org.Testing.testCases;

import org.json.JSONObject;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TC3_ComplexOrgJsonpostMethod 
{
		public static void main(String[] args) 
		{
				JSONObject inner=new JSONObject(); /*Example of complex Json {
																				 {
																			        	}
																			 }*/
				inner.put("TeamName", "Quality");
				inner.put("NoOfMembers", "10");
				inner.put("ProectworkingOn", "ProjectA");
				
				JSONObject outer=new JSONObject();
				outer.put("firstname", "Udit");
				outer.put("lastname", "Chandel");
				outer.put("Designation", inner);
				
				Response res=given().contentType(ContentType.JSON).body(outer.toString()).post("http://localhost:3000/DevpStudent");
				System.out.println("Status code is "+res.statusCode());
				System.out.println(res.asString());
		}
}

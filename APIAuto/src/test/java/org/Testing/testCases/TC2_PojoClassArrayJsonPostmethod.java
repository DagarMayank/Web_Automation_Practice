package org.Testing.testCases;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TC2_PojoClassArrayJsonPostmethod 
{
	public static void main(String[] args) 
	{
		PojoClassInnerInforamtion pi=new PojoClassInnerInforamtion();
		pi.setNoofMembers("8");
		pi.setProject("IOT");
		pi.setTeamname("AutomationAPI");
		
		
		
		PojoClassBasicOuterInformation bi=new PojoClassBasicOuterInformation();
		bi.setFirstname("Malkhe");
		bi.setLastname("Singh");
		bi.setDesignation("Business Man");
		bi.setTeam(pi);
		//bi.setFamily(fam);
		
		Response res= given().contentType(ContentType.JSON).body(bi).when().post("http://localhost:3000/DevpStudent");
		System.out.println("Status code is "+res.statusCode());
		System.out.println(res.asString());
	}
}

package org.Testing.testCases;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TC1_PojoClassPostmethod 
{
	@Test
	public void testcase() 
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
		
		Response res= given().contentType(ContentType.JSON).body(bi).when().post("http://localhost:3000/DevpStudent");
		System.out.println("Status code is "+res.statusCode());
		System.out.println(res.asString());
	}
}

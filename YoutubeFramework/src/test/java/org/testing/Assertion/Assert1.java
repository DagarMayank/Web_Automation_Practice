package org.testing.Assertion;

public class Assert1 
{

	public static void assertionEquals(String expectedURL, String currentUrl) {
		if(expectedURL.equals(currentUrl))
		{
			System.out.println("Assertion is Passed");
		}
		else
		{
			System.out.println("Assertion is failed");
		}
		
	}
}

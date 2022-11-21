package org.testing.TestScript;



import org.testing.Assertion.Assert1;
import org.testing.Base.Base;
import org.testing.Pages.HomePage;
import org.testing.Pages.LogOut;
import org.testing.Pages.Login;
import org.testng.annotations.Test;

public class TC1 extends Base
{
	
	@Test
	public void signup() throws Exception
	{
		Login log=new Login(driver, pr);
		log.login("ballu.badmass101@gmail.com","India@1234");
		
		Thread.sleep(5000);
		String expectedURL="https://www.youtube.com/"; 
		Assert1.assertionEquals( expectedURL,driver.getCurrentUrl());
		
	   
		
		HomePage hp=new HomePage(driver, pr);
		hp.trending();
		
		LogOut logout=new LogOut(driver, pr);
		logout.logout();
	}
	
}	




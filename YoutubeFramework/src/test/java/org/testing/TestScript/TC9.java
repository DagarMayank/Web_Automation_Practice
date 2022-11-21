package org.testing.TestScript;



import org.testing.Base.Base;
import org.testing.Pages.HomePage;
import org.testing.Pages.LogOut;
import org.testing.Pages.Login;
import org.testng.annotations.Test;



public class TC9 extends Base
{
	
	@Test
	public void Login() throws Exception
	{
		
		Login log=new Login(driver, pr);
		log.login("ballu.badmass101@gmail.com","India@1234");
			Thread.sleep(10000);
	
		HomePage hp= new HomePage(driver, pr);
		hp.Comments();
		Thread.sleep(5000);
		
		LogOut logout=new LogOut(driver, pr);
		logout.logout();
	
	}
	
	
}

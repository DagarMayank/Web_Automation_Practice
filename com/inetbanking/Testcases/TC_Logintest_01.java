package com.inetbanking.Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.inetbanking1.pagesobject.Baseclass;
import com.inetbanking1.pagesobject.Loginpage1;


public class TC_Logintest_01 extends Baseclass
{
	@Test
    public void LoginTest()
    {
		 
		 logger.info("sucessfully open URL");
		 Loginpage1 lp=new Loginpage1(driver);
		 lp.setUserName(username);
		 logger.info("sucessfully setusername");
		 lp.settypePassword(password);
		 logger.info("sucessfully setpassword");
		 lp.ClickSubmit();
		 logger.info("sucessfully ClickSubmitbtn");
		 if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		 {
			 Assert.assertTrue(true);
		 }
		 else {
			 Assert.assertTrue(false);
		 }
		
    }
}
	 
	 
	
	
	




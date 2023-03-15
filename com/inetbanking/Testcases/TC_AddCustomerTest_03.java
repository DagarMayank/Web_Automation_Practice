package com.inetbanking.Testcases;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.apache.commons.lang3.RandomStringUtils;
import com.inetbanking1.pagesobject.AddCustomerPage;
import com.inetbanking1.pagesobject.Baseclass;
import com.inetbanking1.pagesobject.Loginpage1;

public class TC_AddCustomerTest_03 extends Baseclass{
	
    
	@Test
	 public void addNewCustomer() throws Exception  
	    {
    	
		Loginpage1 lp=new Loginpage1(driver);
    	 lp.setUserName(username);
    	 logger.info("username is provided");
    	 lp.settypePassword(password);
    	 logger.info("Password is provided");
    	 lp.ClickSubmit();
    	 
    	 Thread.sleep(3000);
         
    	 AddCustomerPage addcust=new AddCustomerPage(driver);
    	 addcust.ClickAddNewCustomer();
    	 logger.info("providing customer details....");
    	 
    	 addcust.custName("srishti");
    	 addcust.custgender("female");
    	 addcust.custdob("05","01","2000");
    	 
    	 Thread.sleep(3000);
    	 
    	 addcust.custaddress("INDIA");
    	 addcust.custcity("GZB");
    	 addcust.custstate("UP");
    	 addcust.custpinno("201001");
         addcust.custtelephoneno("9716345901");
         
         String email=randomestring()+"@gmail.com";
         addcust.custemailid(email);
         addcust.custpassword("acdefg");
         addcust.custsubmit();
         Thread.sleep(2000);
         logger.info("validation details....");
    	 
        boolean res= driver.getPageSource().contains("Customer Registered Successfully!!!");
        if(res==true) {
        	Assert.assertTrue(true);
        	logger.info("test case passed....");
       	 
        }else 
        {
        	logger.info("test case failed....");
        	getSCREENSHOT(driver,"addNewCustomer");
        	Assert.assertTrue(false);
        }
        
   }	
	
        public String randomestring() {
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return (generatedstring);
		
	}

	    public static String randomenum() {
		String generatedstring2=RandomStringUtils.randomNumeric(4);
		return (generatedstring2);
		
	}
	
	
}

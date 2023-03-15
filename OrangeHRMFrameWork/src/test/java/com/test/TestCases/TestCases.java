package com.test.TestCases;

import com.test.Actions.LogOutAction;
import com.test.Actions.LoginAction;
import com.test.Basebroswer.Base;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCases extends Base{
	
	@Test(priority=0)
	@Parameters({"userName","passWord"})
	public void test_logIn(String userName,String passWord) {

		LoginAction login =new LoginAction(driver);
		login.loginUserName(userName);
		login.loginPassWord(passWord);
		login.loginSubmitButton();
  
		LogOutAction logout=new LogOutAction(driver);
		logout.logOutDropDownMenu();
		logout.logOutButton();
	
	
	}
	
	@Test(priority=1)
	public void test_logOut()
	{
		System.out.println("Hello All");
	}
}


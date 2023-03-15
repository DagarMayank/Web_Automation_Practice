package com.inetbanking1.pagesobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage1 {
	
	public WebDriver ldriver;
	
    //constructors
    public Loginpage1(WebDriver rdriver)
    {
    	ldriver=rdriver;
    	PageFactory.initElements(ldriver,this);
    	
    }
    @FindBy(name="uid")
    @CacheLookup
    WebElement txtUserName;
    
    @FindBy(name="password")
    @CacheLookup
    WebElement txtPassword;
    
    @FindBy(name="btnLogin")
    @CacheLookup
    WebElement btnLogin;
    
    @FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
    @CacheLookup
    WebElement lnkLogout;
    
    
    //methods
    public void setUserName(String uname) 
    {
    	txtUserName.sendKeys(uname);
    }
    	  
     public void settypePassword(String pwd) 
     {
   	       txtPassword.sendKeys(pwd);
      }
       public void ClickSubmit() 
      {
   	      btnLogin.click();
      }
       public void clickLogoutbtn() {
    	   lnkLogout.click();
       }
}

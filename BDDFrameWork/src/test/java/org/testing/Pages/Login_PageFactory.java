package org.testing.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_PageFactory 
{
	@FindBy(xpath="//input[@placeholder='Enter your full name']")
	WebElement txt_username;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement txt_password;
	
	@FindBy(xpath="//button[@id='login']")
												//@Cache it will stored the value of webelemnt LoginButton in the System memory
												//By doing this it will not search for the button over and over
												//the webelemnt it will direatly take it from the memory
	WebElement btn_login;
	
	WebDriver driver;
	public Login_PageFactory(WebDriver driver)
	{
		this.driver=driver;					
									//	AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(driver, 20);
									//	PageFactory.initElements(factory, this);
									//This command is used to put the wait over the webelement 
		
		
		PageFactory.initElements(driver, this);
	}
	
	public void username(String username){
		txt_username.sendKeys(username);
	}
	public void password(String password) {
		txt_password.sendKeys(password);
	}
	public void login()
	{
		btn_login.click();
	}
}

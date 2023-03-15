package com.test.Actions;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.commonLibrary.CLIB;


public class LoginAction 
{
	CLIB clib= new CLIB();
	
	public WebDriver driver;
	@FindBy(xpath="//input[@placeholder='Username']")
	public static  WebElement login_txt_UserName;

	@FindBy(xpath="//input[@placeholder='Password']")
	public static WebElement login_txt_Password;

	@FindBy(xpath="//button[@type='submit' and contains(text(),'')]")
	public static WebElement login_btn_SubmitButton;


	public LoginAction(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void loginUserName(String username){
			
			clib.elementIsDisplayed(login_txt_UserName);
			clib.mouseHoverToElement(login_txt_UserName, driver);
			clib.sendInput(username, login_txt_UserName);
	}
	
	public void loginPassWord(String passWord) {
		clib.elementIsDisplayed(login_txt_Password);
		clib.mouseHoverToElement(login_txt_Password, driver);
		clib.sendInput(passWord,login_txt_Password );
	}
	
	public void loginSubmitButton() {
		clib.elementIsDisplayed(login_btn_SubmitButton);
		clib.mouseHoverToElement(login_btn_SubmitButton, driver);
		clib.WaitForElementClickable(login_btn_SubmitButton, driver);
	}
	
}

package com.test.Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.commonLibrary.CLIB;

public class LogOutAction {
	
	public WebDriver driver;
	CLIB clib=new CLIB();
	
	@FindBy(xpath="//ul/li/span[@class='oxd-userdropdown-tab']")
	WebElement logOut_btn_DropDown;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	WebElement logout_btn;
	
	public LogOutAction(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void logOutDropDownMenu(){
		
		clib.elementIsDisplayed(logOut_btn_DropDown);
		clib.mouseHoverToElement(logOut_btn_DropDown, driver);
		clib.WaitForElementClickable(logOut_btn_DropDown, driver);
	}
	
	public void logOutButton() {
		clib.elementIsDisplayed(logout_btn);
		clib.mouseHoverToElement(logout_btn, driver);
		clib.WaitForElementClickable(logout_btn, driver);
	}
}

package org.testing.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	WebDriver driver;
	
	By txt_username_loginPage=By.xpath("//input[@placeholder='Enter your full name']");
	By txt_password_loginpage=By.xpath("//input[@id='password']");
	By btn_Login_loginPage=By.xpath("//button[@id='login']");
	By btn_Logout_loginPage=By.xpath("//button[@id='logout']");
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void enterUsername(String username)
	{
		driver.findElement(txt_username_loginPage).sendKeys(username);
	}
	public void enterPassword(String password)
	{
		driver.findElement(txt_password_loginpage).sendKeys(password);
	}
	public void loginbutton()
	{
		driver.findElement(btn_Login_loginPage).click();
	}
}

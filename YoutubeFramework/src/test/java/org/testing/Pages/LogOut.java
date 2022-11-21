package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogOut 
{
	WebDriver driver;
	Properties pr;
	public LogOut(WebDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	
	public void logout() throws Exception
	{
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(pr.getProperty("BButton"))).click();
		Thread.sleep(5000);
		WebElement signout=driver.findElement(By.xpath(pr.getProperty("signOut"))); 								//div[@id='primary-text-container']/ancestor::a[@href='/logout']  
																																								//yt-formatted-string[text()='Sign out']/ancestor::tp-yt-paper-item"));
																																								//button[@id='avatar-btn']
		signout.click();
		System.out.println("You are now signout");
	
	}
}

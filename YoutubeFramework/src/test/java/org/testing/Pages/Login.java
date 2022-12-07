package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login
{	
	WebDriver driver;
	Properties pr;
	
	public Login(WebDriver driver, Properties pr) //use of constructor here is to assigning the values
	{
		this.driver=driver;
		this.pr=pr;
	}
	public void login(String userName , String password) throws InterruptedException
	{
		WebElement SignUp= driver.findElement(By.cssSelector(pr.getProperty("SignUp")));
		SignUp.click();
		
		
		WebElement EmailID= driver.findElement(By.xpath(pr.getProperty("EmailID")));
		EmailID.sendKeys(userName);
		Thread.sleep(3000);
		
		WebElement NextButton= driver.findElement(By.xpath(pr.getProperty("NextButton")));
		NextButton.click();
		Thread.sleep(3000);
		
		WebElement Password= driver.findElement(By.xpath(pr.getProperty("Password")));
		Password.sendKeys(password);
		WebElement NextButton1= driver.findElement(By.xpath(pr.getProperty("NextButton1")));
		NextButton1.click();
		Thread.sleep(3000);
		
//		Alert alt=driver.switchTo().alert();
//		alt.dismiss();
		

		
		Thread.sleep(10000);
	
	}
}

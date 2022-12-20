package org.testing.StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDef_YoutubeFrameWork 
{
	public WebDriver driver;

	
	@Before
	public void setup()
	{

		System.setProperty("webdriver.chrome.driver", "../YoutubeFramework/chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("Before Method Running fine");
	}
	
	@After()
	public void Avtr() throws Exception{
			driver.findElement(By.xpath("//button[@id='avatar-btn']")).click(); Thread.sleep(3000);
			driver.findElement(By.xpath("//yt-formatted-string[text()='Sign out']/ancestor::tp-yt-paper-item")).click(); Thread.sleep(3000); driver.close();
	}
	
	 
	@Given("Click on the Signup tab")
	 public void Click_on_the_Signup_tab()
	 {
		WebElement SignUp= driver.findElement(By.cssSelector("#buttons ytd-button-renderer div.yt-spec-touch-feedback-shape__fill"));
		SignUp.click();
		
	 }
	 @And("User is Navigated to EnterLogin Enter username and password and click on next")
	 public void User_is_Navigated_to_EnterLogin_Enter_username_and_password_and_click_on_next() throws Exception
	 {
		 WebElement EmailID= driver.findElement(By.xpath("//input[@autocomplete='username']"));
			EmailID.sendKeys("ballu.badmass101@gmail.com");
			Thread.sleep(3000);
			
			WebElement NextButton= driver.findElement(By.xpath("//span[text()='Next']"));
			NextButton.click();
			Thread.sleep(3000);
			

			 WebElement Password= driver.findElement(By.xpath("//input[@aria-label='Enter your password']"));
				Password.sendKeys("India@1234");
				WebElement NextButton1= driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']"));
				NextButton1.click();
				Thread.sleep(3000);
			
	 }
//	 @And("User enters password")
//	 public void UserEntersPassword() throws Exception
//	 {
//		 Thread.sleep(4000);
//
//		 WebElement Password= driver.findElement(By.xpath("//input[@aria-label='Enter your password']"));
//			Password.sendKeys("India@1234");
//			WebElement NextButton1= driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']"));
//			NextButton1.click();
//			Thread.sleep(3000);
//			
//	 }
	 @Then("User is Navigated to HomePage")
	 public void User_is_Navigated_to_HomePage()
	 {
		 System.out.println(driver.getCurrentUrl());
	 }
	 
	 
	 
	 @And("Click on Hisotry")
	 public void Click_on_History()
	 {
		 WebElement history=driver.findElement(By.xpath("//div[@id='section-items']//a//tp-yt-paper-item//yt-formatted-string[text()='History']"));
			history.click();
			
	 }
	 @Then("User is Navigated to History tab")
	 public void User_is_Navigated_to_History_tab()
	 {
		 System.out.println(driver.getCurrentUrl());
	 }
	 
	 
	 @And("Click on Trending")
	 public void Click_on_Trending()
	 {
		 WebElement trending= driver.findElement(By.xpath("//yt-formatted-string[text()='Trending']"));
			trending.click();
			
	 }
	 @Then("User is Navigated to Trending tab")
	 public void User_is_Navigated_to_Trending_tab()
	 {
		 System.out.println(driver.getCurrentUrl());
	 }
	 
	 
	 
	 
	 
	 
}

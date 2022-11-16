package org.testing.TestScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC8 
{
	public WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "../YoutubeFramework/chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		System.out.println("BeforeMethod");
	}
	
	@Test
	public void Login() throws Exception
	{
		WebElement SignUp= driver.findElement(By.cssSelector("#buttons ytd-button-renderer div.yt-spec-touch-feedback-shape__fill"));
		SignUp.click();
		
		WebElement EmailID= driver.findElement(By.xpath("//input[@autocomplete='username']"));
		EmailID.sendKeys("ballu.badmass101@gmail.com");
		Thread.sleep(3000);
		
		WebElement NextButton= driver.findElement(By.xpath("//span[text()='Next']"));
		NextButton.click();
		Thread.sleep(3000);
		
		WebElement Password= driver.findElement(By.xpath("//input[@type='password']"));
		Password.sendKeys("India@1234");
		WebElement NextButton1= driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']"));
		NextButton1.click();
		Thread.sleep(3000);
		System.out.println("You are now loged In ");
		Thread.sleep(10000);
		
		
		List<WebElement>  allvideo= driver.findElements(By.id("video-title"));
		System.out.println("Size of allVideo is "+allvideo.size());			//.size method is used for getting the number of element stored in the Webelements 
		allvideo.get(5).click();
			Thread.sleep(5000);
			
		String videoName = driver.findElement(By.xpath("//h1[@class='style-scope ytd-watch-metadata']")).getText();
		System.out.println(videoName);
			
			
			
		driver.findElement(By.xpath("//div[@id=\"title\"]//yt-formatted-string[text()='"+videoName+"']/../../..//span[text()='Subscribe']/../..")).click();					//div[@id=\"title\"]//yt-formatted-string[text()= '"+videoName+"']/../../..//button[contains(@aria-label,'Subscribe')]
		Thread.sleep(5000);
		System.out.println("Channel is suscribed");
		
		
		driver.findElement(By.xpath("//button[@id='avatar-btn']")).click();
		Thread.sleep(5000);
		WebElement signout=driver.findElement(By.xpath("//yt-formatted-string[text()='Sign out']/ancestor::tp-yt-paper-item")); 								//div[@id='primary-text-container']/ancestor::a[@href='/logout']  
																																								//yt-formatted-string[text()='Sign out']/ancestor::tp-yt-paper-item"));
																																								//button[@id='avatar-btn']
		signout.click();
		System.out.println("You are now signout");
		
	}
	@AfterMethod
	public void closebrowser()
	{
		System.out.println("After Method");
	driver.quit();
	}
}

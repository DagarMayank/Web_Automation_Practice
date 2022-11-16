package org.testing.TestScript;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TC9 
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
		
		WebElement SignUp=driver.findElement(By.cssSelector("#buttons ytd-button-renderer div.yt-spec-touch-feedback-shape__fill"));
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
		allvideo.get(7).click();
		
		Thread.sleep(5000);
		System.out.println("Scroll to comment tab");
		JavascriptExecutor js=(JavascriptExecutor) driver;		
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(10000);
		System.out.println("comment on video");
		
		driver.findElement(By.xpath("//div[@id='simple-box']//div[@id='placeholder-area']")).sendKeys("Hello");
//		WebElement commentsPost=driver.findElement(By.xpath("//div[@id='simple-box']//div[@id='placeholder-area']")).click();
//		commentsPost.sendKeys("Ballu badmass paschim Uttar Pradesh, raat 10 bje ballu jail se farrar");
		Thread.sleep(5000);
		System.out.println("Thanks for commenting");
	}
	
	@AfterMethod
	public void clousre()
	{
		System.out.println("After Method");
//		driver.quit();
	}
}

package com.test.Basebroswer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class Base {
	
	public WebDriver driver;
	@BeforeMethod
	public void broswerSetup() {
		
		driver = new ChromeDriver() ;
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().refresh();

	}

	@AfterMethod
	public void browserClose() {
		driver.close();

	}
}	

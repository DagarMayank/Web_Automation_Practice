package org.testing.Base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base
{
	
	public WebDriver driver;
	public Properties pr;
	@BeforeMethod
	public void setup() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "../YoutubeFramework/chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		
		File f=new File("../YoutubeFramework/LocatorValue.properties");
		FileReader fr=new FileReader(f);
		pr=new Properties();
		pr.load(fr);
		
		
		System.out.println("BeforeMethod");
		
		
	}
	
	@AfterMethod
	public void closebrowser()
	{
		System.out.println("After Method");
	//	driver.quit();
		
	}
	
}

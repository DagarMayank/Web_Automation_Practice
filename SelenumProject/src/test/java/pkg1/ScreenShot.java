package pkg1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenShot
{
	public WebDriver driver;
	@BeforeMethod
	public void launch()
	{
		  System.setProperty("webdriver.chromedriver","../SelenumProject/chromedriver.exe");	
			 driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();;
			
	}
	
	@Test
	public void getscreen() throws IOException
	{	
		TakesScreenshot	screenshot=(TakesScreenshot) driver;
		
		File src=screenshot.getScreenshotAs(OutputType.FILE);
		File target= 	new File("../SelenumProject/Screenshot/1.png");
		
		
		
		FileUtils.copyFile(src, target);
	
	}
	@AfterMethod
	public void close()
	{
		driver.close();
	}
}

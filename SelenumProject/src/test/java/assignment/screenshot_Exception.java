package assignment;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot_Exception 
{
	@Test
	@Parameters("browser")			//<parameter name="browser" value="firefox"/> in testNG file
	public void exception(String browser) throws IOException
	{
		WebDriverManager.edgedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		try
		{
			driver.findElement(By.xpath("email")).click();
		
			
		} catch (Exception e) {
			// TODO: handle exception

		
			TakesScreenshot	screenshot=(TakesScreenshot) driver;
			File src=		screenshot.getScreenshotAs(OutputType.FILE);
			File target= 	new File("../SelenumProject/Screenshot/2.png");
			FileUtils.copyFile(src, target);
		
		
		}
	}
	@Test(enabled=false)
	public void test()
	{
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver d=new FirefoxDriver();
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
	}
	
}

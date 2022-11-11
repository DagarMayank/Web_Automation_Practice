package pkg2;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrolling_WebPage 
{
	@Test
	public void ScrollTo_GivenCoordinates()
	{
		System.setProperty("webdriver.chromedriver","../SelenumProject/chromedriver.exe");	
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.Zomato.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
	}
	
}

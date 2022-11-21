package pkg2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class NotificationPOP_UP 
{
	@Test
	public void launch()
	{
	 System.setProperty("webdriver.chromedriver","../SelenumProject/chromedriver.exe");	
	 
	 ChromeOptions op=new ChromeOptions();
	 //op.addArguments("disable-popup-blocking");
	 op.addArguments("start-maximized");
	 
	 
	 ChromeDriver driver= new ChromeDriver(op);
	  driver.get("https://www.Youtube.com/");
	}	
}

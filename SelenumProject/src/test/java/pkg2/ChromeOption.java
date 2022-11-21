package pkg2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ChromeOption 
{
	@Test
	public void launch()
	{
	    System.setProperty("webdriver.chromedriver","../SelenumProject/chromedriver.exe");	
		
		ChromeOptions op=new ChromeOptions();
		op.addArguments("incognito");
		op.addArguments("start-maximized");
		//op.addArguments("headless");
		//op.addArguments("make-default-browser");
		op.addArguments("version");//This will give the version of the notification
		op.addArguments("disable-infobars");//this is used to remove the the notification(The chrome is being conrtolled by Automated Software)
		
		ChromeDriver driver= new ChromeDriver(op);
		driver.get("https://www.Youtube.com/");
		
	}
}

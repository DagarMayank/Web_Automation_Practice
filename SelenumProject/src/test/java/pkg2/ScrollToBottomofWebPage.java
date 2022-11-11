package pkg2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollToBottomofWebPage 
{
	@Test
		public void ScrollDown()
		{
			System.setProperty("webdriver.chromedriver","../SelenumProject/chromedriver.exe");	
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.Zomato.com/");
			driver.manage().window().maximize();
			
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		}
}

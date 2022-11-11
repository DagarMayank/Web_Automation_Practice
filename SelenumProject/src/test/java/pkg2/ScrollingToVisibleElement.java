package pkg2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollingToVisibleElement 
{
		@Test
		public void scrolldown()
		{
			System.setProperty("webdriver.chromedriver","../SelenumProject/chromedriver.exe");	
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.Zomato.com/");
			driver.manage().window().maximize();
			
			WebElement Element=driver.findElement(By.xpath("//h5[text()='DLF Phase 4']"));
			
			
			JavascriptExecutor js=(JavascriptExecutor) driver;
			
			js.executeScript("arguments[0].scrollIntoView();", Element);		//arguments[0]” means first index of page starting at 0.
			
			Element.click();
		}
}

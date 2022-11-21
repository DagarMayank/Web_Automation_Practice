package pkg2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IsDisplayed 
{	
		@Test
		public void display()
		{
			System.setProperty("webdriver.chromedriver","../SelenumProject/chromedriver.exe");	
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
			driver.manage().window().maximize();
			
			boolean Displayed=driver.findElement(By.id("email")).isDisplayed();
			if(Displayed)
			{
				System.out.println("Tab is displayed");
			}
			else
			{
				System.out.println("Tab not displayed");
			}
		}
}

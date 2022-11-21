package pkg1;



import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class SwitchingWindow 
{
	public WebDriver driver;
		@BeforeMethod
		public void launchWindow()
		{
			System.setProperty("webdriver.chrome.driver","../SelenumProject/chromedriver.exe");	
			driver=new ChromeDriver();
			driver.get("https://www.google.com/search?q=gmail&rlz=1C1CHBF_enIN1030IN1030&oq=gmail&aqs=chrome..69i57j69i59j0i271j69i65j69i61j69i65l2.2065j0j1&sourceid=chrome&ie=UTF-8");
			driver.manage().window().maximize();
			
		}
		
		@Test
		public void nextTab()
		{
			WebElement gmail=driver.findElement(By.xpath("//h3[text()='Gmail - Google']"));
			Actions ac=new Actions(driver);
			ac.keyDown(Keys.CONTROL).click(gmail).keyUp(Keys.CONTROL).build().perform();
		
			String currentTab=driver.getWindowHandle();
			Set<String> allWindows=driver.getWindowHandles();
			
			System.out.println("Total number of Tab "+allWindows.size());
			for(String s : allWindows)
			{
				driver.switchTo().window(s);
			}
			System.out.println("Current tab url "+driver.getCurrentUrl());
		
			WebElement nexttab1=driver.findElement(By.xpath("//a//span[text()='Create an account' and @class='laptop-desktop-only'][1]"));
			ac.keyDown(Keys.CONTROL).click(nexttab1).keyUp(Keys.CONTROL).build().perform();
			
			System.out.println("Total number of Tab "+allWindows.size());
			for(String s1 : allWindows)
			{
				driver.switchTo().window(s1);
			}
			System.out.println("Current tab url "+driver.getCurrentUrl());
		
			
			int a=0;
			for(String i : allWindows)
			{
				a=a+1;
				if(a==2)
				{
					driver.switchTo().window(i);
					break;
				}
			}
			System.out.println("Current Tab URL "+driver.getCurrentUrl());
		}
		
		@AfterMethod
		public void close()
		{
			driver.quit();
		}
}

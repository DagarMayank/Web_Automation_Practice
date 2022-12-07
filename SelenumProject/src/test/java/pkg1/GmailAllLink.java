package pkg1;


import java.util.List;
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

public class GmailAllLink 
{
	WebDriver driver;
	@BeforeMethod
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "../YoutubeFramework/chromedriver.exe");
		 driver =new ChromeDriver();
		driver.get("https://www.google.com/search?q=gmail&rlz=1C1CHBF_enIN1030IN1030&oq=gmail&aqs=chrome..69i57j69i59j69i65l3.1525j0j1&sourceid=chrome&ie=UTF-8");
		driver.manage().window().maximize();
		System.out.println("BeforeMethod");
	}
	
	@Test
	public void getallLINK() throws Exception
	{
		List<WebElement> link=driver.findElements(By.xpath("//a/h3"));
		System.out.println(link.size());
		Actions ac=new Actions(driver);

		String currentTab=driver.getWindowHandle();

		
		for(WebElement i : link)
		{	
			ac.keyDown(Keys.CONTROL).click(i).keyUp(Keys.CONTROL).build().perform();
	
			Set<String> allWindow=driver.getWindowHandles();
	        //  Iterator it = it.next();
			
			
			for(String s : allWindow)
			{
					driver.switchTo().window(s);
					Thread.sleep(3000);
			}
			Thread.sleep(3000);
			driver.switchTo().window(currentTab);
			//driver.navigate().back();
			System.out.println("Back to parent Tab");
			Thread.sleep(3000);
		}
	}
	
	
	
	
	
	
	
	
	@AfterMethod
	public void close()
	{
		driver.close();
		System.out.println("AfterMethod");
	}

}

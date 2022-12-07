package pkg1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataPicker 
{
	public WebDriver driver;
		@BeforeMethod
		public void launch()
		{
			System.setProperty("webdriver.chrome.driver", "../YoutubeFramework/chromedriver.exe");
			driver =new ChromeDriver();
			driver.get("https://emicalculator.net/");
			driver.manage().window().maximize();
			System.out.println("BeforeMethod");
		}

		@SuppressWarnings("deprecation")
		@Test
		public void EMI()
		{
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
			
			JavascriptExecutor js=(JavascriptExecutor) driver;
			WebElement	graph=driver.findElement(By.xpath("//div[@id='emibarchart']"));
			js.executeScript("arguments[0].scrollIntoView();", graph);
		
			Actions ac=new Actions(driver);
			List<WebElement> bars=driver.findElements(By.xpath("((//*[local-name()='svg'])[2]/*[name()='g'])[7]/*[name()='g']/*[name()='rect']"));
			for(int i=1; i<=bars.size() ; i++ )
			{
				WebElement pillar=driver.findElement(By.xpath("(((//*[local-name()='svg'])[2]/*[name()='g'])[7]/*[name()='g']/*[name()='rect'])["+i+"]"));
				ac.moveToElement(pillar).build().perform();
		
			}

		}
		
}
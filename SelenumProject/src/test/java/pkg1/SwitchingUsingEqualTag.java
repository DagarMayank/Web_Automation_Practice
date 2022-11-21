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

public class SwitchingUsingEqualTag 
{
	public WebDriver driver;
	
	@BeforeMethod
	public void lauchwindow()
	{
		System.setProperty("webdriver.chrome.driver","../SelenumProject/chromedriver.exe");	
		driver=new ChromeDriver();
		driver.get("https://www.google.com/search?q=gov.in&rlz=1C1CHBF_enIN1030IN1030&oq=gov.in&aqs=chrome..69i57j69i65.1035j0j9&sourceid=chrome&ie=UTF-8");
		driver.manage().window().maximize();
		
	}
	
	@SuppressWarnings("unlikely-arg-type")
	@Test
	public void Switch() throws InterruptedException 
	{
		WebElement gov=driver.findElement(By.xpath("//h3[text()='National Portal of India']"));
		Actions ac=new Actions(driver);
		ac.keyDown(Keys.CONTROL).click(gov).keyUp(Keys.CONTROL).build().perform();
		
		String currentTab=driver.getWindowHandle();
		Set<String> allWindow=driver.getWindowHandles();
	
		for(String s : allWindow)
		{
				driver.switchTo().window(s);
		}
		
		
		WebElement GovPortal=driver.findElement(By.xpath("//li/a[@href='/my-government']/img[@alt='My Government']"));
		ac.keyDown(Keys.CONTROL).click(GovPortal).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(4000);
		Set<String>	allWindow1=driver.getWindowHandles();
		for(String s1 : allWindow1)
		{
			driver.switchTo().window(s1);
		}
	
		WebElement drivinglicesnce=driver.findElement(By.xpath("//a[@href='/gsearch?s=Driving%20Licence']"));
		ac.keyDown(Keys.CONTROL).click(drivinglicesnce).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(5000);
		Set<String> allWindow2=driver.getWindowHandles();
		for(String s2 : allWindow2)
		{
			driver.switchTo().window(s2);
		}
 		Thread.sleep(5000);

 		Set<String > AllTab=driver.getWindowHandles();
		Thread.sleep(5000);
		for(String s3 : AllTab)
		{
			driver.switchTo().window(s3);
			if(driver.getCurrentUrl().equals(drivinglicesnce))
			{
				break;
			}
		}
	
	}
	
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
	
	
}

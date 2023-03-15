package pkg2;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Waits 
{
	public static ChromeDriver driver;
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chromedriver","../SelenumProject/chromedriver.exe");	
	    final ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		 WebElement username=driver.findElement(By.cssSelector("input#email"));
			username.sendKeys("Mayank Dagar");
			
			WebElement password=driver.findElement(By.id("pass"));
			password.sendKeys("India@Bharat");
			WebElement login=driver.findElement(By.name("login"));
			login.click();	
			
//			WebDriverWait wait= new WebDriverWait(driver, 10);
//			wait.until(ExpectedConditions.elementToBeClickable(login));

			driver.navigate().back();
			driver.navigate().forward();
			driver.navigate().refresh();
			driver.navigate().back();
			
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
					               									.pollingEvery(Duration.ofSeconds(3))
					               									.ignoring(NoSuchElementException.class);

			WebElement element = (WebElement) wait.until(new Function<WebDriver, WebElement>()  
			{

				public WebElement apply(WebDriver arg0) 
				{
					WebElement createaccount = driver.findElement(By.linkText("Create New Account"));

					if(createaccount.isDisplayed())
						{
							System.out.println("Element Visible");
						}
					return createaccount;
				}

				
			});
				element.click();
			}	
	
	
}



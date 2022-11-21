package pkg1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutoSuggestionDropdown
{
	public WebDriver driver;
	@BeforeMethod
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "../YoutubeFramework/chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println("BeforeMethod");
	
	}
	@Test
	public void Suggestion() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Iphone 13");
		Thread.sleep(5000);
		
		List<WebElement>  suggestion=driver.findElements(By.xpath("//div[@class='autocomplete-results-container']"));
		Thread.sleep(5000);
		
		for(WebElement i : suggestion)
		{
		System.out.println(i.getText());
		Thread.sleep(5000);
//			Select s=new Select(i);
//			s.selectByVisibleText("iphone 12 back cover");
//			
		
			if(i.getText().contains("iphone 13 back cover"))
					{
						i.click();
						//driver.findElement(By.xpath("//div[@class='autocomplete-results-container']/descendant::div[@aria-label='iphone 13 back cover']")).click();
						
						Thread.sleep(5000);
						break;
					}
			
		}
		Thread.sleep(5000);
		
	}
}

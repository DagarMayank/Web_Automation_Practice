package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IframeHandle 
{
	@Test
	public void setup() throws Exception
	{
		System.setProperty("webdriver.chromedriver","../SelenumProject/chromedriver.exe");	
	    ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();;
		
		WebElement main=driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		main.click();
		
		WebElement f1=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(f1);
		Thread.sleep(3000);
		WebElement f2=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(f2);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello All");

//			driver.switchTo().parentFrame();	//we can use this .parentframe to switchTo parent frame only
//			driver.switchTo().parentFrame();
			driver.switchTo().defaultContent();	//.defaultcontent is used to switch to the ancestor
			
		driver.findElement(By.xpath("//a[text()='Single Iframe ']")).click();
	}
}

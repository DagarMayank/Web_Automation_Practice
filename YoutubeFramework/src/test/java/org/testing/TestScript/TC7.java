package org.testing.TestScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC7 
{
	public WebDriver driver;
	public List<WebElement> d1;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "../YoutubeFramework/chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void Login() throws Exception
	{
		WebElement SignUp= driver.findElement(By.cssSelector("#buttons ytd-button-renderer div.yt-spec-touch-feedback-shape__fill"));
		SignUp.click();
		
		WebElement EmailID= driver.findElement(By.xpath("//input[@autocomplete='username']"));
		EmailID.sendKeys("ballu.badmass101@gmail.com");
		Thread.sleep(3000);
		
		WebElement NextButton= driver.findElement(By.xpath("//span[text()='Next']"));
		NextButton.click();
		Thread.sleep(3000);
		
		WebElement Password= driver.findElement(By.xpath("//input[@type='password']"));
		Password.sendKeys("India@1234");
		WebElement NextButton1= driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']"));
		NextButton1.click();
		Thread.sleep(3000);
	
		List<WebElement>  allvideo= driver.findElements(By.id("video-title"));
		System.out.println(allvideo.size());			//.size method is used for getting the number of element stored in the Webelements 
	
	 
		for(WebElement Element : allvideo)	//Used the collection class (For-Each loop to run the all the video stored in the 'allvideo')
		{	
			 Element.click();
			 Thread.sleep(5000);			//it will play each video for 5 seconds
			 driver.navigate().back();		//it will navigate  back us on the main page 

		}//WebElement likes=driver.findElement(By.xpath("//div[@class='yt-spec-touch-feedback-shape__fill']\""));
		
	
	WebElement Bclicksign=driver.findElement(By.xpath("//img[@id='img' and @draggable='false' and @alt='Avatar image' ]"));
	Bclicksign.click();
	
	WebElement signout= driver.findElement(By.xpath("//tp-yt-paper-item[@class='style-scope ytd-compact-link-renderer'][4]"));  //yt-formatted-string[text()='Sign out']/ancestor::tp-yt-paper-item"));
	signout.click();
	
}
@AfterMethod
public void closebrowser()
{
	System.out.println("After Method");
	//driver.quit();
}

}

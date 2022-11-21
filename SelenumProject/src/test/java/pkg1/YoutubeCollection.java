package pkg1;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class YoutubeCollection //this class is showing how the collection class is being used in the selenium
{
	
	@Test
	public void launch() throws Exception
	{
		System.setProperty("webdriver.chromedriver","../SelenumProject/chromedriver.exe");	
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.Youtube.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		ScreenShotCapture.takescreenshot(driver, "c://folder//first.png");
		Thread.sleep(5000);
		List<WebElement>  allvideo= driver.findElements(By.id("video-title"));
		System.out.println(allvideo.size());			//.size method is used for getting the number of element stored in the Webelements 
	
	 
		for(WebElement Element : allvideo)	//Used the collection class (For-Each loop to run the all the video stored in the 'allvideo')
		{	
			 Element.click();
			 Thread.sleep(5000);			//it will play each video for 5 seconds
			 driver.navigate().back();		//it will navigate  back us on the main page 

		}
		/*
		WebElement  video= driver.findElement(By.id("video-title"));  //here we are using action class to click the control button from keyboard
		Actions ac=new Actions(driver);					//CONTROL+click to open the element in new tab
		ac.keyDown(Keys.CONTROL).click(video).keyUp(Keys.CONTROL).build().perform();
		
		
		String currentTab= driver.getWindowHandle();		//will return address of current window/Tab
		Set<String> allWindow =driver.getWindowHandles();	//will return the address of all the windows/tabs
		
		System.out.println("Current Tab URL "+driver.getCurrentUrl());
		System.out.println("All window size "+allWindow.size());
		
		
		for(String i : allWindow)
		{
			driver.switchTo().window(i);			//this command is used for switiching between the two tabs will directs to last tab
		}
		System.out.println("Window/Tab URL now "+driver.getCurrentUrl());*/
	}
	
	
}

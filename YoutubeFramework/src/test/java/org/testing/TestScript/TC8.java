package org.testing.TestScript;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testing.Pages.LogOut;
import org.testing.Pages.Login;
import org.testng.annotations.Test;

public class TC8 extends Base
{
	
	@Test
	public void Login() throws Exception
	{
		Login log=new Login(driver, pr);
		log.login("ballu.badmass101@gmail.com","India@1234");
		
			Thread.sleep(10000);
	

			List<WebElement>  allvideo= driver.findElements(By.id("video-title"));
			System.out.println("Size of allVideo is "+allvideo.size());			//.size method is used for getting the number of element stored in the Webelements 
			allvideo.get(3).click();
				Thread.sleep(5000);
				
			String videoName = driver.findElement(By.xpath(pr.getProperty("NameofVideo"))).getText();
			System.out.println(videoName);
				Thread.sleep(5000);
				
				
			driver.findElement(By.xpath("//div[@id=\"title\"]//yt-formatted-string[text()='"+videoName+"']/../../..//span[text()='Subscribe']/../..")).click();					//div[@id=\"title\"]//yt-formatted-string[text()= '"+videoName+"']/../../..//button[contains(@aria-label,'Subscribe')]
			Thread.sleep(5000);
			System.out.println("Channel is suscribed");
		Thread.sleep(3000);
		
		
		
		
		LogOut logout=new LogOut(driver, pr);
		logout.logout();
	
	}
	
}

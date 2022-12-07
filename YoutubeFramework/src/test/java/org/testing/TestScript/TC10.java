package org.testing.TestScript;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testing.Pages.LogOut;
import org.testing.Pages.Login;
import org.testng.annotations.Test;

public class TC10 extends  Base
{

	@Test
	public void Login() throws Exception
	{
		
		Login log=new Login(driver, pr);
		log.login("ballu.badmass101@gmail.com","India@1234");
		
			Thread.sleep(10000);
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of song you want to listen");
		String s=sc.next();
		Thread.sleep(10000);
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='search']"));
		searchbox.sendKeys(s);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		
		List<WebElement>  allvideo= driver.findElements(By.id("video-title"));
		System.out.println("Size of allVideo is "+allvideo.size());		
		Thread.sleep(5000);

		WebElement videoName=driver.findElement(By.xpath("(//a[@id='video-title']//yt-formatted-string[contains(text(),'"+s+"')])[1]"));
		videoName.click();
		/*String videoName=driver.findElement(By.xpath(pr.getProperty("NameofVideo"))).getText();
		System.out.println(videoName);
		Thread.sleep(5000);
		*/
//		driver.findElement(By.xpath("//a[@id='video-title']//yt-formatted-string[text()='"+videoName+"']")).click();
//		Thread.sleep(5000);
		driver.findElement(By.xpath(pr.getProperty("LikeButton"))).click();
		Thread.sleep(5000);
		
		LogOut logout=new LogOut(driver, pr);
		logout.logout();
	
}
		

	
}

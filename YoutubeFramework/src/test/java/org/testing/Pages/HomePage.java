package org.testing.Pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage 
{
	WebDriver driver;
	Properties pr;
	public HomePage(WebDriver driver, Properties pr) 
	{
		this.driver=driver;
		this.pr=pr;
	}
	
	public void trending()
	{
		WebElement trending= driver.findElement(By.xpath(pr.getProperty("Trending")));
		trending.click();
		
	}
	
	public void history() throws InterruptedException
	{
		WebElement history=driver.findElement(By.xpath(pr.getProperty("History")));
		history.click();
		Thread.sleep(3000);
	}
	
	public void suscribe() throws Exception
	{
		WebElement subscribe=driver.findElement(By.xpath("//div//ytd-guide-entry-renderer/descendant::a[@id='endpoint' and @title='Subscriptions']"));
		subscribe.click();
		Thread.sleep(3000);	
	}
	
	public void library() throws InterruptedException
	{
		WebElement Library=driver.findElement(By.xpath(pr.getProperty("Library")));
		Library.click();
		Thread.sleep(3000);

	}
	
	public void watchLater() throws InterruptedException
	{
		WebElement WatchLater=driver.findElement(By.xpath(pr.getProperty("watchlater")));
		WatchLater.click();
		Thread.sleep(3000);
		
	}

	public void likeVideo() throws InterruptedException
	{
		WebElement Likedvideos=driver.findElement(By.xpath(pr.getProperty("likedvideotab")));
		Likedvideos.click();
		Thread.sleep(3000);
		
	}
	
	public void Like() throws InterruptedException
	{
		List<WebElement>  allvideo= driver.findElements(By.id("video-title"));
		System.out.println("Size of allVideo is "+allvideo.size());			//.size method is used for getting the number of element stored in the Webelements 
		
		allvideo.get(2).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(pr.getProperty("LikeButton"))).click();
		Thread.sleep(10000);
		
	}

	public void Comments() throws InterruptedException
	{
		List<WebElement>  allvideo= driver.findElements(By.id("video-title"));
		allvideo.get(7).click();
		
		Thread.sleep(5000);
		System.out.println("Scroll to comment tab");
		JavascriptExecutor js=(JavascriptExecutor) driver;		
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(10000);
		System.out.println("comment on video");
		
		
		driver.findElement(By.xpath("//div[@id='simple-box']//div[@id='placeholder-area']")).click();
		Thread.sleep(5000);
		WebElement Comment=driver.findElement(By.xpath("//div[@id='thumbnail-input-row']//div/div/div[@class='paper-input-input style-scope ytd-commentbox']//yt-formatted-string//div"));
		Comment.sendKeys("Hello to all of you");
		System.out.println("Thanks for commenting");
		Thread.sleep(5000);
		
		WebElement commented=driver.findElement(By.xpath("//ytd-button-renderer[@id='submit-button']//button[@aria-label='Comment']"));
		Thread.sleep(5000);
		commented.click();
		
	}
}

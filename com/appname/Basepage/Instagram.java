package com.appname.Basepage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Instagram extends Basepage {
	@Test
	public void instagramTest() throws InterruptedException {
		openBrowser("chrome");
		OpenURL("https://www.instagram.com/");
		 driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
     
         driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("");
         driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("");
         		
         		
         		
         driver.findElement(By.xpath("//button[@type='submit']")).click();
         
         Thread.sleep(5000);
         driver.findElement(By.xpath("(//div[text()='Messages'])[1]")).click();
         Thread.sleep(5000);
         driver.findElement(By.xpath("//*[@id=\"f24ca61b72ed9f8\"]/div/div/div/div")).click();
         
        WebElement we= driver.findElement(By.xpath("//textarea[@placeholder=\"Message...\"]"));
         we.sendKeys("Hii");
         Thread.sleep(1000);
         driver.findElement(By.xpath("//button[text()='Send']")).click();
}
}


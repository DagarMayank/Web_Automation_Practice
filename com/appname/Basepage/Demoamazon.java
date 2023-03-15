package com.appname.Basepage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Demoamazon extends Basepage {
      
	@Test
	public void amazonTest() throws InterruptedException {
		openBrowser("chrome");
		OpenURL("https://www.amazon.com/");
		driver.manage().window().maximize();
		 WebElement we=driver.findElement(By.xpath("//input[@type=\"text\"]"));
		 we.sendKeys("women woolen tops");
		 we.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;  
		js.executeScript("scrollBy(0, 2000)");  
		WebElement wy=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[13]/div/div/div/div/div[2]/div[1]/h2/a/span"));
		wy.click();
		
}
}
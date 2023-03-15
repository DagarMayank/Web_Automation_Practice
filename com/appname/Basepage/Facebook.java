package com.appname.Basepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Facebook  extends Basepage {
	@Test
	public void FacebookTest() throws InterruptedException {
		openBrowser("chrome");
		OpenURL("https://www.facebook.com/");
	    driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("Komal");
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("@3044");
	      
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		Thread.sleep(2000);
	    driver.navigate().back();
		  
	    Thread.sleep(2000);

	    WebElement we=driver.findElement(By.xpath("//*[text() = 'Create New Account']"));
		we.click();
		//sleep for 20 seconds
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("srishti");
		driver.findElement(By.xpath("//input[@aria-label=\"Surname\"]")).sendKeys("chauhan");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9319431419");
		driver.findElement(By.xpath("//input[@aria-label=\"New password\"]")).sendKeys("@12345");
		WebElement wb=driver.findElement(By.xpath("//select[@id=\"day\"]"));
		Select s=new Select(wb);
		s.selectByVisibleText("20");
		WebElement wr=driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select w=new Select(wr);
		w.selectByVisibleText("Jun");
		WebElement wy=driver.findElement(By.xpath("//select[@id=\"year\"]"));
		Select f=new Select(wy);
		f.selectByVisibleText("1995");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		//sleep for 50 seconds
		Thread.sleep(5000);
		driver.close();
		}
}
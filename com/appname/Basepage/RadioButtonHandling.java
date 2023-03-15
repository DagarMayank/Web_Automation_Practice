package com.appname.Basepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

@Test
public class RadioButtonHandling extends Basepage  {
	public void radioTest()   
	{
		openBrowser("chrome");
		OpenURL("https://www.shantigopalhospitals.com/");
		driver.findElement(By.xpath("//*[text()='Book an Appointment']")).click();
		driver.findElement(By.xpath("//*[text()='Book an Appointment']")).click();
		WebElement patName=driver.findElement(By.xpath("//*[@id=\"wpcf7-f1988-o2\"]/form/div[3]/div[3]/span/input"));
		patName.sendKeys("Master");
		System.out.println(patName.getAttribute("value"));
		
		WebElement radiofemale=driver.findElement(By.xpath("//input[@value=\"Female\"]"));
		radiofemale.click();
		System.out.println(radiofemale.isSelected());
		
		
		
	}		
}

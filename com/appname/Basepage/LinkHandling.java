package com.appname.Basepage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



@Test
public class LinkHandling extends Basepage {
	public void linkTest() {
		openBrowser("chrome");
		OpenURL("https://the-internet.herokuapp.com/");
		//WebElement lnkBrokenimage=driver.findElement(By.xpath("//a[text()='Broken Images']"));
		//lnkBrokenimage.click();
		 
		List <WebElement> elmList=driver.findElements(By.xpath("//a"));
		System.out.println(elmList.size());
		for(int i=0;i<elmList.size();i++) 
		{
			System.out.println(elmList.get(i).getText());
		}
		
		}
}
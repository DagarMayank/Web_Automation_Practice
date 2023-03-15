



package com.appname.Basepage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



public class Calendardemo  extends Basepage{
	
   @Test
	public void CalendarTest() throws InterruptedException  {
		openBrowser("chrome");
		OpenURL("https://uk.flightnetwork.com/rf/destination?text=10&from=JER&domain=bing&domain=bing&campaign=non-brand-competitor-city&campaign=non-brand&msclkid=31e6041a52fe1ef9aea8678884fa317e&utm_source=bing&utm_medium=cpc&utm_campaign=UK-JER%7CNon-Brand%7CDesktop%7CFlightnetwork%7CSearch%7CCompetitor%7CBroad&utm_term=Cheapflights.com&utm_content=Cheapflights.com");
		Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@placeholder=\"Depart\"]")).click();
		
		
	List<WebElement> column=driver.findElements(By.xpath("//div[@class=\"DayPicker-Weekdays\"]/div/div"));
	int columnsize=column.size();
	System.out.println(columnsize);
	
	List<WebElement> row=driver.findElements(By.xpath("//div[@class=\"DayPicker-Body\"]/div"));
	int rowsize=row.size();
	System.out.println(rowsize);
	
	
	for(int i=1;i<=row.size();i++) {
		for(int j=1;j<=column.size();j++) {
			
		}
	}
	
}
}
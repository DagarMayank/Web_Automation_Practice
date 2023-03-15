package com.appname.Basepage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ReadingText extends Basepage {
	@Test
	public void ReadingTest() {
		openBrowser("chrome");
		OpenURL("https://the-internet.herokuapp.com/");
		System.out.println(driver.findElement(By.xpath("//h1")).getText());
		
}
}
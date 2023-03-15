package com.appname.Basepage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class InputHandling  extends Basepage {
   
	@Test
	public void InputTest() {
		openBrowser("chrome");
		OpenURL("https://the-internet.herokuapp.com/inputs");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/input")).sendKeys("4477");
	}
}

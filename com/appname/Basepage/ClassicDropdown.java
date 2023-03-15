package com.appname.Basepage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ClassicDropdown extends Basepage{
	@Test
	public void classicDropdownTest() {
		openBrowser("chrome");
		OpenURL("https://the-internet.herokuapp.com/dropdown");
		WebElement elmdropdown=driver.findElement(By.xpath("//*[@id=\"dropdown\"]"));
		Select dropdown=new Select(elmdropdown);

		List<WebElement> lstOptions=dropdown.getOptions();
		for(int i=0;i<lstOptions.size();i++)
		{
			System.out.println(lstOptions.get(i).getText());
		}

		dropdown.selectByVisibleText("Option 1");
		
		 
	
   }
}
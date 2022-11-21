package pkg2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected 
{	
	public void selected() throws Exception 
	{
	System.setProperty("webdriver.chromedriver","../SelenumProject/chromedriver.exe");	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	
	WebElement CheckBox =driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']"));
	CheckBox.click();
	Thread.sleep(5000);
	
	boolean select= CheckBox.isSelected();
	
	if(select)
	{
		System.out.println("Pass : The checkbox is selected");
	}
	else
	{
		System.out.println("Fail : The CheckBox is not selected");
	}
	Thread.sleep(5000);
	driver.quit();
	}
}	

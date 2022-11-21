package pkg2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertPop_UpHandle 
{
	@Test
	public void launch() throws Exception
	{
		 System.setProperty("webdriver.chromedriver","../SelenumProject/chromedriver.exe");	
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://rediff.com");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//p[@id='signin_info']/a")).click();
		 Thread.sleep(5000);
	 
		 driver.findElement(By.xpath("//input[@title='Sign in']")).click();
	
		 Alert alt=driver.switchTo().alert();
		 Thread.sleep(5000);
		 alt.getText();
		 System.out.println(alt.getText());
		 Thread.sleep(3000);
		 alt.dismiss(); 
	}
}

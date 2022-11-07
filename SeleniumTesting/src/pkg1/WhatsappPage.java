package pkg1;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class WhatsappPage 
{
	
	public static void main(String[] args) 
	{
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://web.whatsapp.com/");
	driver.manage().window().maximize();
	
	/*WebElement searchbox=driver.findElement(By.xpath("//div[@title='Search input textbox']"));
	searchbox.sendKeys("Deeksha");
	
	WebElement nameofperson= driver.findElement(By.xpath("//span[text()='Deeksha']"));
	nameofperson.click();
	
	WebElement chatBox= driver.findElement(By.xpath("//*[@*='selectable-text copyable-text']"));
	chatBox.click();	
	
	for(int i=0;i<100;i++)
	{
	WebElement chat=driver.findElement(By.xpath("//*[@*='selectable-text copyable-text']"));
	chat.sendKeys("Kya haal hai");
	}*/
	}

}
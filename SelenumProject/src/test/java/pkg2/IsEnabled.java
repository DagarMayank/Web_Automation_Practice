package pkg2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chromedriver","../SelenumProject/chromedriver.exe");	
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ballu.badmass101@gmail.com");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(5000);
		
		
		WebElement Tab= driver.findElement(By.xpath(""));
		boolean enabled =Tab.isEnabled();

		if(enabled)
		{
			System.out.println("tag is enabled");
		}
		
		Thread.sleep(5000);
		
	
	}
}

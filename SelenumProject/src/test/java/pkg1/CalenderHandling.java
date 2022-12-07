package pkg1;

import java.time.Duration;

import java.util.Scanner;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderHandling 
{
	public WebDriver driver;
	public  static WebElement monthTitle;
	public static String Month;
		
	@BeforeTest
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		driver.get("https://www.Redbus.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date");
		String d=sc.next();
		System.out.println("Please enter the month");
		String month=sc.next();
		System.out.println("Please enter the Year");
		String MonthYear=month+" "+sc.next();
		String MonthYear1= d+" "+MonthYear;
		System.out.println(MonthYear1);
	
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(5000);
		driver.findElement(By.id("onward_cal")).click();

		
		monthTitle = driver.findElement(By.xpath("//td[@class='monthTitle']"));
		 Month=monthTitle.getText();
		 System.out.println(Month);
		 Thread.sleep(5000);
		
		 
		 while(true)
		 {
				if(MonthYear.equalsIgnoreCase(Month))
				{
					System.out.println("Month Reached");
					break;
					
				}
				else 
				{	
					Thread.sleep(3000);
					WebElement button=driver.findElement(By.xpath("//td[@class='next']"));
					button.click();
					
					
					 monthTitle = driver.findElement(By.xpath("//td[@class='monthTitle']"));
					  Month=monthTitle.getText();
					  System.out.println(Month);	
				}
				
			}	
		
		 Thread.sleep(2000);
		
		 
 
		 WebElement  date=driver.findElement(By.xpath("//*[text()='"+d+"']"));
		 date.click();
		
	}

	@AfterMethod
	public void close()
	{
		driver.close();
	}
	
}

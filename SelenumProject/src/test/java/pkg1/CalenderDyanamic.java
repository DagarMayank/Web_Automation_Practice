package pkg1;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderDyanamic 
{
	static WebDriver driver;
	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.trivago.co.uk/");
		driver.manage().window().maximize();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date");
		String d=sc.next();
		System.out.println("Please enter the month");
		String month=sc.next();
		System.out.println("Please enter the Year");
		String MonthYear=month+" "+sc.next();
		String MonthYear1= d+" "+MonthYear;
		System.out.println(MonthYear1);

		driver.findElement(By.xpath("//button[@data-testid='calendar-checkin']")).click();
		
		new WebDriverWait(driver, Duration.ofSeconds(10))
		.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='DatePicker_calendarMonth__QzjFe']")));
	
		
			
		
		
		
		WebElement MonthTitle=driver.findElement(By.xpath("//*[text()='December 2022']"));
			String MonthTitle_Text=MonthTitle.getText();
			
			while(true)
			{
				if(MonthTitle_Text.contains(MonthYear))
				{
					System.out.println("Month/Year Reached");
					break;
				}
				else
				{
					Thread.sleep(3000);
					driver.findElement(By.xpath("//button[@type='button' and @data-testid='calendar-button-next']")).click();
					
					
				}
			}
	}

}

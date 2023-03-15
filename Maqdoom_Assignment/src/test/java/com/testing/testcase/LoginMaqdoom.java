package com.testing.testcase;

import java.time.Duration;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.testing.Utilities.Reports;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginMaqdoom extends Reports
{
	Reports report= new Reports();
	public WebDriver driver;
		@BeforeMethod
		public void launch()
		{
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			driver.get("https://maqdoomec.github.io/login.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		}
		
		@Test
		public void test()
		{
			ExtentTest test= extent.createTest("LoginPagetestCase").assignAuthor("");
			driver.findElement(By.xpath("//input[@id='usernametxt']")).sendKeys("test");
			driver.findElement(By.xpath("//input[@id='passwordtxt']")).sendKeys("test");
			driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
			
			test.log("", "");
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the Character in text Field");
			String X=sc.next();
			driver.findElement(By.xpath("//input[@id='searchTerm']")).sendKeys(""+X);
			
			System.out.println("Enter the term in Search Field");
			String Y=sc.next();
			driver.findElement(By.xpath("//textarea[@id='searchContent']")).sendKeys(""+Y);
			sc.close();
			driver.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
			
			int count=0;
			Pattern p= Pattern.compile(X);			//it will check the text(String in variable X)
			Matcher m= p.matcher(Y);				//it will match the string in X with the string Y
			while(m.find()) {						//.find is used to check the occurance of the subString in String
				count++;
			}
			String text1="The input '"+X+"' appears "+count+" time(s) in the search content";
			System.out.println(text1);
			String text=driver.findElement(By.xpath("//div[@class='w3-container w3-light-grey w3-text-brown popupResultMessage']")).getText();
			System.out.println(text);
			if(text.equals(text1))
			{
				System.out.println("Search result Matched");
			}
			else
			{
				System.out.println("result failed");
			}
		}
		
		@AfterMethod
		public void close()
		{
			driver.close();
		}
}

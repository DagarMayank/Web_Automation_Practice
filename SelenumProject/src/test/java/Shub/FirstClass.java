package Shub;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass
{
		public static void main(String[] args) 
		{
				System.setProperty("Webdriver.chrome.driver","../SelenumProject/chromedriver.exe" );
				ChromeDriver driver= new ChromeDriver();
				driver.get("https://www.zomato.com/");
				driver.manage().window().maximize();
		}
}

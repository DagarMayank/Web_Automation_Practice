package org.testing.StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testing.Pages.Login_PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDemoPageObject 
{
	WebDriver driver;
	@Given("^browser is open$")
	public void browser_is_open()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://example.testproject.io/web/");
		driver.manage().window().maximize();
	}
	
	@When("^user enter (.*) and (.*)$")
	public void user_enter_username_and_password(String username,String password)
	{
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//input[@placeholder='Enter your full name']")).sendKeys(username);
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
//		driver.findElement(By.xpath("//button[@id='login']")).click();
													//Simple way of executing the code 
//		LoginPage l=new LoginPage(driver);
//			l.enterUsername(username);
//			l.enterPassword(password);
//			l.loginbutton();
													//This is Page Object Example to execute the code
		Login_PageFactory pf=new Login_PageFactory(driver);
		pf.username(username);
		pf.password(password);
		pf.login();
													//This is PageFactoy example to execute the code
													//Using the  @FindBy and iniitElement 
													//		PageFactory.initElements(driver, Login_PageFactory.class or this);

	}
	@And("^user is on login$")
	public void user_is_on_login()
	{
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		WebElement country=driver.findElement(By.xpath("//select[@id='country']")); country.click();
		Select s=new Select(country);
		s.selectByVisibleText("Australia");;
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("Khanpur");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ballu.badmass101@gmail.com");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("12345678");
		
		
	}
	

	@Then("^user is navigated to the home page$")
	public void user_is_navigated_to_the_home_page()
	{
		driver.findElement(By.xpath("//*[@id='save']")).click();
	}
}

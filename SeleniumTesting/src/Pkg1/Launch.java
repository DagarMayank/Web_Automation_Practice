package pkg1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.host.html.Option;



public class Launch
{
	
	public static void main(String[] args) throws InterruptedException 
	{
	    System.setProperty("webdriver.chromedriver","../SeleniumTesting/chromedriver.exe");	
		
	    
	    ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();;
		//Option op=(Option) driver.manage();
		//Window w=op.window();
		//w.maximize();
		
		 WebElement username=driver.findElement(By.cssSelector("input#email"));
		username.sendKeys("Mayank Dagar");
		
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("India@Bharat");
		WebElement login=driver.findElement(By.name("login"));
		login.click();	
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().back();
		
		
		WebElement createaccount=driver.findElement(By.linkText("Create New Account"));
		createaccount.click();
		Thread.sleep(5000);
		
		WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));	//driver.findElement(By.xpath("//input[@name='firstname']"))..sendKeys("Ballu");
		firstname.sendKeys("Ballu");
		
		WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));		//driver.findElement(By.xpath("//input[@name='lastname']")).lastname.sendKeys("Badmass");
		lastname.sendKeys("Badmass");							
		
		WebElement mobEmail=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mobEmail.sendKeys("9818225721");
		WebElement NewPassword=driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		NewPassword.sendKeys("India@123");
		
		
		WebElement Bday=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s=new Select(Bday);
		s.selectByValue("1");
		
		WebElement Bday_month=driver.findElement(By.xpath("//select[@id='month']"));
		Select s1=new Select(Bday_month);
		s1.selectByIndex(10);
		
		WebElement Bday_year=driver.findElement(By.xpath("//select[@id='year']"));
		Select s2=new Select(Bday_year);
		s2.selectByValue("1999");
		
		WebElement gender=driver.findElement(By.cssSelector("input[value='2']"));
		gender.click();
		
		WebElement signup=driver.findElement(By.xpath(""));
		signup.click();
		
		
		
	} 
}

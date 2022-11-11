package pkg1;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TrivagoTripActionclass
{
	
	WebDriver driver= null;
	@BeforeTest
	public void setup() {
		
			
	}
	
	
	
	@Test
	public void weblauch() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","../SelenumProject/chromedriver.exe");	
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.trivago.in/?__wr=21&tc=102&themeId=280&sem_keyword=trivago&sem_creativeid=552804408376&sem_matchtype=e&sem_network=g&sem_device=c&sem_placement=&sem_target=&sem_adposition=&sem_param1=&sem_param2=&sem_campaignid=12420192376&sem_adgroupid=126823053068&sem_targetid=kwd-5593367084&sem_location=9061644&cipc=br&cip=9119000005&gclid=CjwKCAiAvK2bBhB8EiwAZUbP1HkbBaCQ359xGtC1NApEsTGh56_p9A7_xqO-nDjNRhaNogFcUDFy7xoCx2AQAvD_BwE");
		driver.manage().window().maximize();
		/*WebElement frame=driver.findElement(By.xpath("//iframe[@title=\"webengage-engagement-callback-frame\"]"));
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
		WebElement cancel=driver.findElement(By.xpath("//a[@class=\"close\"]"));
		cancel.click();
		*/
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(5000);
		
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(5000);
        js.executeScript("window.scrollBy(0,-500)");
        Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='query']"));
		Actions ac=new Actions(driver);
		
		ac.sendKeys("jaipur").sendKeys(Keys.ENTER).click().perform();
		
		
}
	
}
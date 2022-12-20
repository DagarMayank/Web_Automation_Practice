package org.testing.StepDefination;

import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
public class YoutubeRun 
{
	public WebDriver driver;
	public Properties pr;		
		
	@Before
	public void opening() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
	}
	
	@After
	public void close() throws Exception
	{
	driver.findElement(By.xpath(pr.getProperty("BButton"))).click();
		Thread.sleep(5000);
		WebElement signout=driver.findElement(By.xpath(pr.getProperty("signOut"))); 								//div[@id='primary-text-container']/ancestor::a[@href='/logout']  
																																								//yt-formatted-string[text()='Sign out']/ancestor::tp-yt-paper-item"));																																					//button[@id='avatar-btn']
		signout.click();
			driver.quit();
	}
	
			
		
		@Given("User will enter valid cred")
		public void Login() throws InterruptedException, Exception
		{			
			File f=new File("../BDD_Youtube_Frame/Xpaths.properties");
			FileReader fr=new FileReader(f);
			 pr= new Properties();
			 pr.load(fr);
			
			driver.findElement(By.cssSelector("#buttons ytd-button-renderer div.yt-spec-touch-feedback-shape__fill")).click();Thread.sleep(2000);
			driver.findElement(By.xpath(pr.getProperty("EmailID"))).sendKeys("ballu.badmass101@gmail.com");Thread.sleep(2000);
			driver.findElement(By.xpath(pr.getProperty("NextButton"))).click();Thread.sleep(2000);
			driver.findElement(By.xpath(pr.getProperty("Password"))).sendKeys("India@1234");Thread.sleep(2000);
			driver.findElement(By.xpath(pr.getProperty("NextButton1"))).click();Thread.sleep(2000);	
		}
		@Given("Clicking the History Tab")
		public void  History()
		{
			driver.findElement(By.xpath(pr.getProperty("History"))).click();
		}
		@Given("Clicking the Trending Tab")
		public void Trending()
		{
			driver.findElement(By.xpath(pr.getProperty("Trending"))).click();
		}
		@Given("Clicking the Suscribe Tab")
		public void suscribe()
		{
			driver.findElement(By.xpath("//div//ytd-guide-entry-renderer/descendant::a[@id='endpoint' and @title='Subscriptions']")).click();
		}
		@Given("Clicking the Library Tab")
		public void Library()
		{
			driver.findElement(By.xpath(pr.getProperty("Library"))).click();
		}
		@Given("Like any video")
		public void Like() throws Exception
		{
			List<WebElement>  allvideo= driver.findElements(By.id("video-title"));
			System.out.println("Size of allVideo is "+allvideo.size());			//.size method is used for getting the number of element stored in the Webelements 
			allvideo.get(2).click();
			Thread.sleep(5000);
			
			driver.findElement(By.xpath(pr.getProperty("LikeButton"))).click();
		}
		@Given("Comment on video")
		public void comment() throws Exception
		{
			List<WebElement>  allvideo= driver.findElements(By.id("video-title"));
			allvideo.get(7).click();												Thread.sleep(5000);
			
			JavascriptExecutor js=(JavascriptExecutor) driver;		
			js.executeScript("window.scrollBy(0,500)");                             Thread.sleep(10000);
			
			
			
			driver.findElement(By.xpath("//div[@id='simple-box']//div[@id='placeholder-area']")).click(); Thread.sleep(5000);
			
			WebElement Comment=driver.findElement(By.xpath("//div[@id='thumbnail-input-row']//div/div/div[@class='paper-input-input style-scope ytd-commentbox']//yt-formatted-string//div"));
			Comment.sendKeys("Hello to all of you");
			System.out.println("Thanks for commenting");
			Thread.sleep(5000);
			
			WebElement commented=driver.findElement(By.xpath("//ytd-button-renderer[@id='submit-button']//button[@aria-label='Comment']"));
			Thread.sleep(5000);
			commented.click();
		}
		@Given("run like comment on video")
		public void Auto_Suggestion_DropDown() throws Exception
		{
			String A="Ram Siya Ram";
			driver.findElement(By.xpath("//input[@id='search']")).sendKeys(""+A); 	Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click(); 			Thread.sleep(2000);			
			List<WebElement> list= driver.findElements(By.xpath("//a[@id='video-title']"));
			for(WebElement i : list)
			{
				
				if((i.getText()).contains(A))
				{
					A=i.getText();
					driver.findElement(By.xpath("//a[@id='video-title' and @title='"+A+"']")).click();
					break ;
				}
			}
			Thread.sleep(4000);
			driver.findElement(By.xpath(pr.getProperty("LikeButton"))).click();
			
			Thread.sleep(5000);
			
			JavascriptExecutor js=(JavascriptExecutor) driver;		
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(10000);
			
			
			
			driver.findElement(By.xpath("//div[@id='simple-box']//div[@id='placeholder-area']")).click();
			Thread.sleep(5000);
			
			WebElement Comment=driver.findElement(By.xpath("//div[@id='thumbnail-input-row']//div/div/div[@class='paper-input-input style-scope ytd-commentbox']//yt-formatted-string//div"));
			Comment.sendKeys("Hello to all of you");					Thread.sleep(5000);
			
			driver.findElement(By.xpath("//ytd-button-renderer[@id='submit-button']//button[@aria-label='Comment']")).click();
			
			
		}
}

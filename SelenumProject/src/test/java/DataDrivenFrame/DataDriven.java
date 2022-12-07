package DataDrivenFrame;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDriven 
{
	@SuppressWarnings("deprecation")
	@Test(dataProvider="file")
	public void test(String UserName, String PassWord) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "../YoutubeFramework/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		System.out.println("BeforeMethod");
		
		
		WebElement SignUp= driver.findElement(By.cssSelector("#buttons ytd-button-renderer div.yt-spec-touch-feedback-shape__fill"));
		SignUp.click();
		
		
		WebElement EmailID= driver.findElement(By.xpath("//input[@autocomplete='username']"));
		Thread.sleep(3000);
		EmailID.sendKeys(UserName);
		Thread.sleep(3000);
		
		WebElement NextButton= driver.findElement(By.xpath("//span[text()='Next']"));
		Thread.sleep(3000);
		NextButton.click();
		Thread.sleep(3000);
		
		WebElement Password= driver.findElement(By.xpath("//input[@aria-label='Enter your password']"));
		Thread.sleep(3000);
		Password.sendKeys(PassWord);
		Thread.sleep(3000);
		
		WebElement NextButton1= driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']"));
		NextButton1.click();
		Thread.sleep(3000);

	}
	
	@DataProvider(name="file")
	public Object[][] filedata() throws BiffException, IOException 
	{	
		File f=new File("../SelenumProject/src/test/java/DataDrivenFrame/Book1,Login.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet ws=wb.getSheet(0);
		int r = ws.getRows();
		int c = ws.getColumns();
		
		Object[][] obj= new Object[r][c];
		for(int i=0;i<r ;i++)
		{
			for(int j=0;j<c;j++)
			{
				Cell wc=ws.getCell(j, i);
				obj[i][j]=wc.getContents();
			}
		}
		
		return obj;
		}
	

}

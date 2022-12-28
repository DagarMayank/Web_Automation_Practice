package com.testing.testcase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDriven_Reading_Data_DromExcel 
{
		@Test(dataProvider="PinterestLogin")
		public void test(Map<Object, Object> mapData)
		{
			if(mapData==null)
			{
				throw new SkipException("Skipping this exception"); 
			}
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://in.pinterest.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			
			String user=mapData.get("UserName").toString();
			String pass=mapData.get("Password").toString();
			
			driver.findElement(By.xpath("//div[@data-test-id='simple-login-button']")).click();
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(user);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			
			System.out.println(mapData.get("UserName"));
			System.out.println(mapData.get("Password"));
		}
		@DataProvider(name="PinterestLogin")
		public Object dataproviderMethod() throws IOException
		{
			File f=new File("../Maqdoom_Assignment/src/test/java/com/testing/testcase/maqdoomAssigment.xlsx");
			FileInputStream fis=new FileInputStream(f);
			XSSFWorkbook wb= new XSSFWorkbook(fis);
			XSSFSheet ws=wb.getSheetAt(0);
			wb.close();
			
			int rowcount=ws.getLastRowNum();
			int colcout=ws.getRow(0).getLastCellNum();
			System.out.println(rowcount);
			System.out.println(colcout);
			Object[][] obj=new Object[rowcount][1];
			
			
			for(int i=0;i<rowcount;i++)
			{
				Map<Object,Object> mapData= new HashMap<Object, Object>();
				for(int j=0;j<colcout;j++)
				{
					mapData.put(ws.getRow(0).getCell(j).toString(), ws.getRow(i+1).getCell(j).toString());
				}
				if(mapData.get("EligileTORun").equals("Yes"))
				{
					obj[i][0]=mapData;
				}
				
			}
			return obj;
		}
}

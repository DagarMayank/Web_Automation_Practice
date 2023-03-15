package com.inetbanking1.pagesobject;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking1.utilities.Readconfig;

public class Baseclass {
	
	
    
	Readconfig readconfig = new Readconfig();
	
	public String baseURl=readconfig.getApplicationURL();
    public String username=readconfig.getUsername();
    public String password=readconfig.getPassword();
    public static  WebDriver driver;
    public static Logger logger;
    
    @Parameters("browser")
    @BeforeClass
    public void setup(String br)
    {
    	logger=Logger.getLogger("e banking");
    	String filepath=System.getProperty("user.dir")+"/MyLogger/log4j.properties";
    	PropertyConfigurator.configure(filepath);
    	
    	if(br.equals("chrome"))
    	{
    	System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
    	driver=new ChromeDriver();
    	
    	}
    	driver.get(baseURl);
    	
    	
    }
    @AfterClass
    public void tearDown() 
    {
    	driver.quit();
    }
    public static void getSCREENSHOT(WebDriver driver,String tname) {

   	 Date d=new Date();
   
   	 String newDate=d.toString();
   	 
   	String modifyDate=newDate.replace(" ","_").replace(":","_")+".html";
    	TakesScreenshot ss=(TakesScreenshot)driver;

	     String modifydate1="Test_"+newDate.replace(" ","_").replace(":","_")+tname+".jpg";
	     File file=ss.getScreenshotAs(OutputType.FILE);

	     try {
	         FileUtils.copyFile(file,new File("./ScreenShots"+modifydate1));
	     } catch (Exception e) {

	         e.printStackTrace();
	     }
    }
    
}

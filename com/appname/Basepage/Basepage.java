

package com.appname.Basepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Basepage {
	public WebDriver driver;
	public void openBrowser(String browserName) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IQA\\Desktop\\12\\chromedriver.exe");
		if(browserName.equalsIgnoreCase("chrome")) {
		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("--disable-notifications");
		ops.addArguments("--start-maximized");
		ops.addArguments("igonre-certificate-errors");
		//ChromeDriver driver=new ChromeDriver(ops);
		driver=new ChromeDriver(ops);     
		
	}
		driver.manage().window().maximize();
}	
        public void OpenURL(String url)	
        {
	    driver.get(url);
}
}

package org.testing.Pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotCapture 
{
	public static void takescreenshot(ChromeDriver driver, String path) throws IOException
	{
		File screenshot=driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot,new File(path));  
	}
}   

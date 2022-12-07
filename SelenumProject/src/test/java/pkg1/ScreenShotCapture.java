package pkg1;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShotCapture 
{
	@Test
	public static void takescreenshot(ChromeDriver driver, String string) throws Exception 
	{
		File screenshot=driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot,new File(string));  
	
	}
	
}

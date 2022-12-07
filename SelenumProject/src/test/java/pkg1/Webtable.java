package pkg1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable {
	WebDriver driver;
	WebDriverWait wait;

	@BeforeMethod
	public void launch() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
	}

	@Test
	public void table() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement Element = driver.findElement(By.xpath("//table[@summary='Sample Table']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element); // arguments[0]” means first index of page starting
																		// at 0.

		// Row Of the Table
		int row = driver.findElements(By.xpath("//table[@summary='Sample Table']//tbody/tr")).size();
		System.out.println("row size " + row);

		// Column of table
		int column = driver.findElements(By.xpath("//table[@summary='Sample Table']//thead/tr/th")).size();
		System.out.println("Column Size " + column);

		// data in the table
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j < column; j++) {
				String data = driver
						.findElement(By.xpath("//table[@summary='Sample Table']//tbody/tr[" + i + "]/td[" + j + "]"))
						.getText();
				System.out.print(data + "          ");
			}
			System.out.println();
		}

		System.out.println("We have all the data of the table");

		// Now for specific record
		for (int r = 1; r <= row; r++) {
			String BuildingName = driver
					.findElement(By.xpath("//table[@summary='Sample Table']//tbody/tr[" + r + "]/th")).getText();

			if (BuildingName.equals("Clock Tower Hotel")) {
				String Height = driver
						.findElement(By.xpath("//table[@summary='Sample Table']//tbody/tr[" + r + "]/td[3]")).getText();
				System.out.println("Height of this Tower is " + Height);
			}

		}
	}

	@AfterMethod
	public void close() {
		driver.close();
	}

}

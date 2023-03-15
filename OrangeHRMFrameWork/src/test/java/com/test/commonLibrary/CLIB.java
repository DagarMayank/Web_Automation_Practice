package com.test.commonLibrary;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CLIB 
{

	public WebDriver driver;
		public void elementIsEnabled(WebElement Element){  Element.isEnabled(); }
		public void elementIsSelected(WebElement Element){
			Element.isSelected();
		}

		public void elementIsDisplayed(WebElement Element){
			Element.isDisplayed();
		}

		public void WaitforVisibility( WebElement Element){

			WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(15));
			wait.until(ExpectedConditions.visibilityOf(Element));

		}
		
		public void WaitForElementClickable( WebElement Element ,  WebDriver driver){
			WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(15));
			wait.until(ExpectedConditions.elementToBeClickable(Element));
			Element.click();
		}
		
		
		public void sendInput(String str, WebElement Element) {
			Element.clear();
			Element.sendKeys(str);
		}
		
		public void mouseHoverToElement(WebElement Element,WebDriver driver) {
			Actions ac=new Actions(driver);
			ac.moveToElement(Element).perform();
		}
}

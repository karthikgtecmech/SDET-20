package com.vtiger.com_generic_utility;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * this class contains webdriver specific reusable actions
 * @author Karthik D😎
 *
 */
public class WebDriverUtility {
	
	/**
	 * this method waits until the element is loaded in the webpage for the given polling period of time
	 * @param driver
	 */
	public void waitUntilPageLoad(WebDriver driver){
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
	}
	
	/**
	 * this method waits until the element to be visible
	 * @param driver
	 * @param element
	 */
	public void waitForElement(WebDriver driver , WebElement element){
		WebDriverWait wait = new WebDriverWait(driver, 15);		
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	/**
	 * this method will wait until the element to be clicked, it is used to avoid ElementInteractableException
	 * @param element
	 * @throws Throwable 
	 */
	public void waitAndClick(WebElement element) throws Throwable{
		int count = 0;
		while(count<20) {
			try {
				element.click();
				break;
			} catch (Exception e) {
				Thread.sleep(1000);
				count++;
			}
		}
	}
		
		/**
		 * this method is enables the user to handle dropdownlistbox using visiblity text
		 * @param element
		 * @param option
		 */
		public void selectOptionUsingText(WebElement element , String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
		}
		
		/**
		 * this method is enables the user to handle dropdownlistbox using value of text
		 * @param element
		 * @param option
		 */
		public void selectOptionUsingValue(WebElement element , String value) {
		Select select = new Select(element);
		select.selectByValue(value);
		}
		
		/**
		 * this method is used to perform mouse over action
		 * @param driver
		 * @param element
		 */
		public void mouseOver(WebDriver driver , WebElement element) {
			Actions action = new Actions(driver);
			action.moveToElement(element).perform();
		}
		
		 /**
		  * this method is used to accept alert 
		  * @param driver
		  */
		public void acceptAlert(WebDriver driver)
		{
			   driver.switchTo().alert().accept();
		}
		   
		 /**
		  * This method used for scrolling action in a webpage
		  * @param driver
		  * @param element
		  */
		public void scrollToElement(WebDriver driver , WebElement element) {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			int Y = element.getLocation().getY();
			jse.executeScript("window.scrollBy(0,"+Y+")", element);
		}
		
		/**
		 * This method is used to switch the tab
		 */
		public void switchToTab(WebDriver driver , int value) {
			ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tab.get(value));			
		}
		
		/**
		 * This method is used to maximize the tab
		 */
		public void maximize(WebDriver driver) {
			driver.manage().window().maximize();
		}
}

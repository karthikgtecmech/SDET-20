package com.vtiger.com_pom_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.com_generic_utility.JavaUtility;

public class CreateNewOrganization {
	
		WebDriver driver;
		
		public CreateNewOrganization(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy (name = "accountname")
		private WebElement orgName;
		
		@FindBy (css = "input[title='Save [Alt+S]']")
		private WebElement saveBtn;
		
		@FindBy (linkText = "Opportunities")
		private WebElement opportunityLink;

		public WebElement getSaveBtn() {
			return saveBtn;
		}

		public WebDriver getDriver() {
			return driver;
		}

		public WebElement getOrgName() {
			return orgName;
		}
		
		public void getOrgName(String name) {
			int random = new JavaUtility().getRandomNumber();
			getOrgName().sendKeys(name+random);	
		}
		
		public void saveBtn() {
			getSaveBtn().click();
		}

}

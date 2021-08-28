package com.vtiger.com_pom_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsPage {
	
	public OrganizationsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);		
	}
	
		@FindBy (css = "img[title='Create Organization...']")
		private WebElement createOrgImg;

		public WebElement getCreateOrgImg() {
			return createOrgImg;
		}
	
	
	

}

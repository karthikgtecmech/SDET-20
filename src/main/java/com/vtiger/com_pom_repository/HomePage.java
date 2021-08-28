package com.vtiger.com_pom_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy (linkText = "Opportunities")
	private WebElement opportunityLink;

	public WebElement getOpportunityLink() {
		return opportunityLink;
	}
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getOrganizationsLink() {
		return organizationsLink;
	}

	@FindBy (linkText = "Organizations")
	private WebElement organizationsLink;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement administrImg;
	
	@FindBy (linkText = "Sign Out")
	private WebElement signOutLink;

	public WebElement getAdministrImg() {
		return administrImg;
	}

	public WebElement getSignOutLink() {
		return signOutLink;
	}
	
	public void logout(){
		Actions actions = new Actions(driver);
		actions.moveToElement(administrImg).perform();
		signOutLink.click();
		
		
	}
}

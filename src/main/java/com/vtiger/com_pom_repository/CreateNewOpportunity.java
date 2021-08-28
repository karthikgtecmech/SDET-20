package com.vtiger.com_pom_repository;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.com_generic_utility.JavaUtility;
import com.vtiger.com_generic_utility.WebDriverUtility;

public class CreateNewOpportunity extends OrgNamePopUp {
	
	WebDriver driver;
	
	public CreateNewOpportunity(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (name = "potentialname")
	private WebElement oppName;

	@FindBy (id = "related_to_type")
	private WebElement relatedToDropDown;
	
	@FindBy (xpath = "//input[@id='related_to_display']/following-sibling::img[@title='Select']")
	private WebElement relatedToLookup;
	
	@FindBy (css = "input[value='T']")
	private WebElement assignedToGroup;

	@FindBy (css = "select[name='assigned_group_id']")
	private WebElement assignedToDropDown;
	
	@FindBy (css = "input[title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getAssignedToGroup() {
		return assignedToGroup;
	}

	public WebElement getOppName() {
		return oppName;
	}

	public WebElement getRelatedToDropDown() {
		return relatedToDropDown;
	}

	public WebElement getRelatedToLookup() {
		return relatedToLookup;
	}
	
	public WebElement getAssignedToDropDown() {
		return assignedToDropDown;
	}
	
	public void selectRelatedToLookUp() {
		relatedToLookup.click();
		WebDriverUtility webUtility = new WebDriverUtility();
		webUtility.switchToTab(driver, 1);
		getOrgName().click();
		webUtility.switchToTab(driver, 0);
	}
	
	public void selectRelatedToDropDown(String value) throws Throwable {
		WebDriverUtility webUtility = new WebDriverUtility();
		webUtility.selectOptionUsingValue(getRelatedToDropDown(), value);
	}
	public void selectAssignedToGroup() {
		getAssignedToGroup().click();
	}
	public void selectAssignedToDropDown(String text) throws Throwable {
		WebDriverUtility webUtility = new WebDriverUtility();
		webUtility.selectOptionUsingText(getAssignedToDropDown(), text);
	}
	public void getOpportunityName(String name) throws Throwable {
		int random = new JavaUtility().getRandomNumber();
		getOppName().sendKeys(name+random);	
	}	
	public void saveBtn() {
		getSaveBtn().click();
	}
}

package com.vtiger.com_pom_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunityInfo {
	
	public OpportunityInfo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (className = "dvHeaderText")
	private WebElement successMsg;

	public WebElement getSuccessMsg() {
		return successMsg;
	}

}

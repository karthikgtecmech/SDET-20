package com.vtiger.com_pom_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrgNamePopUp {
	
	@FindBy (id = "1")
	private WebElement orgName;

	public WebElement getOrgName() {
		return orgName;
	}

}

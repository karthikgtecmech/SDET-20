package com.vtiger.com_pom_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (name = "user_name")
	private WebElement userNme;
	
	@FindBy (name = "user_password")
	private WebElement userPassWd;
	
	@FindBy (id = "submitButton")
	private WebElement loginBtn;

	public WebElement getUserNme() {
		return userNme;
	}

	public WebElement getUserPassWd() {
		return userPassWd;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	public void loginToApp(String username, String password) {
		userNme.sendKeys(username);
		userPassWd.sendKeys(password);
		loginBtn.click();
	}
}

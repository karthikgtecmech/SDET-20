package com.vtiger.com_generic_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


import com.vtiger.com_pom_repository.HomePage;
import com.vtiger.com_pom_repository.LoginPage;

public class BaseClass {
	public WebDriver driver;

	public static WebDriver sDriver;
	
	/* Object Creation for Lib */
	protected FileUtility file = new FileUtility();
	protected WebDriverUtility web = new WebDriverUtility();
	protected ExcelUtility sheet = new ExcelUtility();

	@BeforeSuite(groups = { "smokeTesting", "regressionTesting" })
	public void beforeSuite() {
		System.out.println("======Connecting to Database======");
	}

	
	   @BeforeClass (groups = {"smokeTesting" , "regressionTesting"}) 
	   public void beforeClass() throws Throwable{ 
	
	   String url = file.getPropertyKeyValue("URL");
	   String browser = file.getPropertyKeyValue("Browser");
	   if(browser.equals("Chrome")) {
	  		driver = new ChromeDriver();
	   } else if(browser.equals("Opera")){ 
	  		driver = new OperaDriver();
	   } else if(browser.equals("Firefox")){
	   	driver = new FirefoxDriver();
	   }
	   sDriver = driver;
	   web.maximize(driver);
	   web.waitUntilPageLoad(driver); 
	   driver.get(url);
	   }
	 
	
   	/*@Parameters ("Browser")
	@BeforeClass (groups = {"smokeTesting" , "regressionTesting"})
	public void beforeClass(String Browser) throws Throwable{ 
	   String url = file.getPropertyKeyValue("URL"); 
	   if(Browser.equals("Chrome")) { 
		   driver = new ChromeDriver();
	   } else if(Browser.equals("Opera")){
		   driver = new OperaDriver(); 
	   } else if(Browser.equals("Firefox")){
		   driver = new FirefoxDriver();
	   }
	   web.maximize(driver);
	   web.waitUntilPageLoad(driver);
	   driver.get(url); 
	   }*/
	 
	
	@BeforeMethod(groups = { "smokeTesting", "regressionTesting" })
	public void beforeMethod() throws Throwable {
		String username = file.getPropertyKeyValue("UserName");
		String password = file.getPropertyKeyValue("Password");
		LoginPage login = new LoginPage(driver);
		login.loginToApp(username, password);
	}

	@AfterMethod(groups = { "smokeTesting", "regressionTesting" })
	public void afterMethod() {
		HomePage home = new HomePage(driver);
		home.logout();
	}

	@AfterClass(groups = { "smokeTesting", "regressionTesting" })
	public void afterClass() {
		driver.quit();
	}

	@AfterSuite(groups = { "smokeTesting", "regressionTesting" })
	public void afterSuite() {
		System.out.println("======Disconnecting from Database======");
	}
}

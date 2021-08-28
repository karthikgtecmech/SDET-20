package vtiger;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.com_generic_utility.BaseClass;


@Listeners(com.vtiger.com_generic_utility.ListenerClassUtility.class)
class assertionPractice extends BaseClass{

	//WebDriver driver;
	/*
	 * public ExtentHtmlReporter reporter; public ExtentReports reports; public
	 * ExtentTest test;
	 */

	@BeforeSuite
	public void beforeSuite() {
		/*
		 * reporter = new ExtentHtmlReporter("./extentReport/SDET20.html");
		 * System.out.println("Before Suite Executed");
		 * reporter.config().setDocumentTitle("SeleniumProject"); reports = new
		 * ExtentReports(); reports.attachReporter(reporter);
		 */

		System.out.println("======Connecting to Database======");
	}

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://localhost:8888/");
	}

	@BeforeMethod
	public void beforeMethod() {
		String username = "admin";
		String password = "admin";
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).submit();
	}

	@Test
	public void loginTest() {
		// test = reports.createTest("loginTest");
		System.out.println(driver.getTitle());
		String homeTitle = "aaAdministrator - Home - vtiger CRM 5 - Commercial Open Source CRM".trim();
		Assert.assertEquals(driver.getTitle(), homeTitle);

		driver.findElement(By.linkText("Organizations")).click();
		System.out.println(driver.getTitle());
		String orgTitle = "Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM".trim();
		Assert.assertEquals(driver.getTitle(), orgTitle);
	}

	@AfterMethod
	public void afterMethod() {
		Actions actions = new Actions(driver);
		WebElement adminImg = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		actions.moveToElement(adminImg).perform();
		driver.findElement(By.linkText("Sign Out")).click();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	@AfterSuite
	public void afterSuite() {
		// reports.flush();
		System.out.println("Setup Closed");

		System.out.println("======Disconnecting from Database======");
	}

}

package datadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_08 {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("./data/commonData.properties");
		Properties data = new Properties();
		data.load(fis);
		String Browser = data.getProperty("Browser");
		String URL = data.getProperty("URL");
		String UserName = data.getProperty("UserName");
		String Password = data.getProperty("Password");

		WebDriver driver = null;
		
		if(Browser.equals("Chrome")) {
			driver = new ChromeDriver();
		}
		else if(Browser.equals("Opera")){
			driver = new OperaDriver();
		}
		else if(Browser.equals("Firefox")){
			driver = new FirefoxDriver();
		}
		WebDriverWait wait = new WebDriverWait(driver , 25);
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.name("user_name")).sendKeys(UserName);
		driver.findElement(By.name("user_password")).sendKeys(Password);
		driver.findElement(By.id("submitButton")).submit();
		driver.findElement(By.linkText("Opportunities")).click();
		driver.findElement(By.cssSelector("img[title='Create Opportunity...']")).click();
		FileInputStream testValue = new FileInputStream("./data/testdata.xlsx");
		Workbook workbook = WorkbookFactory.create(testValue);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row5 = sheet.getRow(5);
		String OppName = row5.getCell(2).getStringCellValue();
		driver.findElement(By.name("potentialname")).sendKeys(OppName);
		Select select = new Select(driver.findElement(By.id("related_to_type")));
		select.selectByValue("Accounts");
		driver.findElement(By.xpath("//input[@id='related_to_display']/following-sibling::img[@title='Select']")).click();
		ArrayList<String> tab = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tab.get(1));
		Row row1 = sheet.getRow(1);
		String OrgName = row1.getCell(2).getStringCellValue();
		driver.findElement(By.linkText(OrgName)).click();
		driver.switchTo().window(tab.get(0));
		driver.findElement(By.cssSelector("input[value='T']")).click();
		Select select1 = new Select(driver.findElement(By.cssSelector("select[name='assigned_group_id']")));
		select1.selectByValue("4");
		driver.findElement(By.cssSelector("input[title='Save [Alt+S]']")).click();
		
		String actualdata = driver.findElement(By.xpath("//span[contains(.,'"+OppName+" -  Opportunity Information')]")).getText();
		String expdata = OppName;
		
		if(actualdata.contains(expdata)) {
			row5.getCell(3).setCellValue("PASS");
			FileOutputStream fos = new FileOutputStream("./data/testdata.xlsx");
			workbook.write(fos);
			System.out.println("PASS::Organization created is correct -> "+OppName);
		}else {
			row5.getCell(3).setCellValue("FAIL");
			FileOutputStream fos = new FileOutputStream("./data/testdata.xlsx");
			workbook.write(fos);
			System.out.println("FAIL::Organization created is not correct");
		}
		workbook.close();
		driver.findElement(By.xpath("//td[contains(@onmouseover,'fnDropDownUser')]")).click();
		driver.findElement(By.linkText("Sign Out")).click();
		driver.quit();
		
		
		
		
		
		

	}

}

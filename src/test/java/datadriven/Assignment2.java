package datadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2 {

	public static void main(String[] args) throws IOException {
		
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
		
		driver.findElement(By.name("user_name")).sendKeys(UserName);
		driver.findElement(By.name("user_password")).sendKeys(Password);
		driver.findElement(By.id("submitButton")).submit();
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.cssSelector("img[title='Create Organization...']")).click();
		
		FileInputStream fis1 = new FileInputStream("./data/testdata.xlsx");
		Workbook workbook = WorkbookFactory.create(fis1);
		Row row = workbook.getSheet("Sheet1").getRow(1);
		String wb = row.getCell(2).getStringCellValue();
		
		driver.findElement(By.name("accountname")).sendKeys(wb);
		driver.findElement(By.cssSelector("input[title='Save [Alt+S]']")).click();
		wait.until(ExpectedConditions.textToBePresentInElementLocated((By.xpath("//span[contains(.,'Organization Information')]")), "Organization Information"));
		String actualdata = driver.findElement(By.xpath("//span[contains(.,'"+wb+" -  Organization') ]")).getText();
		String expdata = wb;
		
		if(actualdata.contains(expdata)) {
			row.getCell(3).setCellValue("PASS");
			FileOutputStream fos = new FileOutputStream("./data/testdata.xlsx");
			workbook.write(fos);
			System.out.println("PASS::Organization created is correct -> "+wb);
		}else {
			row.getCell(3).setCellValue("FAIL");
			FileOutputStream fos = new FileOutputStream("./data/testdata.xlsx");
			workbook.write(fos);
			System.out.println("FAIL::Organization created is not correct");
		}
		
		driver.findElement(By.xpath("//td[contains(@onmouseover,'fnDropDownUser')]")).click();
		driver.findElement(By.linkText("Sign Out")).click();
		driver.quit();
		
	}

}	


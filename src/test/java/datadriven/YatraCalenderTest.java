package datadriven;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YatraCalenderTest {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = null;
		
		FileInputStream fis = new FileInputStream("./data/commonData.properties");
		Properties data = new Properties();
		data.load(fis);
		String Browser = data.getProperty("Browser");
		if(Browser.equals("Chrome")) {
			ChromeOptions options = new ChromeOptions().addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
		}
		else if(Browser.equals("Opera")){
			driver = new OperaDriver();
		}
		else if(Browser.equals("Firefox")){
			driver = new FirefoxDriver();
		}
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com/");
		driver.findElement(By.xpath("//button[.='Ok,I Agree']")).click();
		driver.findElement(By.id("BE_flight_origin_date")).click();
		driver.findElement(By.id("09/08/2022")).click();
		driver.quit();

	}

}

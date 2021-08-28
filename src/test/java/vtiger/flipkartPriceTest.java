package vtiger;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class flipkartPriceTest {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = null;
		
		FileInputStream fis = new FileInputStream("./data/commonData.properties");
		Properties data = new Properties();
		data.load(fis);
		String Browser = data.getProperty("Browser");
		if(Browser.equals("Chrome")) {
			driver = new ChromeDriver();
		}
		else if(Browser.equals("Opera")){
			driver = new OperaDriver();
		}
		else if(Browser.equals("Firefox")){
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		String price = "//div[.='realme C21 (Cross Black, 32 GB)']/ancestor::a[@class='_1fQZEK']/descendant::div[.='₹8,499']";

	}

}

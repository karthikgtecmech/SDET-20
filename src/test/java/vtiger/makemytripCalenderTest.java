package vtiger;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class makemytripCalenderTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		
		String day = "20";
		String monthYear = "November 2021";
		
		Actions action = new Actions(driver);
		action.click().perform();
		driver.findElement(By.xpath("//span[.='DEPARTURE']")).click();
		String dateXpath = "//div[text()='"+monthYear+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[.='"+day+"']";
		String nextMonth = "span[aria-label='Next Month']";
		
		for(;;) {
			try {
				driver.findElement(By.xpath(dateXpath)).click();
				break;
			} catch (Exception e) {
				driver.findElement(By.cssSelector(nextMonth)).click();
			}
		}
		Thread.sleep(5000);
		driver.quit();

	}

}

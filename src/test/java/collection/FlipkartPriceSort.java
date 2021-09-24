package collection;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartPriceSort {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		String priceXpath = "//div[@class='_30jeq3 _1_WHN1']";
		List<WebElement> priceList = driver.findElements(By.xpath(priceXpath));
		
		ArrayList<String> expPriceList = new ArrayList<String>();
		for(WebElement ele:priceList) {
			expPriceList.add(ele.getText());
		}
		ArrayList<String> temp = expPriceList;
		Collections.sort(temp);
		//System.out.println(temp);
		
		for(int i=0;i<temp.size();i++) {
			System.out.println(temp.get(i));
		}
	}

}

package com.vtiger.com_generic_utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenerClassUtility implements ITestListener {
	
	public void onTestFailure(ITestResult result) {
		EventFiringWebDriver fireDriver = new EventFiringWebDriver(BaseClass.sDriver);
		File srcFile = fireDriver.getScreenshotAs(OutputType.FILE);
		String testName = result.getMethod().getMethodName();
		File destFile = new File("./screenshots/"+testName+".png");
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

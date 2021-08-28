package com.vtiger.com_generic_utility;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.Random;
/**
 * this class contains java specific generic libraries
 * @author Karthik D😎
 *
 */
public class JavaUtility {
	/**
	 * It is used to generate the Integer random numbers within boundary of 0 to 1000
	 * @return int
	 */
	public int getRandomNumber(){
		int random = new Random().nextInt(1000);
		return random;
	}
	/**
	 * It is used to get the current system date & time
	 * @return String
	 */
	public String getSystemDate() {
		String date = new Date().toString();
		return date;
	}
	/**
	 * It is used to get the current system date and time in the format of YYYY-MM-DD
	 * @return String
	 */
	public String getSystemDateYYYYMMDD() {
		Date date = new Date();
		String SystemDateandTime = date.toString();
		String arr[] = SystemDateandTime.split(" ");
		String DD = arr[2];
		String YYYY = arr[5];
		@SuppressWarnings("deprecation")
		int MM = date.getMonth()+1;
		String finalFormat = YYYY+"-"+MM+"-"+DD;
		return finalFormat;
	}
	/**
	 * It is used to pass virtual Key to OS
	 * @throws Throwable
	 */
	public void pressVirtualEnterKey() throws Throwable {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}

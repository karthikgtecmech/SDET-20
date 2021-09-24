
package com.vtiger.com_generic_utility;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * 
 * @author Karthik D😎
 *
 */
public class FileUtility {
	/**
	 * its used to read the data from commonData.properties File based on Key which you pass as an argument
	 * @param key
	 * @throws Throwable 
	 */
    public String getPropertyKeyValue(String key) throws Throwable {
    	 FileInputStream fis = new FileInputStream("./data/commonData.properties");
    	 Properties prop = new Properties();
    	 prop.load(fis);
    	 String value = prop.getProperty(key);
    	 return value;
    }
}

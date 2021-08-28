package com.vtiger.com_generic_utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * this class is developed using Apache POI libraries , which used to handle Microsoft Excel sheet
 * @author Karthik D😎
 *
 */

public class ExcelUtility {
		/**
		 * its used read the data from excel based on below arguments 
		 * @param sheetName
		 * @param rowNum
		 * @param celNum
		 * @return Data
		 * @throws Throwable
		 */
		public String getDataFromExcel(String sheetName , int rowNum, int cellNum) throws Throwable {
		   FileInputStream fis  = new FileInputStream("./data/testdata.xlsx");
		   Workbook wb = WorkbookFactory.create(fis);
		   Sheet sh = wb.getSheet(sheetName);
		   Row row = sh.getRow(rowNum);
		   String data = row.getCell(cellNum).getStringCellValue();
		   wb.close();
		   return data;
		}
		
		/**
		 * its used to get the last used row number on specified Sheet
		 * @param sheetName
		 * @return
		 * @throws Throwable 
		 */
		public int getRowCount(String sheetName) throws Throwable {
			FileInputStream fis  = new FileInputStream("./data/testdata.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetName);
			wb.close();
			return sh.getLastRowNum();
		}
		
		/**
		 * its used to set the data on specified sheet
		 * @param sheetName
		 * @param rowNum
		 * @param celNum
		 * @return
		 * @throws Throwable 
		 */
		public void setDataExcel(String sheetName , int rowNum, int celNum ,String data) throws Throwable {
			FileInputStream fis  = new FileInputStream("./data/testdata.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetName);
			Row row = sh.getRow(rowNum);
			Cell cel = row.createCell(celNum);
			cel.setCellValue(data);
			FileOutputStream fos = new FileOutputStream("./data/testdata.xlsx");
			wb.write(fos);
			wb.close();	
		}

}

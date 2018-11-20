package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_MultipleTestData_Read {

	public static void main(String[] args) throws IOException
	{
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\ExcelTestDataFiles\\SudhaMultipleTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		int rowsCount=sheet.getLastRowNum();
		
		for(int i=0;i<=rowsCount;i++) // To gotoEvery Row
		{
			Row r=sheet.getRow(i);
			
			int cellCount=r.getLastCellNum();
			
			for(int j=0;j<cellCount;j++) // in every Row - Goto all the cell to get the data
			{
				Cell c=r.getCell(j);
				String data=c.getStringCellValue();
				System.out.print(data+" ");
			}
			System.out.println();
		}
	}

}

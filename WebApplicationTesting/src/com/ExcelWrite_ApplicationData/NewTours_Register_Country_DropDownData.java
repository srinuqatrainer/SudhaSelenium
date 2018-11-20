package com.ExcelWrite_ApplicationData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_Country_DropDownData {

	public static void main(String[] args) throws IOException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		
		// <a href="mercuryregister.php">REGISTER</a>
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		// <select size="1" name="country"> 
		
		WebElement country=driver.findElement(By.name("country"));
		
		// tag - option
		
		List<WebElement>countryNames=country.findElements(By.tagName("option"));
		
		int countriesCount=countryNames.size();
		System.out.println(" Total number of Countries in the dropDown are :"+ countriesCount);
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\ExcelTestDataFiles\\CountryData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
				
		for(int i=0;i<countriesCount;i++)
		{
			String countryName=countryNames.get(i).getText();
			System.out.println(i+" "+countryName);
			
			Row r=sheet.createRow(i);
			Cell c=r.createCell(0);
			
			c.setCellValue(countryName);
			
			FileOutputStream file1 = new FileOutputStream(System.getProperty("user.dir")+"\\src\\com\\ExcelTestDataFiles\\CountryData.xlsx");
			workBook.write(file1);
			
		}
		
		driver.close();

	}

}

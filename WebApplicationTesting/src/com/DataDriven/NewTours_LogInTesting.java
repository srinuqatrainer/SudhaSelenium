package com.DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_LogInTesting 
{
	FirefoxDriver driver;

	@BeforeTest
	public void setUp()
	{
		 driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void logIn() throws IOException
	{
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\ApplicationTestDataFiles\\NewTours_LogInTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		int rowsCount=sheet.getLastRowNum();
		
		for(int i=1;i<=rowsCount;i++)
		{
			
			Row r=sheet.getRow(i);
			
		// <input type="text" size="10" name="userName">
		
		driver.findElement(By.name("userName")).sendKeys(r.getCell(0).getStringCellValue());
		
		// <input type="password" size="10" name="password">
		
		driver.findElementByName("password").sendKeys(r.getCell(1).getStringCellValue());
		
		// <input width="58" type="image" border="0" height="17" alt="Sign-In"
		// src="/images/btn_signin.gif?osCsid=bcc8e573014c0b67f61d64efa132ab5a" value="Login" name="login">
		
		driver.findElementByName("login").click();
		
		String expected_Title="Find";
		System.out.println(" the Expected title is : "+expected_Title);
		
		String acutal_Title=driver.getTitle();
		System.out.println(" the actual title is : "+ acutal_Title);
		
		
		if(acutal_Title.contains(expected_Title))
		{
			System.out.println(" LogIn Successfull - PASS");
			r.createCell(2).setCellValue("LogIn Successfull - PASS");
		}
		else
		{
			System.out.println(" LogIn Failed - FAIL");
			r.createCell(2).setCellValue("LogIn Failed - FAIL");
		}
		
		FileOutputStream file1 = new FileOutputStream(System.getProperty("user.dir")+"\\src\\com\\ApplicationTestResultFiles\\NewTours_LogInTestResult.xlsx");
		workBook.write(file1);
		
		driver.navigate().back();
	}
}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	
}

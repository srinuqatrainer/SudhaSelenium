package com.GRID;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTours_LogInTest
{
	
	@Parameters("Browser")
	@Test
	public void logIn(String browser) throws IOException
	{
		// information about nodes
		System.out.println(browser);
		
		DesiredCapabilities cap=null;
		
		if(browser.equals("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		else
			if(browser.equals("chrome"))
			{
				cap=DesiredCapabilities.chrome();
				cap.setBrowserName("chrome");
				cap.setPlatform(Platform.WINDOWS);
			}
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.8:4444/wd/hub"),cap);
		
		driver.get("http://newtours.demoaut.com");
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
	driver.quit();	
		
	}
	
	
	
	
}

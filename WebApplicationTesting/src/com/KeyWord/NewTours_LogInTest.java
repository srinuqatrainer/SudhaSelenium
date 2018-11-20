package com.KeyWord;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_LogInTest
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
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\newTours.properties");
		
		//
		Properties pr = new Properties();
		pr.load(file);
		
		
		driver.findElementByName(pr.getProperty("username")).sendKeys("tutorial");
		driver.findElement(By.name(pr.getProperty("password"))).sendKeys("tutorial");
		driver.findElement(By.name(pr.getProperty("signIn"))).click();
		
		
		String expected_Text = "search for the lowest";
		System.out.println(" The Expected text is : "+expected_Text);
		
		String actual_Text=driver.findElementByXPath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/font").getText();
		System.out.println(" The Actual Text is : "+actual_Text);
		
		
		if(actual_Text.contains(expected_Text))
		{
			System.out.println(" LogIn Successfull - PASS");
		}
		else
		{
			System.out.println(" LogIn Failed - FAIL");
		}
		
			
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
}

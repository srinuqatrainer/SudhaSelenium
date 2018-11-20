package com.DataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_NewUserRegistration 
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

	@Test(priority=0)
	public void register()
	{
		// <a href="mercuryregister.php">REGISTER</a>
		
		driver.findElement(By.linkText("REGISTER")).click();
		
	}
	
	@Test
	public void userRegistration()
	{
		driver.findElementByName("firstName").sendKeys("Sudha");
		driver.findElementByName("lastName").sendKeys("Hello");
		driver.findElementByName("phone").sendKeys("785858");
		driver.findElementById("userName").sendKeys("sudha@gmail.com");
		
		driver.findElementByName("address1").sendKeys("HiTech City");
		driver.findElementByName("city").sendKeys("Hyderabad");
		driver.findElementByName("state").sendKeys("Telangana");
		driver.findElementByName("postalCode").sendKeys("500001");
		driver.findElementByName("country").sendKeys("INDIA");
		
		driver.findElementByName("email").sendKeys("sudhaaaa");
		driver.findElementByName("password").sendKeys("abc123");
		driver.findElementByName("confirmPassword").sendKeys("abc123");
		
		driver.findElement(By.name("register")).click();
		
		String expected_UserName="sudhaaaa";
		System.out.println(" The expected UserName is : "+expected_UserName);
		
		String actual_UserRegisteredText=driver.findElementByXPath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b").getText();
		System.out.println(" The actual Registered text is :"+actual_UserRegisteredText);
		
		if(actual_UserRegisteredText.contains(expected_UserName))
		{
			System.out.println(" User registration Successfull - PASS");
		}
		else
		{
			System.out.println(" User Registration Failed - FAIL");
		}
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
}

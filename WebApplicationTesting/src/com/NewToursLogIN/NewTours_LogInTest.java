package com.NewToursLogIN;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_LogInTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		// <input type="text" size="10" name="userName">
		
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		
		// <input type="password" size="10" name="password">
		
		driver.findElementByName("password").sendKeys("sudha");
		
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
		}
		else
		{
			System.out.println(" LogIn Failed - FAIL");
		}
		
		//driver.close();

	}

}

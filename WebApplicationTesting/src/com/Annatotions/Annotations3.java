package com.Annatotions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations3
{

	@BeforeMethod
	public void ApplicationLaunchAndLogIn()
	{
		System.out.println(" Firefox Browser Launch and LogIn ");
	}
	
	@Test(priority=0)
	public void inBox()
	{
		System.out.println(" Testing Inbox Functionality ");
	}
	
	@Test(priority=1)
	public void composeMail()
	{
		System.out.println(" Testing composeMail functionality ");
	}
	
	@AfterMethod
	public void applicationClose()
	{
		System.out.println(" Closing the Application ");
	}
	
	
}

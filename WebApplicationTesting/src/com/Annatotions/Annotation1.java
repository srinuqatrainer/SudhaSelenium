package com.Annatotions;

import org.testng.annotations.Test;

public class Annotation1 
{

	@Test(priority=0)
	public void ApplicationLaunchAndLogIn()
	{
		System.out.println(" Firefox Browser Launch and LogIn ");
	}
	
	@Test(priority=1)
	public void inBox()
	{
		System.out.println(" Testing Inbox Functionality ");
	}
	
	@Test(enabled=false)
	public void composeMail()
	{
		System.out.println(" Testing composeMail functionality ");
	}
	
}

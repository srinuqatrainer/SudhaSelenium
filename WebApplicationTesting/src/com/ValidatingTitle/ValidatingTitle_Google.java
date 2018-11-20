package com.ValidatingTitle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingTitle_Google {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		String expected_Title="google";
		System.out.println(" The Expected Title is : "+ expected_Title);
		
		String actual_Title=driver.getTitle();
		System.out.println(" The Actual title is : "+actual_Title);
		
		if(actual_Title.equals(expected_Title))
		{
			System.out.println(" Title matched - PASS");
		}
		else
		{
			System.out.println(" Title not matched - FAIL");
		}
		
		driver.close();
		

	}

}

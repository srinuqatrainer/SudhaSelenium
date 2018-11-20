package com.ValidatingUrl;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingUrl_Facebook {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		String expected_Url="facebook.com";
		System.out.println(" The Expected Url is : "+expected_Url);
		
		String actual_Url=driver.getCurrentUrl();
		System.out.println(" The actual url is :"+actual_Url);
		
		if(actual_Url.contains(expected_Url))
		{
			System.out.println(" Url existing -- PASS");
		}
		else
		{
			System.out.println(" URl does not contain expected -- FAIL");
		}

		driver.quit();
	}

}

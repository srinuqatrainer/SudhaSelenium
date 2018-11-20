package com.CapturingUrl;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingUrl_Facebook {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		String url=driver.getCurrentUrl();
		System.out.println("The Current url of Facebook is: "+url);
				
	}

}

package com.GoogleTest;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_SignIn_Click {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		// <a id="gb_70" class="gb_xe gb_Aa gb_Fb" target="_top" 
		// href="https://accounts.google.com/ServiceLogin?hl=en&passive=true&continue=https://www.google.com/">Sign in</a>
		
		driver.findElementById("gb_70").click();
		
		String title=driver.getTitle();
		System.out.println(" The title is : "+title);
		
		driver.close();

	}

}

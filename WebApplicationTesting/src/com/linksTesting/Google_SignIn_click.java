package com.linksTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_SignIn_click {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		driver.manage().window().maximize();
		
		
		//<a id="gb_70" class="gb_xe gb_Aa gb_Fb" target="_top" 
		//href="https://accounts.google.com/ServiceLogin?hl=en&passive=true&continue=https://www.google.com/">Sign in</a>
		
		//driver.findElement(By.id("gb_70")).click();
		
		driver.findElement(By.linkText("Sign in")).click();
		
		System.out.println(driver.getTitle());
		
		driver.close();
	}

}

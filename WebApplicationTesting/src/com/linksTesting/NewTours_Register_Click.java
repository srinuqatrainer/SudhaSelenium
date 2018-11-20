package com.linksTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_Click {

	public static void main(String[] args) 
	{
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		
		 /* <a href="mercuryregister.php">REGISTER</a>

		  tag - a - link on the page

		  attribute - href -- will always have a reference URL

		 then the element is of type -- link

		 locator -- linkText
		 Selector - REGISTER */
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		System.out.println(driver.getTitle());
		
		driver.close();

	}

}

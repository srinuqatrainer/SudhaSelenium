package com.Alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class HandlingAlert {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://apsrtconline.in/oprs-web/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// <input id="searchBtn" -- Check Availability Button
		
		driver.findElementById("searchBtn").click();
		
		//driver.switchTo().alert();
		
		Alert alt = driver.switchTo().alert();

		// capturing the text of an Alert
		String altText=alt.getText();
		System.out.println(altText);
		
		Sleeper.sleepTightInSeconds(15);
		
		alt.accept();
		
		// cancel
		//alt.dismiss();
		
		// enter text in alert
		//alt.sendKeys("sudha");
		
		

	}

}

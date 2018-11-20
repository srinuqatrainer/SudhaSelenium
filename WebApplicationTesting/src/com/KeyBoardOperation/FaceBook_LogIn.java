package com.KeyBoardOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FaceBook_LogIn {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// <input id="email"
		driver.findElementById("email").sendKeys("Sudha");
		
		// perform TAB operation from KeyBoard
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).build().perform();
		
		// sending data into Password Element using Actions class object(act) - without the properties of the Element found
		
		act.sendKeys("Hello").build().perform();
		
		// Perform ENTER key operation from keyBoard
		
		act.sendKeys(Keys.ENTER).build().perform();
		

	}

}

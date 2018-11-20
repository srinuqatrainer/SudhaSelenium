package com.MouseHover;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_HelloSignIn_MouseHover {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://amazon.in");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// id="nav-link-yourAccount" 
		
		WebElement helloSignIn=driver.findElement(By.id("nav-link-yourAccount"));
		
		// Mouse or keyBoard operations - Actions class
		
		Actions act = new Actions(driver);
		act.moveToElement(helloSignIn).build().perform();
		
		// click on your wish list - .//*[@id='nav-flyout-yourAccount']/div[3]/a[3]/span
		
		driver.findElement(By.xpath(".//*[@id='nav-flyout-yourAccount']/div[3]/a[3]/span")).click();
		
		
		
	}

}

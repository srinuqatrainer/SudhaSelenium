package com.Frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchToFrame {

	public static void main(String[] args)
	{
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		// <iframe class="demo-frame" --- Switch to the Frame
		
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
	}

}

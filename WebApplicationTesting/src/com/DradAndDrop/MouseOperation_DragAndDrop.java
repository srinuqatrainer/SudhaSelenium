package com.DradAndDrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperation_DragAndDrop {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		// <iframe class="demo-frame" --- Switch to the Frame
		
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		
		// <div id="draggable"
		
		WebElement dragElement=driver.findElementById("draggable");
		
		// <div id="droppable"
		
		WebElement dropElement=driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(dragElement, dropElement).build().perform();

	}

}

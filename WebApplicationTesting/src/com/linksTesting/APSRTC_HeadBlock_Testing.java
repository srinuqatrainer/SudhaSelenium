package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class APSRTC_HeadBlock_Testing {

	public static void main(String[] args) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://apsrtconline.in/oprs-web/");
		
		driver.manage().window().maximize();
		
		// <div class="menu-wrap">
		
		WebElement headerBlock=driver.findElement(By.className("menu-wrap"));
		
		List<WebElement>headerBlockLinks=headerBlock.findElements(By.tagName("a"));
		
		int linksCount=headerBlockLinks.size();
		System.out.println(" Total number of links in the headerBlok are : "+linksCount);
		
		for(int i=0;i<linksCount;i++)
		{
			String linkName=headerBlockLinks.get(i).getText();
			System.out.println(i+" "+linkName);
			
			headerBlockLinks.get(i).click();
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			
			driver.navigate().back();
			
			Thread.sleep(7000);
			
			headerBlock=driver.findElement(By.className("menu-wrap"));
			headerBlockLinks=headerBlock.findElements(By.tagName("a"));
			
		}
		driver.close();
		
		
		

	}

}

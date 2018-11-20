package com.ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_HomePage_linksTesting_ScreenShots {

	public static void main(String[] args) throws IOException 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		
		// <a href="mercurysignon.php">SIGN-ON</a>
		// <a href="mercuryregister.php">REGISTER</a>
		// <a href="mercuryunderconst.php">SUPPORT</a>
		// <a href="mercuryunderconst.php">CONTACT</a>
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		int linksCount=links.size();
		
		System.out.println(" The total number of links on newTours Home page are: "+linksCount);
		
		for(int i=0;i<linksCount;i++)
		{
			String linkName=links.get(i).getText();
			System.out.println(i+" "+linkName);
			
			links.get(i).click();
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			
			File ScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(ScreenShot, new File(System.getProperty("user.dir")+"\\screenShots\\"+linkName+".png"));
			
			driver.navigate().back();
			
			links=driver.findElements(By.tagName("a"));
		}
		
		driver.close();

	}

}

package com.dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_Country {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		
		// <a href="mercuryregister.php">REGISTER</a>
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		// <select size="1" name="country"> 
		
		WebElement country=driver.findElement(By.name("country"));
		
		// tag - option
		
		List<WebElement>countryNames=country.findElements(By.tagName("option"));
		
		int countriesCount=countryNames.size();
		System.out.println(" Total number of Countries in the dropDown are :"+ countriesCount);
		
		for(int i=0;i<countriesCount;i++)
		{
			String countryName=countryNames.get(i).getText();
			System.out.println(i+" "+countryName);
		}
		
		driver.close();

	}

}

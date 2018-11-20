package com.Select;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NewTours_Register_Country_Select {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		
		// <a href="mercuryregister.php">REGISTER</a>
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		// <select size="1" name="country"> 
		
		WebElement country=driver.findElement(By.name("country"));
		
		// Selection of an element from country dropDown
		
		Select selection = new Select(country);
		//selection.selectByIndex(1);
		
		//selection.selectByVisibleText("INDIA");
		
		selection.selectByValue("234");
		
		
		

	}

}

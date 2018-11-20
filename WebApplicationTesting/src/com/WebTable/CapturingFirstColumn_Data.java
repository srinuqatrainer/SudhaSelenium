package com.WebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingFirstColumn_Data {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// xpath of FirstRow _ FirstColumn
		// html/body/div[1]/div[8]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		// html/body/div[1]/div[8]/section[1]/div/section/div[1]/div/table/tbody/tr[2]/td[1]
		// html/body/div[1]/div[8]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]
		
		for(int i=1;i<=36;i++)
		{
			
			//String cityName=driver.findElement(By.xpath("html/body/div[1]/div[8]/section[1]/div/section/div[1]/div/table/tbody/tr[i]/td[1]")).getText();
			String cityName=driver.findElementByXPath("html/body/div[1]/div[8]/section[1]/div/section/div[1]/div/table/tbody/tr["+i+"]/td[1]").getText();
			System.out.println(cityName);
		}
		
		


	}

}

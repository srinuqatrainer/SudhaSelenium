package com.WebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWebTable {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// identify the table - xpath is - html/body/div[1]/div[8]/section[1]/div/section/div[1]/div/table
		
		WebElement table=driver.findElement(By.xpath("html/body/div[1]/div[8]/section[1]/div/section/div[1]/div/table"));
		
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		
		int rowCount=rows.size();
		
		for(int i=0;i<rowCount;i++)
		{
			List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
			
			for(int j=0;j<cols.size();j++)
			{
				String data=cols.get(j).getText();
				System.out.print(data+" ");
			}
			System.out.println();
		}
		
		driver.close();

	}

}

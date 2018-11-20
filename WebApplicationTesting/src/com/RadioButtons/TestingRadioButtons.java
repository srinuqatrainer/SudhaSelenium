package com.RadioButtons;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestingRadioButtons {

	public static void main(String[] args) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// identify the block of the webPage
		
		// html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td
		
		WebElement radioButton_block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		
		// name="group1" 
		
		List<WebElement>radioButtons=radioButton_block.findElements(By.name("group1"));
		
		System.out.println(radioButtons.size());
		
		
		for(int i=0;i<radioButtons.size();i++) // to perform click on every radio Button
		{
			
			radioButtons.get(i).click();
			
			Thread.sleep(15000);
			
			for(int j=0;j<radioButtons.size();j++)
			{
				System.out.println(radioButtons.get(j).getAttribute("value")+" "+radioButtons.get(j).getAttribute("checked"));
			}
			
			Thread.sleep(15000);
			
		}
		
		driver.close();

	}

}

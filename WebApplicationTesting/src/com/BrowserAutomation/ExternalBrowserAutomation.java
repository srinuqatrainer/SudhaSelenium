package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ExternalBrowserAutomation {

	public static void main(String[] args)
	{
		// chrome Browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driverFiles\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		
		// Edge Browser
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\driverFiles\\MicrosoftWebDriver.exe");
		EdgeDriver dri = new EdgeDriver();
		dri.get("http://google.com");
		
		// InternetExplorer
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\driverFiles\\IEDriverServer.exe");
		InternetExplorerDriver dr = new InternetExplorerDriver();
		dr.get("http://google.com");
		
		// Lastest FireFox Browser -- Version 50 to current version(63)
		// Selenium Server standalone jar file above 3.0 versioon
		// download the GeckoDriver file
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\driverFiles\\geckodriver.exe");
		FirefoxDriver d = new FirefoxDriver();
		d.get("http://yahoo.com");
		
		

	}

}

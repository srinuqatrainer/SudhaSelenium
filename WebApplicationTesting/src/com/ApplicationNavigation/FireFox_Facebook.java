package com.ApplicationNavigation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox_Facebook {

	public static void main(String[] args)
	{
		FirefoxDriver sudha = new FirefoxDriver();
		//sudha.get("http://facebook.com");
		//sudha.get("http://google.com");
		
		sudha.navigate().to("http://gmail.com");
		
		sudha.close();

	}

}

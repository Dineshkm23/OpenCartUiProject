package com.qa.opencart.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.qa.opencart.exceptions.BrowserException;

public class DriverFactory {
	WebDriver driver;
	public WebDriver initDriver(String browserName) {
		System.out.println("the browser name passed is ..:"+browserName);
		switch(browserName.toLowerCase().trim()) {
		
		case "chrome":
			driver= new ChromeDriver();
			System.out.println("Launched ..:"+browserName);
			break;
		
		case "firefox":
			driver= new FirefoxDriver();
			System.out.println("Launched ..:"+browserName);
			break;
			
		case "edge":
			driver= new EdgeDriver();
			System.out.println("Launched ..:"+browserName);
			break;
			
		case "safari":
			driver= new SafariDriver();
			System.out.println("Launched ..:"+browserName);
			break;
			
			default:
				System.out.println("please pass the right browser name...");
				throw new BrowserException("NO BROWSER FOUND...."+browserName);
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		return driver;
	}

}

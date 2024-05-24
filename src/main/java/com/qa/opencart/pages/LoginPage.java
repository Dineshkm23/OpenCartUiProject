package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	// Private By locator

	private By email = By.id("input-email");
	private By password = By.id("input-password");
	private By loginButton = By.xpath("//input[@value='Login']");
	private By forgotPwdLink = By.linkText("Forgotten Password");

	// Public page class constructor..
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// public page actions/methods...
	public String getLoginPageTitle() {
		String title = driver.getTitle();
		System.out.println("LoginPage title is: " + title);
		return title;
	}
	public String getLoginPageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println("LoginPage URL is: " + url);
		return url;
	}
	
	public boolean isForgotPwdLinkExist() {
		return driver.findElement(forgotPwdLink).isDisplayed();
	}
	
	public void doLogin(String userName, String pwd) {
		driver.findElement(email).sendKeys(userName);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginButton).click();
	}
}

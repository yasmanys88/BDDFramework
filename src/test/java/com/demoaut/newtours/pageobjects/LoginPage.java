package com.demoaut.newtours.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.NAME, using = "userName")
	@CacheLookup
	WebElement username;

	@FindBy(how = How.NAME, using = "password")
	@CacheLookup
	WebElement password;

	@FindBy(how = How.NAME, using = "login")
	@CacheLookup
	WebElement btnlogin;

	public void setPassword(String pass) {
		password.sendKeys(pass);
	}

	public void setUsername(String user) {
		username.sendKeys(user);
	}

	public void clicBtnLogin() {
		btnlogin.click();
	}

}

package com.Amazon.Registration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.SeleniumUtility;

public class Amazon_Register_Submit extends SeleniumUtility {
	WebDriver driver;
	
	public Amazon_Register_Submit (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id = 'continue']")
	private WebElement VerifyNumberButton;
	
	public void submit() {
		VerifyNumberButton.click();
	}
}

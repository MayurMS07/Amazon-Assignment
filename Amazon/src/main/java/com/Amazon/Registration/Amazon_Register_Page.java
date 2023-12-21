package com.Amazon.Registration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.SeleniumUtility;

public class Amazon_Register_Page extends SeleniumUtility {
	WebDriver driver;
	
	public Amazon_Register_Page (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "ap_customer_name")
	private WebElement Name;
	
	@FindBy(xpath = "//input[@id = 'ap_phone_number']")
	private WebElement Number;
	
	@FindBy(xpath = "//input[@id = 'ap_email']")
	private WebElement Mail;
	
	@FindBy(xpath = "//input[@id = 'ap_password']")
	private WebElement Password;
	
	@FindBy(xpath = "//input[@id = 'continue']")
	private WebElement VerifyNumberButton;
	
	public void registration() {
		Name.sendKeys("ABC Xyz");
		Number.sendKeys("123456789");
		Mail.sendKeys("XYZ123@gmail.com");
		Password.sendKeys("Abc@987zyx");
		VerifyNumberButton.click();
	}

}

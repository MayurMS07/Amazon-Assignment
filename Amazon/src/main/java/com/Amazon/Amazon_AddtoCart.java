package com.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.SeleniumUtility;

public class Amazon_AddtoCart extends SeleniumUtility {
	WebDriver driver;
	
	public Amazon_AddtoCart (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='add-to-cart-button']")
	private WebElement AddCart;
	
	public void AddtoCart() {
		AddCart.click();
	}
}

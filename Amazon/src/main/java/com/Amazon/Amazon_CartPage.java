package com.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.SeleniumUtility;

public class Amazon_CartPage extends SeleniumUtility {
	WebDriver driver;
	
	public Amazon_CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[@id = 'attach-accessory-proceed-to-checkout-text']")
	private WebElement ProceedCheckout;
	
	public void cartwithcorretprice() {
		ProceedCheckout.click();
	}

}

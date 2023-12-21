package com.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.SeleniumUtility;

public class Amazon_List_Page extends SeleniumUtility {
	WebDriver driver;
	
	public Amazon_List_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text() = 'iPhone 15 Pro (512 GB) - White Titanium']")
	private WebElement Iphone;
	
	public void ClickonIphone () {
		Iphone.click();
	}
}	
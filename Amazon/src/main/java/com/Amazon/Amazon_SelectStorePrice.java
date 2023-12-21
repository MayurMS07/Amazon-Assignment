package com.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.SeleniumUtility;

public class Amazon_SelectStorePrice extends SeleniumUtility {
	WebDriver driver;
	
	public Amazon_SelectStorePrice (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//p[text()='512 GB']")
	private WebElement Select512GBModel;
	
	public void SelectModel() {
		Select512GBModel.click();
	}
}

package com.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.SeleniumUtility;

public class Amazon_Search_Page extends SeleniumUtility {
	WebDriver driver;
	
	public Amazon_Search_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "twotabsearchtextbox")
	private WebElement searchBox;
	
	@FindBy(id = "nav-search-submit-button")
	private WebElement searchButton;

	public void Search() {
		searchBox.sendKeys("iphone");
		searchButton.click();
	}
}

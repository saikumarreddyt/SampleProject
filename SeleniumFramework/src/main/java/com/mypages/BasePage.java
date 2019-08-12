package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage extends Page {

	public BasePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getPageTitle() {
		
		return driver.getTitle();
	}

	@Override
	public String getPageHeader() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebElement getElement(By Locator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void waitForElementPresent(By Locator) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void waitForPageTitle(String title) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
	
	
	
	
	
}

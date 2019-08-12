package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public  abstract class Page {
   
	WebDriver driver;
	WebDriverWait wait;
	//consructor
	public Page(WebDriver driver)
	{
		this.driver =driver;
		this.wait = new WebDriverWait(this.driver,15);
		
	}
	
	//Abstract methods 
	//every page should ahve these absract methods 
	public abstract String getPageTitle();
	public abstract String getPageHeader();
	
	public abstract WebElement getElement(By Locator);
	public abstract void waitForElementPresent(By Locator);
	public abstract void waitForPageTitle(String title);
	
	//create generics 
	
	
	
}

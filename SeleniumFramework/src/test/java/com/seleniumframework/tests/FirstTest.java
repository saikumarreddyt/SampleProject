package com.seleniumframework.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.mypages.*;
public class FirstTest {
	static WebDriver driver =null;
//starting point for any java program
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		googleSearch();
	//	String path = System.getProperty("user.dir");
		//System.out.println("project path:"+ path);
		/*
		 * WebDriverManager.ChromdDriver().SetUp()
		 * webdrivern d  = new chromedriver()
		 * 
		 * 
		 * 
		 */
		//System.setProperty("webdriver.chrome.driver", "/SeleniumFramework/Drivers/chromedriver.exe");
		//WebDriver d = new ChromeDriver();
		//d.get("http://seleniumhq.org/");
	}

	
	public static void googleSearch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sthotla\\Documents\\New folder\\SeleniumFramework\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		//go to google.com
		driver.get("https://google.com");
		//enter text into text box
		driver.findElement(By.className("hp vasq")).sendKeys(Keys.RETURN);
		
		GoogleSearchPage.textbox_search(driver).sendKeys("test");
		GoogleSearchPage.butto_search(driver).click();
		
		
		//click on serach button
		driver.findElement(By.name("btnk")).click();
		//close browser
		driver.quit();
		
		
	}
}

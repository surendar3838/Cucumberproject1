package com.global;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Date;

public class BaseClass {
	
	public static WebDriver  driver;

	public static WebDriver launchBrowser() {
		WebDriverManager.firefoxdriver().setup();
		return driver=new FirefoxDriver();
		
	}
	public static void loadUrl(String url)   {	
		driver.get("https://www.ajio.com/");
	
	}

	public  static void category1(WebElement element,String value) {
		 WebElement element1 = driver.findElement(By.className("desktop-searchBar"));
		 
		element1.sendKeys("jeans men");
		element1.click();
	}
		
	 public static void category(WebElement element) {   
		 	 		 			
		 WebElement element1 = driver.findElement(By.linkText("Men"));
		 element1.click();
		 
			 //Actions actions = new Actions(driver); 
			 //actions.moveToElement(element1).build().perform();	 

	
}
}
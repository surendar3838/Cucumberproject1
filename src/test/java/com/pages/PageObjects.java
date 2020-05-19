package com.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.global.BaseClass;


public class PageObjects extends BaseClass {

		public PageObjects()
		{
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(linkText="Men")
		private WebElement category;

		public WebElement getCategory() {
			return category;
		}

		@FindBy(className="desktop-searchBar")
		private WebElement category1;

		public WebElement getCategory1() {
			return category1;
		}
		
		
		
}

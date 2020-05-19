package com.steps;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.core.event.Status;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import com.global.BaseClass;
import com.pages.PageObjects;


import io.cucumber.core.event.Status;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitions extends BaseClass {
	WebDriver driver;
	
	
	
	  @Before	  
	  public void beforescenario(Scenario sc)
	  { 
		  System.out.println(sc.getName());
		  
	  }
	 
	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
		
		driver=launchBrowser();
		
		
		      
	}

	@Given("user enter url")
	public void user_enter_url() {
		loadUrl(""); 
			
		
	}
	
	@When("user select the product")
	public void user_select_the_product() {
		
		PageObjects obj=new PageObjects();
		category(obj.getCategory());
		
	   
	}

	@When("user click addtocart")
	public void user_click_addtocart() {
	   
	}

	@Then("user click buynow")
	public void user_click_buynow() {
	   
	}

		
}		
		
		

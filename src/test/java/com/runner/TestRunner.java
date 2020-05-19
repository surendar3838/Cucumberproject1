package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.global.BaseClass2;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\Feature_Folder\\UserRegister.feature"},glue= {"com.steps"},
dryRun=false,tags= {"@register"},plugin= {"pretty","json:src\\test\\resources\\Reports\\jsonreport.json",
		"rerun:src\\test\\resources\\Feature_Folder\\failedfeature.txt"},monochrome=true)
public class TestRunner {
	
	@AfterClass
	
	public static void afterTestRunner() {
	
BaseClass2.generateJVMReport(
		System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\jsonreport.json");
}

}
package com.global;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class BaseClass2 {
	public static void generateJVMReport(String jsonfile)
	{

	Configuration con=new Configuration(new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports"),"JVMReport Project");
	
	con.addClassifications("browser", "FireFox");
	
	List<String> li=new ArrayList<String>();
	li.add(jsonfile);
	
	ReportBuilder build=new ReportBuilder(li,con);
	build.generateReports();
	
				
	}
}

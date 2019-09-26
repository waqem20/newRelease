package com.runners;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;
import com.utils.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\waqem.haq\\eclipse-workspace\\Orange\\src\\test\\resources\\features\\Login.feature"},
				 glue = {"C:\\Users\\waqem.haq\\eclipse-workspace\\Orange\\src\\test\\java\\com\\stepDefinitions\\LoginStep.java"},
				 dryRun = true,
				 monochrome = true,
				 tags = {"@Login"},
				 plugin = {"pretty",
						 	"usage",
						   "html:target/cucumber-default-reports",
						   "json:target/cucumber.json",
						   "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"
							
				}		 
				 
				)
public class TestRunner {
	
	@AfterClass
	 public static void writeExtentReport() {
	 Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	 }
	

}
 
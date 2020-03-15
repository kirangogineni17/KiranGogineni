package testRunner;


import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "E:/Selenium/Cucumber_Selenium/Features/Login.feature",
glue= "stepDefinitionsTest",
plugin = { "pretty", "html:target/html/", "json:target/json/file.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},

monochrome = true

//plugin = { "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:path/report.html"}
//tags= {"@sanity, @regression"}
)
public class TestRunner {
	@AfterClass
    public static void writeExtentReport() {
       //Reporter.loadXMLConfig(new File("config/report.xml"));
	}
    }



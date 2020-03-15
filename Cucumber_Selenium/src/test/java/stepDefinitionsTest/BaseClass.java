package stepDefinitionsTest;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pageObjects.LoginPage;

import java.util.Properties;

public class BaseClass {

	public WebDriver driver;
	public LoginPage loginpage;
	//public static Logger logger;
	public Properties configProperties;
	 Logger logger;
	
}
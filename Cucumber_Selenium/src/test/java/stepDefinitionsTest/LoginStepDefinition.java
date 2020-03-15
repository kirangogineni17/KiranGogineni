package stepDefinitionsTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjects.LoginPage;

public class LoginStepDefinition extends BaseClass{

	 public WebDriver driver;
	// Logger logger;
	 @Before
	 public void setup() throws IOException {
		 //code for logs
		logger = Logger.getLogger("Cucumber_Selenium");
			PropertyConfigurator.configure("Log4j.properties");
			//code to read properties
			configProperties=new Properties();
			FileInputStream configPropfile=new FileInputStream("config.properties");
			configProperties.load(configPropfile);
			String browser=configProperties.getProperty("browser");
			
			if(browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", configProperties.getProperty("chromepath"));
				driver =new ChromeDriver();
			}else if(browser.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", configProperties.getProperty("firefoxpath"));
				driver =new FirefoxDriver();
			}
	 }
	   @After
	 public void close_browser() throws Throwable {   
		  	driver.quit();
		      }
    @When("^user opens Automation practice website$")
public void user_OpensWebsite() throws Throwable { 
    	//logger.info("Opening url");
    	//String url=configProperties.getProperty("url");
    	//if(url.equalsIgnoreCase(arg0))
    
    	driver.get("http://automationpractice.com/index.php");
    	//driver.get("http://www.nammregister.org.uk/test.asp");
    	/// scaner=new Scanner(System.in);
    	//System.out.println("entered captcha manually");
    	//scanner.nextInt();
    	
    }
    @And("^user click on Signin$")
    public void user_clickSignIn() throws Throwable {   
    	System.out.println("entered method login step defi");
    	LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
        	loginpage.clickSignin();
        }
    
    @And("^enter email address to create account$")
    public void enter_EmailAddress() throws Throwable {   
    	System.out.println("entered Email Address");
    	LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
        	loginpage.enterEmail();
        }
    @And("^click on Create account button$")
    public void user_clickCreateAccount() throws Throwable {   
    	System.out.println("Click Create Account");
    	LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
        	loginpage.click_CreateButton();
        }

   // @And("^user enters \"([^\"]*)\" and \"([^\")\"$")
  @And("^user enters (.*) and (.*)$")
    public void user_enterDetails(String FirstName, String LastName) throws Throwable {   
    	System.out.println("User Enter Details");
    	LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
        	loginpage.enterUserDetails(FirstName,LastName);
        }
  @And("^I can select state (.*)$")
  public void user_seletState(String State) throws Throwable {   
  	System.out.println("User Enter Details");
  	LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
      	loginpage.select_State(State);
      }
  @And("^I can verify title$")
  public void verify_Title() throws Throwable {   
  	String verifyTitle= driver.getTitle();
		System.out.println("title is"+ verifyTitle);
		if(verifyTitle.equalsIgnoreCase("Login - My Store1")) {
			System.out.println("Title verified");
		}throw new Exception("Wrong Title");
      }

  
    }


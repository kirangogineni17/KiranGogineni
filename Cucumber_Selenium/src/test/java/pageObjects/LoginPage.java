package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinitionsTest.BaseClass;

public class LoginPage extends BaseClass {

	@FindBy(id="email_create")
	WebElement emailCreate;
	
	@FindBy(linkText="Sign in")
	WebElement clickSigninLink;

	@FindBy(xpath="//a[@class='login']")
	WebElement clickSignIn;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='passwd']")
	WebElement password;
	
	@FindBy(xpath="//button[@id='SubmitCreate']")
	WebElement submitCreate;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	WebElement submitLogin;
	
	@FindBy(xpath="//input[@id='customer_firstname']")
	WebElement customerFirstName;
	
	@FindBy(xpath="//input[@id='customer_lastname']")
	WebElement customerLastName;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement customerEmail;
		
	@FindBy(xpath="//select[@id='id_state']")
	WebElement selectState;
	
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		}
	public void clickSignin() {
		System.out.println("entered method signin");
		//driver.findElement(By.xpath("//a[@class='login']")).click();
		clickSignIn.click();
		System.out.println("completed method signin");
	}
	
	public void enterEmail() throws InterruptedException {
		String user_email ="kirankumargogineni17@gmail.com";
		Thread.sleep(5000);
		emailCreate.sendKeys(user_email);
	}
	public void click_CreateButton() {
		submitCreate.click();
	}
	
	public void enterUserDetails(String FirstName, String LastName) throws Throwable {
		Thread.sleep(5000);
		customerFirstName.sendKeys(FirstName);
		Thread.sleep(5000);
		customerLastName.sendKeys(LastName);
			
	}
	
	public void select_State(String State) throws Throwable {
		Thread.sleep(5000);
		selectState.sendKeys(State);
		
			
	}
	public void verify_title() throws Throwable {
		
			
	}
}

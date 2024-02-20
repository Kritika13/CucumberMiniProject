package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private WebDriver driver;

	//By Locators
	private By emailInputLocator= By.name("user-name");
	private By passwordInputLocator= By.name("password");
	private By loginButtonLocator = By.xpath("//input[@id='login-button']");
	//private By forgottenPasswordLinkLocator = By.linkText("Forgotten Password");
	private By logoutLinkLocator = By.xpath("//span[@class='title']");


	//constructor is to sya that whenever we try to create the object of login page give me the driver and same driver will be given to the loginPage 
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

	//Page method //actions -- classic example of encapsulation

	public void enterEmail(String email) {
		WebElement emailInput= driver.findElement(emailInputLocator);
		emailInput.sendKeys(email);
	}

	public void enterPassword(String password) {
		WebElement passwordInput = driver.findElement(passwordInputLocator);
		passwordInput.sendKeys(password);		
	}

	public void clickLoginButton() {
		WebElement loginButton = driver.findElement(loginButtonLocator);
		loginButton.click();
	}
	
//	public void clickForgottenPasswordLink() {
//		WebElement forgottenPasswordLink=driver.findElement(forgottenPasswordLinkLocator);
//		forgottenPasswordLink.click();
//	}
//	
//	public boolean checkForgotPwdLink() {
//		return driver.findElement(forgottenPasswordLinkLocator).isDisplayed();
//	}
//	
	public boolean checkLogOutLink() {
		return driver.findElement(logoutLinkLocator).isDisplayed();
	}
	
	//enter user name and password and click on login button
	public void login(String email, String password) {
		enterEmail(email);
		enterPassword(password);
		clickLoginButton();	
	}
	
//	//when clicked on forgotten password need to check if navigated to the right button or not 
//	public String getForgotPwdPageUrl() {
//		String forgotPwdPageUrl = driver.getCurrentUrl();
//		return forgotPwdPageUrl;
//	}
//	
	
	
	






}

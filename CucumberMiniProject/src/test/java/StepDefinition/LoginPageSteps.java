package StepDefinition;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.LoginPage;

public class LoginPageSteps {

	private WebDriver driver;
	private LoginPage loginPage;


	//hooks
	@Before
	public void setup() {
		// Launching ChromeDriver
		driver = new ChromeDriver(); 
		// Setting timeouts using Duration
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
	}

	@After
	public void tearDown() throws InterruptedException {

		// Closing the browser

		if (driver != null) {
			driver.quit();
		}
	}


	@Given("I am on the opencart login page")
	public void i_am_on_the_opencart_login_page() {

		driver.get("https://www.saucedemo.com/");
		loginPage  = new LoginPage(driver);
	}

	@Given("I have entered a valid username and password")
	public void i_have_entered_a_valid_username_and_password() throws InterruptedException {
		loginPage.enterEmail("standard_user");
		loginPage.enterPassword("secret_sauce");
		//Thread.sleep(2000);
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() {
		loginPage.clickLoginButton();
	}

	@Then("I should be logged in successfully")
	public void i_should_be_logged_in_successfully() {
		AssertJUnit.assertEquals(loginPage.checkLogOutLink(), true); //assert is from testng, as we have used boolean so assert is used
	}

	@Given("I have entered invalid {string} and {string}")
	public void i_have_entered_invalid_and(String username, String password) {
		loginPage.login(username, password);
		//loginPage.enterPassword(password);
	}



	@Then("I should see an error message indicating {string}")
	public void i_should_see_an_error_message_indicating(String error_message) {
		//Assert that an error message is displayed on the page matching the expected error message
		//AssertJUnit.assertEquals(driver.findElement(By.cssSelector("h3[data-test='error']")).isDisplayed(), true);
		//		
		WebElement errorMessageElement = driver.findElement(By.xpath("//h3[contains(text(),'Epic sadface: Username and password do not match a')]"));
		Assert.assertTrue(errorMessageElement.isDisplayed());
		Assert.assertEquals(error_message, errorMessageElement.getText());
	}

	//	@When("I click on the \"Forgotten Password\" link")
	//	public void i_click_on_link() {
	//		loginPage.clickForgottenPasswordLink();
	//
	//	}
	//
	//	@Then("I should be redirected to the password reset page")
	//	public void i_should_be_redirected_to_the_password_reset_page() {
	//		AssertJUnit.assertTrue(loginPage.getForgotPwdPageUrl().contains("account/forgotten"));
	//	}




}

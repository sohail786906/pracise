package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.*;

public class stepDef {
	WebDriver driver;
	@Given("I am on the Parabank login page")
	public void i_am_on_the_Parabank_login_page() {
		System.setProperty("webdriver.chrome.driver" , "C:\\Selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		driver.get("https://parabank.parasoft.com/parabank/index.html");
		driver.manage().window().maximize();
	}
	@When("I enter valid username and password")
	public void I_enter_valid_username_and_password() {
		driver.findElement(By.cssSelector("div:nth-child(1) div:nth-child(2) form:nth-child(1) div.login:nth-child(2) > input.input")).sendKeys("valid_username");
		driver.findElement(By.cssSelector("div:nth-child(1) div:nth-child(2) form:nth-child(1) div.login:nth-child(4) > input.input")).sendKeys("valid_password");
	}
	@When("I click on the login button")
	public void I_click_on_the_login_button() {
		driver.findElement(By.cssSelector("div:nth-child(1) div:nth-child(2) form:nth-child(1) div.login:nth-child(5) > input.button")).click();
	}
	@Then("I should be logged in successfully")
	public void I_should_be_logged_in_successfully() {
		Assert.assertTrue(driver.getTitle().contains("Welcome validusername"));
		driver.quit();
	}
	@When("I enter invalid username and password")
	public void I_enter_invalid_username_and_password() {
		driver.findElement(By.cssSelector("div:nth-child(1) div:nth-child(2) form:nth-child(1) div.login:nth-child(2) > input.input")).sendKeys("invalid");
		driver.findElement(By.cssSelector("div:nth-child(1) div:nth-child(2) form:nth-child(1) div.login:nth-child(4) > input.input")).sendKeys("invalid_password");
	}
	@Then("I should see an error message")
	public void i_see_an_error_message() {
		WebElement errorMessage = driver.findElement(By.cssSelector(".error"));
		Assert.assertTrue(errorMessage.isDisplayed());
		driver.quit();
	}
}

package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.LoginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {

	public WebDriver driver;
	
	public LoginPage loginpag;
	
	@Given("User Launch Chromebrowser")
	public void user_launch_chromebrowser() {
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   
	   loginpag = new LoginPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_url(String URL) {
	   driver.get(URL);
	   
	}
	@When("user click on Singin Button")
	public void user_click_on_Signin_Button() {
		loginpag.signin();
	}
	
	
}

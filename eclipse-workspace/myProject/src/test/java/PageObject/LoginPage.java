package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;

public class LoginPage {
	private WebDriver driver;
	private By usernameField = By.tagName("input");
	private By passwordField = By.tagName("input");
	private By loginButton = By.tagName("input");
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
	}
	public void 
	enterUsername(String username) {
		driver.findElement(usernameField).sendKeys("validusername");
		
	}
	public void
	enterPassword(String password) {
		driver.findElement(passwordField).sendKeys("validpassword");
	}
	public void
	clickLoginButton() {
		driver.findElement(passwordField).click();
	}
}

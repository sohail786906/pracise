package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) {
		
		ldriver = rdriver;
	PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(id="nav-link-accountList")
	WebElement Sigin;

	
	public void signin() {
		Sigin.click();
	}
}

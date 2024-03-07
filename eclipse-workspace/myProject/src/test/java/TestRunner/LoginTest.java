package TestRunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.LoginPage;

public class LoginTest {
	private WebDriver driver;
	private LoginPage loginpage;
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://parabank.parasoft.com/parabank/index.html");
	driver.manage().window().maximize();
	loginpage = new LoginPage(driver);
	}
	@Test
	public void loginWithValidCredential() {
		loginpage.enterUsername("validusername");
		loginpage.enterPassword("validpassword");
		loginpage.clickLoginButton();
		Assert.assertTrue(driver.getCurrentUrl().contains("overview"));
	}
	@AfterClass
	public void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}

}

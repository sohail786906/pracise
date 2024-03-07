package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class LoginStepDefination {
	WebDriver driver;
	@Given("I am on the NopCommerce login page")
	public void i_am_on_the_nop_commerce_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login/");
		driver.manage().window().maximize();
		
}
	@When("I enter valid username and password")
	public void i_enter_valid_username_and_password() throws InterruptedException {
		driver.findElement(By.cssSelector("#Email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#Email")).sendKeys("admin@yourstore.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#Password")).clear();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#Password")).sendKeys("admin");
	
}
	@When("click on the login button")
	public void click_on_the_login_button() throws InterruptedException {
		Thread.sleep(2000);
	    driver.findElement(By.tagName("button")).click();
}
	@Then("I should verify to the {string}")
	public void i_should_verify_to_the(String expectedtitle) {
	   
	
		String actualtitle = driver.getTitle();
		
		if(actualtitle.equals(expectedtitle)) {
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertTrue(true);
		}
	}
	@When("I click to logout button")
	public void i_click_to_logout_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
}
	@Then("Then I am on the NopCommerce login page{string}")
	public void then_i_on_the_nopcommerce_login_page(String expectedtitle) throws InterruptedException {
		
		String actualTitle = driver.getTitle();
		
		if(actualTitle.equals(expectedtitle)) {
			Assert.assertTrue(false);
		}
		else {
			Assert.assertTrue(true);
		}
		Thread.sleep(2000);
		
		 driver.findElement(By.tagName("button")).click();
		System.out.println("LOGIN SUCCESSFULLY>>>>!" +driver.getPageSource().contains(actualTitle));
		driver.close();
	}
}

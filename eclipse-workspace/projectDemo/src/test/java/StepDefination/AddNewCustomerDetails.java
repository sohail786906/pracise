package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import PageObject.DashboardPage;
import io.cucumber.java.en.*;

public class AddNewCustomerDetails {
	

	public WebDriver driver;
	

	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		driver.get("https://admin-demo.nopcommerce.com/login/");
		
		driver.manage().window().maximize();
		
	}
	

	@When("User enters username and password and clicks login")
	public void user_enters_username_and_password_and_clicks_login() {

		driver.findElement(By.cssSelector("#Email")).clear();
		driver.findElement(By.cssSelector("#Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.cssSelector("#Password")).clear();
		driver.findElement(By.cssSelector("#Password")).sendKeys("admin");
	    driver.findElement(By.tagName("button")).click();

	}

	

	  @When("User clicks on Customers")
	    public void userClicksOnCustomers() {
	        DashboardPage.clickCustomersDropdown();
	        DashboardPage.clickAddNewCustomer();
	    }
    @When("User fills customer details")
     public void userFillsCustomerDetails() {
       
        String email;
        String password;
        String firstName;
        String lastName;
        String gender;
        String dateOfBirt;
        String companyName; 
        AddNewCustomerDetails.fillCustomerDetails(email, password, firstName, lastName, gender, dateOfBirth, companyName);
} 


	private static void fillCustomerDetails(String email, String password, String firstName, String lastName,
			String gender, String dateOfBirth, String companyName) {
		email = "Romanemperior@gmail.com";
		password = "admin";
	   firstName = "roman";
	   lastName = "emperior";
	   gender = "Male";
	   dateOfBirth = "01/01/1990";
	   companyName = "Apple";
	}


	@When("User clicks on Save")
    public void userClicksOnSave() {
		 driver.findElement(By.cssSelector("body.sidebar-mini.layout-fixed.control-sidebar-slide-open.sidebar-closed.sidebar-collapse:nth-child(2) div.wrapper:nth-child(3) div.content-wrapper:nth-child(3) form:nth-child(2) div.content-header.clearfix:nth-child(1) div.float-right > button.btn.btn-primary:nth-child(1)")).click();
    }
    

	@Then("User sees the message {string}")
	    public void userSeesTheMessage(String expectedTitle) {
	                          
	        String actualTitle = driver.getTitle();
	        Assert.assertEquals(actualTitle, expectedTitle, "Title mismatch");
	    }
	}
	
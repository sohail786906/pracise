package StepDefination;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObject.AddressPage;

public class AddressStepDefination {
	private WebDriver driver;
    private AddressPage addressPage;
   

    @When("I add the address {string}")
    public void addAddress(String address) {
        addressPage.addAddress(address);
    }
}

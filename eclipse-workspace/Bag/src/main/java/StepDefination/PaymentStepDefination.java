package StepDefination;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.When;
import pageObject.PaymentPage;

public class PaymentStepDefination {
	private WebDriver driver;
    private PaymentPage paymentPage;

    @When("I pay with cash")
    public void payWithCash() {
        paymentPage.payWithCash();
    }
}

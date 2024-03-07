package StepDefination;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.When;
import pageObject.CartPage;

public class CartStepDefination {
	private WebDriver driver;
    private CartPage cartPage;


    @When("I add {string} to the cart")
    public void addToCart(String itemName) {
        cartPage.addToCart(itemName);
    }

    @When("I view the cart")
    public void viewCart() {
        cartPage.viewCart();
    }
}

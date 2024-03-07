package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage {
	 private final WebDriver driver;

	    public PaymentPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void payWithCash() {
	        driver.findElement(By.id("cashPayment")).click();
	        driver.findElement(By.id("confirmPayment")).click();
	    }
}

package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddressPage {
	private final WebDriver driver;

    public AddressPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addAddress(String address) {
        driver.findElement(By.id("Address")).sendKeys(address);
    }
}

package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
	private final WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addToCart(String itemName) {
        driver.findElement(By.xpath("//h2[text()='" + itemName + "']/following-sibling::button")).click();
    }

    public void viewCart() {
        driver.findElement(By.id("viewCart")).click();
    }
}

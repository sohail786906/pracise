package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Signup {
	private final WebDriver driver;

    public Signup(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToSignupPage(String url) {
        driver.get(url);
    }

    public void enterSignupDetails(String username, String password, String email) {
        driver.findElement(By.id("Username")).sendKeys(username);
        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.id("Email")).sendKeys(email);
    }

    public void clickSignupButton() {
        driver.findElement(By.cssSelector("input[type='submit']")).click();
    }
}

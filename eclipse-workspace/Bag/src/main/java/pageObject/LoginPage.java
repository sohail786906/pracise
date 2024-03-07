package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToLoginPage(String url) {
        driver.get(url);
    }

    public void enterUsername(String username) {
        driver.findElement(By.id("Username")).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(By.id("Password")).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(By.cssSelector("input[type='submit']")).click();
    }
}

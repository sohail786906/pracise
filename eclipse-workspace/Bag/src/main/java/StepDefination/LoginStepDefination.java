package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginStepDefination {
	private final WebDriver driver;

    public LoginStepDefination(WebDriver driver) {
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

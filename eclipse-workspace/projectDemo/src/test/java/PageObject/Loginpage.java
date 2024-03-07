import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
    public WebDriver driver;

    public Loginpage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsernameAndPassword(String username, String password) {
        WebElement usernameInput = driver.findElement(By.cssSelector("#Email"));
        WebElement passwordInput = driver.findElement(By.cssSelector("#Password"));
        usernameInput.clear();
        usernameInput.sendKeys("admin@yourstore.com");
        passwordInput.clear();
        passwordInput.sendKeys("admin");
    }

    public void clickLoginButton() {
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginButton.click();
    }

   
}
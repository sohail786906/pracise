package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateCustomerAddr {
    private final WebDriver driver;

    public CreateCustomerAddr(WebDriver driver) {
        this.driver = driver;
    }

    public void fillCustomerDetails(String email, String password, String firstName, String lastName,
                                    String gender, String dateOfBirth, String companyName) {
        WebElement emailInput = driver.findElement(By.cssSelector("#Email"));
        WebElement passwordInput = driver.findElement(By.cssSelector("#Password"));
        WebElement firstNameInput = driver.findElement(By.cssSelector("#FirstName"));
        WebElement lastNameInput = driver.findElement(By.cssSelector("#LastName"));
        WebElement genderDropdown = driver.findElement(By.cssSelector("#Gender_Male"));
        WebElement dateOfBirthInput = driver.findElement(By.cssSelector("#DateOfBirth"));
        WebElement companyNameInput = driver.findElement(By.cssSelector("#Company"));

    }

    public void clickSaveButton() {
        WebElement saveButton = driver.findElement(By.xpath("//body/div[3]/div[1]/form[1]/div[1]/div[1]/button[1]/i[1]"));
       saveButton.click();
    }

    
}

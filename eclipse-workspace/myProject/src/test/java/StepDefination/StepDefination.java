package StepDefination;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefination {
	public static void main(String args[]) {
		WebDriver  driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.html");
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		new File("screenshot.png");
		driver.quit();
	}

}

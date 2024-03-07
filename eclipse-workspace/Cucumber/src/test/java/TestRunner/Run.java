package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".//Features/LoginPage.feature",
glue = "StepDefination",
dryRun = true,
monochrome = false,
plugin = {"pretty","html:target/Cucumber-reports/reports1.html"})



public class Run {

}

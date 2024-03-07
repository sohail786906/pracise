package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = ".//features/Loginpage.feature",

		glue = "stepDef",
		dryRun = true,
		monochrome = false,
		plugin = {"pretty","html:target/-Pracise/reports1.html"})


public class Run {

}

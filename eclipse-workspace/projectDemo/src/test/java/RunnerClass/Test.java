package RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//Features/CreateCustomer.feature", glue="StepDefination",
monochrome=true,
dryRun=false,
plugin={"pretty", "html:target/projectDemo-reports/reports1.html"}
)

public class Test {

}

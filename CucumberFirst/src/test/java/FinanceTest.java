import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(features = "classpath:cucumber-feature/MorningStar.feature", glue = { "org.cuke.steps" }, plugin = {
		"pretty", "html:target/cucumber", "json:target/cucumber-report.json" })

public class FinanceTest {

}

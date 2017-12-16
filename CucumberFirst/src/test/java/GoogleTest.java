import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions (features = "classpath:cucumber-feature/google.feature"
                   ,glue={"org.cuke.steps"})

public class GoogleTest {

}

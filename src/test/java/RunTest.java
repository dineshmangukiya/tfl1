import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/feature", strict = true,
        format = "pretty", plugin = {"json:target/cucumber.json"})
public class RunTest {
}

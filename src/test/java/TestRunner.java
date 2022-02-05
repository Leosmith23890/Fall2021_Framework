
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // Path to feature files
        features = {"src/test/resources/Facebook", "src/test/resources/Darksky"},

        // Specify the step definition package name
        glue = {"StepDefinition", "Web"},

        // Tags to be executed
        //tags = {"@Sanity"},

        // This create a default Cucumber report
        plugin = {"pretty", "html:Reports/Default/"}
)
public class TestRunner {
}
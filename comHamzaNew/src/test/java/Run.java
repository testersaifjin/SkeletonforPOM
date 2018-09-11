import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\sjain1\\IdeaProjects\\comHamzaNew\\src\\test\\resources\\login.feature", tags = "@live", dryRun = false, strict = false)
public class Run {
}

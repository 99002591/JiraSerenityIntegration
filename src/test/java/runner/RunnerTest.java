package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)


@CucumberOptions(
        features = "src/test/resources/features/004Test_loginUI.feature",
        glue= "StepDefinitions",
        monochrome = true,
        plugin = "html:target/automationreport.html")
public class RunnerTest {
}

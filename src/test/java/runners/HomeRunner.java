package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/feature/Home.feature",
        glue = "stepDefinition",
        tags="@home",
        plugin = {"pretty", "json:target/cucumber/home.json", "html:target/cucumber-reports/home.html"}
)
public class HomeRunner extends AbstractTestNGCucumberTests{
	
}
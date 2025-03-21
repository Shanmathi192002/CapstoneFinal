package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/feature/Search.feature",
        glue = "stepDefinition",
        plugin = {"pretty", "json:target/cucumber/search.json", "html:target/cucumber-reports/search.html"}
)
public class SearchRunner extends AbstractTestNGCucumberTests{
	
}

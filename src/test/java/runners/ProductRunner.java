package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/feature/Product.feature",
        glue = "stepDefinition",
        plugin = {"pretty", "json:target/cucumber/product.json", "html:target/cucumber-reports/product.html"}
)
public class ProductRunner extends AbstractTestNGCucumberTests{
	
}

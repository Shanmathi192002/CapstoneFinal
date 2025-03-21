package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/feature/Cart.feature",
        glue = "stepDefinition",
        plugin = {"pretty", "json:target/cucumber/cart.json", "html:target/cucumber-reports/cart.html"}
)
public class CartRunner extends AbstractTestNGCucumberTests{
	
}

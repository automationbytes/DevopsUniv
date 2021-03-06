package Runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/FeatureFiles/Google.feature",
		glue = {"StepDefn"},
		plugin = {"pretty","html:Reports/cucumberreports.html"},
		publish = true
		
		)


public class TestRunnerTestng extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios(){
		return super.scenarios();
		
	}
	
}

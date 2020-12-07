package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features={"D://Balajid//eclipse-workspace//AcurusResumeCucumber//src//main//java//Features//Login.feature"},
glue="StepDefinitions", strict=true, monochrome = true,
plugin = {"json:target/cucumber.json","html:target/site/cucumber-pretty"})
public class RunnerClass extends AbstractTestNGCucumberTests{
	
}

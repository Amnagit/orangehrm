package Com.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/resources",
		  glue = {"Com.StepDef"},
		  tags = {"@newtest"},
		  plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/reports.html"},
		  monochrome = true
		  
		)
public class Runner {

}

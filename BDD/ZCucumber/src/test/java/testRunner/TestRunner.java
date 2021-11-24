package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions
(
	features="C:\\Users\\ASHA PANDEY\\ZCucumber\\features",
	glue="stepDefinations",
	dryRun=false,
	plugin= { "pretty"},
	monochrome=true
	
	)

public class TestRunner {

}

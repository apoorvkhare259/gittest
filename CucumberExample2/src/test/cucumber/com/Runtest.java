package test.cucumber.com;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\cucumber\\com\\Testcase.feature", glue="StepDefenations",plugin = { "pretty" },
monochrome = true)
public class Runtest {
	

}
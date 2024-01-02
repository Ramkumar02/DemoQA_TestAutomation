package StepDefinition;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features="src\\test\\resources\\Features", 
glue={"StepDefinition"}, 
monochrome = true,
plugin = {"pretty","html:target/HtmlReports/reports.html",
		  "pretty","json:target/JSONReports/reports.json",
		  "pretty","junit:target/JuintReports/reports.xml"},
tags="@SmokeFeature")

public class TestRunner {

}

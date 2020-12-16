package Runner;

import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;

//To run with JUnit
 //@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,plugin = {"html:target/cucumber-html-report", "json:target/cucumber.json"},
        features="src/test/java/Features",
        tags = {"@smoke"},
        glue="Steps",
        dryRun = false)
public class TestRunner extends AbstractTestNGCucumberTests {

}


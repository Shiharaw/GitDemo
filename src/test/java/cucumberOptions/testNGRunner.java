package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",

//This check all the feature files have all associated step definitions
//dryRun=true,
//Run all
glue="stepDefinitions", monochrome=true,
plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json"})

//Run SmokeTest only
//glue="stepDefinitions", monochrome=true, tags="@SmokeTest")

//Run Scenarios with both tags SmokeTest and RegesstionTest
//glue="stepDefinitions", monochrome=true, tags="@SmokeTest and @RegressionTest")

//Run Scenarios with tags SmokeTest or RegesstionTest
//glue="stepDefinitions", monochrome=true, tags="@SmokeTest or @RegressionTest")

//Run Scenarios with tags non RegesstionTest
//glue="stepDefinitions", monochrome=true, tags="not @RegressionTest")
public class testNGRunner extends AbstractTestNGCucumberTests{

}


//tags="@SmokeTest or @RegressionTest" >
//This check the feature file and based on the tags run the scenarios
//This run all scenarios with SmokeTest, RegressionTest and both SmokeTest, RegressionTest

//plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json"} >
//This use to define reports
//Pretty - give color full reports
//html and Json are 2 report types and location to generate the reports

//dryRun=true > 
//This check all the feature files have all associated step definitions
//This is not executed the test

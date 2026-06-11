package com.spartawebtest.runner;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.SNIPPET_TYPE_PROPERTY_NAME;

//@Cucumber
/*@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",glue = "com.spartawebtest",plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber-report.json"})
*/

@Suite
@SelectClasspathResource("features") // Folder in src/test/resources
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.spartawebtest.steps") // Step definitions package
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, html:target/cucumber-report.html")
@ConfigurationParameter(key = SNIPPET_TYPE_PROPERTY_NAME, value = "camelcase")
public class Runner {

}

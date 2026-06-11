package com.spartawebtest.runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.platform.engine.Cucumber;

import org.junit.runner.RunWith;

import static io.cucumber.core.options.Constants.GLUE_PROPERTY_NAME;

@Cucumber
/*@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",glue = "com.spartawebtest",plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber-report.json"})
*/
public class Runner {

}

package com.spartawebtest.runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",glue = "com.spartawebtest",plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber-report.json"})
public class Runner {
}

package com.spartawebtest.steps;

import com.spartawebtest.pages.InsightsPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.MatcherAssert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class InsightsSteps {

    private final InsightsPage insightsPage = new InsightsPage();

    @Given("I am on the Insights Page")
    public void iAmOnTheInsightsPage() {
        insightsPage.navigateToInsights();
    }

    @When("I select the case studies filter")
    public void iSelectTheCaseStudiesFilter() {
        insightsPage.clickCaseStudiesFilter();
    }

    @Then("I can see the FCDO case study")
    public void iCanSeeTheFcdoCaseStudy() {
        assertThat(insightsPage.isFcdoCaseStudyVisible(), is(true));
    }
}
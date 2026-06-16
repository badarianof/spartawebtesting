package com.spartawebtest.steps;

import com.spartawebtest.pages.HomePage;
import com.spartawebtest.pages.InsightsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

@SuppressWarnings("unused")
public class HomePageSteps {

    private final HomePage homePage = new HomePage();
    private final InsightsPage insightsPage = new InsightsPage();

    @Given("I am on the Sparta Global homepage")
    public void iAmOnTheHomepage() {
        homePage.open();
    }

    @And("I navigate to the Insights page")
    public void iNavigateToTheInsightsPage() {
        homePage.hoverOverInsightsHeader();
    }

    @And("select subsection called insights")
    public void selectSubsectionCalledInsights() {
        homePage.selectInsightsSubsection();
    }

    @When("I type {string} in the search bar")
    public void iTypeInTheSearchBar(String keyword) {
        insightsPage.searchForKeyword(keyword);
    }

    @Then("I see case studies")
    public void iSeeCaseStudies() {
        Assertions.assertTrue(insightsPage.areSearchResultsVisible());
    }
}

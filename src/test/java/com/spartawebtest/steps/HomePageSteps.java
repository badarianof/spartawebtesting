package com.spartawebtest.steps;

import com.spartawebtest.pages.HomePage;
import com.spartawebtest.pages.InsightsPage;
import io.cucumber.java.en.*;
import net.serenitybdd.annotations.Steps;
import org.junit.jupiter.api.Assertions;

@SuppressWarnings("unused")
public class HomePageSteps {

    // Step libraries - managed and instrumented by Serenity
    @Steps
    private HomePage homePage;

    // FIX: Page objects declared as plain fields are auto-instantiated
    // by Serenity with the correct driver - no factory or @Steps needed
    private InsightsPage insightsPage;

    @Given("I am on the Sparta Global homepage")
    public void iAmOnTheHomepage() { homePage.openHomePage(); }

    @And("I navigate to the Insights page")
    public void iNavigateToTheInsightsPage() { homePage.hoverOverInsightsHeader(); }

    @And("select subsection called insights")
    public void selectSubsectionCalledInsights() { homePage.selectInsightsSubsection(); }

    @When("I type {string} in the search bar")
    public void iTypeInTheSearchBar(String keyword) { insightsPage.searchForKeyword(keyword); }

    @Then("I see case studies")
    public void iSeeCaseStudies() { Assertions.assertTrue(insightsPage.areSearchResultsVisible()); }
}
package com.spartawebtest.steps;

import com.spartawebtest.pages.HomePage;
import com.spartawebtest.pages.InsightsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import static net.serenitybdd.core.Serenity.getDriver;

public class HomePageSteps {
    private final HomePage homePage = new HomePage();
    private final InsightsPage insightsPage = new InsightsPage();
    @Given("I am on the Home Page")
    public void iAmOnTheHomePage() {
        homePage.open();
    }

    @Then("the page title is {string}")
    public void thePageTitleIs(String arg0) {
        MatcherAssert.assertThat(homePage.getTitle().contains(arg0), Matchers.is(true));
    }

    @When("I type {string} in the search bar")
    public void iTypeInTheSearchBar(String keyword) {
        insightsPage.searchForKeyword(keyword);
    }

    @Then("I see case studies")
    public void iSeeCaseStudies() {
        MatcherAssert.assertThat(insightsPage.areSearchResultsVisible().getAccessibleName(),Matchers.containsString("HSBC"));
    }

    @Then("I am on the {string} page")
    public void iAmOnThePage(String arg0) {
        MatcherAssert.assertThat(getDriver().getCurrentUrl(),Matchers.is(arg0));
    }

    @When("I click the {string} button")
    public void iClickTheButton(String arg0) {
        homePage.clickButton(arg0);
    }
}

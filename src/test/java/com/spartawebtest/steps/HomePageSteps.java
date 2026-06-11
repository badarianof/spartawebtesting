package com.spartawebtest.steps;

import com.spartawebtest.pages.HomePage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

public class HomePageSteps {
    private final HomePage homePage = new HomePage();
    @Given("I am on the Home Page")
    public void iAmOnTheHomePage() {
        homePage.open();
    }

    @Then("the page title is {string}")
    public void thePageTitleIs(String arg0) {
        MatcherAssert.assertThat(homePage.getTitle().contains("arg0"), Matchers.is(true));
    }
}

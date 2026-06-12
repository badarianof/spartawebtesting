package com.spartawebtest.steps;

import com.spartawebtest.pages.HomePage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.waits.Wait;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import com.spartawebtest.utils.*;

import static net.serenitybdd.core.Serenity.getDriver;

public class HomePageSteps {
    private final HomePage homePage = new HomePage();
    @Given("I am on the Home Page")
    public void iAmOnTheHomePage() {
        homePage.open();
    }

    @Then("the page title is {string}")
    public void thePageTitleIs(String arg0) {
        MatcherAssert.assertThat(homePage.getTitle().contains(arg0), Matchers.is(true));
    }

    @And("I click the services tab")
    public void iClickTheServicesTab() {
        homePage.clickServices();
    }

    @When("I click the capability build button")
    public void iClickTheCapabilityBuildButton() {
        homePage.clickCapabilityBuild();
    }

    @Then("I am on the {string} page")
    public void iAmOnThePage(String arg0) {
        MatcherAssert.assertThat(getDriver().getCurrentUrl(),Matchers.is(arg0));
    }
}

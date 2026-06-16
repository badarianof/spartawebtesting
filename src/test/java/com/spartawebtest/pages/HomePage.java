package com.spartawebtest.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;

public class HomePage extends PageObject {

    public void openHomePage() {
        getDriver().get("https://www.spartaglobal.com/");
    }

    public void hoverOverInsightsHeader() {
        By cookieButton = By.id("ccc-dismiss-button");
        if (!getDriver().findElements(cookieButton).isEmpty()) {
            find(cookieButton).click();
        }

        By insightsHeader = By.cssSelector("nav a[href*='insights']");
        find(insightsHeader).withTimeoutOf(Duration.ofSeconds(10)).waitUntilVisible();
        new Actions(getDriver())
                .moveToElement(getDriver().findElement(insightsHeader))
                .perform();

        waitABit(1500);
    }

    public void selectInsightsSubsection() {
        By subMenuLink = By.xpath(
                "//a[contains(translate(text(),'abcdefghijklmnopqrstuvwxyz','ABCDEFGHIJKLMNOPQRSTUVWXYZ'), 'INSIGHTS')]"
        );
        find(subMenuLink).withTimeoutOf(Duration.ofSeconds(10)).waitUntilVisible().click();
    }
}
package com.spartawebtest.pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

@DefaultUrl("https://www.spartaglobal.com/insights/")
public class InsightsPage extends PageObject {

    public void navigateToInsights() {
        open();
    }

    public void clickCaseStudiesFilter() {
        getDriver().navigate().to("https://www.spartaglobal.com/insights/?type=case_study");
    }

    public boolean isFcdoCaseStudyVisible() {
        var element = $(By.xpath("//*[contains(text(),'FCDO')]"));
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", element.getElement());
        return element.isVisible();
    }
}
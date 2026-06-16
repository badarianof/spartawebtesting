package com.spartawebtest.pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.By;
//import org.openqa.selenium.By;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://www.spartaglobal.com/insights/")
public class InsightsPage extends PageObject {

    public void navigateToInsights() {
        open();}
    public void searchForKeyword(String keyword) {
        find(By.id("search")).waitUntilVisible();
        find(By.id("search")).clear();
        find(By.id("search")).type(keyword);
        find(By.id("search")).sendKeys(Keys.ENTER);
    }

    public void clickCaseStudiesFilter() {
        getDriver().navigate().to("https://www.spartaglobal.com/insights/?type=case_study");
    }

    public boolean isFcdoCaseStudyVisible() {
        var element = $(By.xpath("//*[contains(text(),'FCDO')]"));
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", element.getElement());
        return element.isVisible();}
    public WebElement areSearchResultsVisible() {
        return getDriver().findElement(By.xpath("//*[contains(text(),'HSBC')]"));
    }
}
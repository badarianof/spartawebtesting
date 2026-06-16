package com.spartawebtest.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import java.time.Duration;

@SuppressWarnings("unused")
public class InsightsPage extends PageObject {

    // FIX: use id="search" - the most reliable locator
    private static final By KEYWORD_SEARCH_BAR = By.id("search");

    private static final By FIRST_CASE_STUDY =
            By.xpath("//div[contains(@class,'list') or contains(@class,'posts')]" +
                    "//a[contains(translate(.,'abcdefghijklmnopqrstuvwxyz'," +
                    "'ABCDEFGHIJKLMNOPQRSTUVWXYZ'),'CASE STUDY')]");

    public void searchForKeyword(String keyword) {
        find(KEYWORD_SEARCH_BAR).withTimeoutOf(Duration.ofSeconds(10)).waitUntilVisible();
        find(KEYWORD_SEARCH_BAR).clear();
        find(KEYWORD_SEARCH_BAR).type(keyword);
        find(KEYWORD_SEARCH_BAR).sendKeys(Keys.ENTER);
    }

    public boolean areSearchResultsVisible() {
        try {
            return find(FIRST_CASE_STUDY)
                    .withTimeoutOf(Duration.ofSeconds(10))
                    .isCurrentlyVisible();
        } catch (Exception e) {
            return false;
        }
    }
}

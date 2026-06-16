package com.spartawebtest.pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

@SuppressWarnings("unused")
@DefaultUrl("https://www.spartaglobal.com/insights/")
public class InsightsPage extends PageObject {

    public void searchForKeyword(String keyword) {
        find(By.id("search")).waitUntilVisible();
        find(By.id("search")).clear();
        find(By.id("search")).type(keyword);
        find(By.id("search")).sendKeys(Keys.ENTER);
    }

    public boolean areSearchResultsVisible() {
        try {
            return find(By.xpath(
                    "//div[contains(@class,'list') or contains(@class,'posts')]" +
                            "//a[contains(translate(.,'abcdefghijklmnopqrstuvwxyz','ABCDEFGHIJKLMNOPQRSTUVWXYZ'),'CASE STUDY')]"
            )).isCurrentlyVisible();
        } catch (Exception e) {
            return false;
        }
    }
}
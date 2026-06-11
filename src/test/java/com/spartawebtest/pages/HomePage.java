package com.spartawebtest.pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;

@DefaultUrl("https://www.spartaglobal.com/")
public class HomePage extends PageObject {
    public Boolean isLoaded(){
        return getDriver().getTitle().contains("Sparta Global");
    }
}

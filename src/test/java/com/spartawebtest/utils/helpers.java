package com.spartawebtest.utils;

import net.serenitybdd.core.pages.WebElementFacade;

import java.net.URL;

import static net.serenitybdd.core.Serenity.getDriver;

public class helpers {
    public Boolean testLink(WebElementFacade button, String URL){
        button.click();
        return getDriver().getCurrentUrl() == URL;
    }
}

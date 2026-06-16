package com.spartawebtest.pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

@DefaultUrl("https://www.spartaglobal.com/")
public class HomePage extends PageObject {
    public void clickButton(String buttonText){getDriver().findElement(By.buttonText(buttonText)).click();}
}
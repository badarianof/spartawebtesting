package com.spartawebtest.pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

@DefaultUrl("https://www.spartaglobal.com/")
public class HomePage extends PageObject {
    public Boolean isLoaded(){
        return getDriver().getTitle().contains("Sparta Global");
    }
    public void clickServices(){getDriver().findElement(By.buttonText("Services")).click();}
    public void clickCapabilityBuild(){getDriver().findElement(By.buttonText("Capability Build")).click();}
    public void clickAISkillsAccelerator(){getDriver().findElement(By.buttonText("AI Skills Accelerator")).click();}
    public void clickBecomeASpartan(){getDriver().findElement(By.buttonText("Become a Spartan")).click();}
    public void clickCommunity(){getDriver().findElement(By.buttonText("Community")).click();}
    public void clickExForces(){getDriver().findElement(By.buttonText("Ex-Forces")).click();}
}

    public void clickServices() {
        getDriver().findElement(By.buttonText("Services")).click();
    }

    public void clickCapabilityBuild() {
        getDriver().findElement(By.buttonText("Capability Build")).click();
    }

    public void hoverOverInsightsHeader() {
        org.openqa.selenium.By cookieBtn = org.openqa.selenium.By.id("ccc-dismiss-button");
        if (!getDriver().findElements(cookieBtn).isEmpty()) {
            getDriver().findElement(cookieBtn).click();
        }
        find(org.openqa.selenium.By.cssSelector("nav a[href*='insights']"))
                .waitUntilVisible();
        new Actions(getDriver())
                .moveToElement(getDriver().findElement(
                        org.openqa.selenium.By.cssSelector("nav a[href*='insights']")))
                .perform();
        waitABit(1500);
    }

    public void selectInsightsSubsection() {
        find(org.openqa.selenium.By.xpath(
                "//a[contains(translate(text(),'abcdefghijklmnopqrstuvwxyz','ABCDEFGHIJKLMNOPQRSTUVWXYZ'),'INSIGHTS')]"
        )).waitUntilVisible().click();
    }
}
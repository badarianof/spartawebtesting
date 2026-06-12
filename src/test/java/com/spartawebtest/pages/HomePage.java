package com.spartawebtest.pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

@DefaultUrl("https://www.spartaglobal.com/")
public class HomePage extends PageObject {
    @FindBy(xpath = "xpath = \"//nav//a[contains(text(),'Services')] | //nav//span[contains(text(),'Services')]\"")
    private WebElementFacade services;
    @FindBy(xpath="xpath=//ul[@id='menu-main-menu']/li[2]/div/div/ul/li/a/span")
    private WebElementFacade capabilityBuild;
    public Boolean isLoaded(){
        return getDriver().getTitle().contains("Sparta Global");
    }
    public void clickServices(){getDriver().findElement(By.buttonText("Services")).click();}
    public void clickCapabilityBuild(){getDriver().findElement(By.buttonText("Capability Build")).click();}
    public void clickAISkillsAccelerator(){getDriver().findElement(By.buttonText("AI Skills Accelerator")).click();}
}

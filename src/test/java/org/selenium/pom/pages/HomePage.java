package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class HomePage extends BasePage {

    public final By elements = By.cssSelector("body > div:nth-child(6) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1)");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage load(){
        load("/"); //pozovemo load metod iz base page
        return this;
    }

    public Elements clickElements(){
        wait.until(ExpectedConditions.elementToBeClickable(elements)).click();
        return new Elements(driver); //trebamo ovo uradit samo ako navigiramo na novu stranicu, ako cemo ostat na istoj stranici ne moramo ovo uradit, ovo je fluent interface

    }

}

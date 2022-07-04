package org.example.pages;

import org.example.stepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_homePage {
public List<WebElement> prices(){
    return Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
    }
public WebElement searchBox(){
    return Hooks.driver.findElement(By.id("small-searchterms"));
    }




    public WebElement page_title(){
    return Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
    }

}

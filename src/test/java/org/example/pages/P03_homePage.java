package org.example.pages;

import org.example.stepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_homePage {
public List<WebElement> prices(){
    return Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
}
}

package org.example.pages;

import org.example.stepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {
    public WebElement email(){
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement password(){
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement loginButton(){
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
    }
    public WebElement myAccount(){
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-account\"]"));
    }
    public WebElement failed_message(){
        return Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));
    }
}

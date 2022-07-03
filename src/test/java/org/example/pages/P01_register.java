package org.example.pages;

import org.example.stepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_register {
    public WebElement male_gender(String type){
        WebElement element=null;
        if (type.contains("male")) {
            element= Hooks.driver.findElement(By.id("gender-male"));
        } else if (type.contains("female")) {
            element=Hooks.driver.findElement(By.id("gender-female"));
        }
        return element;
    }
    public WebElement first_name(){
        return Hooks.driver.findElement(By.id("FirstName"));

    }
    public WebElement last_name(){
        return Hooks.driver.findElement(By.id("LastName"));
    }
    public WebElement email(){
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement password(){
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement confirmPassword(){
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement register_button(){
        return Hooks.driver.findElement(By.id("register-button"));
    }
    public WebElement successMessage(){
        return Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }
}

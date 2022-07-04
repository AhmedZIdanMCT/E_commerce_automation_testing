package org.example.stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D03_currenciesStepDef {
    P03_homePage homePage=new P03_homePage();
    @When("user should select euro from drop down list")
    public void Select_currency(){
        WebElement currency = Hooks.driver.findElement(By.id("customerCurrency"));
        Select select = new Select(currency);
        select.selectByVisibleText("Euro");
    }
    @Then("currency of product's prices is changed to euro")
    public void assert_currency(){
        int no_of_products=homePage.prices().size();
        for (int i =0;i<no_of_products;i++){
            String price=homePage.prices().get(i).getText();
            Assert.assertTrue(price.contains("€"));
        }
    }
}

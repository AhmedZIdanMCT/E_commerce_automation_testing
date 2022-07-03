package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {
    SoftAssert soft=new SoftAssert();
    P02_login login_page=new P02_login();
    @Given("user go to login page")
    public void navigate_to_login(){
        Hooks.driver.findElement(By.cssSelector("a[class=\"ico-login\"]")).click();
    }
    @When("^user login with \"(.*)\" and \"(.*)\"$")
    public void username_password(String username,String password){
        login_page.email().sendKeys(username);
        login_page.password().sendKeys(password);
    }
    @And("user press on login button")
    public void loginButton(){
        login_page.loginButton().click();
    }
    @Then("user login to the system successfully")
    public void successfully_loged(){

        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/"),"wrong URL");
        soft.assertTrue(login_page.myAccount().isDisplayed(),"tab doesn't exist");
        soft.assertAll();
    }
    @Then("user could not login to the system")
    public void failed_to_log_in(){
        soft.assertTrue(login_page.failed_message().isDisplayed(),"message didn't display");
        soft.assertTrue(login_page.failed_message().getCssValue("color").contains("228, 67, 75, 1"),"wrong color");
        soft.assertAll();
    }
}

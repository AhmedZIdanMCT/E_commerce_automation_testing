package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    P01_register reg_page=new P01_register();
    SoftAssert soft=new SoftAssert();
    @Given("user go to register page")
    public void reg_page_navigate(){
        Hooks.driver.findElement(By.cssSelector("a[class=\"ico-register\"]")).click();
    }
    @When("user select gender type")
    public void gender_selection(){
        reg_page.male_gender("male").click();
    }
    @And("^user enter first name \"(.*)\" and last name \"(.*)\"$")
    public void name(String firstName,String lastName){
        reg_page.first_name().sendKeys(firstName);
        reg_page.last_name().sendKeys(lastName);
    }
    @And("user enter date of birth")
    public void date_of_birth(){
        WebElement birthDay = Hooks.driver.findElement(By.name("DateOfBirthDay"));
        Select select = new Select(birthDay);
        select.selectByIndex(19);

        WebElement birthMonth = Hooks.driver.findElement(By.name("DateOfBirthMonth"));
        select = new Select(birthMonth);
        select.selectByValue("11");

        WebElement birthYear = Hooks.driver.findElement(By.name("DateOfBirthYear"));
        select = new Select(Hooks.driver.findElement(By.name("DateOfBirthYear")));
        select.selectByVisibleText("1994");
    }
    @And("^user enter email \"(.*)\" field$")
    public void email(String email){
        reg_page.email().sendKeys(email);
    }
    @And("^user fills Password fields \"(.*)\" \"(.*)\"$")
    public void password(String password,String confirmPassword){
        reg_page.password().sendKeys(password);
        reg_page.confirmPassword().sendKeys(confirmPassword);
    }
    @And("user clicks on register button")
    public void button_click() throws InterruptedException {
        reg_page.register_button().click();
        Thread.sleep(3000);
    }
    @Then("success message is displayed")
    public void success_message(){
        String successMessage ="Your registration completed";

        soft.assertTrue(reg_page.successMessage().getText().contains(successMessage));
        soft.assertTrue(reg_page.successMessage().getCssValue("color").contains("76, 177, 124, 1"));
        soft.assertAll();
    }
}

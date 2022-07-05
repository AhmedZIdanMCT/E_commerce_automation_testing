package org.example.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D06_homeSlidersStepDef {
    P03_homePage homePage=new P03_homePage();
    @Given("user select first slider")
    public void first_slider_selection(){
        homePage.first_slider_selector().click();
    }
    @When("user click on the image")
    public void clickOnSliderImage(){
        homePage.slider_image().click();
    }
    @Then("^url should be referring to product url \"(.*)\"$")
    public void assert_url(String url){
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains(url));
    }
    @Given("user select second slider")
    public void second_slider_selection() throws InterruptedException {
        homePage.second_slider_selector().click();
        Thread.sleep(2000);
    }


}

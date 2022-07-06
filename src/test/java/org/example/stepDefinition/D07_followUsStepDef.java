package org.example.stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

import java.util.ArrayList;

public class D07_followUsStepDef {
    P03_homePage homePage=new P03_homePage();

    @When("user opens facebook link")
    public void facebook_click() throws InterruptedException {
        homePage.facebook_page().click();
        Thread.sleep(2000);
    }
    @When("user opens twitter link")
    public void twitter_click() throws InterruptedException {
        homePage.twitter_page().click();
        Thread.sleep(2000);
    }
    @When("user opens rss link")
    public void rss_click() throws InterruptedException {
        homePage.rss_page().click();
        Thread.sleep(2000);
    }
    @When("user opens youtube link")
    public void youtube_click() throws InterruptedException {
        homePage.youtube_page().click();
        Thread.sleep(2000);
    }
    @Then("^\"(.*)\" is opened in new tab$")
    public void checkURL(String url){
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains(url));
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));
        System.out.println(Hooks.driver.getCurrentUrl());
        System.out.println(Hooks.driver.getTitle());
    }
    @Then("^\"(.*)\" is opened in the same tab$")
    public void checkRSS_URL(String url){

        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains(url));
        System.out.println(Hooks.driver.getCurrentUrl());
        System.out.println(Hooks.driver.getTitle());
    }
}

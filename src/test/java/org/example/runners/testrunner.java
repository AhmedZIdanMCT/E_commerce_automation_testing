package org.example.runners;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
                features = "src/main/resources/Features",
                glue = {"org.example.StepDefinition"},
                plugin = {"pretty",
                        "html:target/cucumber.html",
                        "json:target/cucumber.json",
                        "junit:target/cukes.xml",
                        "rerun:target/rerun.txt"},
                tags = "@smoke"
        )
public class testrunner {
}

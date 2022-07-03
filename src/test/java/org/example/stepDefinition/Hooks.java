package org.example.stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver = null;

    @Before
    public static void open_browser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

    }
    @After
    public static void quit_browser() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}

package com.testing.framework;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//mvn clean -Pintegration-tests verify -Dcucumber.options="--tags @run"

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
        features = "classpath:com/testing/framework/features",
        glue = "classpath:com.testing.framework",
        tags = "~@FAKE_TAG"
)
public class CucumberRunnerIT {

    public static WebDriver driver = new ChromeDriver();



}

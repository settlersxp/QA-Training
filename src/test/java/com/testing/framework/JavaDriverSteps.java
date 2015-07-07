package com.testing.framework;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;

import static com.testing.framework.CucumberRunnerIT.*;

public class JavaDriverSteps {
    @Given("^I start the browser with java$")
    public void I_start_the_browser_with_java() throws Throwable {
        driver.get("http://www.google.com");
    }

    @And("^I do some browser commands with java$")
    public void I_do_some_browser_commands_with_java() throws Throwable {
        driver.findElement(By.name("q")).sendKeys("search for this");
        Thread.sleep(3333);
        driver.findElement(By.name("q")).submit();
    }

    @Given("^I navigate to \"([^\"]*)\"$")
    public void I_navigate_to(String address) throws Throwable {
        driver.get(address);
    }
}

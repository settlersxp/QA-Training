package com.testing.framework;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;

public class DriverSteps {
    @And("^I use driver from Java$")
    public void I_use_driver_from_Java() throws Throwable {
        System.out.println("Print title from Java steps");
        String x =  CucumberRunnerIT.driver.getTitle();
        System.out.println(x);

    }
}

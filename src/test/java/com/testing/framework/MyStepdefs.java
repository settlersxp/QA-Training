package com.testing.framework;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;

import java.util.concurrent.TimeUnit;

import static com.testing.framework.CucumberRunnerIT.*;


public class MyStepdefs {


    @Before
    public void setUp() {
        System.out.println( "Running @Before annotation");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @And("^I test a Java steps$")
    public void I_test_a_Java_steps() throws Throwable {
        System.out.println("some msg from JAVA");
    }
}

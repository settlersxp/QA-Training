package com.testing.framework

import cucumber.api.DataTable
import cucumber.api.PendingException
import cucumber.api.groovy.EN

import static com.testing.framework.CucumberRunnerIT.*
import static cucumber.api.groovy.EN.*
import data.TestData

this.metaClass.mixin(EN)



Given(~'^I want to test following mappings with Groovy$'){ DataTable dataTable ->
    dataTable.asList(TestData.class).each { TestData testData ->
        println testData.data
        println testData.table
        println testData.cool

    }}

Then(~'^I print message from Groovy$') { ->
    println "Print message from GROOVY"
}



And(~'^I want to do browser command from Groovy$') { ->
    println "Printing title from groovy"
    println driver.getTitle()
    println "Printing title from groovy"
    driver.close()
    driver.quit()
}
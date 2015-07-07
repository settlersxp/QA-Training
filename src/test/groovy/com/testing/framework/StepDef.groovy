package com.testing.framework

import cucumber.api.PendingException


this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

Given(~'^I use driver from groovy$') { ->
    println "Print title from Groovy new steps"
    println CucumberRunnerIT.driver.getTitle()
}
@run
Feature: I want to see if java steps work


  Scenario: Java steps with Groovy
    Given I start the browser with java
    And I do some browser commands with java
    Then I print message from Groovy
    And I want to do browser command from Groovy
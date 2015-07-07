@running
Feature: Testing feature that uses both Groovy and Java

  Scenario : Testing Groovy + Java
    Given I want to test following mappings with Groovy
      | data | table | cool |
      | next | is    | now  |
      | next | is    | now  |
      | next | is    | now  |
      | next | is    | now  |
    And I test a Java steps



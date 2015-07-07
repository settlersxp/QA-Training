@Gmail
Feature: Login Gmail using Page Objects

  Scenario: Login Gmail
    Given I navigate to "mail.gmail.com"
    When I input my "username" and "password"
    Then I should be taken to the Inbox Page
    And I see the mail count
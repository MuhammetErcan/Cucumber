Feature: 2 feature

  Scenario: 1. Scenario
    Given user on home page
    When user clicks to login button
    Then My Account page should be visible



  Scenario: 2. Scenario
    Given the initial value is 5
    When user add 2 the value
    Then  the result should be 10
      
  Scenario: 3. Scenario
    Given the initial value is 10
    When user add 10 the value
    Then the result should be 20

  Scenario: 4.Scenario
    Given the String is "Java"
    And  the number is 1.8
    When the version is combined
    Then the version is "Java 1.8"
    And the number is a1,8
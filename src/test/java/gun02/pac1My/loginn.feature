Feature: Login functionally
  Scenario: Login
    Given open site
    When login account
    Then assert login

  Scenario:  change telefon number

    Given go to edit acconut
    When chane telephone number with "123456789"
    Then assert change

  Scenario: change newsletter
    Given go to newsletter
    When change button
    Then assert change


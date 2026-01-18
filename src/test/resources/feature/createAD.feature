Feature: Create new AD
  Scenario: Create new AD
    Given create random data
    Given create random AD data
    Given reg new user API
    Given open enterPage
    When Auth user
    When open page create new AD
    When create new AD
    Then search ad and close
Feature: Editing AD
  Scenario: Editing AD
    Given create random data
    Given create random AD data
    Given reg new user API
    Given open enterPage
    When Auth user
    When open page create new AD
    When create new AD
    When search ad and editing
    When del ad
    Then search del ad and close
Feature: Auth user
  Scenario: Auth user
    Given create random data
    Given reg new user API
    Given open enterPage
    When Auth user
    Then Reg OK and close
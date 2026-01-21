Feature: Registration user
  Scenario: Registration user
    Given open regPage
    When registr new user
    Then Reg OK and close
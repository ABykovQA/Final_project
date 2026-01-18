Feature: Double registration user
  Scenario: Double registration user
Given create random data
Given reg new user API
Given open regPage
When registr new user
Then fail reg user and close
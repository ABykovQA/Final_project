Feature: Editing AD
  Scenario: Editing AD
    Given reg new user API
    Given open enterPage
    When Auth user
    When open page create new AD
    When create new AD
    When search ad and editing
    When open editing ad
    When editing AD
    Then checking saved changes
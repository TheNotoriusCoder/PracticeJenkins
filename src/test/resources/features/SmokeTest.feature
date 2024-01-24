Feature: this feature is for smoke test

  @smoke
  Scenario: Smoke test
    Given I print hello world
    Then everybody is happy

  @regression
  Scenario: this is for cucumber test
    Given Irun cucumber test
    Then verify this cucumber
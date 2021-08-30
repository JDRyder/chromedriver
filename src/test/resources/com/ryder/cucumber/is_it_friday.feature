Feature: Is it Friday yet?
  Everyone wants to know if its Friday

  Scenario: Sunday
    Given today is Sunday
    When I ask is it Friday yet
    Then I should be told "Nope"

  Scenario: Monday
    Given today is Monday
    When I ask is it Friday yet
    Then I should be told "Nope"

  Scenario: Friday
    Given today is Friday
    When I ask is it Friday yet
    Then I should be told "TGIF"

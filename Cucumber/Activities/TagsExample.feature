Feature: Basic Syntax

  Scenario: This is scenario 1
    Given user is on the Homepage
    When user clicks on About us
    Then User is redirected to About us page
    And close the browser

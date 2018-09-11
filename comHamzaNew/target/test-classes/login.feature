Feature: Login Functionality

  @live
  Scenario: Valid Login

    Given User is in Home Page
    When User select the Login link
    And User enter email and password
    And User click Login button
    Then User enter welcome screen
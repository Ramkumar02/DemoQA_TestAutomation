@SmokeFeature
Feature: Feature to test google search functionality for demoQA application

  @SmokeTest1
  Scenario: Validate demoQA application launches on google search
    Given Browser is open
    And User is on google search page
    When User enters demoQA url
    And Hits enter
    Then User is navigated to search results



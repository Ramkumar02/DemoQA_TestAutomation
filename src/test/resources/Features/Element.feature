@SmokeFeature1
Feature: Launch URL and verify URL

  @SmokeTest1
  Scenario: Launch url and validate the endpoint
    Given User launches demoQA URL
    When user enters valid url
    Then Validate the outcome



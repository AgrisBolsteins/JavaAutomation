Feature: Sign-up feature
  This feature is about creating new acc in the system

  Scenario: Successful sign-up
    Given I have opened homepage
    When I select my acc menu
      And I select sign-up button
      And I enter First name
      And I enter Last name
      And I enter mobile phone number
      And I enter email address
      And I enter password
      And I confirm password
      And I select validate SIGN-UP button
    Then user account page is opened
Feature: Login feature
  This feature is about logging in to the system

  Scenario: Successful login
    Given I have opened homepage
    When I select my acc menu
    And I select login button
    And I enter login email address
    And I enter login password
    And I check Remember me checkbox
    And I select validate LOGIN button
#    Then user account page is opened
    And I select ADD menu
    And I select select logOut button
    Then Navigation page is opened


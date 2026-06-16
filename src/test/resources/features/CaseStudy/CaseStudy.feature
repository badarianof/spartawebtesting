Feature: Search for Case Studies

  @HappyPath
  Scenario: Search returns matching case studies (Happy Path)
    Given I am on the Insights Page
    When I type "HSBC" in the search bar
    Then I see case studies
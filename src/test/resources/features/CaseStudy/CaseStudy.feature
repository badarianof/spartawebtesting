Feature: Search for Case Studies

  @HappyPath
  Scenario: Search returns matching case studies (Happy Path)
    Given I am on the Sparta Global homepage
    And I navigate to the Insights page
    And select subsection called insights
    When I type "HSBC" in the search bar
    Then I see case studies
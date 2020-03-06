Feature: Applying filter
  Scenario:
    Given I am in home page
    When Select the product name "nike"
    And I need to apply filter techniques "4or more"
    Then I should be able to see the products for "Backpacks"
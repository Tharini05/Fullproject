@trolley
  Feature: In trolley page
    Scenario:To check the products are in trolley page
      Given I am in home page
      When Select the product name "brita"
      And Select any product from list
      And Go to trolley
      Then Click Trolley Logo
      And check the sub total

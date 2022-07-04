@smoke
Feature: user should change the currency of prices
  Scenario: user should select euro instead of us dollars
    When user should select euro from drop down list
    Then currency of product's prices is changed to euro
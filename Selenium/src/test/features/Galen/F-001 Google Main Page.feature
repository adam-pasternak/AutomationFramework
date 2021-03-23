@Regression
Feature: F-001 Google Main Page

  Scenario: S-001 Verify layout on Google Main Page
    Given Browser: Open URL GOOGLE
    When Browser: wait for full page load
    Then Page layout matches requirements described in GoogleMainPage.gspec
@Debug
Feature: F-001 Login

  Scenario: S-001 Positive login
    Given Open URL: SAUCEDEMO
    When Login page: fill field USERNAME with keyword standard_user
    And  Login page: fill field PASSWORD with keyword secret_sauce
    And  Login page: click on field SUBMIT
    Then  Logged user panel: field CART is displayed
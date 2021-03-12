@Regression
Feature: F-001 Login

  Scenario: S-001 Positive login
    Given Open URL: SAUCEDEMO
    When Login page: fill field USERNAME with keyword standard_user
    And  Login page: fill field PASSWORD with keyword secret_sauce
    And  Login page: click on field SUBMIT
    Then Logged user panel: field CART is displayed

  Scenario: S-002 Failed login
    Given Open URL: SAUCEDEMO
    When Login page: fill field USERNAME with keyword standard_user
    And  Login page: fill field PASSWORD with keyword wrong_password
    And  Login page: click on field SUBMIT
    Then Login page: field ERROR_MESSAGE contains value Username and password do not match any user in this service
    And  Logged user panel: field CART is not displayed
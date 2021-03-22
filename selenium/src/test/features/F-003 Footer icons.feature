@Regression
Feature: F-003 Footer icons

  Scenario: S-001 User is redirected to proper page after clicking Twitter icon
    Given Browser: Open URL SAUCEDEMO
    When Login page: fill field USERNAME with keyword standard_user
    And  Login page: fill field PASSWORD with keyword secret_sauce
    And  Login page: click on field SUBMIT
    And  Footer: click on field TWITTER_ICON
    And  Browser: switch to tab with title Sauce Labs (@saucelabs) / Twitter
    And  Browser: wait for full page load
    Then Browser: Current page URL is https://twitter.com/saucelabs

  Scenario: S-002 User is redirected to proper page after clicking Facebook icon
    Given Browser: Open URL SAUCEDEMO
    When Login page: fill field USERNAME with keyword standard_user
    And  Login page: fill field PASSWORD with keyword secret_sauce
    And  Login page: click on field SUBMIT
    And  Footer: click on field FACEBOOK_ICON
    And  Browser: switch to tab with title Facebook
    And  Browser: wait for full page load
    Then Browser: Current page URL is https://www.facebook.com/saucelabs

  Scenario: S-003 User is redirected to proper page after clicking LinkedIn icon
    Given Browser: Open URL SAUCEDEMO
    When Login page: fill field USERNAME with keyword standard_user
    And  Login page: fill field PASSWORD with keyword secret_sauce
    And  Login page: click on field SUBMIT
    And  Footer: click on field LINKEDIN_ICON
    And  Browser: switch to tab with title Sauce Labs | LinkedIn
    And  Browser: wait for full page load
    Then Browser: Current page URL is https://www.linkedin.com/company/sauce-labs/
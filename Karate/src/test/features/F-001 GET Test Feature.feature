@Regression
Feature: GET Test Feature

  Background:
    * url 'https://reqres.in'

  Scenario: GET Test Scenario

    Given path '/api/users'
    When method GET
    Then status 200
    And match response.per_page == 6
    And match each response.data[*].id == '#number'
    And match each response.data[*].email == '#string'
    And match each response.data[*].first_name == '#string'
    And match each response.data[*].last_name == '#string'
    And match each response.data[*].avatar == '#string'
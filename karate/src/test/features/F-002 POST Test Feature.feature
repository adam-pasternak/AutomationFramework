@Regression
Feature: POST Test Feature

  Background:
    * url 'https://reqres.in'
    * def query =
    """
    {
      "name": "Adam",
      "job": "QA Automation Tester"
    }
    """

  Scenario: POST Test Scenario

    Given path '/api/users'
    And request { query: '#(query)' }
    When method POST
    Then status 201
    And match response.query.name == 'Adam'
    And match response.query.job == 'QA Automation Tester'
    And match response.id == '#present'
    And match response.createdAt == '#string'
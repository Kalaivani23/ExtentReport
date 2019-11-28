@tag
Feature: To check facebook application

  @tag1
  Scenario: To check login page
    Given to launch facebook application
    And verify url and title
    When enter username and password
    And click loginbutton
    Then close application

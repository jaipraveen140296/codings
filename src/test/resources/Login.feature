Feature: To validate login functionality with valid and invalid credentials

  Background: 
    Given hit the chrome browser

  Scenario: To pass the valid and invalid credentials
    When Access the url
    When pass the username and password to the username and password textbox and click login button
    When click the report tab and select pending pos
    When click the showfilter button and select all vendor select the vendor and click filter option
    Then scroll and take screenshot of po

  Scenario: To pass invalid credentials
    When go to URL
    When pass the invalid credentials and click login

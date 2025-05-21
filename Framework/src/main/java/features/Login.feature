Feature: Login Functionality


  Scenario: Verify login with valid credentials
Given User is on login page
When User enters valid username
And User enters valid password
And User clicks on login button
Then User should land on homepage

Scenario: Verify login with in-valid credentials
Given User is on login page
When User enters in-valid username
And User enters in-valid password
And User clicks on login button
Then User should see a error message
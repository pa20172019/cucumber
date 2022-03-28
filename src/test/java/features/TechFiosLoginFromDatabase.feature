@DBLoginFeature @Regression
 Feature: Techfios login page functionality validation
 
 Background:
   Given User in on the Techfios login page
 
 @DBScenario1 
 Scenario: Login with valid credentials
   When User enters "username" from techfios database
   When User enters "password" from techfios database
   And User clicks on signin button
   Then User should land on dashboard page
   
 
@LoginFeature @Regression
 Feature: Techfios login page functionality validation
 
 Background:
   Given User in on the Techfios login page
 
 @Scenario1 
 Scenario: Login with valid credentials
   When User enters password as "abc123"
   When User enters username as "demo@techfios.com"
   And User clicks on signin button
   Then User should land on dashboard page
   
 @Scenario2 
 Scenario: Login with incorrect username
   When User enters password as "abc123"
   When User enters username as "demo2@techfios.com"
   And User clicks on signin button
   Then User should not land on dashboard page
 
   
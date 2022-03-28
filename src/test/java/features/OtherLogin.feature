@OtherLoginFeature @Regression
 Feature: Other login page functionality validation
 
 Background:
   Given User in on the Techfios login page
 
 @OtherScenario1
 Scenario Outline: Login with incorrect username(other)
   When User enters username as "<username>"
   When User enters password as "<password>"
   And User clicks on signin button
   Then User should land on dashboard page
 Examples:
  |username|password|
  |demo2@techfios.com|abc123|
  |demo@techfios.com|abc124|
  |demo2@techfios.com|abc124|
   
 #@OtherScenario2 
 #Scenario: Login with incorrect username
   #When User enters password as "abc123"
   #When User enters username as "demo2@techfios.com"
   #And User clicks on signin button
   #Then User should not land on dashboard page
 #
   
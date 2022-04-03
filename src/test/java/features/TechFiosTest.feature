@Test_Feature 
 Feature: Techfios test page functionality validation
 
  
 @Scenario1 
 Scenario: SkyBlue Background change
   Given Set SkyBlue Background button exists
   When  User click on the button
   Then  The background color will change to skyblue
   
 @Scenario2 
 Scenario: White background change
   Given Set White Background button exists
   When User click on the Set White Background button
   Then The background color will change to white
 
   


Feature: Verify the login Feature
 I want to use this feature file to verify the login page.
 
  
  Scenario: Verify the login with valid username and password
    Given launch the browser with URL
    When  enter user name 
    Then enter the password
    Then check the remember me checkbox
    Then  click on Login
    Then  User is Logged in to the page
    
    



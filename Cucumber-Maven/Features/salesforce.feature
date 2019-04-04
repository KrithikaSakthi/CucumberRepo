

Feature: Verify the Saleforce Validation
  I want to use this feature file to validate the Saleforce Application

 
  Scenario: Successful Login with valid Credentials
    Given launch the browser with URL
    When enter user name 
    Then enter the password
    Then click on Login
    Then User is Logged in to the page
    
 	Scenario: User Menu
 	Given Hover over the user menu
 	When Select the user menu
 	
 	Scenario: Developer Console
 	Given Click On The Developer Console
 	When Developer console selected
 	Then Switching to Old Window
 	
 	Scenario: Create An Account
 	Given Click the Accounts tab
 	When Click the Create New tab
 	Then Select Account from dropdown
 	Then Enter the Account Name
 	Then Save the account name
 	
  
  Scenario: Successful Logout
  
    Given Click on the Logout
    When User Logged out from the Application
    


  

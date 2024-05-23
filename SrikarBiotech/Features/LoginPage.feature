@FeatureGroup_Requirement
Feature: feature to test Srikar Biotech login functionality

@LoginPage
Scenario: Validate login is successful with valid credentials
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
Then User navigated to the home page
 
  
 @LoginPage
 Scenario: Validate login is unsuccessful with invalid username credentials
 Given User navigates to Login page
 When User enters invalid username and valid password
 And User click on the signIn 
 Then Incorrect User Name validation message should be displayed
  
@LoginPage
 Scenario: Validate login is unsuccessful with invalid password credentials
 Given User navigates to Login page
 When User enters valid username and invalid password
 And User click on the signIn 
 Then Incorrect Password validation message should be displayed
  
@LoginPage
 Scenario: Validate Forgot password in login page
 Given User navigates to Login page
 When User clicks on Forgot password link
 Then User navigated to the Forgot Password page
 When User without enters Email Address or Username
 And User click on the Submit button
 Then validation message should be displayed or not
 When user enter the valid Email Address
 @LoginPage
 Scenario: Validate Invalid Email Address
 Given User navigates to Login page
 When User clicks on Forgot password link
 Then User navigated to the Forgot Password page
 When user enter the Invalid Email Address
 When User click on the back to Signin
 #When user enter the valid Username
@LoginPage
Scenario Outline: Validate login is successful with valid credentials
Given User navigates to Login page
Given the user has entered"<username>"
And the user has entered1"<password>"
And  User click on the signIn 
Then User navigated to the home page
 Examples:
    | username      | password | 
    | SuperAdmin    | Abcd@123 |
    | Raviteja      | Abcd@123 | 
    | Anji          | Abcd@123 | 
@LoginPage
Scenario Outline: Unsuccessful login with missing credentials
Given User navigates to Login page
Given the user has entered"<username>"
And the user has entered1"<password>"
And  User click on the signIn 
Then an error message should be displayed saying"<error_message>"

 Examples:
      | username   | password | error_message                                      |
      |            |          | Mandatory Fields Are Required With Valid Data.     |
      | SuperAdmin |          | Mandatory Fields Are Required With Valid Data.     |
      |            | Abcd@123 | Mandatory Fields Are Required With Valid Data.     | 
      
      
      
      
      
      
      
      
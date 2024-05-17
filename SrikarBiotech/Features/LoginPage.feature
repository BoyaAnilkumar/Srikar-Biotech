@FeatureGroup_Requirement
Feature: feature to test Srikar Biotech login functionality

@LoginPage
Scenario: Validate login is successful with valid credentials
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
Then User navigated to the home page

@LoginPage
 Scenario: Validate login functionality without user credentials
 Given User navigates to Login page
 When User without enters username and password
 And User click on the signIn 
 Then the Validation message should be displayed
  
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
  
  
  
  
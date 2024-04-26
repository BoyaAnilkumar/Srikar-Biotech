@FeatureGroup_Requirement
Feature: feature to Test User Screen functionality

@Users
Scenario: Validate login is successful with valid credentials
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
Then User navigated to the home page

@Users
Scenario: Validate user click on the Users screen in menu
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the Security Module
And  User Click on the Users screen

@Users
 Scenario: Validate Add user without enter the data
 Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the Security Module
And  User Click on the Users screen
And  User click on the Add button
And Click on the Save button 
Then Validation message should be displayed 
When User enter the Username
 
@Users
Scenario: Verify the Add user functionality
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the Security Module
And  User Click on the Users screen
And  User click on the Add button
When User enter the Username
Then User enter the Slp code
And User enter the First name
When User enter the Last name
Then User enter the data in Email field
And User enter the data in Mobile number field
When User enter the data in Alternate mobile number field
Then User enter the New Password
And User enter the Confirm Password
And User select the Role
And User Select the Reporting Manager
And User Select the Company
And User select the Warehouse
#And Click on the Save button
And Click on the Cancel button
@Users1
Scenario: Verifying the Cancel button functionality
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the Security Module
And  User Click on the Users screen
And  User click on the Add button
And Click on the Cancel button
Then The Users screen should be displayed
@Users
Scenario: Verification of the Added user is displayed in the grid 
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the Security Module
And  User Click on the Users screen
Then User Click on the Filter Icon
When User enter the data in filter field
And Click on the Apply button
And Click on the Clear button

@Users
Scenario: Verify the Update user functionality
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the Security Module
And  User Click on the Users screen
Then User Click on the Filter Icon
When User enter the data in filter field
And Click on the Apply button
And Verify whether the page is navigating to the Update User or not on clicking the Edit button
When Update the Username
Then Update the Slp Code
#And Click on the Submit button
#And The Update Successfull message is displayed or not
@Users
Scenario: Verify the Delete user functionality
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the Security Module
And  User Click on the Users screen
Then User Click on the Filter Icon
When User enter the data in filter field
And Click on the Apply button
#And Click on the Delete icon
#And Validation message is displayed or not


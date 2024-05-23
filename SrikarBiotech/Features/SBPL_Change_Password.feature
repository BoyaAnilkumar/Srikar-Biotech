@FeatureGroup_Requirement
Feature: feature to Test the Change Password functionality

@Change_Password
Scenario: Validate login is successful with valid credentials
Given User navigates to Login page
When User enter the username and password
And  User click on the signIn 
Then User navigated to the home page

@Change_Password123
Scenario: Successful password change
Given User navigates to Login page
When User enter the username and password
And  User click on the signIn 
Then User navigated to the home page
When User click on User Image Icon under User icon in webpage
And User chooses the option to change the password
When User navigates to the Confirm Password page
And User enters the current password
And User enters a new password
And User enters a Confirm Password
And User submits the form
Then User should receive a confirmation message that the password has been changed

@Change_Password 
Scenario: Password change with incorrect current password
Given User navigates to Login page
When User enter the username and password
And  User click on the signIn 
Then User navigated to the home page
When User click on User Image Icon under User icon in webpage
And User chooses the option to change the password
When User navigates to the Confirm Password page
And User enters an incorrect current password
And User enters a new password
And User enters a Confirm Password
And User submits the form
Then User should receive an error message indicating that the current password is incorrect

@Change_Password
Scenario: Password change with mismatched new and Confirm passwords
Given User navigates to Login page
When User enter the username and password
And  User click on the signIn 
Then User navigated to the home page
When User click on User Image Icon under User icon in webpage
And User chooses the option to change the password
When User navigates to the Confirm Password page
And User enters the current password
And User enters a new password
And User enters a different Confirm password for confirmation
And User submits the form
Then User should receive an error message indicating that the new passwords do not match

@Change_Password
Scenario: Validate Change Password functionality without entering any data
Given User navigates to Login page
When User enter the username and password
And  User click on the signIn 
Then User navigated to the home page
When User click on User Image Icon under User icon in webpage
And User chooses the option to change the password
When User navigates to the Confirm Password page
And User clicks on the Submit button without entering any data
Then User should receive an error message

@Change_Password
Scenario: Password Show and Hide Icon Functionality
Given User navigates to Login page
When User enter the username and password
And  User click on the signIn 
Then User navigated to the home page
When User click on User Image Icon under User icon in webpage
And User chooses the option to change the password
When User navigates to the Confirm Password page
When User enters a new password
And User click on the show password icon
Then User should see the password
And User click on the hide password icon
Then User should not be able to see the password

@Change_Password
Scenario: Close Icon functionality
Given User navigates to Login page
When User enter the username and password
And  User click on the signIn 
Then User navigated to the home page
When User click on User Image Icon under User icon in webpage
And User chooses the option to change the password
When User navigates to the Confirm Password page  
And User Click on the Close Icon in the Confirm Password Page
Then the Confirm Password Page should be closed



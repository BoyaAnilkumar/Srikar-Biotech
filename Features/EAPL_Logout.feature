@FeatureGroup_Requirement
Feature: feature to test logout functionality

@EAPL_Logout
 Scenario: Validate login is successful with valid credentials
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
Then User navigated to the home page
When User click on User Image Icon under User icon in webpage
And Click on Logout button


@FeatureGroup_Requirement
Feature: feature to Test Roles Screen functionality

@Roles
Scenario: Validate login is successful with valid credentials
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
Then User navigated to the home page

@Roles
Scenario: Validate user click on the Roles screen in menu
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the Security Module
And  User Click on the Roles screen

@Roles
Scenario: Validate Add user without enter the data
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the Security Module
And  User Click on the Roles screen
And  User click on the Add button
And  User Click on the Save button 
Then Validation message should be displayed 
@Roles
Scenario: Verify the Cancel button functionality
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the Security Module
And  User Click on the Roles screen
And  User click on the Add button
And  User Click on the Cancel button 
Then Verify whether the page is navigated to the Roles List or not

@Roles
Scenario: Validate Add user without Select the Permission 
Given User navigates to Login page
When User enters the username and password
And User click on the signIn 
And User click on the Security Module
And User Click on the Roles screen
And User click on the Add button
When User enter the data in Name field
And  User Click on the Save button 
Then Validation message should be displayed without select the permissions

@Roles
Scenario Outline: Verify the Add Role functionality
Given User navigates to Login page
When User enters the username and password
And User click on the signIn 
And User click on the Security Module
And User Click on the Roles screen
And User click on the Add button
When User enter the data in the Name field "<Name>"
Then User Select the Reporting manager
When User enter the Description
And User Select the Web Access type toggle
And User Select the Mobile Access type toggle
And the User Select the Users screen Select All check box
When The User Select the Users Section Role permissions
And the User Select the Roles screen Select All check box
Then the User Select the Roles screen permissions
And the User Select the Confirm Orders screen Select All check box
Then the User Select the Confirm Orders section role Permissions
And the User Select the View Collection screen Select All check box
Then the User Select the View Collection Section role Permissions
And the User Select the View return order screen Select All check box
Then the User Select the View Return Order Section Role Permissions
And the User Select the Item Master screen Select All check box
Then the User selects the Item Master section Role Permissions
And the User Select the Banners screen Select All check box
Then the User Select the banners section Role Permissions
#And  User Click on the Save button 
#Then The Added Super Amin Role should be displayed in the roles list
Examples:
			| Name          |
      | Super Admin   |
      | Super Manager |
      | Super Head    |
      | Sales Person  |

@Roles
Scenario: Verification of the Added Role is displayed in the grid 
Given User navigates to Login page
When User enters the username and password
And User click on the signIn 
And User click on the Security Module
And User Click on the Roles screen
Then User click on the Filter Icon
When User enter the data in the filter field
And User Click on the Apply button
And User Click on the Clear button

@Roles
Scenario: Verify the Delete Role functionality
Given User navigates to Login page
When User enters the username and password
And User click on the signIn 
And User click on the Security Module
And User Click on the Roles screen
Then User click on the Filter Icon
When User enter the data in the filter field
And User Click on the Apply button
#And Click on the Delete icon
#And Validation Message is displayed or not

@Roles
Scenario: Verify the Update Role functionality
Given User navigates to Login page
When User enters the username and password
And User click on the signIn 
And User click on the Security Module
And User Click on the Roles screen
Then User click on the Filter Icon
When User enter the data in the filter field
And User Click on the Apply button
And Verify whether the page is navigating to the Update Role or not on clicking the Edit button
When Update the Reporting manager
And User Click on the Update button

@Roles
Scenario: Verify the Search field functionality
Given User navigates to Login page
When User enters the username and password
And User click on the signIn 
And User click on the Security Module
And User Click on the Roles screen
Given User enter the data in the Search field
And The Search related Role data is displayed in the grid






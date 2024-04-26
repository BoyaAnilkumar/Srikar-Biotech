
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
#And  User Click on the Cancel button 
#Then Verify whether the page is navigated to the Roles List or not
@Roles
Scenario: Verify the Add Role functionality
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the Security Module
And  User Click on the Roles screen
And  User click on the Add button
When User enter the data in Name field
Then User Select the Reporting manager
When User enter the Description
And User Select the Web Access type toggle
And User Select the Mobile Access type toggle
#And User Select the Users screen Select All check box
Then User Select the View User Check box
And User Select the Add/Update User Check box
And User Select the Delete User Check box
#And User Select the Roles screen Select All check box
Then User Select the View Roles Check box
And User Select the Add/Update Roles Check box
And User Select the Delete Roles Check box
#And User Select the Confirm Orders screen Select All check box
Then User Select the View Orders
And  User Select the Create orders
And User Select the Cancel Orders
Then User Select the Sale Head Approval/Reject Order
And User Select the HO Accept/Reject Order
And User Select the Receive Order
And User Select the Change Warehouse
#And User Select the View Collection screen Select All check box
Then User Select the View Collection Check box
And User Select the Create Collection Check box
And User Select the Accept/Reject Collection Check box
#And User Select the View return order screen Select All check box
Then User Select the View Return Order
And User Select the Create Return Order
Then User Select the Accept/Reject Return Order
And User Select the Create Credit Note
And User Select the Delete Credit Note
Then User Select the Upload Return Attachments
And The User Select the Change Warehouse
#And User Select the Item Master screen Select All check box
Then User Select the View Item Master Check box
And User Select the Add/Update Item Master Check box
And User Select the Delete Item Master Check box
#And User Select the Banners screen Select All check box
Then User Select the View Banners Check box
And User Select the Add Banners Check box
And User Select the Delete Banners Check box
#And  User Click on the Save button 
@Roles
Scenario: Verification of the Added Role is displayed in the grid 
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the Security Module
And  User Click on the Roles screen
Then User click on the Filter Icon
When User enter the data in the filter field
And User Click on the Apply button
And User Click on the Clear button
@Roles
Scenario: Verify the Delete Role functionality
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the Security Module
And  User Click on the Roles screen
Then User click on the Filter Icon
When User enter the data in the filter field
And User Click on the Apply button
#And Click on the Delete icon
#And Validation Message is displayed or not
@Roles
Scenario: Verify the Update Role functionality
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the Security Module
And  User Click on the Roles screen
Then User click on the Filter Icon
When User enter the data in the filter field
And User Click on the Apply button
And Verify whether the page is navigating to the Update Role or not on clicking the Edit button
When Update the Reporting manager
#And User Click on the Update button



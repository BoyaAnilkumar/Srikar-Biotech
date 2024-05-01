@FeatureGroup_Requirement
Feature: feature to Test the Item Master Screen functionality

@EAPL_Item_Master
Scenario: Validate login is successful with valid credentials
Given User navigates to Login page
When User Select the Eldorado Agritech Company
When User enters the username and password
And  User click on the signIn 
Then User navigated to the home page

@EAPL_Item_Master
Scenario: Validate user click on the Item Master screen in menu
Given User navigates to Login page
When User Select the Eldorado Agritech Company
When User enters the username and password
And  User click on the signIn 
And  User click on the Item Master under the Masters Module
@EAPL_Item_Master
Scenario: Validate Add Items without enter the data
Given User navigates to Login page
When User Select the Eldorado Agritech Company
When User enters the username and password
And  User click on the signIn 
And  User click on the Item Master under the Masters Module
And  User click on the Add button
Then User Click on the Save Button
Then Validation message should be displayed 
@EAPL_Item_Master
Scenario: Verify the Add Items functionality
Given User navigates to Login page
When User Select the Eldorado Agritech Company
When User enters the username and password
And  User click on the signIn 
And  User click on the Item Master under the Masters Module
And  User click on the Add button
Then User Select the Company name
And User Select the Category
And User Select the Items
#And upload the file in Items attachment
#Then User Click on the Save Button

@EAPL_Item_Master
Scenario: Verification of the Added Items are displayed in the grid 
Given User navigates to Login page
When User Select the Eldorado Agritech Company
When User enters the username and password
And  User click on the signIn 
And  User click on the Item Master under the Masters Module
Then User Click on the Filter icon
When User enter the Data in the filter field
And User Click on the Apply button
And User Click on the Clear Button

@EAPL_Item_Master
Scenario: Verify the Delete Items functionality
Given User navigates to Login page
When User Select the Eldorado Agritech Company
When User enters the username and password
And  User click on the signIn 
And  User click on the Item Master under the Masters Module
Then User Click on the Filter icon
When User enter the Data in the filter field
And User Click on the Apply button
And Click on the Delete Icon
@EAPL_Item_Master
Scenario: Verify the Update Items functionality
Given User navigates to Login page
When User Select the Eldorado Agritech Company
When User enters the username and password
And  User click on the signIn 
And  User click on the Item Master under the Masters Module
Then User Click on the Filter icon
When User enter the Data in the filter field
And User Click on the Apply button
Then Click on the Edit Icon
When Update the category
And Update the Items
#And Click on the Update button
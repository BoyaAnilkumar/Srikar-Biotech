@FeatureGroup_Requirement
Feature: feature to Test the Item Master Screen functionality

@SBPL_Item_Master
Scenario: Validate login is successful with valid credentials
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
Then User navigated to the home page

@SBPL_Item_Master1
Scenario: Validate user click on the Roles screen in menu
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the Item Master under the Masters Module
@SBPL_Item_Master
Scenario: Validate Add Items without enter the data
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the Item Master under the Masters Module
And  User click on the Add button
Then User Click on the Save Button
Then Validation message should be displayed 
@SBPL_Item_Master1236
Scenario Outline: Verify the Add Items functionality
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the Item Master under the Masters Module
And  User click on the Add button
Then User Select the Company name"<Company>"
And User Select the Category"<Category>"
And User Select the Items
#And upload the file in Items attachment
Then User Click on the Save Button

Examples:
|Company             |       Category               |
|Srikar Biotech      |  Pesticides Products         |
|Eldorado Agritech   |                              |

@SBPL_Item_Master
Scenario: Verification of the Added Items are displayed in the grid 
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the Item Master under the Masters Module
Then User Click on the Filter icon
When User enter the Data in the filter field
And User Click on the Apply button
And User Click on the Clear Button

@SBPL_Item_Master
Scenario: Verify the Delete Items functionality
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the Item Master under the Masters Module
Then User Click on the Filter icon
When User enter the Data in the filter field
And User Click on the Apply button
And Click on the Delete Icon

@SBPL_Item_Master
Scenario: Verify the Update Items functionality
Given User navigates to Login page
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

@SBPL_Item_Master
Scenario: Verify the Pagination functionality
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the Item Master under the Masters Module
Then By default ten records are displayed
And check whether it is navigating to the after page records when the user clicks on Next page icon
And check whether it is navigating to the before page records when the user clicks on before page icon
And check whether it is displaying the last page records when the user clicks on last page icon
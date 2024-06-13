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
And User enter the First name
When User enter the Last name
Then User enter the data in Email field
And User enter the data in Mobile number field
When User enter the data in Alternate mobile number field
Then User enter the New Password
And User enter the Confirm Password
And User select the Role
And User Select the Reporting Manager
When the user selects the company
And User select the Warehouse
Then User enter the SBPL. Slp code
Then User enter the EAPL. Slp code
#And Click on the Save button

@Users
Scenario Outline: Verify the Add user functionality
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the Security Module
And  User Click on the Users screen
And  User click on the Add button
When the user enters "<Username>" as username, "<Firstname>" as first name, "<Lastname>" as last name, and "<Email>" as email
And the User enters "<Mobilenumber>", and "<NewPassword>", and "<ConfirmPassword>", and "<Role>"
When User enter the data in Alternate mobile number field
And User Select the Reporting Manager
Then User Select the Company"<searchTerm>"
And User select the"<searchWarehouse>"
Then User enters the "<SBPL_Slp_code>"
Then The User enters the "<EAPL_Slp_code>" 
#And Click on the Save button
And Click on the Cancel button
Examples:
|Username    | Firstname    | Lastname | Email             |Mobilenumber |NewPassword  |ConfirmPassword | Role          |SBPL_Slp_code|EAPL_Slp_code| searchTerm |Company       |searchWarehouse|
|Swathi      | Swathi       | T        | Swathi@gmail.com  |9898898998   |Abcd@123     |Abcd@123        |Sales Person   |1001         |1002         | Srikar     |Srikar Biotech |Andhra |
#|Tarun       | tarun        | S        | Tarun@gmail.com   |8978987898   |Abcd@123     |Abcd@123        |Sales Manager  |1003         |1004         |Eldorado    |  Eldorado Agritech|Andhra |



@Users
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

@Users11
Scenario Outline: Verify the Update user functionality
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the Security Module
And  User Click on the Users screen
Then User Click on the Filter Icon
When User enter the data in filter field
And Click on the Apply button
And Verify whether the page is navigating to the Update User or not on clicking the Edit button
When Update the"<Update_Username>"
Then Update the SBPL Slp Code
And Update the EAPL Slp Code
And Click on the Submit button
And The Update Successfull message is displayed or not

Examples:
|Update_Username|
|Neha           |

@Users_Delete
Scenario: Verify the Delete user functionality
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the Security Module
And  User Click on the Users screen
Then User Click on the Filter Icon
When User enter the data in filter field
And Click on the Apply button
And Click on the Delete icon
And Validation message is displayed or not

@Users
Scenario: Verify the Pagination functionality
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the Security Module
And  User Click on the Users screen
Then By default ten records are displayed
And check whether it is navigating to the after page records when the user clicks on Next page icon
And check whether it is navigating to the before page records when the user clicks on before page icon
And check whether it is displaying the last page records when the user clicks on last page icon

@Users
Scenario: Verify the Search field functionality
Given User navigates to Login page
When User enters the username and password
And User click on the signIn 
And User click on the Security Module
And  User Click on the Users screen
Given The User enter the data in the Search field
And The Search related Role data is displayed in the grid

@Users
Scenario: Verify the Expansion Icon functionality
Given User navigates to Login page
When User enters the username and password
And User click on the signIn 
And User click on the Security Module
And  User Click on the Users screen
Given The User enter the data in the Search field
Then the Search related data is displayed in the main grid
And User Click on the Expansion Icon
Then the Expansion grid header section names are displayed or not
And the Expansion grid data is displayed or not


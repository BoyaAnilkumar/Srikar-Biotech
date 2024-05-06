@FeatureGroup_Requirement
Feature: feature to Test the View Collection Screen functionality

@EAPL_View_Collection
Scenario: Validate login is successful with valid credentials
Given User navigates to Login page
When User Select the Eldorado Agritech Company
When User enters the username and password
And  User click on the signIn 
Then User navigated to the home page

@EAPL_View_Collection
Scenario: Validate user click on the View Collection screen in menu
Given User navigates to Login page
When User Select the Eldorado Agritech Company
When User enters the username and password
And  User click on the signIn 
And  User click on the View Collection under the Orders Module

@EAPL_View_Collection
Scenario: Verify the filter Functionality
Given User navigates to Login page
When User Select the Eldorado Agritech Company
When User enters the username and password
And  User click on the signIn 
And  User click on the View Collection under the Orders Module
And The View Collection Screen is displayed or not
Then Select the State 
And The User Select the Sales Person
When The User enter the partyname
And The user Select the From date and ToDate
And The user Click on the Search button
And The Search related data is displayed in the grid
@EAPL_View_Collection1
Scenario: Verify the Order Accepted functionality
Given User navigates to Login page
When User Select the Eldorado Agritech Company
When User enters the username and password
And  User click on the signIn 
And  User click on the View Collection under the Orders Module
And The View Collection Screen is displayed or not
Then Select the State 
And The User Select the Sales Person
#When The User enter the partyname
And The user Select the From date and ToDate
And The user Click on the Search button
#And Click on the Status Filter Icon
Then User Click on the Order Check box
And Click on the Received button
When The user enter the data in Reason field
And User Click on the save button
And Verify the Collection Accepted Validation msg is displayed or not
And Verify the Status is updated or not

@EAPL_View_Collection12
Scenario: Verify the Order Rejected functionality
Given User navigates to Login page
When User Select the Eldorado Agritech Company
When User enters the username and password
And  User click on the signIn 
And  User click on the View Collection under the Orders Module
And The View Collection Screen is displayed or not
Then Select the State 
And The User Select the Sales Person
#When The User enter the partyname
And The user Select the From date and ToDate
And The user Click on the Search button
And Click on the Reject Icon
When The user enter the data in Remarks field
And User Click on the save button
And Verify the Collection Rejected Validation msg is displayed or not
And Verify the Rejected Status is updated or not

@EAPL_View_Collection
Scenario: verifying both the column filters functionality and sorting functionality of a table.
Given User navigates to Login page
When User Select the Eldorado Agritech Company
When User enters the username and password
And  User click on the signIn 
And  User click on the View Collection under the Orders Module
And The View Collection Screen is displayed or not
And The user Select the From date and ToDate
And The user Click on the Search button
And Verify Column names are displayed or not
And Verify the Collection details grid headers and Sorting

@EAPL_View_Collection
Scenario: Verify the User able to view the Collection attachment
Given User navigates to Login page
When User Select the Eldorado Agritech Company
When User enters the username and password
And  User click on the signIn 
And  User click on the View Collection under the Orders Module
And The View Collection Screen is displayed or not
Then Select the State 
And The User Select the Sales Person
When The User enter the partyname
And The user Select the From date and ToDate
And The user Click on the Search button
And Click on the collection View Icon in the Action Column

@EAPL_View_Collection
Scenario: Verify the Pagination functionality
Given User navigates to Login page
When User Select the Eldorado Agritech Company
When User enters the username and password
And  User click on the signIn 
And  User click on the View Collection under the Orders Module
And The View Collection Screen is displayed or not
And The user Select the From date and ToDate
And The user Click on the Search button
Then By default ten records are displayed
And check whether it is navigating to the after page records when the user clicks on Next page icon
And check whether it is navigating to the before page records when the user clicks on before page icon
And check whether it is displaying the last page records when the user clicks on last page icon
And check whether it is displaying the first page records when the user clicks on first page icon
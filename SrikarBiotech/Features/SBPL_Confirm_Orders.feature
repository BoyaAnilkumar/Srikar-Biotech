@FeatureGroup_Requirement
Feature: feature to Test the Confirm Orders Screen functionality

@SBPL_Confirm_Orders
Scenario: Validate login is successful with valid credentials
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
Then User navigated to the home page

@SBPL_Confirm_Orders
Scenario: Validate user click on the Confirm Orders screen in menu
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the Confirm Orders under the Orders Module

@SBPL_Confirm_Orders
Scenario: Verify the filter Functionality
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the Confirm Orders under the Orders Module
Then User Select the State 
And User Select the Sales Person
And Select the Warehouse
When User enter the partyname
And Select the Status
And Select the From date and ToDate
And Click on the Search button
And The Search related data is displayed in the main grid

@SBPL_Confirm_Orders
Scenario Outline: Verify the State related filter functionality
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the Confirm Orders under the Orders Module
And User Select the State"<States>"
And Click on the Search button
And The Search related data is displayed in the main grid

Examples:

|States          |
|Andhra Pradesh  |
|Bihar           |
|Chattisgarh     |      


@SBPL_Confirm_Orders
Scenario Outline: Verify the Sales person related filter functionality
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the Confirm Orders under the Orders Module
And User Select the Sales Person"<SalesPerson>"
And Click on the Search button
And The Search related data is displayed in the main grid

Examples:

|SalesPerson     |
|Super Admin     |
|Ravi A          |  

@SBPL_Confirm_Orders
Scenario Outline: Verify the Warehouse related filter functionality
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the Confirm Orders under the Orders Module
And User Select the Warehouse"<Warehouse>"
And Click on the Search button
And The Search related data is displayed in the main grid

Examples:

|Warehouse               |
|Andhra Pradesh (AP01)   |
|Bihar (BH01)            |  
|Gujarat (GJ01)          |

@SBPL_Confirm_Orders
Scenario Outline: Verify the Status related filter functionality
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the Confirm Orders under the Orders Module
And User Select the Status"<Status>"
And Click on the Search button
And The Search related data is displayed in the main grid

Examples:

|Status                 |
| Pending               |
| Shipped               |  
| Partially Shipped     |


@SBPL_Confirm_Orders
Scenario: Verify the change Warehouse functionality
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the Confirm Orders under the Orders Module
Then User Select the State 
And User Select the Sales Person
And Select the Warehouse
When User enter the partyname
And Select the Status
And Select the From date and ToDate
And Click on the Search button
And Click on the Warehouse Icon
Then User Select the Warehouse in the Change Warehouse page
And User click on the Save Button
Then User should receive a confirmation message that the Warehouse has been changed

@SBPL_Confirm_Orders
Scenario: Verify the Order Accepted functionality
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the Confirm Orders under the Orders Module
Then User Select the State 
And User Select the Sales Person
And The User Select the Warehouse
When User enter the partyname
And User Select the Status
And Select the From date and ToDate
And Click on the Search button
Then User Click on the Order Check box
And Click on the Accept button
When User enter the data in Remarks field
And Click on the save button

@SBPL_Confirm_Orders1
Scenario: Verify the Order Rejected functionality
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the Confirm Orders under the Orders Module
Then User Select the State 
And User Select the Sales Person
When User enter the partyname
And User Select the Status
And The User Select the From date and ToDate
And Click on the Search button
Then User Click on the Order Check box
And Click on the Reject button
When The User enter the data in Remarks field
And Click on the Reject details save button

@SBPL_Confirm_Orders
Scenario: Verify the Order History when the status is Accepted
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the Confirm Orders under the Orders Module
Then User Select the State 
And User Select the Sales Person
Then The User Select the Status
And User Select the From date and ToDate
And Click on the Search button
And Click on the Order history Icon
And Verify the Party details and Order details are displayed or not
And Verify the displayed Order ID is correct or not
And Verify the order details are displayed in the Order history page or not
And Verify the Party details are displayed in the Order history page or not
And User Click on the Back button 

@SBPL_Confirm_Orders
Scenario: Verify the Order History when the status is Rejected
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the Confirm Orders under the Orders Module
Then User Select the State 
And User Select the Sales Person
Then The User Select the Reject Status 
And User Select the From date and ToDate
And Click on the Search button
And Click on the Order history Icon
And Verify the Party details and Order details are displayed or not
And Verify the displayed Order ID is correct or not
And Verify the order details are displayed in the Order history page or not
And Verify the Party details are displayed in the Order history page or not
And The Status is displayed as Pending to Rejected or not
And User Click on the Back button 

@SBPL_Confirm_Orders
Scenario: Verification of the expansion grid functionality
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the Confirm Orders under the Orders Module
Then User Select the State 
And User Select the Sales Person
And The User Select the Warehouse
When User enter the partyname
Then The User Select the Status
And User Select the From date and ToDate
And Click on the Search button
And Click on the Order Expansion Icon
And Verify the expansion grid header section names are displayed or not
And Verify the Order Items are displayed in the expansion grid or not

@SBPL_Confirm_Orders
Scenario: Verify the Export button functionality
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the Confirm Orders under the Orders Module
And User Click on the Export button

@SBPL_Confirm_Orders4321
Scenario: Verify the Partially Shipped Status functionality
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the Confirm Orders under the Orders Module
Then The User Select the Partially Shipped Status
And User Select the From date and ToDate
And Click on the Search button
And User Click on the LR and Invoice Icon in the Actions column
And Verify the order details are displayed in the Invoice List page or not
And Verify the Party details are displayed in the Invoice List page or not

@SBPL_Confirm_Orders
Scenario: Verify without select the From Date and Todate Functionality
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the Confirm Orders under the Orders Module
And User without Select the From date and ToDate
And Click on the Search button

@SBPL_Confirm_Orders
Scenario: Verify the Pagination functionality
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the Confirm Orders under the Orders Module
And User Select the From date and ToDate
And Click on the Search button
Then By default ten records are displayed
And check whether it is navigating to the after page records when the user clicks on Next page icon
And check whether it is navigating to the before page records when the user clicks on before page icon
And check whether it is displaying the last page records when the user clicks on last page icon




@FeatureGroup_Requirement
Feature: feature to Test the View Return Order Screen functionality

@SBPL_View_Return_Order
Scenario: Validate login is successful with valid credentials
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
Then User navigated to the home page

@SBPL_View_Return_Order
Scenario: Validate user click on the View Return Order screen in menu
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the View Return Order under the Orders Module
And The View Return Order Screen is displayed or not

@SBPL_View_Return_Order
Scenario: Verify the filter Functionality
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the View Return Order under the Orders Module
And The View Return Order Screen is displayed or not
Then User Select the State 
And User Select the Sales Person
And Select the Warehouse
When User enter the partyname
And Select the Status
And User Select the From date and To Date
And Click on the Search button
And The Search related data is displayed in the main grid

@SBPL_View_Return_Order
Scenario: Verify the change Warehouse functionality
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the View Return Order under the Orders Module
And The View Return Order Screen is displayed or not
Then User Select the State 
And User Select the Sales Person
#And Select the Warehouse
When User enter the partyname
And Select the Status
And User Select the From date and To Date
And Click on the Search button
And Click on the Warehouse Icon
Then User Select the Warehouse in the Change Warehouse page
And User click on the Save Button

@SBPL_View_Return_Order
Scenario: Verification of the expansion grid data
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the View Return Order under the Orders Module
And The View Return Order Screen is displayed or not
Then User Select the State 
And User Select the Sales Person
#And Select the Warehouse
When User enter the partyname
And Select the Status
And User Select the From date and To Date
And Click on the Search button
And Click on the Order Expansion Icon
And Verify the Return Order expansion grid header section names are displayed or not
And Verify the Return Order Items are displayed in the expansion grid or not

@SBPL_View_Return_Order
Scenario: Verify the Item Partial received functionality
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the View Return Order under the Orders Module
And The View Return Order Screen is displayed or not
Then User Select the State 
And User Select the Sales Person
#And Select the Warehouse
#When User enter the partyname
And Select the Status
And User Select the From date and To Date
And Click on the Search button
And Click on the Order Expansion Icon
And User Select the Check Box
And User Click on the Partial Received Icon 
Then The Partial Received Popup page is displayed or not when click on the Partial Received Icon
And Click on the Save button in the Partial Received popup page
Then The Validation message is displayed or not
When The User enter the Partial Qty is More than the Original Qty the validation message is displayed
Given User Enter the data in the Partial Received Qty field
Given User enter the data in the Remarks field
#And Click on the Save button in the Partial Received popup page
#When The User enter the data in all field and Click on the Save button Partial received Successfull validation message is displayed
And Click on the Close button
#And Click on the Close Icon

@SBPL_View_Return_Order
Scenario: Verify the Item Reject functionality
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the View Return Order under the Orders Module
And The View Return Order Screen is displayed or not
Then User Select the State 
And User Select the Sales Person
#And Select the Warehouse
#When User enter the partyname
And Select the Status
And User Select the From date and To Date
And Click on the Search button
And Click on the Order Expansion Icon
And User Select the Check Box
And Click on the Item Reject Icon
And The Reject details Page is displayed or not
And Click on the Save button in the Reject details page
Then The Remarks field Validation message is displayed or not
Given User Enter the data in the Remarks field
And Click on the Save button in the Reject details page
Then The Reject Successfull validation message is displayed
#And Click on the Close button in the Reject details page
#And Click on the Close Icon in the Reject details page

@SBPL_View_Return_Order
Scenario: Verify the Item Received functionality
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the View Return Order under the Orders Module
And The View Return Order Screen is displayed or not
Then User Select the State 
And User Select the Sales Person
#And Select the Warehouse
#When User enter the partyname
And Select the Status
And User Select the From date and To Date
And Click on the Search button
And Click on the Order Expansion Icon
And User Select the Check Box
And Click on the Received icon
And The Received details Page is displayed or not
When User enter the data in the Remarks field in the Received details page
And Click on the Save button in the Received details page
When The User enter the data in all field and Click on the Save button Received Successfull validation message is displayed
#And Click on the Close button in the Received details page
#And User Click on the Close Icon in the Received details page

@SBPL_View_Return_Order
Scenario: Verify when the Order Status is Partially Received the add Credit notes functionality
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the View Return Order under the Orders Module
And The View Return Order Screen is displayed or not
Then User Select the State 
And User Select the Sales Person
#And Select the Warehouse
When User enter the partyname
And Select the Status as Partially Received
And User Select the From date and To Date
And Click on the Search button
And User Click on the Order Credit note in the Actions Column
Then The page is navigated to the Credit note page
And The Order details are displayed in the credit note page
Then The Party details are displayed in the credit note page
And The User Click on the Add button
And The User Click on the Save button
Then The User without enter the data in all fields and Click on the Save button the toaster message is displayed
Then The Add Credit note form is displayed when Click on the Add button
When User Select the Credit date
Given User Enter the data in the Remarks Field
#And User Select the credit note attachment
And The User Click on the Save button
When The User without select the credit attachment the validation message is displayed or not
And The User Click on the Save button
And User enter the data in all fields and Click on the save button the credit note saved successfull validation text is displayed 
#And User Click on the Close button
#And User Click on the Close Icon

@SBPL_View_Return_Order
Scenario: Verify the Pagination functionality
Given User navigates to Login page
When User enters the username and password
And  User click on the signIn 
And  User click on the View Return Order under the Orders Module
And The View Return Order Screen is displayed or not
And User Select the From date and To Date
And Click on the Search button
Then By default ten records are displayed
And check whether it is navigating to the after page records when the user clicks on Next page icon
And check whether it is navigating to the before page records when the user clicks on before page icon
And check whether it is displaying the last page records when the user clicks on last page icon


@FeatureGroup_Requirement
Feature: feature to Test the Banners Screen functionality

@EAPL_Banners
Scenario: Validate login is successful with valid credentials
Given User navigates to Login page
When User Select the Eldorado Agritech Company
When  User enters the username and password
And   User click on the signIn 
Then  User navigated to the home page
@EAPL_Banners1
Scenario: Validate user click on the View Return Order screen in menu
Given User navigates to Login page
When User Select the Eldorado Agritech Company
When  User enters the username and password
And   User click on the signIn 
And   User click on the Banners under the Masters Module
Then the Banners Screen should be displayed
@EAPL_Banners
Scenario: Verify the Add Banners functionality
Given User navigates to Login page
When User Select the Eldorado Agritech Company
When  User enters the username and password
And   User click on the signIn 
And   User click on the Banners under the Masters Module
Then the Banners Screen should be displayed
And User Click on the Add Banner button
Then the Add Banners Page Should be displayed
When the User enters data in the Banner name field
And User Select the Banner attachment
And User Click on the Save button in the Add banner page
Then User should receive a confirmation message that the Banner has been Created
@EAPL_Banners
Scenario: Validate Add Banner functionality without entering any data
Given User navigates to Login page
When User Select the Eldorado Agritech Company
When  User enters the username and password
And   User click on the signIn 
And   User click on the Banners under the Masters Module
Then the Banners Screen should be displayed
And User Click on the Add Banner button
Then the Add Banners Page Should be displayed
And User clicks on the Save button without entering any data
Then User Should Receive an error message
@EAPL_Banners
Scenario: Verifying the Delete button functionality
Given User navigates to Login page
When User Select the Eldorado Agritech Company
When  User enters the username and password
And   User click on the signIn 
And   User click on the Banners under the Masters Module
Then the Banners Screen should be displayed
When the User clicks on the Delete button
Then the User should receive a deleted message and the banner should be deleted
@EAPL_Banners
Scenario: Verifying the Cancel button functionality
Given User navigates to Login page
When User Select the Eldorado Agritech Company
When  User enters the username and password
And   User click on the signIn 
And   User click on the Banners under the Masters Module
Then the Banners Screen should be displayed
And User Click on the Add Banner button
Then the Add Banners Page Should be displayed
When the User clicks on the Cancel button
Then the Add Banners Page should be closed
@EAPL_Banners
Scenario: Validate Add Banner functionality when the user select the pdf file
Given User navigates to Login page
When User Select the Eldorado Agritech Company
When  User enters the username and password
And   User click on the signIn 
And   User click on the Banners under the Masters Module
Then the Banners Screen should be displayed
And User Click on the Add Banner button
Then the Add Banners Page Should be displayed
When the User enters data in the Banner name field
And User Select the Pdf file in the Banner attachment
Then The User Should Receive an error message
#And User Click on the Save button in the Add banner page
@EAPL_Banners
Scenario: Validate Add Banner functionality without Select the Attachment
Given User navigates to Login page
When User Select the Eldorado Agritech Company
When  User enters the username and password
And   User click on the signIn 
And   User click on the Banners under the Masters Module
Then the Banners Screen should be displayed
And User Click on the Add Banner button
Then the Add Banners Page Should be displayed
When the User enters data in the Banner name field
And User clicks on the Save button without select the attachment
Then The user Should Receive an error message










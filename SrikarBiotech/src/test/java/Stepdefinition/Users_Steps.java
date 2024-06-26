package Stepdefinition;

import Pages.Users_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Users_Steps {
	
 Users_Pages Users = new Users_Pages();
 
 
 @And  ("^User click on the Security Module$")
 public void User_click_on_the_Security_Module() throws Throwable {
	 Users.User_click_on_the_Security_Module();
}
 @And  ("^User Click on the Users screen$")
 public void User_Click_on_the_Users_screen() throws Throwable {
	 Users.User_Click_on_the_Users_screen();
}
 @And("^User click on the Add button$")
 public void User_click_on_the_Add_button()throws Throwable {
 Users.User_click_on_the_Add_button();
}
 @When ("^User enter the Username$")
 public void User_enter_the_Username()throws Throwable {
 Users.User_enter_the_Username();
 }
 @And ("^User enter the First name$")
 public void User_enter_the_First_name() throws Throwable {
	 Users.User_enter_the_First_name(); 
 }
 @When ("^User enter the Last name$")
 public void User_enter_the_Last_name() throws Throwable {
	 Users.User_enter_the_Last_name(); 
 }
 @Then ("^User enter the data in Email field$")
 public void User_enter_the_data_in_Email_field() throws Throwable {
	 Users.User_enter_the_data_in_Email_field(); 
 }
 @And ("^User enter the data in Mobile number field$")
 public void User_enter_the_data_in_Mobile_number_field() throws Throwable {
	 Users.User_enter_the_data_in_Mobile_number_field(); 
 }
 @When ("^User enter the data in Alternate mobile number field$")
 public void User_enter_the_data_in_Alternate_Mobile_number_field() throws Throwable {
	 Users.User_enter_the_data_in_Alternate_Mobile_number_field(); 
 }
 @Then ("^User enter the New Password$")
 public void User_enter_the_New_Password() throws Throwable {
	 Users.User_enter_the_New_Password(); 
 }
 @And ("^User enter the Confirm Password$")
 public void User_enter_the_Confirm_Password() throws Throwable {
	 Users.User_enter_the_Confirm_Password(); 
 }
 @And ("^User select the Role$")
 public void User_select_the_Role() throws Throwable {
	 Users.User_select_the_Role(); 
 }
 @And ("^User Select the Reporting Manager$")
 public void User_Select_the_Reporting_Manager() throws Throwable {
	 Users.User_Select_the_Reporting_Manager(); 
 }

 @And ("^User select the Warehouse$")
 public void User_Select_the_Warehouse() throws Throwable {
	 Users.User_Select_the_Warehouse(); 
 }
 @Then ("^User enter the SBPL. Slp code$")
 public void User_enter_the_SBPL_Slp_code()throws Throwable {
 Users.User_enter_the_SBPL_Slp_code();
}
 @And ("^User enter the EAPL. Slp code$")
 public void User_enter_the_EAPL_Slp_code()throws Throwable {
 Users.User_enter_the_EAPL_Slp_code();
}
 @And ("^Click on the Save button$")
 public void Click_on_the_Save_button() throws Throwable {
	 Users.Click_on_the_Save_button(); 
 }
 @And ("^Click on the Cancel button$")
 public void Click_on_the_Cancel_button() throws Throwable {
	 Users.Click_on_the_Cancel_button(); 
 }
 @Then ("^Validation message should be displayed$")
 public void Validation_message_should_be_displayed() throws Throwable {
	 Users.Validation_message_should_be_displayed(); 
 }
 @Then ("^User Click on the Filter Icon$")
 public void User_Click_on_the_Filter_Icon() throws Throwable {
	 Users.User_Click_on_the_Filter_Icon(); 
 }
 @When ("^User enter the data in filter field$")
 public void User_enter_the_data_in_filter_field() throws Throwable {
	 Users.User_enter_the_data_in_filter_field(); 
 }
 @And ("^Click on the Apply button$")
 public void Click_on_the_Apply_button() throws Throwable {
	 Users.Click_on_the_Apply_button(); 
 }
 @And ("^Click on the Clear button$")
 public void Click_on_the_Clear_button() throws Throwable {
	 Users.Click_on_the_Clear_button(); 
 }
 @And ("^Verify whether the page is navigating to the Update User or not on clicking the Edit button$")
 public void Verify_whether_the_page_is_navigating_to_the_Update_User_or_not_on_clicking_the_Edit_button() throws Throwable {
	 Users.Verify_whether_the_page_is_navigating_to_the_Update_User_or_not_on_clicking_the_Edit_button(); 
 }
 @When ("^Update the Username$")
 public void Update_the_Username() throws Throwable {
	 Users.Update_the_Username(); 
 }
 @When ("Update the{string}")
 public void Update_the(String Update_Username) throws Throwable{
 Users.Update_the(Update_Username);
}
 @Then ("^Update the SBPL Slp Code$")
 public void Update_the_SBPL_Slp_Code() throws Throwable {
	 Users.Update_the_SBPL_Slp_Code(); 
 }
 @And ("^Update the EAPL Slp Code$")
 public void Update_the_EAPL_Slp_Code() throws Throwable {
	 Users.Update_the_EAPL_Slp_Code();
 }
 
 @And ("^Click on the Submit button$")
 public void Click_on_the_Submit_button() throws Throwable {
	 Users.Click_on_the_Submit_button(); 
 }
 @And ("^The Update Successfull message is displayed or not$")
 public void The_Update_Successfull_message_is_displayed_or_not() throws Throwable {
	 Users.The_Update_Successfull_message_is_displayed_or_not(); 
 }
 @And ("^Click on the Delete icon$")
 public void Click_on_the_Delete_icon() throws Throwable {
	 Users.Click_on_the_Delete_icon(); 
 }
 @And ("^Validation message is displayed or not$")
 public void Validation_message_is_displayed_or_not() throws Throwable {
	 Users.Validation_message_is_displayed_or_not(); 
 }
 @Then ("^The Users screen should be displayed$")
 public void The_Users_screen_should_be_displayed() throws Throwable {
	 Users.The_Users_screen_should_be_displayed(); 
 }
 @When ("^the user selects the company$")
 public void the_user_selects_the_company() throws Throwable {
	 Users.the_user_selects_the_company();
 }
 @Given ("^The User enter the data in the Search field$")
 public void The_User_enter_the_data_in_the_Search_field() throws Throwable {
	 Users.The_User_enter_the_data_in_the_Search_field(); 
 }
 @When("the user enters {string} as username, {string} as first name, {string} as last name, and {string} as email")
 public void User_enter_the(String Username, String Firstname, String Lastname, String Email) throws Throwable {
 Users.enterUsername(Username);
 Users.enterLastName(Lastname);
 Users.enterEmail(Email);
}
 @And ("the User enters {string}, and {string}, and {string}, and {string}")
 public void the_User_enters (String Mobilenumber, String NewPassword, String ConfirmPassword, String Role) throws Throwable {
 Users.enterMobilenumber(Mobilenumber);
 Users.enterNewPassword(NewPassword);
 Users.enterConfirmPassword(ConfirmPassword);
 Users.SelectRole(Role); 
 }
 @Then ("User enters the {string}")
 public void User_enters_the(String SBPL_Slp_code) throws Throwable { 
 Users.enterSBPLSlpcode(SBPL_Slp_code);
 }
 @Then ("The User enters the {string}")
 public void The_User_enters_the(String EAPL_Slp_code) throws Throwable { 
 Users.enterEAPLSlpcode(EAPL_Slp_code);
}
 @Then ("User Select the Company{string}")
 public void User_Select_the_Company(String searchTerm) throws Throwable {
	 Users.User_Select_the_Company(searchTerm);
}
 @And ("User select the{string}")
 public void User_select_the(String searchWarehouse) throws Throwable { 
	 Users.User_select_the(searchWarehouse);
 }
 @And ("^User Click on the Expansion Icon$")
 public void User_Click_on_the_Expansion_Icon() throws Throwable {
	 Users.User_Click_on_the_Expansion_Icon();
 }
 
 @Then ("^the Expansion grid header section names are displayed or not$")
 public void the_Expansion_grid_header_section_names_are_displayed_or_not() throws Throwable{
	 Users.the_Expansion_grid_header_section_names_are_displayed_or_not();
 }
 @And ("^the Expansion grid data is displayed or not$")
 public void the_Expansion_grid_data_is_displayed_or_not() throws Throwable {
	 Users.the_Expansion_grid_data_is_displayed_or_not();
 }
 @Then ("^the Search related data is displayed in the main grid$")
 public void the_Search_related_data_is_displayed_in_the_main_grid() throws Throwable{
	 Users.the_Search_related_data_is_displayed_in_the_main_grid();
 }
}

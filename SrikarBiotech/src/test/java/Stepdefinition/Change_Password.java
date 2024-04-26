package Stepdefinition;

import Pages.Change_Password_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Change_Password {
	Change_Password_Pages  Change_Password_Pages  = new Change_Password_Pages();
	@When ("^User enter the username and password$")
	public void User_enter_the_username_and_password() throws Throwable{
		Change_Password_Pages.User_enter_the_username_and_password();
	}
	
	@When ("^User click on User Image Icon under User icon in webpage$")
	public void User_click_on_User_Image_Icon_under_User_icon_in_webpage() throws Throwable{
		Change_Password_Pages.User_click_on_User_Image_Icon_under_User_icon_in_webpage();
	}
	@And ("^User chooses the option to change the password$")
	public void User_chooses_the_option_to_change_the_password() throws Throwable{
		Change_Password_Pages.User_chooses_the_option_to_change_the_password();
	}
	@When ("^User navigates to the Confirm Password page$")
	public void User_navigates_to_the_Confirm_Password_page() throws Throwable{
		Change_Password_Pages.User_navigates_to_the_Confirm_Password_page();
	}
	@And ("^User enters the current password$")
	public void User_enters_the_current_password() throws Throwable{
		Change_Password_Pages.User_enters_the_current_password();
	}
	@And ("^User enters a new password$")
	public void User_enters_a_new_password() throws Throwable{
		Change_Password_Pages.User_enters_a_new_password();
	}

	@And ("^User submits the form$")
	public void User_submits_the_form() throws Throwable{
		Change_Password_Pages.User_submits_the_form();
	}
	@Then ("^User should receive a confirmation message that the password has been changed$")
	public void User_should_receive_a_confirmation_message_that_the_password_has_been_changed() throws Throwable{
		Change_Password_Pages.User_should_receive_a_confirmation_message_that_the_password_has_been_changed();
	}
	@And ("^User enters an incorrect current password$")
	public void User_enters_an_incorrect_current_password() throws Throwable{
		Change_Password_Pages.User_enters_an_incorrect_current_password();
	}
	@And ("^User enters a Confirm Password$")
	public void User_enters_a_Confirm_Password() throws Throwable{
		Change_Password_Pages.User_enters_a_Confirm_Password();
	}
	@Then ("^User should receive an error message indicating that the current password is incorrect$")
	public void User_should_receive_an_error_message_indicating_that_the_current_password_is_incorrect() throws Throwable{
		Change_Password_Pages.User_should_receive_an_error_message_indicating_that_the_current_password_is_incorrect();
	}
	@And ("^User enters a different Confirm password for confirmation$")
	public void User_enters_a_different_Confirm_password_for_confirmation() throws Throwable{
		Change_Password_Pages.User_enters_a_different_Confirm_password_for_confirmation();
	}
	@Then ("^User should receive an error message indicating that the new passwords do not match$")
	public void User_should_receive_an_error_message_indicating_that_the_new_passwords_do_not_match() throws Throwable{
		Change_Password_Pages.User_should_receive_an_error_message_indicating_that_the_new_passwords_do_not_match();
	}
	@And ("^User clicks on the Submit button without entering any data$")
	public void User_clicks_on_the_Submit_button_without_entering_any_data() throws Throwable{
		Change_Password_Pages.User_clicks_on_the_Submit_button_without_entering_any_data();
	}
	@Then ("^User should receive an error message$")
	public void User_should_receive_an_error_message() throws Throwable{
		Change_Password_Pages.User_should_receive_an_error_message();
	}
	@And ("^User click on the show password icon$")
	public void User_click_on_the_show_password_icon()throws Throwable{
		Change_Password_Pages.User_click_on_the_show_password_icon();
	}
	@Then ("^User should see the password$")
	public void User_should_see_the_password()throws Throwable{
		Change_Password_Pages.User_should_see_the_password();
	}
	@And ("^User click on the hide password icon$")
	public void User_click_on_the_hide_password_icon()throws Throwable{
		Change_Password_Pages.User_click_on_the_hide_password_icon();
	}
	@Then ("^User should not be able to see the password$")
	public void User_should_not_be_able_to_see_the_password()throws Throwable{
		Change_Password_Pages.User_should_not_be_able_to_see_the_password();
	}
	@And ("^User Click on the Close Icon in the Confirm Password Page$")
	public void User_Click_on_the_Close_Icon_in_the_Confirm_Password_Page()throws Throwable{
		Change_Password_Pages.User_Click_on_the_Close_Icon_in_the_Confirm_Password_Page();
	}
	@Then ("^the Confirm Password Page should be closed$")
	public void the_Confirm_Password_Page_should_be_closed()throws Throwable{
		Change_Password_Pages.the_Confirm_Password_Page_should_be_closed();
	}
}

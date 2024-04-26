package Stepdefinition;

import Pages.EAPL_Banners_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
        public class EAPL_Banners {
		EAPL_Banners_Page  Banners_Page = new EAPL_Banners_Page();
		
		@And ("^User click on the Banners under the Masters Module$")
		public void User_click_on_the_Banners_under_the_Masters_Module() throws Throwable{
			Banners_Page.User_click_on_the_Banners_under_the_Masters_Module();
		}
		
		@Then ("^the Banners Screen should be displayed$")
	    public void the_Banners_Screen_should_be_displayed() throws Throwable {
			Banners_Page.the_Banners_Screen_should_be_displayed();
		}
		@And ("^User Click on the Add Banner button$")
		public void User_Click_on_the_Add_Banner_button() throws Throwable {
			Banners_Page.User_Click_on_the_Add_Banner_button();
		}
		@Then ("^the Add Banners Page Should be displayed$")
		public void the_Add_Banners_Page_Should_be_displayed() throws Throwable {
			Banners_Page.the_Add_Banners_Page_Should_be_displayed();
		}
		@When ("^the User enters data in the Banner name field$")
		public void the_User_enters_data_in_the_Banner_name_field() throws Throwable {
			Banners_Page.the_User_enters_data_in_the_Banner_name_field();
		}
		@And ("^User Select the Banner attachment$")
		public void User_Select_the_Banner_attachment() throws Throwable {
			Banners_Page.User_Select_the_Banner_attachment();
		}
		@And ("^User Click on the Save button in the Add banner page$")
		public void User_Click_on_the_Save_button_in_the_Add_banner_page() throws Throwable {
			Banners_Page.User_Click_on_the_Save_button_in_the_Add_banner_page();
		}
		@Then ("^User should receive a confirmation message that the Banner has been Created$")
		public void User_should_receive_a_confirmation_message_that_the_Banner_has_been_Created() throws Throwable {
			Banners_Page.User_should_receive_a_confirmation_message_that_the_Banner_has_been_Created();
		}
		@And ("^User clicks on the Save button without entering any data$")
		public void User_clicks_on_the_Save_button_without_entering_any_data() throws Throwable{
			Banners_Page.User_clicks_on_the_Save_button_without_entering_any_data();
		}
		@Then ("^User Should Receive an error message$")
		public void User_Should_Receive_an_error_message() throws Throwable{
			Banners_Page.User_Should_Receive_an_error_message();
		}
		@When ("^the User clicks on the Delete button$")
		public void the_User_clicks_on_the_Delete_button() throws Throwable{
			Banners_Page.the_User_clicks_on_the_Delete_button();
		}
		@Then ("^the User should receive a deleted message and the banner should be deleted$")
		public void the_User_should_receive_a_deleted_message_and_the_banner_should_be_deleted() throws Throwable{
			Banners_Page.the_User_should_receive_a_deleted_message_and_the_banner_should_be_deleted();
		}
		@When ("^the User clicks on the Cancel button$")
		public void the_User_clicks_on_the_Cancel_button() throws Throwable{
			Banners_Page.the_User_clicks_on_the_Cancel_button();
		}
		@Then ("^the Add Banners Page should be closed$")
		public void the_Add_Banners_Page_should_be_closed() throws Throwable{
			Banners_Page.the_Add_Banners_Page_should_be_closed();
		}
		@And ("^User Select the Pdf file in the Banner attachment$")
		public void User_Select_the_Pdf_file_in_the_Banner_attachment() throws Throwable{
			Banners_Page.User_Select_the_Pdf_file_in_the_Banner_attachment();
		}
		@Then ("^The User Should Receive an error message$")
		public void The_User_Should_Receive_an_error_message() throws Throwable{
			Banners_Page.The_User_Should_Receive_an_error_message();
		}
		@And ("^User clicks on the Save button without select the attachment$")
		public void User_clicks_on_the_Save_button_without_select_the_attachment() throws Throwable{
			Banners_Page.User_clicks_on_the_Save_button_without_select_the_attachment();
		}
		@Then ("^The user Should Receive an error message$")
		public void The_user_Should_Receive_an_error_message() throws Throwable{
			Banners_Page.The_user_Should_Receive_an_error_message();
		}


}

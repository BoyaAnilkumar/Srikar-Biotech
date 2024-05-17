package Stepdefinition;

import Pages.SBPL_View_Return_Order_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SBPL_View_Return_Order {

	SBPL_View_Return_Order_Pages  View_Return_Order_Pages  = new SBPL_View_Return_Order_Pages();
	
	
	@And ("^User click on the View Return Order under the Orders Module$")
	public void User_click_on_the_View_Return_Order_under_the_Orders_Module() throws Throwable{
		View_Return_Order_Pages.User_click_on_the_View_Return_Order_under_the_Orders_Module();
	}
	@And ("^The View Return Order Screen is displayed or not$")
	public void The_View_Return_Order_Screen_is_displayed_or_not() throws Throwable{
		View_Return_Order_Pages.The_View_Return_Order_Screen_is_displayed_or_not();
	}
	@And ("^User Select the From date and To Date$")
	public void User_Select_the_From_date_and_To_Date() throws Throwable{
		View_Return_Order_Pages.User_Select_the_From_date_and_To_Date();
	}
	@And ("^The Search related data is displayed in the main grid$")
	public void The_Search_related_data_is_displayed_in_the_main_grid() throws Throwable{
		View_Return_Order_Pages.The_Search_related_data_is_displayed_in_the_main_grid();
	}
	@And ("^Verify the Return Order expansion grid header section names are displayed or not$")
	public void Verify_the_Return_Order_expansion_grid_header_section_names_are_displayed_or_not() throws Throwable{
		View_Return_Order_Pages.Verify_the_Return_Order_expansion_grid_header_section_names_are_displayed_or_not();
	}
	@And ("^Verify the Return Order Items are displayed in the expansion grid or not$")
	public void Verify_the_Return_Order_Items_are_displayed_in_the_expansion_grid_or_not() throws Throwable{
		View_Return_Order_Pages.Verify_the_Return_Order_Items_are_displayed_in_the_expansion_grid_or_not();
	}
	@And ("^User Select the Check Box$")
	public void User_Select_the_Check_Box() throws Throwable{
		View_Return_Order_Pages.User_Select_the_Check_Box();
	}
	@And ("^User Click on the Partial Received Icon$")
	public void User_Click_on_the_Partial_Received_Icon() throws Throwable{
		View_Return_Order_Pages.User_Click_on_the_Partial_Received_Icon();
	}
	@Then ("^The Partial Received Popup page is displayed or not when click on the Partial Received Icon$")
	public void The_Partial_Received_Popup_page_is_displayed_or_not_when_click_on_the_Partial_Received_Icon() throws Throwable{
		View_Return_Order_Pages.The_Partial_Received_Popup_page_is_displayed_or_not_when_click_on_the_Partial_Received_Icon();
	}
	@Given ("^User Enter the data in the Partial Received Qty field$")
	public void User_Enter_the_data_in_the_Partial_Received_Qty_field() throws Throwable{
		View_Return_Order_Pages.User_Enter_the_data_in_the_Partial_Received_Qty_field();
	}
	@Given ("^User enter the data in the Remarks field$")
	public void User_enter_the_data_in_the_Remarks_field() throws Throwable{
		View_Return_Order_Pages.User_enter_the_data_in_the_Remarks_field();
	}
	@And ("^Click on the Save button in the Partial Received popup page$")
	public void Click_on_the_Save_button_in_the_Partial_Received_popup_page() throws Throwable{
		View_Return_Order_Pages.Click_on_the_Save_button_in_the_Partial_Received_popup_page();
	}
	@Then ("^The Validation message is displayed or not$")
	public void The_Validation_message_is_displayed_or_not() throws Throwable{
		View_Return_Order_Pages.The_Validation_message_is_displayed_or_not();
	}
	@When ("^The User enter the data in all field and Click on the Save button Partial received Successfull validation message is displayed$")
	public void The_User_enter_the_data_in_all_field_and_Click_on_the_Save_button_Partial_received_Successfull_validation_message_is_displayed() throws Throwable{
		View_Return_Order_Pages.The_User_enter_the_data_in_all_field_and_Click_on_the_Save_button_Partial_received_Successfull_validation_message_is_displayed();
	}
	@And ("^Click on the Close button$")
	public void Click_on_the_Close_button() throws Throwable{
		View_Return_Order_Pages.Click_on_the_Close_button();
	}
	@And ("^Click on the Close Icon$")
	public void Click_on_the_Close_Icon() throws Throwable{
		View_Return_Order_Pages.Click_on_the_Close_Icon();
	}
	@And ("^Click on the Item Reject Icon$")
	public void Click_on_the_Item_Reject_Icon() throws Throwable{
		View_Return_Order_Pages.Click_on_the_Item_Reject_Icon();
	}
	@And ("^The Reject details Page is displayed or not$")
	public void The_Reject_details_Page_is_displayed_or_not() throws Throwable{
		View_Return_Order_Pages.The_Reject_details_Page_is_displayed_or_not();
	}
	@Given ("^User Enter the data in the Remarks field$")
	public void User_Enter_the_data_in_th_Remarks_field() throws Throwable{
		View_Return_Order_Pages.User_Enter_the_data_in_th_Remarks_field();
	}
	@And ("^Click on the Save button in the Reject details page$")
	public void Click_on_the_Save_button_in_the_Reject_details_page() throws Throwable{
		View_Return_Order_Pages.Click_on_the_Save_button_in_the_Reject_details_page();
	}
	@And ("^Click on the Close button in the Reject details page$")
	public void Click_on_the_Close_button_in_the_Reject_details_page() throws Throwable{
		View_Return_Order_Pages.Click_on_the_Close_button_in_the_Reject_details_page();
	}
	@And ("^Click on the Close Icon in the Reject details page$")
	public void Click_on_the_Close_Icon_in_the_Reject_details_page() throws Throwable{
		View_Return_Order_Pages.Click_on_the_Close_Icon_in_the_Reject_details_page();
	}
	@And ("^Click on the Received icon$")
	public void Click_on_the_Received_icon() throws Throwable{
		View_Return_Order_Pages.Click_on_the_Received_icon();
	}
	@And ("^The Received details Page is displayed or not$")
	public void The_Received_details_Page_is_displayed_or_not() throws Throwable{
		View_Return_Order_Pages.The_Received_details_Page_is_displayed_or_not();
	}
	@When ("^User enter the data in the Remarks field in the Received details page$")
	public void User_enter_the_data_in_the_Remarks_field_in_the_Received_details_page() throws Throwable{
		View_Return_Order_Pages.User_enter_the_data_in_the_Remarks_field_in_the_Received_details_page();
	}
	@And ("^Click on the Save button in the Received details page$")
	public void Click_on_the_Save_button_in_the_Received_details_page() throws Throwable{
		View_Return_Order_Pages.Click_on_the_Save_button_in_the_Received_details_page();
	}
	@And ("^Click on the Close button in the Received details page$")
	public void Click_on_the_Close_button_in_the_Received_details_page() throws Throwable{
		View_Return_Order_Pages.Click_on_the_Close_button_in_the_Received_details_page();
	}
	@And ("^User Click on the Close Icon in the Received details page$")
	public void User_Click_on_the_Close_Icon_in_the_Received_details_page() throws Throwable{
		View_Return_Order_Pages.User_Click_on_the_Close_Icon_in_the_Received_details_page();
	}
	@Then ("^The Reject Successfull validation message is displayed$")
	public void The_Successfull_validation_message_is_displayed() throws Throwable{
		View_Return_Order_Pages.The_Reject_Successfull_validation_message_is_displayed();
	}
	@When ("^The User enter the Partial Qty is More than the Original Qty the validation message is displayed$")
	public void The_User_enter_the_Partial_Qty_is_More_than_the_Original_Qty_the_validation_message_is_displayed() throws Throwable{
		View_Return_Order_Pages.The_User_enter_the_Partial_Qty_is_More_than_the_Original_Qty_the_validation_message_is_displayed();
	}
	@Then ("^The Remarks field Validation message is displayed or not$")
	public void The_Remarks_field_Validation_message_is_displayed_or_not() throws Throwable{
		View_Return_Order_Pages.The_Remarks_field_Validation_message_is_displayed_or_not();
	}
	@When ("^The User enter the data in all field and Click on the Save button Received Successfull validation message is displayed$")
	public void The_User_enter_the_data_in_all_field_and_Click_on_the_Save_button_Received_Successfull_validation_message_is_displayed() throws Throwable{
		View_Return_Order_Pages.The_User_enter_the_data_in_all_field_and_Click_on_the_Save_button_Received_Successfull_validation_message_is_displayed();
	}
	@And ("^Select the Status as Partially Received$")
	public void Select_the_Status_as_Partially_Received() throws Throwable{
		View_Return_Order_Pages.Select_the_Status_as_Partially_Received();
	}
	@And ("^User Click on the Order Credit note in the Actions Column$")
	public void User_Click_on_the_Order_Credit_note_in_the_Actions_Column() throws Throwable{
		View_Return_Order_Pages.User_Click_on_the_Order_Credit_note_in_the_Actions_Column();
	}
	@Then ("^The page is navigated to the Credit note page$")
	public void The_page_is_navigated_to_the_Credit_note_page() throws Throwable{
		View_Return_Order_Pages.The_page_is_navigated_to_the_Credit_note_page();
	}	
	@And ("^The Order details are displayed in the credit note page$")
	public void The_Order_details_are_displayed_in_the_credit_note_page() throws Throwable{
		View_Return_Order_Pages.The_Order_details_are_displayed_in_the_credit_note_page();
	}
	@Then ("^The Party details are displayed in the credit note page$")
	public void The_Party_details_are_displayed_in_the_credit_note_page() throws Throwable{
		View_Return_Order_Pages.The_Party_details_are_displayed_in_the_credit_note_page();
	}
	@And ("^The User Click on the Add button$")
	public void The_User_Click_on_the_Add_button() throws Throwable{
		View_Return_Order_Pages.The_User_Click_on_the_Add_button();
	}
	@Then ("^The Add Credit note form is displayed when Click on the Add button$")
	public void The_Add_Credit_note_form_is_displayed_when_Click_on_the_Add_button() throws Throwable{
		View_Return_Order_Pages.The_Add_Credit_note_form_is_displayed_when_Click_on_the_Add_button();
	}
	@When ("^User Select the Credit date$")
	public void User_Select_the_Credit_date() throws Throwable{
		View_Return_Order_Pages.User_Select_the_Credit_date();
	}
	@Given ("^User Enter the data in the Remarks Field$")
	public void User_Enter_the_data_in_the_Remarks_Field() throws Throwable{
		View_Return_Order_Pages.User_Enter_the_data_in_the_Remarks_Field();
	}
	@And ("^User Select the credit note attachment$")
	public void User_Select_the_credit_note_attachment() throws Throwable{
		View_Return_Order_Pages.User_Select_the_credit_note_attachment();
	}
	@And ("^The User Click on the Save button$")
	public void The_User_Click_on_the_Save_button() throws Throwable{
		View_Return_Order_Pages.The_User_Click_on_the_Save_button();
	}
	@When ("^The User without select the credit attachment the validation message is displayed or not$")
	public void The_User_without_select_the_credit_attachment_the_validation_message_is_displayed_or_not() throws Throwable{
		View_Return_Order_Pages.The_User_without_select_the_credit_attachment_the_validation_message_is_displayed_or_not();
	}
	@And ("^User enter the data in all fields and Click on the save button the credit note saved successfull validation text is displayed$")
	public void User_enter_the_data_in_all_fields_and_Click_on_the_save_button_the_credi_note_saved_successfull_validation_text_is_displayed() throws Throwable{
		View_Return_Order_Pages.User_enter_the_data_in_all_fields_and_Click_on_the_save_button_the_credit_note_saved_successfull_validation_text_is_displayed();
	}
	@Then ("^The User without enter the data in all fields and Click on the Save button the toaster message is displayed$")
	public void The_User_without_enter_the_data_in_all_fields_and_Click_on_the_Save_button_the_toaster_message_is_displayed() throws Throwable{
		View_Return_Order_Pages.The_User_without_enter_the_data_in_all_fields_and_Click_on_the_Save_button_the_toaster_message_is_displayed();
	}
	@And ("^User Click on the Close button$")
	public void User_Click_on_the_Close_button() throws Throwable{
		View_Return_Order_Pages.User_Click_on_the_Close_button();
	}
	@And ("^User Click on the Close Icon$")
	public void User_Click_on_the_Close_Icon() throws Throwable{
		View_Return_Order_Pages.User_Click_on_the_Close_Icon();
	}
	@And ("^The User click on the Save Button$")
	public void The_User_click_on_the_Save_Button() throws Throwable{
		View_Return_Order_Pages.The_User_click_on_the_Save_Button();
	}
}

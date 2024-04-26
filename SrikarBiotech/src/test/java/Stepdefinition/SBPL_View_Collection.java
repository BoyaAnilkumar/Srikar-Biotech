package Stepdefinition;


import Pages.SBPL_View_Collection_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SBPL_View_Collection {

	SBPL_View_Collection_Pages  View_Collection_Pages  = new SBPL_View_Collection_Pages();

	
	@And  ("^User click on the View Collection under the Orders Module$")
	public void User_click_on_the_View_Collection_under_the_Orders_Module() throws Throwable{
		View_Collection_Pages.User_click_on_the_View_Collection_under_the_Orders_Module();
	}
	@And ("^The View Collection Screen is displayed or not$")
	public void The_View_Collection_Screen_is_displayed_or_not() throws Throwable{
		View_Collection_Pages.The_View_Collection_Screen_is_displayed_or_not();
	}
	@Then ("^Select the State$")
	public void Select_the_State() throws Throwable{
		View_Collection_Pages.Select_the_State();
	}
	@And ("^The User Select the Sales Person$")
	public void The_User_Select_the_Sales_Person() throws Throwable{
		View_Collection_Pages.The_User_Select_the_Sales_Person();
	}
	@When ("^The User enter the partyname$")
	public void The_User_enter_the_partyname() throws Throwable{
		View_Collection_Pages.The_User_enter_the_partyname();
	}
	@And ("^The user Select the From date and ToDate$")
	public void The_user_Select_the_From_date_and_ToDate() throws Throwable{
		View_Collection_Pages.The_user_Select_the_From_date_and_ToDate();
	}
	@And ("^The user Click on the Search button$")
	public void The_user_Click_on_the_Search_button() throws Throwable{
		View_Collection_Pages.The_user_Click_on_the_Search_button();
	}
	@And ("^Click on the Received button$")
	public void Click_on_the_Received_button() throws Throwable{
		View_Collection_Pages.Click_on_the_Received_button();
	}
	@When ("^The user enter the data in Reason field$")
	public void The_user_enter_the_data_in_Reason_field() throws Throwable{
		View_Collection_Pages.The_user_enter_the_data_in_Reason_field();
	}
	@And ("^User Click on the save button$")
	public void User_Click_on_the_save_button() throws Throwable{
		View_Collection_Pages.User_Click_on_the_save_button();
	}
	@And ("^Click on the Reject Icon$")
	public void Click_on_the_Reject_Icon() throws Throwable{
		View_Collection_Pages.Click_on_the_Reject_Icon();
	}
	@When ("^The user enter the data in Remarks field$")
	public void The_user_enter_the_data_in_Remarks_field() throws Throwable{
		View_Collection_Pages.The_user_enter_the_data_in_Remarks_field();
	}
	
	@And ("^Verify the Collection Accepted Validation msg is displayed or not$")
	public void Verify_the_Collection_Accepted_Validation_msg_is_displayed_or_not() throws Throwable{
		View_Collection_Pages.Verify_the_Collection_Accepted_Validation_msg_is_displayed_or_not();
	}
	@And ("^Verify the Status is updated or not$")
	public void Verify_the_Status_is_updated_or_not() throws Throwable{
		View_Collection_Pages.Verify_the_Status_is_updated_or_not();
	}
	@And ("^Verify the Collection Rejected Validation msg is displayed or not$")
	public void Verify_the_Collection_Rejected_Validation_msg_is_displayed_or_not() throws Throwable{
		View_Collection_Pages.Verify_the_Collection_Rejected_Validation_msg_is_displayed_or_not();
	}
	@And ("^Verify the Rejected Status is updated or not$")
	public void Verify_the_Rejected_Status_is_updated_or_not() throws Throwable{
		View_Collection_Pages.Verify_the_Rejected_Status_is_updated_or_not();
	}
	@And ("^Verify the Collection details grid headers and Sorting$")
	public void Verify_the_Collection_details_grid_headers_and_Sorting() throws Throwable{
		View_Collection_Pages.Verify_the_Collection_details_grid_headers_and_Sorting();
	}
	@And ("^Click on the Status Filter Icon$")
	public void Click_on_the_Status_Filter_Icon() throws Throwable{
		View_Collection_Pages.Click_on_the_Status_Filter_Icon();
	}
	@And ("^Click on the collection View Icon in the Action Column$")
	public void Click_on_the_collection_View_Icon_in_the_Action_Column() throws Throwable{
		View_Collection_Pages.Click_on_the_collection_View_Icon_in_the_Action_Column();
	}
	@And ("^Verify Column names are displayed or not$")
	public void Verify_Column_names_are_displayed_or_not() throws Throwable{
		View_Collection_Pages.Verify_Column_names_are_displayed_or_not();
	}
	@Then ("^By default ten records are displayed$")
	public void By_default_ten_records_are_displayed() throws Throwable{
	View_Collection_Pages.By_default_ten_records_are_displayed();
	}
	@And ("^check whether it is navigating to the after page records when the user clicks on Next page icon$")
	public void check_whether_it_is_navigating_to_the_after_page_records_when_the_user_clicks_on_Next_page_icon() throws Throwable{
	View_Collection_Pages.check_whether_it_is_navigating_to_the_after_page_records_when_the_user_clicks_on_Next_page_icon();
	}
	@And ("^check whether it is navigating to the before page records when the user clicks on before page icon$")
	public void check_whether_it_is_navigating_to_the_before_page_records_when_the_user_clicks_on_before_page_icon() throws Throwable{
	View_Collection_Pages.check_whether_it_is_navigating_to_the_before_page_records_when_the_user_clicks_on_before_page_icon();
	}

	@And ("^check whether it is displaying the last page records when the user clicks on last page icon$")
	public void check_whether_it_is_displaying_the_last_page_records_when_the_user_clicks_on_last_page_icon() throws Throwable{
	View_Collection_Pages.check_whether_it_is_displaying_the_last_page_records_when_the_user_clicks_on_last_page_icon();
	}
	@And ("^The Search related data is displayed in the grid$")
	public void The_Search_related_data_is_displayed_in_the_grid() throws Throwable{
		View_Collection_Pages.The_Search_related_data_is_displayed_in_the_grid();
	}
	@And ("^check whether it is displaying the first page records when the user clicks on first page icon$")
	public void check_whether_it_is_displaying_the_first_page_records_when_the_user_clicks_on_first_page_icon() throws Throwable{
	View_Collection_Pages.check_whether_it_is_displaying_the_first_page_records_when_the_user_clicks_on_first_page_icon();
	}
	
}

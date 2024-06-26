package Stepdefinition;

import Pages.SBPL_Confirm_Orders_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SBPL_Confirm_Orders_Steps {
  SBPL_Confirm_Orders_Pages  Confirm_Orders_Pages  = new SBPL_Confirm_Orders_Pages();
  
  
  @And  ("^User click on the Confirm Orders under the Orders Module$")
  public void User_click_on_the_Confirm_Orders_under_the_Orders_Module() throws Throwable{
	  Confirm_Orders_Pages.User_click_on_the_Confirm_Orders_under_the_Orders_Module();
  }
  @Then ("^User Select the State$") 
  public void User_Select_the_State() throws Throwable{
	  Confirm_Orders_Pages.User_Select_the_State();
  }
  @And ("^User Select the Sales Person$")
  public void User_Select_the_Sales_Person() throws Throwable{
	  Confirm_Orders_Pages.User_Select_the_Sales_Person();
  }
  @And ("^Select the Warehouse$")
  public void Select_the_Warehouse() throws Throwable{
	  Confirm_Orders_Pages.Select_the_Warehouse();
  }
  @When ("^User enter the partyname$")
  public void User_enter_the_partyname() throws Throwable{
	  Confirm_Orders_Pages.User_enter_the_partyname();
  }
  @And ("^Select the Status$")
  public void Select_the_Status() throws Throwable{
	  Confirm_Orders_Pages.Select_the_Status();
  }
  @And ("^Select the From date and ToDate$")
  public void Select_the_From_date_and_ToDate() throws Throwable{
	  Confirm_Orders_Pages.Select_the_From_date_and_ToDate();
  }
  @And ("^Click on the Search button$")
  public void Click_on_the_Search_button() throws Throwable{
	  Confirm_Orders_Pages.Click_on_the_Search_button();
  }
  @And ("^Click on the Warehouse Icon$")
  public void Click_on_the_Warehouse_Icon() throws Throwable{
	  Confirm_Orders_Pages.Click_on_the_Warehouse_Icon();
  }
  @Then ("^User Select the Warehouse in the Change Warehouse page$")
  public void User_Select_the_Warehouse_in_the_Change_Warehouse_page() throws Throwable{
	  Confirm_Orders_Pages.User_Select_the_Warehouse_in_the_Change_Warehouse_page();
  }
  @And ("^User click on the Save Button$")
  public void User_click_on_the_Save_Button() throws Throwable{
	  Confirm_Orders_Pages.User_click_on_the_Save_Button();
  }
  @And ("^User Select the Status$")
  public void User_Select_the_Status() throws Throwable{
	  Confirm_Orders_Pages.User_Select_the_Status();
  }
  @Then ("^User Click on the Order Check box$")
  public void User_Click_on_the_Order_Check_box() throws Throwable{
	  Confirm_Orders_Pages.User_Click_on_the_Order_Check_box();
  }
  @And ("^Click on the Accept button$")
  public void Click_on_the_Accept_button() throws Throwable{
	  Confirm_Orders_Pages.Click_on_the_Accept_button();
  }
  @When ("^User enter the data in Remarks field$")
  public void User_enter_the_data_in_Remarks_field() throws Throwable{
	  Confirm_Orders_Pages.User_enter_the_data_in_Remarks_field();
  }
  @And ("^Click on the save button$")
  public void Click_on_the_save_button() throws Throwable{
	  Confirm_Orders_Pages.Click_on_the_save_button();
  }
  @And ("^Click on the Reject details save button$")
  public void Click_on_the_Reject_details_save_button() throws Throwable{
	  Confirm_Orders_Pages.Click_on_the_Reject_details_save_button();
  }
  @Then ("^The User Select the Status$")
  public void The_User_Select_the_Status() throws Throwable{
	  Confirm_Orders_Pages.The_User_Select_the_Status();
  }
  @And ("^The Status is displayed as Pending to Rejected or not$")
  public void The_Status_is_displayed_as_Pending_to_Rejected_or_not() throws Throwable{
	  Confirm_Orders_Pages.The_Status_is_displayed_as_Pending_to_Rejected_or_not();
  }
  @Then ("^The User Select the Reject Status$") 
  public void The_User_Select_the_Reject_Status() throws Throwable{
	  Confirm_Orders_Pages.The_User_Select_the_Reject_Status();
  }
  @And ("^Click on the Order history Icon$")
  public void Click_on_the_Order_history_Icon() throws Throwable{
	  Confirm_Orders_Pages.Click_on_the_Order_history_Icon();
  }
  @And ("^The User Select the Warehouse$")
  public void The_User_Select_the_Warehouse() throws Throwable{
	  Confirm_Orders_Pages.The_User_Select_the_Warehouse();
  }
  @And ("^User Select the From date and ToDate$")
  public void User_Select_the_From_date_and_ToDate() throws Throwable{
	  Confirm_Orders_Pages.User_Select_the_From_date_and_ToDate();
  }
  @And ("^Verify the Party details and Order details are displayed or not$")
  public void Verify_the_Party_details_and_Order_details_are_displayed_or_not() throws Throwable{
	  Confirm_Orders_Pages.Verify_the_Party_details_and_Order_details_are_displayed_or_not();
  }
  @And ("^Verify the displayed Order ID is correct or not$")
  public void Verify_the_displayed_Order_ID_is_correct_or_not() throws Throwable{
	  Confirm_Orders_Pages.Verify_the_displayed_Order_ID_is_correct_or_not();
  }
  @And ("^The User Select the From date and ToDate$")
  public void The_User_Select_the_From_date_and_ToDate() throws Throwable {
	  Confirm_Orders_Pages.The_User_Select_the_From_date_and_ToDate();
  }
  @When ("^The User enter the data in Remarks field$")
  public void The_User_enter_the_data_in_Remarks_field() throws Throwable{
	  Confirm_Orders_Pages.The_User_enter_the_data_in_Remarks_field();
  }
  @And ("^Click on the Reject button$")
  public void Click_on_the_Reject_button() throws Throwable {
	  Confirm_Orders_Pages.Click_on_the_Reject_button();
  }
  @And ("^Verify the order details are displayed in the Order history page or not$")
  public void Verify_the_order_details_are_displayed_in_the_Order_history_page_or_not() throws Throwable {
	  Confirm_Orders_Pages.Verify_the_order_details_are_displayed_in_the_Order_history_page_or_not();
  }
  @And ("^Verify the Party details are displayed in the Order history page or not$")
  public void Verify_the_Party_details_are_displayed_in_the_Order_history_page_or_not() throws Throwable {
	  Confirm_Orders_Pages.Verify_the_Party_details_are_displayed_in_the_Order_history_page_or_not();
  }
  @And ("^User Click on the Back button$")
  public void User_Click_on_the_Back_button() throws Throwable {
	  Confirm_Orders_Pages.User_Click_on_the_Back_button();
  }
  @And ("^Click on the Order Expansion Icon$")
  public void Click_on_the_Order_Expansion_Icon() throws Throwable {
	  Confirm_Orders_Pages.Click_on_the_Order_Expansion_Icon();
  }
  @And ("^Verify the expansion grid header section names are displayed or not$")
  public void Verify_the_expansion_grid_header_section_names_are_displayed_or_not() throws Throwable {
	  Confirm_Orders_Pages.Verify_the_expansion_grid_header_section_names_are_displayed_or_not();
  }
  @And ("^Verify the Order Items are displayed in the expansion grid or not$")
  public void Verify_the_Order_Items_are_displayed_in_the_expansion_grid_or_not() throws Throwable {
	  Confirm_Orders_Pages.Verify_the_Order_Items_are_displayed_in_the_expansion_grid_or_not();
  }
  @Then ("^User should receive a confirmation message that the Warehouse has been changed$")
  public void User_should_receive_a_confirmation_message_that_the_Warehouse_has_been_changed() throws Throwable{
	  Confirm_Orders_Pages.User_should_receive_a_confirmation_message_that_the_Warehouse_has_been_changed();
  }
  @And ("^User Click on the Export button$")
  public void User_Click_on_the_Export_button() throws Throwable {
	  Confirm_Orders_Pages.User_Click_on_the_Export_button();
  }
  @Then ("^The User Select the Partially Shipped Status$")
  public void The_User_Select_the_Partially_Shipped_Status() throws Throwable {
	  Confirm_Orders_Pages.The_User_Select_the_Partially_Shipped_Status();
  }
  @And ("^User Click on the LR and Invoice Icon in the Actions column$")
  public void User_Click_on_the_LR_and_Invoice_Icon_in_the_Actions_column() throws Throwable {
	  Confirm_Orders_Pages.User_Click_on_the_LR_and_Invoice_Icon_in_the_Actions_column();
  }
  @And ("^Verify the order details are displayed in the Invoice List page or not$")
  public void Verify_the_order_details_are_displayed_in_the_Invoice_List_page_or_not() throws Throwable {
	  Confirm_Orders_Pages.Verify_the_order_details_are_displayed_in_the_Invoice_List_page_or_not();
  }
  @And ("^Verify the Party details are displayed in the Invoice List page or not$")
  public void Verify_the_Party_details_are_displayed_in_the_Invoice_List_page_or_not() throws Throwable {
	  Confirm_Orders_Pages.Verify_the_Party_details_are_displayed_in_the_Invoice_List_page_or_not();
  }
  @And ("User Select the State{string}")
  public void User_Select_the_State(String State)throws Throwable{
	  Confirm_Orders_Pages.User_Select_the_State(State);
	}
  @And ("User Select the Sales Person{string}")
  public void User_Select_the_Sales_Person(String SalesPerson)throws Throwable{
	  Confirm_Orders_Pages.User_Select_the_Sales_Person(SalesPerson);
	}
  @And ("User Select the Warehouse{string}")
  public void User_Select_the_Warehouse(String Warehouse)throws Throwable{
	  Confirm_Orders_Pages.User_Select_the_Warehouse(Warehouse);
	}
  @And ("User Select the Status{string}")
  public void User_Select_the_Status(String Status)throws Throwable{
	  Confirm_Orders_Pages.User_Select_the_Status(Status);
	}
  @And ("^User without Select the From date and ToDate$")
  public void User_without_Select_the_From_date_and_ToDate()throws Throwable{
	  Confirm_Orders_Pages.User_without_Select_the_From_date_and_ToDate();
	}
}

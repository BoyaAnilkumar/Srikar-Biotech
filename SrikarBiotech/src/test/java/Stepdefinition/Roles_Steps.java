package Stepdefinition;


import Pages.Roles_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Roles_Steps {
	Roles_Pages Roles_Pages = new Roles_Pages();
	
	@And  ("^User Click on the Roles screen$")
	 public void User_Click_on_the_Roles_screen() throws Throwable {
		Roles_Pages.User_Click_on_the_Roles_screen();
	}
	@And  ("^User Click on the Save button$")
	public void User_Click_on_the_Save_button() throws Throwable {
		Roles_Pages.User_Click_on_the_Save_button();
	}
	@When ("^User enter the data in Name field$")
	public void User_enter_the_data_in_Name_field() throws Throwable {
		Roles_Pages.User_enter_the_data_in_Name_field();
	}
	@Then ("^User Select the Reporting manager$")
	public void User_Select_the_Reporting_manager() throws Throwable {
		Roles_Pages.User_Select_the_Reporting_manager();
	}
	@When ("^User enter the Description$")
	public void User_enter_the_Description() throws Throwable {
		Roles_Pages.User_enter_the_Description();
	}
	@And ("^User Select the Web Access type toggle$")
	public void User_Select_the_Web_Access_type_toggle() throws Throwable {
		Roles_Pages.User_Select_the_Web_Access_type_toggle();
	}
	@And ("^User Select the Mobile Access type toggle$")
	public void User_Select_the_Mobile_Access_type_toggle() throws Throwable {
		Roles_Pages.User_Select_the_Mobile_Access_type_toggle();
	}
	@And ("^User Select the Users screen Select All check box$")
	public void User_Select_the_Users_screen_Select_All_check_box() throws Throwable {
		Roles_Pages.User_Select_the_Users_screen_Select_All_check_box();
	}
	@Then ("^User Select the View User Check box$")
	public void User_Select_the_View_User_Check_box() throws Throwable {
		Roles_Pages.User_Select_the_View_User_Check_box();
	}
	
	@And ("^User Select the Add/Update User Check box$")
	public void User_Select_the_Add_and_Update_User_Check_box() throws Throwable {
		Roles_Pages.User_Select_the_Add_and_Update_User_Check_box();
	}
	
	@And ("^User Select the Delete User Check box$")
	public void User_Select_the_Delete_User_Check_box() throws Throwable {
		Roles_Pages.User_Select_the_Delete_User_Check_box();
	}
	@And ("^User Select the Roles screen Select All check box$")
	public void User_Select_the_Roles_screen_Select_All_check_box() throws Throwable {
		Roles_Pages.User_Select_the_Roles_screen_Select_All_check_box();
	}
	@Then ("^User Select the View Roles Check box$")
	public void User_Select_the_View_Roles_Check_box() throws Throwable {
		Roles_Pages.User_Select_the_View_Roles_Check_box();
	}
	
	@And ("^User Select the Add/Update Roles Check box$")
	public void User_Select_the_Add_and_Update_Roles_Check_box() throws Throwable {
		Roles_Pages.User_Select_the_Add_and_Update_Roles_Check_box();
	}
	
	@And ("^User Select the Delete Roles Check box$")
	public void User_Select_the_Delete_Roles_Check_box() throws Throwable {
		Roles_Pages.User_Select_the_Delete_Roles_Check_box();
	}
	@And ("^User Select the Item Master screen Select All check box$")
	public void User_Select_the_Item_Master_screen_Select_All_check_box() throws Throwable {
		Roles_Pages.User_Select_the_Item_Master_screen_Select_All_check_box();
	}
	@Then ("^User Select the View Item Master Check box$")
	public void User_Select_the_View_Item_Master_Check_box() throws Throwable {
		Roles_Pages.User_Select_the_View_Item_Master_Check_box();
	}
	
	@And ("^User Select the Add/Update Item Master Check box$")
	public void User_Select_the_Add_and_Update_Item_Master_Check_box() throws Throwable {
		Roles_Pages.User_Select_the_Add_and_Update_Item_Master_Check_box();
	}
	
	@And ("^User Select the Delete Item Master Check box$")
	public void User_Select_the_Delete_Item_Master_Check_box() throws Throwable {
		Roles_Pages.User_Select_the_Delete_Item_Master_Check_box();
	}
	@And ("^User Select the Banners screen Select All check box$")
	public void User_Select_the_Banners_screen_Select_All_check_box() throws Throwable {
		Roles_Pages.User_Select_the_Banners_screen_Select_All_check_box();
	}
	@Then ("^User Select the View Banners Check box$")
	public void User_Select_the_View_Banners_Check_box() throws Throwable {
		Roles_Pages.User_Select_the_View_Banners_Check_box();
	}
	
	@And ("^User Select the Add Banners Check box$")
	public void User_Select_the_Add_Banners_Check_box() throws Throwable {
		Roles_Pages.User_Select_the_Add_Banners_Check_box();
	}
	
	@And ("^User Select the Delete Banners Check box$")
	public void User_Select_the_Delete_Banners_Check_box() throws Throwable {
		Roles_Pages.User_Select_the_Delete_Banners_Check_box();
	}
	@And ("^User Select the Confirm Orders screen Select All check box$")
	public void User_Select_the_Confirm_Orders_screen_Select_All_check_box() throws Throwable {
		Roles_Pages.User_Select_the_Confirm_Orders_screen_Select_All_check_box();
	}
	@Then ("^User Select the View Orders$")
	public void User_Select_the_View_Orders() throws Throwable {
		Roles_Pages.User_Select_the_View_Orders();
	}
	@And  ("^User Select the Create orders$")
	public void User_Select_the_Create_orders() throws Throwable {
		Roles_Pages.User_Select_the_Create_orders();
	}
	@And ("^User Select the Cancel Orders$")
	public void User_Select_the_Cancel_Orders() throws Throwable {
		Roles_Pages.User_Select_the_Cancel_Orders();
	}
	@Then ("^User Select the Sale Head Approval/Reject Order$")
	public void User_Select_the_Sale_Head_Approval_and_Reject_Order() throws Throwable {
		Roles_Pages.User_Select_the_Sale_Head_Approval_and_Reject_Order();
	}
	@And ("^User Select the HO Accept/Reject Order$")
	public void User_Select_the_HO_Accept_and_Reject_Order() throws Throwable {
		Roles_Pages.User_Select_the_HO_Accept_and_Reject_Order();
	}
	@And ("^User Select the Receive Order$")
	public void User_Select_the_Receive_Order() throws Throwable {
		Roles_Pages.User_Select_the_Receive_Order();
	}
	@And ("^User Select the Change Warehouse$")
	public void User_Select_the_Change_Warehouse() throws Throwable {
		Roles_Pages.User_Select_the_Change_Warehouse();
	}
	@And ("^User Select the View Collection screen Select All check box$")
	public void User_Select_the_View_Collection_screen_Select_All_check_box() throws Throwable {
		Roles_Pages.User_Select_the_View_Collection_screen_Select_All_check_box();
	}
	@Then ("^User Select the View Collection Check box$")
	public void User_Select_the_View_Collection_Check_box() throws Throwable {
		Roles_Pages.User_Select_the_View_Collection_Check_box();
	}
	@And ("^User Select the Create Collection Check box$")
	public void User_Select_the_Create_Collection_Check_box() throws Throwable {
		Roles_Pages.User_Select_the_Create_Collection_Check_box();
	}
	
	@And ("^User Select the Accept/Reject Collection Check box$")
	public void User_Select_the_Accept_and_Reject_Collection_Check_box() throws Throwable {
		Roles_Pages.User_Select_the_Accept_and_Reject_Collection_Check_box();
	}
	@And ("^User Select the View return order screen Select All check box$")
	public void User_Select_the_View_return_order_screen_Select_All_check_box() throws Throwable {
		Roles_Pages.User_Select_the_View_return_order_screen_Select_All_check_box();
	}
	@Then ("^User Select the View Return Order$")
	public void User_Select_the_View_Return_Order() throws Throwable {
		Roles_Pages.User_Select_the_View_Return_Order();
	}
	@And ("^User Select the Create Return Order$")
	public void User_Select_the_Create_Return_Order() throws Throwable {
		Roles_Pages.User_Select_the_Create_Return_Order();
	}
	@Then ("^User Select the Accept/Reject Return Order$")
	public void User_Select_the_Accept_and_Reject_Return_Order() throws Throwable {
		Roles_Pages.User_Select_the_Accept_and_Reject_Return_Order();
	}
	@And ("^User Select the Create Credit Note$")
	public void User_Select_the_Create_Credit_Note() throws Throwable {
		Roles_Pages.User_Select_the_Create_Credit_Note();
	}
	@And ("^User Select the Delete Credit Note$")
	public void User_Select_the_Delete_Credit_Note() throws Throwable {
		Roles_Pages.User_Select_the_Delete_Credit_Note();
	}
	@Then ("^User Select the Upload Return Attachments$")
	public void User_Select_the_Upload_Return_Attachments() throws Throwable {
		Roles_Pages.User_Select_the_Upload_Return_Attachments();
	}
	@And("^The User Select the Change Warehouse$")
	public void The_User_Select_the_Change_Warehouse() throws Throwable {
		Roles_Pages.The_User_Select_the_Change_Warehouse();
	}
	@Then ("^User click on the Filter Icon$")
	public void User_click_on_the_Filter_Icon() throws Throwable {
		Roles_Pages.User_click_on_the_Filter_Icon();
	}
	@When ("^User enter the data in the filter field$")
	public void User_enter_the_data_in_the_filter_field() throws Throwable {
		Roles_Pages.User_enter_the_data_in_the_filter_field();
	}
	@And ("^User Click on the Apply button$")
	public void User_Click_on_the_Apply_button() throws Throwable {
		Roles_Pages.User_Click_on_the_Apply_button();
	}
	@And ("^User Click on the Clear button$")
	public void User_Click_on_the_Clear_button() throws Throwable {
		Roles_Pages.User_Click_on_the_Clear_button();
	}
	@And  ("^User Click on the Cancel button$")
	public void User_Click_on_the_Cancel_button() throws Throwable {
		Roles_Pages.User_Click_on_the_Cancel_button();
	}
	@Then ("^Verify whether the page is navigated to the Roles List or not$")
	public void Verify_whether_the_page_is_navigated_to_the_Roles_List_or_not() throws Throwable {
		Roles_Pages.Verify_whether_the_page_is_navigated_to_the_Roles_List_or_not();
	}
	 @And ("^Validation Message is displayed or not$")
	 public void Validation_Message_is_displayed_or_not() throws Throwable {
		 Roles_Pages.Validation_Message_is_displayed_or_not(); 
	 }
	 @And ("^Verify whether the page is navigating to the Update Role or not on clicking the Edit button$")
	 public void Verify_whether_the_page_is_navigating_to_the_Update_Role_or_not_on_clicking_the_Edit_button() throws Throwable {
		 Roles_Pages.Verify_whether_the_page_is_navigating_to_the_Update_Role_or_not_on_clicking_the_Edit_button(); 
	 }
	 @When ("^Update the Reporting manager$")
	 public void Update_the_Reporting_manager() throws Throwable {
		 Roles_Pages.Update_the_Reporting_manager(); 
	 }
	 @And ("^User Click on the Update button$")
	 public void User_Click_on_the_Update_button() throws Throwable {
		 Roles_Pages.User_Click_on_the_Update_button(); 
	 }
	
}

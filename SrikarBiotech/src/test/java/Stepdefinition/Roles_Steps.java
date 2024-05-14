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
	@When ("^The User enter the data in Name field$")
	public void The_User_enter_the_data_in_Name_field() throws Throwable {
		Roles_Pages.The_User_enter_the_data_in_Name_field();
	}
	@When ("^The User enter the data in the Name field$")
	public void The_User_enter_the_data_in_the_Name_field() throws Throwable {
		Roles_Pages.The_User_enter_the_data_in_the_Name_field();
	}
	@When ("^User enter the data in the Name field$")
	public void User_enter_the_data_in_the_Name_field() throws Throwable {
		Roles_Pages.User_enter_the_data_in_the_Name_field();
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
	@And ("^the User Select the Users screen Select All check box$")
	public void the_User_Select_the_Users_screen_Select_All_check_box() throws Throwable {
		Roles_Pages.the_User_Select_the_Users_screen_Select_All_check_box();
	}
	@When ("^The User Select the Users Section Role permissions$")
	public void The_User_Select_the_Users_Section_Role_permissions() throws Throwable {
		Roles_Pages.The_User_Select_the_Users_Section_Role_permissions();
	}
	
	@And ("^the User Select the Roles screen Select All check box$")
	public void the_User_Select_the_Roles_screen_Select_All_check_box() throws Throwable {
		Roles_Pages.the_User_Select_the_Roles_screen_Select_All_check_box();
	}
	@Then ("^the User Select the Roles screen permissions$")
	public void the_User_Select_the_Roles_screen_permissions() throws Throwable {
		Roles_Pages.the_User_Select_the_Roles_screen_permissions();
	}
		
	@And ("^the User Select the Item Master screen Select All check box$")
	public void the_User_Select_the_Item_Master_screen_Select_All_check_box() throws Throwable {
		Roles_Pages.the_User_Select_the_Item_Master_screen_Select_All_check_box();
	}
	@Then ("^the User selects the Item Master section Role Permissions$")
	public void the_User_selects_the_Item_Master_section_Role_Permissions() throws Throwable {
		Roles_Pages.the_User_selects_the_Item_Master_section_Role_Permissions();
	}

	@And ("^the User Select the Banners screen Select All check box$")
	public void the_User_Select_the_Banners_screen_Select_All_check_box() throws Throwable {
		Roles_Pages.the_User_Select_the_Banners_screen_Select_All_check_box();
	}
	@Then ("^the User Select the banners section Role Permissions$")
	public void the_User_Select_the_banners_section_Role_Permissions() throws Throwable {
		Roles_Pages.the_User_Select_the_banners_section_Role_Permissions();
	}

	@And ("^the User Select the Confirm Orders screen Select All check box$")
	public void the_User_Select_the_Confirm_Orders_screen_Select_All_check_box() throws Throwable {
		Roles_Pages.the_User_Select_the_Confirm_Orders_screen_Select_All_check_box();
	}
	@Then ("^the User Select the Confirm Orders section role Permissions$")
	public void the_User_Select_the_Confirm_Orders_section_role_Permissions() throws Throwable {
		Roles_Pages.the_User_Select_the_Confirm_Orders_section_role_Permissions();
	}
	
	@And ("^the User Select the View Collection screen Select All check box$")
	public void the_User_Select_the_View_Collection_screen_Select_All_check_box() throws Throwable {
		Roles_Pages.the_User_Select_the_View_Collection_screen_Select_All_check_box();
	}
	@Then ("^the User Select the View Collection Section role Permissions$")
	public void the_User_Select_the_View_Collection_Section_role_Permissions() throws Throwable {
		Roles_Pages.the_User_Select_the_View_Collection_Section_role_Permissions();
	}
	
	@And ("^the User Select the View return order screen Select All check box$")
	public void the_User_Select_the_View_return_order_screen_Select_All_check_box() throws Throwable {
		Roles_Pages.the_User_Select_the_View_return_order_screen_Select_All_check_box();
	}
	@Then ("^the User Select the View Return Order Section Role Permissions$")
	public void the_User_Select_the_View_Return_Order_Section_Role_Permissions() throws Throwable {
		Roles_Pages.the_User_Select_the_View_Return_Order_Section_Role_Permissions();
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
	 @Then ("^Validation message should be displayed without select the permissions$")
	 public void Validation_message_should_be_displayed_without_select_the_permissions() throws Throwable {
		 Roles_Pages.Validation_message_should_be_displayed_without_select_the_permissions(); 
	 }
	 @Then ("^The Added Super Amin Role should be displayed in the roles list$")
	 public void The_Added_Super_Amin_Role_should_be_displayed_in_the_roles_list() throws Throwable {
		 Roles_Pages.The_Added_Super_Amin_Role_should_be_displayed_in_the_roles_list(); 
	 } 
	 @And ("^User Select the Sale Head approved or Reject permission$")
	 public void User_Select_the_Sale_Head_approved_or_Reject_permission() throws Throwable {
		 Roles_Pages.User_Select_the_Sale_Head_approved_or_Reject_permission(); 
	 }
	 @And ("^User Add the Activity rights for Create Orders and View Orders$")
	 public void User_Add_the_Activity_rights_for_Create_Orders_and_View_Orders() throws Throwable {
		 Roles_Pages.User_Add_the_Activity_rights_for_Create_Orders_and_View_Orders(); 
	 }
	 @And ("^User Add the Activity rights for Create Collections and View Collections$")
	 public void User_Add_the_Activity_rights_for_Create_Collections_and_View_Collections() throws Throwable {
		 Roles_Pages.User_Add_the_Activity_rights_for_Create_Collections_and_View_Collections(); 
	 }
	 @And ("^User Add the Activity rights for Create Return Orders and View Return Orders$")
	 public void User_Add_the_Activity_rights_for_Create_Return_Orders_and_View_Return_Orders() throws Throwable {
		 Roles_Pages.User_Add_the_Activity_rights_for_Create_Return_Orders_and_View_Return_Orders(); 
	 }
	 @Then ("^The Added Sales Manager Role should be displayed in the roles list$")
	 public void The_Added_Sales_Manager_Role_should_be_displayed_in_the_roles_list() throws Throwable {
		 Roles_Pages.The_Added_Sales_Manager_Role_should_be_displayed_in_the_roles_list(); 
	 }
	 @Then ("^The Added Sales Head Role should be displayed in the roles list$")
	 public void The_Added_Sales_Head_Role_should_be_displayed_in_the_roles_list() throws Throwable {
		 Roles_Pages.The_Added_Sales_Head_Role_should_be_displayed_in_the_roles_list(); 
	 }
	 @Then ("^The Added Sales Person Role should be displayed in the roles list$")
	 public void The_Added_Sales_Person_Role_should_be_displayed_in_the_roles_list() throws Throwable {
		 Roles_Pages.The_Added_Sales_Person_Role_should_be_displayed_in_the_roles_list(); 
	 }
}

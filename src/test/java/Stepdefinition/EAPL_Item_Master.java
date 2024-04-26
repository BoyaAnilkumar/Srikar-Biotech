package Stepdefinition;

import Pages.EAPL_Item_master_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


	public class EAPL_Item_Master {
		EAPL_Item_master_Pages Item_master_Pages = new EAPL_Item_master_Pages();
		
		
		@And  ("^User click on the Item Master under the Masters Module$")
		public void User_click_on_the_Item_Master_under_the_Masters_Module() throws Throwable{
			Item_master_Pages.User_click_on_the_Item_Master_under_the_Masters_Module();
		}
		@And("^User click on the Add button$")
		 public void User_click_on_the_Add_button()throws Throwable {
			Item_master_Pages.User_click_on_the_Add_button();
		}
		@Then ("^User Click on the Save Button$")
		public void User_Click_on_the_Save_Button() throws Throwable{
			Item_master_Pages.User_Click_on_the_Save_Button();
		}
		@Then ("^Validation message should be displayed$")
		 public void Validation_message_should_be_displayed() throws Throwable {
			Item_master_Pages.Validation_message_should_be_displayed(); 
		 }
		@Then ("^User Select the Company name$")
		public void User_Select_the_Company_name() throws Throwable{
			Item_master_Pages.User_Select_the_Company_name();
		}
		@And ("^User Select the Category$")
		public void User_Select_the_Category() throws Throwable{
			Item_master_Pages.User_Select_the_Category();
		}
		@And ("^User Select the Items$")
		public void User_Select_the_Items() throws Throwable{
			Item_master_Pages.User_Select_the_Items();
		}
		@And("^upload the file in Items attachment$")
		public void upload_the_file_in_Items_attachment() throws Throwable {
			Item_master_Pages.upload_the_file_in_Items_attachment();
		}
		@When ("^User enter the Data in the filter field$")
		public void User_enter_the_Data_in_the_filter_field() throws Throwable {
			Item_master_Pages.User_enter_the_Data_in_the_filter_field();
		}
		@Then ("^User Click on the Filter icon$")
		public void User_Click_on_the_Filter_icon() throws Throwable {
			Item_master_Pages.User_Click_on_the_Filter_icon();
		}
		@And ("^User Click on the Apply button$")
		public void User_Click_on_the_Apply_button() throws Throwable {
			Item_master_Pages.User_Click_on_the_Apply_button();
		}
		
		@And ("^User Click on the Clear Button$")
		public void User_Click_on_the_Clear_Button() throws Throwable {
			Item_master_Pages.User_Click_on_the_Clear_Button();
		}
		@And ("^Click on the Delete Icon$")
		public void Click_on_the_Delete_Icon() throws Throwable {
			Item_master_Pages.Click_on_the_Delete_Icon();
		}
		@Then ("^Click on the Edit Icon$")
		public void Click_on_the_Edit_Icon() throws Throwable {
			Item_master_Pages.Click_on_the_Edit_Icon();
		}
		@When ("^Update the category$")
		public void Update_the_category() throws Throwable {
			Item_master_Pages.Update_the_category();
		}
		@And ("^Update the Items$")
		public void Update_the_Items() throws Throwable {
			Item_master_Pages.Update_the_Items();
		}
		@And ("^Click on the Update button$")
		public void Click_on_the_Update_button() throws Throwable {
			Item_master_Pages.Click_on_the_Update_button();
		}


}

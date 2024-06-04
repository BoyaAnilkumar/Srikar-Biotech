package Stepdefinition;



import Pages.SBPL_Item_master_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SBPL_Item_Master_Steps {
	SBPL_Item_master_Pages Item_master_Pages = new SBPL_Item_master_Pages();
	
	
	@And  ("^User click on the Item Master under the Masters Module$")
	public void User_click_on_the_Item_Master_under_the_Masters_Module() throws Throwable{
		Item_master_Pages.User_click_on_the_Item_Master_under_the_Masters_Module();
	}
	@Then ("^User Click on the Save Button$")
	public void User_Click_on_the_Save_Button() throws Throwable{
		Item_master_Pages.User_Click_on_the_Save_Button();
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
	@Then ("User Select the Company name{string}")
	public void User_Select_the_Company_name(String Company) throws Throwable {
		Item_master_Pages.User_Select_the_Company_name(Company);
	}
	@And ("User Select the Category{string}")
	public void User_Select_the_Category(String Category) throws Throwable {
		Item_master_Pages.User_Select_the_Category(Category);
	}	
	@When ("User enters the data in the Search field{string}")
	public void User_enters_the_data_in_the_Search_field(String Search) throws Throwable {
	Item_master_Pages.User_enters_the_data_in_the_Search_field(Search);
   }
	@When ("User enter the data in the Search field{string}")
	public void User_enter_the_data_in_the_Search_field(String Search_Company) throws Throwable {
	Item_master_Pages.User_enter_the_data_in_the_Search_field(Search_Company);
   }
	@And ("^User without select the Company the Category dropdown values are displayed or not$")
	public void User_without_select_the_Company_the_Category_dropdown_values_are_displayed_or_not() throws Throwable {
		Item_master_Pages.User_without_select_the_Company_the_Category_dropdown_values_are_displayed_or_not();
	}
	
}

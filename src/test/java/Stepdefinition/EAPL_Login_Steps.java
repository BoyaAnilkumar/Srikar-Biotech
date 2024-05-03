package Stepdefinition;


import Pages.EAPL_Loginpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EAPL_Login_Steps {

	EAPL_Loginpage Loginpage = new EAPL_Loginpage();

	
	@Given("^User navigates to Login page$")
	public void User_navigates_to_Login_page() throws Throwable {
		Loginpage.User_navigates_to_Login_page();
	}
	@When ("^User Select the Eldorado Agritech Company$")
	public void User_Select_the_Eldorado_Agritech_Company() throws Throwable {
		Loginpage.User_Select_the_Eldorado_Agritech_Company();
	}
	@Then("^User enters the username and password$")
	public void User_enters_the_username_and_password() throws Throwable {
		Loginpage.User_enters_the_username_and_password();
	
    }
	
	@And("^User click on the signIn$")
	public void User_click_on_the_signIn() throws Throwable {
		Loginpage.User_click_on_the_signIn();
		
   }
	
	@Then("^User navigated to the home page$")
	public void user_navigated_to_the_home_page() throws Throwable {
		Loginpage.NavigatedToHomePage();
   }
	 @When("^User without enters username and password$")
	  public void user_without_enters_username_and_password() throws Throwable {
	        
	 }
	 @Then("^validation message should be displayed when Click on the SignIn button$")
	   public void validation_message_should_be_displayed_when_Click_on_the_SignIn_button() throws Throwable {
		 Loginpage.validation_message_should_be_displayed_when_Click_on_the_SignIn_button();
	  }
	 @When ("^User enters invalid username and valid password$")
	 public void User_enters_invalid_username_and_valid_password() throws Throwable {
		 Loginpage.User_enters_invalid_username_and_valid_password();
	 }
	 @Then ("^Incorrect User Name validation message should be displayed$")
	 public void Incorrect_User_Name_validation_message_should_be_displayed() throws Throwable {
		 Loginpage.Incorrect_User_Name_validation_message_should_be_displayed();
	 }
	 @When ("^User enters valid username and invalid password$")
	 public void User_enters_valid_username_and_invalid_password() throws Throwable {
		 Loginpage.User_enters_valid_username_and_invalid_password();
	 }
	 @Then ("^Incorrect Password validation message should be displayed$") 
	 public void Incorrect_Password_validation_message_should_be_displayed() throws Throwable {
		 Loginpage.Incorrect_Password_validation_message_should_be_displayed();
	 }
	 @When ("^User clicks on Forgot password link$")
	 public void User_clicks_on_Forgot_password_link() throws Throwable {
		 Loginpage.User_clicks_on_Forgot_password_link();
	 }
	 @Then ("^User navigated to the Forgot Password page$")
	 public void User_navigated_to_the_Forgot_Password_page() throws Throwable {
		 Loginpage.User_navigated_to_the_Forgot_Password_page();
	 }
	 @When ("^User without enters Email Address or Username$")
	 public void User_without_enters_Email_Address_or_Username() throws Throwable {
		
	 }
	 @And("^User click on the Submit button$")
	 public void User_click_on_the_Submit_button() throws Throwable {
		 Loginpage.User_click_on_the_Submit_button();
			
	 }
	 @Then ("^validation message should be displayed or not$")
	 public void validation_message_should_be_displayed_or_not() throws Throwable {
		 Loginpage.validation_message_should_be_displayed_or_not();
	 }
	 @When ("^user enter the valid Email Address$")
	 public void user_enter_the_valid_Email_Address() throws Throwable {
		 Loginpage.user_enter_the_valid_Email_Address();
	 }
	 @When ("^user enter the Invalid Email Address$")
	 public void user_enter_the_Invalid_Email_Address() throws Throwable {
		 Loginpage.user_enter_the_Invalid_Email_Address();
	 }
	 @When ("^user enter the valid Username$")
	 public void user_enter_the_valid_Username() throws Throwable {
		 Loginpage.user_enter_the_valid_Username();
	 }
	 @When ("^User click on the back to Signin$")
	 public void User_click_on_the_back_to_Signin() throws Throwable {
		 Loginpage.User_click_on_the_back_to_Signin();
	 }
	 
	 
}
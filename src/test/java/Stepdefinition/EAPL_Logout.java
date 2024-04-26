package Stepdefinition;

import Pages.EAPL_Logout_Pages;
import io.cucumber.java.en.And;

	public class EAPL_Logout {
		EAPL_Logout_Pages  Logout_Pages  = new EAPL_Logout_Pages();
		
		@And ("^Click on Logout button$")
		public void Click_on_Logout_button()throws Throwable{
			Logout_Pages.Click_on_Logout_button();
		}
		

}

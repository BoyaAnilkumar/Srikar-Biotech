package Pages;


import org.openqa.selenium.By;

import util.DriverFactory;
import util.Utilities;


public class EAPL_Logout_Pages extends DriverFactory{
	Utilities utilities = new Utilities();
	   
	   By Logout     = By.xpath("//span[text()='Logout']");
	   
		public void Click_on_Logout_button() throws Throwable {
			utilities.webDriverWait(driver, Logout);
			driver.findElement(Logout).click();		
		}

	}
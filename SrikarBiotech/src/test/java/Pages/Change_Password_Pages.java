package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class Change_Password_Pages extends DriverFactory{
	
	Utilities utilities= new Utilities();

	
	By username              = By.xpath("//input[@placeholder='Enter Email address / Username']");
	By Password              = By.xpath("//input[@placeholder='Enter Password']");
	By User_Icon                = By.xpath("//a[@class='dropdown-toggle pc-head-link head-link-primary arrow-none me-0']");
	By Change_Password          = By.xpath("//span[text()=' Change Password']");
	By Confirm_Password         = By.xpath("//span[text()='Confirm Password']");
	By Current_Password         = By.xpath("//input[@placeholder='Enter Current Password']");
	By New_Password             = By.xpath("//input[@placeholder='Enter New Password']");
	By Confirm_Password_field   = By.xpath("//input[@formcontrolname='confirmPassword']");
	By Submit_button            = By.xpath("//button[@class='btn btn-secondary p-2']");
	By Confirmation_message     = By.xpath("//h2[text()='Password Changed Successfully']");
	By Confirm_Password_toggle  = By.xpath("//div[@ngbtooltip='Password and Confirm Password do not match']");
//Show and Hide Icon
	By Eye_Icon                 = By.xpath("//eyeicon[@class='p-element p-icon-wrapper ng-tns-c1323817119-3 ng-star-inserted']");
	By Eye_Hide_Icon            = By.xpath("//eyeslashicon[@class='p-element p-icon-wrapper ng-tns-c1323817119-3 ng-star-inserted']");
	By Close_Icon               = By.xpath("(//button[@type='button'])[3]");
	By Confirm_Orders           = By.xpath("(//span[text()='Confirm Orders'])[1]");
	
	public void User_enter_the_username_and_password() throws Throwable {
		utilities.webDriverWait(driver, username);	
		driver.findElement(username).sendKeys("Ramya");
		utilities.webDriverWait(driver, Password);	
		driver.findElement(Password).sendKeys("Abcd@123");
		
	}


	public void User_click_on_User_Image_Icon_under_User_icon_in_webpage() throws Throwable {
	utilities.webDriverWait(driver, User_Icon);	
	driver.findElement(User_Icon).click();
	}


	public void User_chooses_the_option_to_change_the_password() throws Throwable {
		utilities.webDriverWait(driver, Change_Password);	
		driver.findElement(Change_Password).click();	
		
	}

   public void User_navigates_to_the_Confirm_Password_page() {
	   WebElement Data = driver.findElement(Confirm_Password);
		String DataText = Data.getText();
		System.out.println("The Confirm Password Page is displayed: " + DataText);

		
	}
	public void User_enters_the_current_password() throws Throwable {
		utilities.webDriverWait(driver, Current_Password);	
		driver.findElement(Current_Password).sendKeys("Abcd@123");
		
	}
	public void User_enters_a_new_password() throws Throwable {
		utilities.webDriverWait(driver, New_Password);	
		driver.findElement(New_Password).sendKeys("Abcd@123");
		
	}
	public void User_submits_the_form() throws Throwable {
		utilities.webDriverWait(driver, Submit_button);	
		driver.findElement(Submit_button).click();	
		
	}
	public void User_should_receive_a_confirmation_message_that_the_password_has_been_changed() throws Throwable {
		Thread.sleep(1500);
		Boolean isPresent = driver.findElements(Confirmation_message).size()>0;
		if (isPresent) {
		WebElement Data = driver.findElement(Confirmation_message);
		String test = Data.getText(); 
		String expectedData = "Password Changed Successfully";
		if (expectedData.equals(test)) {
			System.out.println("Display Confirmation msg is correct." + test);
		} else {
			System.out.println("Display Confirmation msg is incorrect."+ test);
		}
	}
		
		
	}
	public void User_enters_an_incorrect_current_password() throws Throwable {
		utilities.webDriverWait(driver, Current_Password);	
		driver.findElement(Current_Password).sendKeys("Abcd@12345");
		
	}
	public void User_enters_a_Confirm_Password() throws Throwable {
		utilities.webDriverWait(driver, Confirm_Password_field);	
		driver.findElement(Confirm_Password_field).sendKeys("Abcd@123");
		
	}


	public void User_should_receive_an_error_message_indicating_that_the_current_password_is_incorrect() {
		
		
	}


	public void User_enters_a_different_Confirm_password_for_confirmation() throws Throwable {
		utilities.webDriverWait(driver, Confirm_Password_field);	
		driver.findElement(Confirm_Password_field).sendKeys("Ramya@123");
		
	}


	public void User_should_receive_an_error_message_indicating_that_the_new_passwords_do_not_match() {
		
		
	}


	public void User_clicks_on_the_Submit_button_without_entering_any_data() throws Throwable {
		utilities.webDriverWait(driver, Current_Password);	
		driver.findElement(Current_Password).sendKeys("");
		utilities.webDriverWait(driver, New_Password);	
		driver.findElement(New_Password).sendKeys("");
		utilities.webDriverWait(driver, Confirm_Password_field);	
		driver.findElement(Confirm_Password_field).sendKeys("");
		utilities.webDriverWait(driver, Submit_button);	
		driver.findElement(Submit_button).click();	
	}


	public void User_should_receive_an_error_message() {
		
		
	}


	public void User_click_on_the_show_password_icon() throws Throwable {
		utilities.webDriverWait(driver, Eye_Icon);	
		driver.findElement(Eye_Icon).click();	
		
	}

By New  = By.xpath("//input[@class='p-inputtext p-component p-element ng-tns-c1323817119-3 p-password-input p-filled']");
	public void User_should_see_the_password() throws Throwable {
		utilities.webDriverWait(driver, New_Password);	
		WebElement data = driver.findElement(New_Password);
		String dataText = data.getAttribute("value");
		System.out.println("Value of the input field:: " + dataText);

	}


	public void User_click_on_the_hide_password_icon() throws Throwable {
		utilities.webDriverWait(driver, Eye_Hide_Icon);	
		driver.findElement(Eye_Hide_Icon).click();		
	}


	public void User_should_not_be_able_to_see_the_password() throws Throwable {
		utilities.webDriverWait(driver, New_Password);	
		WebElement data = driver.findElement(New_Password);
		String dataText = data.getAttribute("value");
		System.out.println("hide the Password: " + dataText);
	}


	public void User_Click_on_the_Close_Icon_in_the_Confirm_Password_Page() throws Throwable {
		utilities.webDriverWait(driver, Close_Icon);	
		driver.findElement(Close_Icon).click();		
	}
	public void the_Confirm_Password_Page_should_be_closed() throws Throwable {
		WebElement Pageclosed = driver.findElement(Confirm_Orders);
		if (Pageclosed.isEnabled()) {
			driver.findElement(Confirm_Orders).click();
			utilities.MediumWait(driver);
			 System.out.println("Page is closed");

		} else {
			driver.findElement(Close_Icon).click();
			utilities.MediumWait(driver);
			System.out.println("Page is still open");
		}
	}
	

}

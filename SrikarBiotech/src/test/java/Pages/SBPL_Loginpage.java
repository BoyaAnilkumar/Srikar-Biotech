package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class SBPL_Loginpage extends DriverFactory{
	Utilities utilities = new Utilities();
	
	By username              = By.xpath("//input[@placeholder='Enter Email address / Username']");
	By Password              = By.xpath("//input[@placeholder='Enter Password']");
	By SignIn                = By.xpath("//button[@type='submit']");
	By Dashboard             = By.xpath("//label[text()='Dashboard ']");
	By Validation_Text       = By.xpath("//h2[text()='Mandatory Fields Are Required With  Valid Data.']");
	By Incorrectusername_msg = By.xpath("//h2[text()='The user name or password is incorrect.']");
	By IncorrectPassword_msg = By.xpath("//h2[text()='The user name or password is incorrect.']");
	By Forgot_Password       = By.xpath("//a[text()='Forgot Password?']");
	By ForgotPassword_Text   = By.xpath("//b[text()='Forgot Password']");
	By Email_Usernamefield   = By.xpath("//input[@formcontrolname='userNameorEmail']");
	By Submit                = By.xpath("//button[@type='submit']");
	By Invalid_EmailText     = By.xpath("//h2[text()='Invalid Email Address']");
	By BackTo_SignIn         = By.xpath("//a[text()=' You want to go back to SignIn? ']");
	By Show_Hide             = By.xpath("//i[@class='pi pi-eye']");
	
	public void User_navigates_to_Login_page() throws Throwable {
		driver.get(prop.getProperty("url"));
		utilities.MinimumWait(driver);
//		driver.findElement(SignIn).click();
	}

	public void User_enters_the_username_and_password() throws Throwable {
		utilities.webDriverWait(driver, username);
		driver.findElement(username).sendKeys("Superadmin");
		driver.findElement(Password).sendKeys("Abcd@123");
		utilities.MediumWait(driver);
			
	}
			
	public void User_click_on_the_signIn() throws Throwable {
		utilities.webDriverWait(driver, Password);		
		driver.findElement(SignIn).click();
		utilities.MediumWait(driver);
		
    }
	public void NavigatedToHomePage() throws Throwable {
			utilities.webDriverWait(driver, Dashboard);
			Boolean isPresent = driver.findElements(Dashboard).size()>0;
			if (isPresent) {
				WebElement Data = driver.findElement(Dashboard);
				String test = Data.getText(); 
				String expectedData = "Dashboard";
				if (expectedData.equals(test)) {
					System.out.println("Display Dashboard Module name is correct." + test);
				} else {
					System.out.println("Display Dashboard Module name is incorrect."+ test);
				}
			}
	}
	public void validation_message_should_be_displayed_when_Click_on_the_SignIn_button() throws Throwable {
		    driver.findElement(SignIn).click();
		  	utilities.webDriverWait(driver, Validation_Text);
             driver.findElement(username).sendKeys("Superadmin");
        	
     }

	public void User_enters_invalid_username_and_valid_password() throws Throwable {
			utilities.webDriverWait(driver, username);
			driver.findElement(username).sendKeys("Mahi");
			driver.findElement(Password).sendKeys("Abcd@123");
			driver.findElement(Show_Hide).click();
			utilities.MediumWait(driver);
			
	}

	public void Incorrect_User_Name_validation_message_should_be_displayed() throws Throwable {
	    	utilities.webDriverWait(driver, Incorrectusername_msg);
			utilities.MediumWait(driver);
	}

	public void User_enters_valid_username_and_invalid_password() throws Throwable {
			utilities.webDriverWait(driver, username);
			driver.findElement(username).sendKeys("Superadmin");
			driver.findElement(Password).sendKeys("Abcd@12345");
			driver.findElement(Show_Hide).click();
			utilities.MediumWait(driver);
			
	}

	public void Incorrect_Password_validation_message_should_be_displayed() throws Throwable {
			utilities.webDriverWait(driver, IncorrectPassword_msg);
//			utilities.MediumWait(driver);
			
	}

	public void User_clicks_on_Forgot_password_link() throws Throwable {
			utilities.webDriverWait(driver, Forgot_Password);		
			driver.findElement(Forgot_Password).click();
			
	}
	
	public void User_navigated_to_the_Forgot_Password_page() throws Throwable {
			utilities.webDriverWait(driver, ForgotPassword_Text);
			Boolean isPresent = driver.findElements(ForgotPassword_Text).size()>0;
			if (isPresent) {
				WebElement Data = driver.findElement(ForgotPassword_Text);
				String test = Data.getText(); 
				String expectedData = "Forgot Password";
				if (expectedData.equals(test)) {
					System.out.println("Display Screen name is correct." + test);
				} else {
					System.out.println("Display Screen name is incorrect."+ test);
				}
			}
	}

	public void User_click_on_the_Submit_button() throws Throwable {
			utilities.webDriverWait(driver, Submit);		
			driver.findElement(Submit).click();
			
	}

	public void validation_message_should_be_displayed_or_not() throws Throwable {
			utilities.webDriverWait(driver, Validation_Text);
			
	}

	public void user_enter_the_valid_Email_Address() throws Throwable {
			utilities.webDriverWait(driver, Email_Usernamefield);
			driver.findElement(Email_Usernamefield).sendKeys("ABCD@123");
			driver.findElement(Submit).click();
	}

	public void user_enter_the_valid_Username() throws Throwable {
			utilities.webDriverWait(driver, username);
			driver.findElement(username).sendKeys("Superadmin");
			
	}

	public void user_enter_the_Invalid_Email_Address() throws Throwable {
			utilities.webDriverWait(driver, Email_Usernamefield);
			driver.findElement(Email_Usernamefield).sendKeys("ABCD@123");
			driver.findElement(Submit).click();	
			utilities.webDriverWait(driver, Invalid_EmailText);
			Boolean isPresent = driver.findElements(Invalid_EmailText).size()>0;
			if (isPresent) {
				WebElement Data = driver.findElement(Invalid_EmailText);
				String test = Data.getText(); 
				String expectedData = "Invalid Email Address";
				if (expectedData.equals(test)) {
					System.out.println("Display msg is correct." + test);
				} else {
					System.out.println("Display msg is incorrect."+ test);
				}
			}
	}

	public void User_click_on_the_back_to_Signin() throws Throwable {
			utilities.webDriverWait(driver, BackTo_SignIn);
			driver.findElement(BackTo_SignIn).click();
			
	}

	public void the_Validation_message_should_be_displayed() {
		WebElement Toaster = driver.findElement(Validation_Text);
		String Toaster1 = Toaster.getText();
		System.out.println("The toaster msg is displayed: " + Toaster1);
	}

	

}

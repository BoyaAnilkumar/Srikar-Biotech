package Pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.DriverFactory;
import util.Utilities;

public class Users_Pages extends DriverFactory{
	Utilities utilities = new Utilities();

	By Security_List          = By.xpath("//span[text()='Security List ']");
	By Users_Screen           = By.xpath("(//span[text()='Users'])[1]");
    By Add_Button             = By.xpath("//button[@class='btn btn-secondary ng-star-inserted']");
    By Username_field         = By.xpath("//input[@placeholder='Enter User Name']");
    By SBPL_Slp_Code          = By.xpath("//input[@placeholder='Enter SBPL Slp. Code']");
    By EAPL_Slp_Code          = By.xpath("//input[@placeholder='Enter EAPL Slp. Code']");
    By First_Name             = By.xpath("//input[@formcontrolname='firstName']");
    By Last_Name              = By.xpath("//input[@placeholder='Enter Last Name']");
    By Email_Address          = By.xpath("//input[@placeholder='Enter Email']");
    By Mobile_Number          = By.xpath("//input[@placeholder='Enter Mobile Number']");
    By Alternate_MobileNumber = By.xpath("//input[@placeholder='Enter Alternative Mobile Number']");
    By New_Password           = By.xpath("//input[@placeholder='Enter New Password']");
    By Confirm_Password       = By.xpath("//input[@placeholder='Enter Confirm Password']"); 
    By Role_field             = By.xpath("//input[@placeholder='Search Role']");
    By Select_Role            = By.xpath("//span[text()='Sales Person']");
    By Reporting_Manager      = By.xpath("//input[@placeholder='Search Name']");
    By Select_ReportingManager= By.xpath("//span[text()='Ravi A']");
    By Company_field          = By.xpath("//label[text()='Company']/..//div[@class='p-element p-multiselect-label-container']");
    By Option1                = By.xpath("//div[text()='Srikar Biotech']");
    By Option2                = By.xpath("//div[text()='Eldorado Agritech']");
    By Warehouse              = By.xpath("//div[text()='Select Warehouse']");
    By Warehouse_Option1      = By.xpath("//div[text()='Andhra Pradesh (AP01) (SBPL)']");
    By Warehouse_Option2	  = By.xpath("//div[text()='Andhra Pradesh (AP01) (EAPL)']");
    By Save_button            = By.xpath("//button[@type='submit']");
    By Cancel_button          = By.xpath("//button[text()=' Cancel']");
    By Column_filter_icon     = By.xpath("(//p-table/div/div/table/thead/tr/th/div/p-columnfilter)[1]");
    By Column_filter_element  = By.xpath("//p-columnfilterformelement/input[@type='text']");
    By column_filter_apply    = By.xpath("//span[text()='Apply']");
    By column_filter_clear    = By.xpath("//span[text()='Clear']");
    By Validation_Msg         = By.xpath("//h2[text()='Mandatory Fields Are Required With  Valid Data.']");
    By Edit_Icon              = By.xpath("//button[@title='Edit']");
    By Updateform_name        = By.xpath("//h4[text()='Update User']");
    By Update_Message         = By.xpath("//div[@class='swal2-popup swal2-toast colored-toast swal2-icon-success swal2-show']");
    By Delete_Icon            = By.xpath("//button[@title='Delete']");
    By Yes_button             = By.xpath("//button[text()='Yes']");
    By Delete_validation_msg  = By.xpath("//h2[text()='User Deactivate Successfully']");      
    By OrderID1               = By.xpath("(//p[contains(@class,'mb-0 text-secondary')]//b)[1]");
    By OrderID2               = By.xpath("((//tr[@class='ng-star-inserted']//td)[3]//span)[1]");
    By Users                  = By.xpath("//h4[text()='Users List']");
    By Search_field           = By.xpath("//input[@placeholder='Search Keyword']");
    By Active                 = By.xpath("(//label[text()='Active'])[2]");
    String companyname1       = "Srikar Biotech";
    String companyname2	      = "Eldorado Agritech";
    By COMPANY                =  By.xpath("//p-multiselect[@optionlabel='companyName']");
    By search_field           = By.xpath("//input[@class='p-multiselect-filter p-inputtext p-component']");
    By Check_Box              = By.xpath("(//div[@class='p-checkbox-box'])[1]");
    By Expansion_Icon         = By.xpath("//button[@class='p-element p-button-text p-button-rounded p-button-plain p-button p-component p-button-icon-only']");
    By Expansion_Grid_header  = By.xpath("(//thead[@class='p-datatable-thead'])[2]");
    By Expansion_Table        = By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[2]");
    By Table                  = By.xpath("//tbody[@class='p-element p-datatable-tbody']");
    
    
  public void User_click_on_the_Security_Module() throws Throwable{
	  utilities.webDriverWait(driver,Security_List );		
		driver.findElement(Security_List).click();
		
	}

 public void User_Click_on_the_Users_screen()throws Throwable {
	 utilities.webDriverWait(driver, Users_Screen);		
		driver.findElement(Users_Screen).click();
		utilities.MediumWait(driver);
  }

public void User_click_on_the_Add_button() throws Throwable {
	 utilities.webDriverWait(driver,Add_Button );		
		driver.findElement(Add_Button).click();
	
}

public void User_enter_the_Username() throws Throwable {
	 utilities.webDriverWait(driver,Username_field );		
		driver.findElement(Username_field).sendKeys("Soumya");
	
}

public void User_enter_the_First_name() throws Throwable {
	 utilities.webDriverWait(driver,First_Name );		
		driver.findElement(First_Name).sendKeys("Soumya");
	
}

public void User_enter_the_Last_name() throws Throwable {
	 utilities.webDriverWait(driver,Last_Name );		
		driver.findElement(Last_Name).sendKeys("Sri");
	
}

public void User_enter_the_data_in_Email_field() throws Throwable {
	 utilities.webDriverWait(driver,Email_Address );		
		driver.findElement(Email_Address).sendKeys("Soumya@Calibrage.in");
	
}

public void User_enter_the_data_in_Mobile_number_field() throws Throwable {
	utilities.webDriverWait(driver,Mobile_Number );		
	driver.findElement(Mobile_Number).sendKeys("9878968778");
	
}

public void User_enter_the_data_in_Alternate_Mobile_number_field() throws Throwable {
	 utilities.webDriverWait(driver,Alternate_MobileNumber );		
		driver.findElement(Alternate_MobileNumber).sendKeys("7898780989");
	
}

public void User_enter_the_New_Password() throws Throwable {
	 utilities.webDriverWait(driver,New_Password );		
		driver.findElement(New_Password).sendKeys("Abcd@123");
	
}

public void User_enter_the_Confirm_Password() throws Throwable {
	 utilities.webDriverWait(driver,Confirm_Password );		
		driver.findElement(Confirm_Password).sendKeys("Abcd@123");
	
}

public void User_select_the_Role() throws Throwable {
	driver.findElement(Role_field).click();
//	utilities.MediumWait(driver);
	driver.findElement(Role_field).sendKeys("Sa");
	utilities.MinimumWait(driver);
//	Robot r = new Robot();
//	r.keyPress(KeyEvent.VK_DOWN);
//	Thread.sleep(2000);
//	driver.findElement(Select_Role).click();
//	driver.findElement(Role).click();
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	utilities.MinimumWait(driver);	
}

public void User_Select_the_Reporting_Manager() throws Throwable {
	utilities.webDriverWait(driver,Reporting_Manager );		
	driver.findElement(Reporting_Manager).click();
	driver.findElement(Reporting_Manager).sendKeys("Ra");
	utilities.MinimumWait(driver);
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	utilities.MinimumWait(driver);	
//	driver.findElement(Select_ReportingManager).click();
	
}
String warehouse1 = "Andhra Pradesh (AP01) (SBPL)";
String warehouse2 = "Andhra Pradesh (AP01) (EAPL)";

@SuppressWarnings("unlikely-arg-type")
public void User_Select_the_Warehouse() throws Throwable {
	utilities.webDriverWait(driver,Warehouse );		
	 WebElement dropdownElement = driver.findElement(Warehouse);
	
	 if(!Warehouse_Option1.equals(warehouse1)) {
		 
//		 WebElement dropdownElement = driver.findElement(Warehouse);
		 dropdownElement.click();
		 utilities.MediumWait(driver);
		 WebElement option1 = driver.findElement(Warehouse_Option1);
		 option1.click();
		 dropdownElement.click();
		 
		 
	 }else {
		 WebElement WarehouseElementEAPL = driver.findElement(Warehouse);
		 WarehouseElementEAPL.click();
		 utilities.MinimumWait(driver);
		 WebElement option2 = driver.findElement(Warehouse_Option2);
		 option2.click();
		 
		 WarehouseElementEAPL.click();
	 }
}
public void User_enter_the_SBPL_Slp_code() throws Throwable {
	 utilities.webDriverWait(driver,SBPL_Slp_Code );		
		driver.findElement(SBPL_Slp_Code).sendKeys("1001");	
}
public void User_enter_the_EAPL_Slp_code() throws Throwable {
	 utilities.webDriverWait(driver,EAPL_Slp_Code );		
		driver.findElement(EAPL_Slp_Code).sendKeys("1002");	
}


public void Click_on_the_Save_button() throws Throwable {
	utilities.webDriverWait(driver,Save_button );		
	driver.findElement(Save_button).click();	
	
}

public void Click_on_the_Cancel_button() throws Throwable {
	utilities.webDriverWait(driver,Cancel_button );		
	driver.findElement(Cancel_button).click();
	utilities.MinimumWait(driver);	
	
}

public void Validation_message_should_be_displayed() throws Throwable {
	Boolean isPresent = driver.findElements(Validation_Msg).size()>0;
	if (isPresent) {
	WebElement Data = driver.findElement(Validation_Msg);
	String test = Data.getText(); 
	String expectedData = "Mandatory Fields Are Required With Valid Data.";
	if (expectedData.equals(test)) {
		System.out.println("Display validation msg is correct." + test);
	} else {
		System.out.println("Display validation msg is incorrect."+ test);
	}
}
}

public void User_Click_on_the_Filter_Icon() throws Throwable {
	utilities.webDriverWait(driver,Column_filter_icon );		
	driver.findElement(Column_filter_icon).click();
	utilities.MinimumWait(driver);	
}

public void User_enter_the_data_in_filter_field() throws Throwable {
	utilities.webDriverWait(driver,Column_filter_element );		
	driver.findElement(Column_filter_element).sendKeys("Ramya");
	
}

public void Click_on_the_Apply_button() throws Throwable {
	utilities.webDriverWait(driver,column_filter_apply );		
	driver.findElement(column_filter_apply).click();
	utilities.MinimumWait(driver);	
	
}

public void Click_on_the_Clear_button() throws Throwable {
	driver.findElement(Column_filter_icon).click();
	utilities.webDriverWait(driver,column_filter_clear );		
	driver.findElement(column_filter_clear).click();
	utilities.MinimumWait(driver);	
	driver.findElement(Column_filter_icon).click();
}

public void Verify_whether_the_page_is_navigating_to_the_Update_User_or_not_on_clicking_the_Edit_button() throws Throwable {

	Boolean isPresent = driver.findElements(Edit_Icon).size() > 0;
	if (isPresent) {
	    WebElement editIcon = driver.findElement(Edit_Icon);
	    editIcon.click();
	    
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(Updateform_name));
	    
	    WebElement updateFormNameElement = driver.findElement(Updateform_name);
	    String formName = updateFormNameElement.getText();
	    System.out.println("Form Name: " + formName);
	} else {
	    System.out.println("Edit Icon not found.");
	}

}

public void Update_the_Username() throws Throwable {

	Boolean isPresent = driver.findElements(Username_field).size()>0;
	if (isPresent) {
		utilities.webDriverWait(driver,Username_field );	
	 driver.findElement(Username_field).click();
		driver.findElement(Username_field).clear();	
		driver.findElement(Username_field).sendKeys("SoumyaSri");	
	}
	else {
		System.out.println("Username field is not displayed:");
	}
}
public void Update_the(String Update_Username) throws Throwable {
	Boolean isPresent = driver.findElements(Username_field).size()>0;
	if (isPresent) {
		utilities.webDriverWait(driver,Username_field );	
	    driver.findElement(Username_field).click();
		driver.findElement(Username_field).clear();	
		driver.findElement(Username_field).sendKeys(Update_Username);		
	}
	else {
		System.out.println("Username field is not displayed:");
	}
	
}

public void Update_the_SBPL_Slp_Code() throws Throwable {
	Boolean isPresent = driver.findElements(SBPL_Slp_Code).size()>0;
	if (isPresent) {
	utilities.webDriverWait(driver,SBPL_Slp_Code );		
//	driver.findElement(SBPL_Slp_Code).click();	
	driver.findElement(SBPL_Slp_Code).clear();	
	driver.findElement(SBPL_Slp_Code).sendKeys("118");
		
	}
	else {
		System.out.println("SBPL_Slp_Code field is not displayed:");
	}
}
public void Update_the_EAPL_Slp_Code() throws Throwable {
	Boolean isPresent = driver.findElements(EAPL_Slp_Code).size()>0;
	if (isPresent) {
		utilities.webDriverWait(driver,EAPL_Slp_Code );		
		driver.findElement(EAPL_Slp_Code).click();	
		driver.findElement(EAPL_Slp_Code).clear();	
		driver.findElement(EAPL_Slp_Code).sendKeys("119");	
		}
		else {
			System.out.println("EAPL_Slp_Code field is not displayed:");
		}
}

public void Click_on_the_Submit_button() throws Throwable {
	Boolean isPresent = driver.findElements(Save_button).size()>0;
	if (isPresent) {
	utilities.webDriverWait(driver,Save_button );		
	driver.findElement(Save_button).click();	
	}
	else {
		System.out.println("Submit button is not displayed:");
	}

}

public void The_Update_Successfull_message_is_displayed_or_not() throws Throwable{
	Boolean isPresent = driver.findElements(Update_Message).size()>0;

	utilities.MediumWait(driver); // Assuming this method waits for the appropriate condition

	if (isPresent) {
	    WebElement data = driver.findElement(Update_Message);

	    // Use WebDriverWait for explicit wait
	    WebDriverWait wait = new WebDriverWait(driver, 10); // Maximum wait time of 10 seconds
	    wait.until(ExpectedConditions.visibilityOf(data));

	    String test = data.getText();
	    String expectedData = "User Updated Successfully";

	    if (expectedData.equals(test)) {
	        System.out.println("Display Validation msg is correct: " + test);
	    } else {
	        System.out.println("Display Validation msg is incorrect: " + test);
	    }
	} else {
	    System.out.println("Update message element not found");
	}
}

public void Click_on_the_Delete_icon() throws Throwable {
	
	WebElement buttonElement = driver.findElement(Delete_Icon);
	if (buttonElement.isEnabled()) {
		System.out.println("Button is enabled.");
		driver.findElement(Delete_Icon).click();
		utilities.MediumWait(driver);
		utilities.webDriverWait(driver,Yes_button );		
		driver.findElement(Yes_button).click();	
//		driver.findElement(No).click();

	} else {
		driver.findElement(Edit_Icon).click();
		utilities.MinimumWait(driver);
		driver.findElement(Active).click();
		driver.findElement(Save_button).click();
	}
}

public void Validation_message_is_displayed_or_not() throws Throwable {
	
	Boolean isPresent = !driver.findElements(Delete_validation_msg).isEmpty();

	if (isPresent) {
	    WebElement data = driver.findElement(Delete_validation_msg);

	    WebDriverWait wait = new WebDriverWait(driver, 10); 
	    wait.until(ExpectedConditions.visibilityOf(data));

	    String test = data.getText();
	    String expectedData = "User Deactivate Successfully";

	    if (expectedData.equals(test)) {
	        System.out.println("Display Validation msg is correct: " + test);
	    } else {
	        System.out.println("Display Validation msg is incorrect: " + test);
	    }
	} else {
	    System.out.println("Delete message element not found");
	

	}
}

public void The_Users_screen_should_be_displayed() throws Throwable {
	utilities.webDriverWait(driver, Users);
	WebElement data = driver.findElement(Users);
	String dataText = data.getText();
	System.out.println("Should display the Users Screen name: " + dataText);	
}

public void the_user_selects_the_company() throws Throwable {
	WebElement dropdownElement = driver.findElement(Company_field);
	 dropdownElement.click();
	 WebElement option = driver.findElement(Option1);
	 option.click();
	 dropdownElement.click();
	 Thread.sleep(500); 
    WebElement field = driver.findElement(SBPL_Slp_Code); 
    if (field.isDisplayed()) {
        System.out.println("SBPL Slp Code Field is displayed. Validation successful.");
    } else {
        System.out.println("SBPL Slp Code Field is not displayed. Validation failed.");
    }

    WebElement dropdown1 = driver.findElement(Company_field); 
    dropdown1.click();
    WebElement option1 = driver.findElement(Option2); 
    option1.click();
    WebElement field1 = driver.findElement(EAPL_Slp_Code); 
    if (field1.isDisplayed()) {
        System.out.println("EAPL Slp Code Field is displayed. Validation successful.");
    } else {
        System.out.println("EAPL slp Code Field is not displayed. Validation failed.");
    }

}

public void The_User_enter_the_data_in_the_Search_field() throws Throwable {
	utilities.webDriverWait(driver,Search_field );	
	driver.findElement(Search_field).sendKeys("Ramya");
	utilities.MediumWait(driver);
	
}
public void enterUsername(String Username) throws Throwable {
	WebElement usernameElement = driver.findElement(Username_field);
    usernameElement.sendKeys(Username);
    utilities.MediumWait(driver);
}

public void enterFirstName(String Firstname) throws Throwable {
	WebElement FirstnameElement = driver.findElement(First_Name);
	FirstnameElement.sendKeys(Firstname);
	utilities.MediumWait(driver);
}

public void enterLastName(String Lastname) throws Throwable {
	WebElement LastnameElement  = driver.findElement(Last_Name);
	LastnameElement.sendKeys(Lastname);
	utilities.MediumWait(driver);
}

public void enterEmail(String Email) throws Throwable {
	WebElement EmailElement  = driver.findElement(Email_Address);
	EmailElement.sendKeys(Email);
	utilities.MediumWait(driver);			
}

public void enterMobilenumber(String Mobilenumber) throws Throwable {
	WebElement MobilenumberElement  = driver.findElement(Mobile_Number);
	MobilenumberElement.sendKeys(Mobilenumber);
	utilities.MediumWait(driver);
}

public void enterNewPassword(String NewPassword) throws Throwable {
	WebElement NewPasswordElement  = driver.findElement(New_Password);
	NewPasswordElement.sendKeys(NewPassword);
	utilities.MediumWait(driver);
}

public void enterConfirmPassword(String confirmPassword) throws Throwable {
	WebElement ConfirmElement  = driver.findElement(Confirm_Password);
	ConfirmElement.sendKeys(confirmPassword);
	utilities.MediumWait(driver);
}

public void SelectRole(String Role) throws Throwable {
	WebElement RoleElement  = driver.findElement(Role_field);
	RoleElement.sendKeys(Role);
	utilities.MediumWait(driver);
}

public void enterSBPLSlpcode(String SBPL_Slp_code) throws Throwable {
	
	try {
        // Try to find and interact with the EAPL SLP Code field
        WebElement sbplElement = driver.findElement(SBPL_Slp_Code);
        
        if (sbplElement.isDisplayed()) {
        	sbplElement.sendKeys(SBPL_Slp_code);
            utilities.MediumWait(driver);
            System.out.println("SBPL SLP Code entered.");
        } else {
            System.out.println("SBPL SLP Code field not displayed.");
        }
    } catch (NoSuchElementException | ElementNotVisibleException e) {
        System.out.println("SBPL SLP Code field not found or not visible.");
    } catch (Exception e) {
        System.out.println("An unexpected error occurred: " + e.getMessage());
    }
}

public void enterEAPLSlpcode(String EAPL_Slp_code) throws Throwable {
	utilities.webDriverWait(driver, SBPL_Slp_Code);
    utilities.webDriverWait(driver, EAPL_Slp_Code);
    
    try {
   // 	 WebDriverWait wait = new WebDriverWait(driver, 5); // 10 seconds timeout
         WebElement eaplElement = driver.findElement(EAPL_Slp_Code);

        // Code that may throw an exception
   // 	WebElement eaplElement = driver.findElement(EAPL_Slp_Code);
    	eaplElement.sendKeys(EAPL_Slp_code);
        utilities.MediumWait(driver);
        System.out.println("EAPL SLP Code entered.");
    	
    } catch (Exception e) {
 
    	System.out.println("EAPL SLP Code field not displayed.");
    }
}

public void User_Select_the_Company(String searchTerm) throws Throwable {
//	WebDriverWait wait = new WebDriverWait(driver, 10);
    
    WebElement dropdownElement = driver.findElement(COMPANY);
    dropdownElement.click();
    
    WebElement searchInputElement = driver.findElement(search_field);
    searchInputElement.clear();
    searchInputElement.sendKeys(searchTerm);
    
    WebElement optionElement = driver.findElement(Check_Box);
    optionElement.click();
}

public void User_select_the(String searchWarehouse) throws Throwable {
// WebDriverWait wait = new WebDriverWait(driver, 10);
 
    WebElement dropdownElement = driver.findElement(Warehouse);
    dropdownElement.click();
    utilities.MediumWait(driver);
    WebElement searchInputElement = driver.findElement(search_field);
    searchInputElement.clear();
    searchInputElement.sendKeys(searchWarehouse);
    
    WebElement optionElement = driver.findElement(Check_Box);
    optionElement.click();
    dropdownElement.click();
  
}

public void User_Click_on_the_Expansion_Icon() throws Throwable {
	utilities.webDriverWait(driver, Expansion_Icon);
	driver.findElement(Expansion_Icon).click();
	utilities.MediumWait(driver);
}

public void the_Expansion_grid_header_section_names_are_displayed_or_not() {

	List<WebElement> headers = driver.findElements(Expansion_Grid_header);   
    String expectedData = "Company Name Warehouse Code Warehouse Name Warehouse State Email Address Address |";   
    System.out.println("Expected Header: " + expectedData);
    StringBuilder actualHeaderText = new StringBuilder();    
    for (WebElement header : headers) {
        actualHeaderText.append(header.getText().trim()).append(" | ");
    }
    String actualHeaderString = actualHeaderText.toString().trim();    
    if (expectedData.equals(actualHeaderString)) {
        System.out.println("Display Header names are correct."+ actualHeaderString);
    } else {
        System.out.println("Display Header names are incorrect."+ actualHeaderString);
    }
  }

public void the_Expansion_grid_data_is_displayed_or_not() throws Throwable {
	if(driver.findElements(Expansion_Table).size() > 0) {
	    utilities.MediumWait(driver);
	    WebElement OrderData = driver.findElement(Expansion_Table);
	    List<WebElement> Column1 = OrderData.findElements(By.tagName("tr"));
	    int Irowcount = Column1.size();
        int Idatarowcount = Irowcount;
        System.out.println("No. of data columns in the grid : " + Idatarowcount);
//    String OrderDataText1 = OrderData.getText();
//	    System.out.println("Display Data in the grid: " + OrderDataText1);
	    utilities.MediumWait(driver);
	    for (WebElement Column : Column1) {
    	    String ColumnText = Column.getText();
    	    System.out.println("Column: " + ColumnText);  	     
	    }		    
	    utilities.MediumWait(driver);
     }
	
  }

public void the_Search_related_data_is_displayed_in_the_main_grid() throws Throwable {
	if(driver.findElements(Table).size() > 0) {
	    utilities.MediumWait(driver);
	    WebElement OrderData = driver.findElement(Table);
	    String OrderDataText1 = OrderData.getText();
//	    System.out.println("Display Data in the grid: " + OrderDataText1);
	    utilities.MediumWait(driver);
	    String[] rows = OrderDataText1.split("\n");
	    for (String row : rows) {
	        System.out.println(row);
	     
	    }		    
	    utilities.MediumWait(driver);
}
	
}

	
}

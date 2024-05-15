package Pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.DriverFactory;
import util.Utilities;

public class Roles_Pages extends DriverFactory{
	private static final Object SuperAdmin = null;

	Utilities utilities = new Utilities();

    By Roles                = By.xpath("(//span[text()='Roles'])[1]");
    By Save_button          = By.xpath("//button[@type='submit']/..//button[text()='Save']");
    By Name_field           = By.xpath("//input[@formcontrolname='name']");
    By Reporting_manager    = By.xpath("//select[@formcontrolname='parentRoleId']");
    By Description          = By.xpath("//textarea[@formcontrolname='description']");
    By Web_Accesstype       = By.xpath("//input[@id='webAccess']");
    By Mobile_Accesstype    = By.xpath("//input[@id='mobileAccess']");
    By Cancel_button        = By.xpath("//button[text()=' Cancel']");
    By Roles_list           = By.xpath("//h4[text()='Roles List']");
    //Users
    By Users_SelectAll      = By.xpath("//input[@id='usersSelectAll-Users']");
    By View_Users           = By.xpath("//input[@id='custom-CanViewUsers']");
    By ADD_Update_Users     = By.xpath("//input[@id='custom-CanManageUsers']");
    By Delete_Users         = By.xpath("//input[@id='custom-CanDeleteUsers']");
    By All_Dealers          = By.xpath("//label[text()=' Can Access All Dealers ']");
    //Roles
    By Roles_SelectAll      = By.xpath("//input[@id='usersSelectAll-Roles']");
    By View_Roles           = By.xpath("//input[@id='custom-CanViewRoles']");
    By ADD_Update_Roles     = By.xpath("//input[@id='custom-CanManageRoles']");
    By Delete_Roles         = By.xpath("//input[@id='custom-CanDeleteRoles']");
    //Confirm Orders
    By Confirm_SelectAll    = By.xpath("//input[@id='usersSelectAll-Confirm Order']");
    By View_Order           = By.xpath("//input[@id='custom-CanViewOrder']");
    By Create_Order         = By.xpath("//input[@id='custom-CanCreateOrder']");
    By Cancel_Order         = By.xpath("//input[@id='custom-CanCancelOrder']");
    By Sale_Approve_Reject  = By.xpath("//input[@id='custom-CanSHApprovalRejectOrder']");
    By HO_Accept_Reject     = By.xpath("//input[@id='custom-CanAcceptRejectOrder']");
    By Receive_Order        = By.xpath("//input[@id='custom-CanReceiveOrder']");
    By Change_Warehouse     = By.xpath("//input[@id='custom-CanChangeWarehouse']");
    // View Collection
    By Collection_SelectAll = By.xpath("//input[@id='usersSelectAll-View Collection']");
    By View_Collection      = By.xpath("//input[@id='custom-CanViewCollection']");
    By Create_Collection    = By.xpath("//input[@id='custom-CanCreateCollection']");
    By Accept_reject_Coll   = By.xpath("//input[@id='custom-CanAcceptRejectCollection']");
    // View return Orders
    By Return_SelectAll     = By.xpath("//input[@id='usersSelectAll-View Return Order']");
    By View_return          = By.xpath("//input[@id='custom-CanViewReturnOrder']");
    By Create_Return        = By.xpath("//input[@id='custom-CanCreateReturnOrder']");
    By Accept_reject_Return = By.xpath("//input[@id='custom-CanAcceptRejectReturnOrder']");
    By Create_Credit        = By.xpath("//input[@id='custom-CreateCreditNote']");
    By Delete_credit        = By.xpath("//input[@id='custom-DeleteCreditNote']");
    By Upload_return        = By.xpath("//input[@id='custom-CanUploadRetunOrderfiles']");
    By Change_Warehouse_Return  = By.xpath("//input[@id='custom-CanReturnOrderChangeWarehouse']");
    // Item Master
    By Item_SelectAll      = By.xpath("//input[@id='usersSelectAll-Item Master']");
    By View_Item_Master    = By.xpath("//input[@id='custom-CanViewProductMaster']");
    By Add_Update_Item     = By.xpath("//input[@id='custom-CanAddUpdateProductMaster']");
    By Delete_Item         = By.xpath("//input[@id='custom-CanDeleteProductMaster']");
    // Banners
    By Banners_SelectAll  = By.xpath("//input[@id='usersSelectAll-Banners']");
    By View_Banners       = By.xpath("//input[@id='custom-CanViewBanner']");
    By Add_Banners        = By.xpath("//input[@id='custom-CanAddBanner']");
    By Delete_Banners     = By.xpath("//input[@id='custom-CanDeleteBanner']");
    
    By Name_Filter        = By.xpath("(//p-table/div/div/table/thead/tr/th/p-columnfilter)[1]");
    By Column_field       = By.xpath("//p-columnfilterformelement/input[@type='text']");
    By Filter_Apply       = By.xpath("//span[text()='Apply']");
    By Filter_Clear       = By.xpath("//span[text()='Clear']");	
    By Delete_Validation  = By.xpath("//h2[text()='Role Deactivate Successfully']");
    By Edit_button        = By.xpath("//button[@title='Edit']");
    By Update_Role        = By.xpath("//h4[text()='Update Role']");
    By Update_button      = By.xpath("//button[text()='Update']");
    By CheckBoxes         = By.xpath("(//div[@class='card-body'])[2]//input[@type='checkbox']");
    By Req_Permission     = By.xpath("//h2[text()='Atleast one permission is required']");
    
    By table_grid   = By.xpath("//tbody[@class='p-element p-datatable-tbody']");   
    By Super_Admin        = By.xpath("(//span[text()=' SuperAdmin'])[1]");
    By Sales_manager      = By.xpath("(//span[text()=' Sales Manager'])[2]");
    By Sales_head         = By.xpath("(//span[text()=' Sales Head'])[1]");
    By Sales_Person       = By.xpath("(//span[text()=' Sales Person'])[1]");
 
	public void User_Click_on_the_Roles_screen() throws Throwable {
		 utilities.webDriverWait(driver,Roles );		
			driver.findElement(Roles).click();
			utilities.MediumWait(driver);
	}

	public void User_Click_on_the_Save_button() throws Throwable {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1766)", "");
		
		utilities.webDriverWait(driver,Save_button);		
		driver.findElement(Save_button).click();
		utilities.MediumWait(driver);
		
	}

	public void User_enter_the_data_in_Name_field() throws Throwable {
		utilities.webDriverWait(driver,Name_field );	
		driver.findElement(Name_field).sendKeys("Super Admin");
		utilities.MediumWait(driver);
	}
	public void User_Select_the_Reporting_manager() throws Throwable {
		driver.findElement(Reporting_manager).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}

	public void User_enter_the_Description() throws Throwable {
		utilities.webDriverWait(driver,Description );	
		driver.findElement(Description).sendKeys("Sales Person");
		utilities.MediumWait(driver);
		
	}

	public void User_Select_the_Web_Access_type_toggle() throws Throwable {
		utilities.webDriverWait(driver,Web_Accesstype);		
		driver.findElement(Web_Accesstype).click();
		utilities.MediumWait(driver);	
	}

	public void User_Select_the_Mobile_Access_type_toggle() throws Throwable {
		utilities.webDriverWait(driver,Mobile_Accesstype);		
		driver.findElement(Mobile_Accesstype).click();
		utilities.MediumWait(driver);	
	}
	
	public void the_User_Select_the_Users_screen_Select_All_check_box() throws Throwable {
		utilities.webDriverWait(driver,Users_SelectAll);		
		driver.findElement(Users_SelectAll).click();
		utilities.MediumWait(driver);		
	}

	public void The_User_Select_the_Users_Section_Role_permissions() throws Throwable {
		driver.findElement(Users_SelectAll).click();
		
		utilities.webDriverWait(driver,View_Users);		
		driver.findElement(View_Users).click();
		
		utilities.webDriverWait(driver,ADD_Update_Users);		
		driver.findElement(ADD_Update_Users).click();
		
		utilities.webDriverWait(driver,Delete_Users);		
		driver.findElement(Delete_Users).click();
		
		utilities.webDriverWait(driver,All_Dealers);		
		driver.findElement(All_Dealers).click();
		 	 
		
	}

	public void the_User_Select_the_Roles_screen_Select_All_check_box() throws Throwable {
		utilities.webDriverWait(driver,Roles_SelectAll);		
		driver.findElement(Roles_SelectAll).click();
	}

	public void the_User_Select_the_Roles_screen_permissions() throws Throwable {
		driver.findElement(Roles_SelectAll).click();
		
		utilities.webDriverWait(driver,View_Roles);			
		driver.findElement(View_Roles).click();
		
		utilities.webDriverWait(driver,ADD_Update_Roles);
		driver.findElement(ADD_Update_Roles).click();
		
		utilities.webDriverWait(driver,Delete_Roles);	
		driver.findElement(Delete_Roles).click();
	}
	

	public void the_User_Select_the_Item_Master_screen_Select_All_check_box() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");
		utilities.webDriverWait(driver,Item_SelectAll);		
		driver.findElement(Item_SelectAll).click();
		
	}

	public void the_User_selects_the_Item_Master_section_Role_Permissions() throws Throwable {
		driver.findElement(Item_SelectAll).click();
		
		utilities.webDriverWait(driver,View_Item_Master);		
		driver.findElement(View_Item_Master).click();
		
		utilities.webDriverWait(driver,Add_Update_Item);		
		driver.findElement(Add_Update_Item).click();
		
		utilities.webDriverWait(driver,Delete_Item);		
		driver.findElement(Delete_Item).click();
		
	}

	public void the_User_Select_the_Banners_screen_Select_All_check_box() throws Throwable {
		utilities.webDriverWait(driver,Banners_SelectAll);		
		driver.findElement(Banners_SelectAll).click();
	}

	public void the_User_Select_the_banners_section_Role_Permissions() throws Throwable {
		driver.findElement(Banners_SelectAll).click();
		
		utilities.webDriverWait(driver,View_Banners);		
		driver.findElement(View_Banners).click();
		
		utilities.webDriverWait(driver,Add_Banners);		
		driver.findElement(Add_Banners).click();
		
		utilities.webDriverWait(driver,Delete_Banners);		
		driver.findElement(Delete_Banners).click();
	}

	public void the_User_Select_the_Confirm_Orders_screen_Select_All_check_box() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		utilities.webDriverWait(driver,Confirm_SelectAll);		
		driver.findElement(Confirm_SelectAll).click();
	}

	public void the_User_Select_the_Confirm_Orders_section_role_Permissions() throws Throwable {
	
		driver.findElement(Confirm_SelectAll).click();
		utilities.webDriverWait(driver,View_Order);		
		driver.findElement(View_Order).click();
		
		utilities.webDriverWait(driver,Create_Order);		
		driver.findElement(Create_Order).click();
		
		utilities.webDriverWait(driver,Cancel_Order);		
		driver.findElement(Cancel_Order).click();
		
		utilities.webDriverWait(driver,Sale_Approve_Reject);		
		driver.findElement(Sale_Approve_Reject).click();
		
		utilities.webDriverWait(driver,HO_Accept_Reject);		
		driver.findElement(HO_Accept_Reject).click();
		utilities.MediumWait(driver);
		
		utilities.webDriverWait(driver,Receive_Order);		
		driver.findElement(Receive_Order).click();
		utilities.MediumWait(driver);	
		
		utilities.webDriverWait(driver,Change_Warehouse);		
		driver.findElement(Change_Warehouse).click();
		utilities.MediumWait(driver);
		
	}

	public void the_User_Select_the_View_Collection_screen_Select_All_check_box() throws Throwable {
		utilities.webDriverWait(driver,Collection_SelectAll);		
		driver.findElement(Collection_SelectAll).click();
		utilities.MediumWait(driver);		
		
	}

	public void the_User_Select_the_View_Collection_Section_role_Permissions() throws Throwable {
		driver.findElement(Collection_SelectAll).click();
		
		utilities.webDriverWait(driver,View_Collection);		
		driver.findElement(View_Collection).click();
		
		utilities.webDriverWait(driver,Create_Collection);		
		driver.findElement(Create_Collection).click();
		
		utilities.webDriverWait(driver,Accept_reject_Coll);		
		driver.findElement(Accept_reject_Coll).click();
				
	}

	public void the_User_Select_the_View_return_order_screen_Select_All_check_box() throws Throwable {
		utilities.webDriverWait(driver,Return_SelectAll);		
		driver.findElement(Return_SelectAll).click();
		
	}

	public void the_User_Select_the_View_Return_Order_Section_Role_Permissions() throws Throwable {
		driver.findElement(Return_SelectAll).click();

		utilities.webDriverWait(driver,View_return);		
		driver.findElement(View_return).click();
		
		utilities.webDriverWait(driver,Create_Return);		
		driver.findElement(Create_Return).click();
		
		utilities.webDriverWait(driver,Accept_reject_Return);		
		driver.findElement(Accept_reject_Return).click();
		
		utilities.webDriverWait(driver,Create_Credit);		
		driver.findElement(Create_Credit).click();
		
		utilities.webDriverWait(driver,Delete_credit);		
		driver.findElement(Delete_credit).click();
		
		utilities.webDriverWait(driver,Upload_return);		
		driver.findElement(Upload_return).click();
		
		utilities.webDriverWait(driver,Change_Warehouse_Return);		
		driver.findElement(Change_Warehouse_Return).click();
		
	}


	public void User_click_on_the_Filter_Icon() throws Throwable {
		utilities.webDriverWait(driver,Name_Filter );		
		driver.findElement(Name_Filter).click();
		
	}

	public void User_enter_the_data_in_the_filter_field() throws Throwable {
		utilities.webDriverWait(driver,Column_field );		
		driver.findElement(Column_field).sendKeys("Sales Person");
		
	}

	public void User_Click_on_the_Apply_button() throws Throwable {
		utilities.webDriverWait(driver,Filter_Apply );		
		driver.findElement(Filter_Apply).click();
		utilities.MinimumWait(driver);	
	}

	public void User_Click_on_the_Clear_button() throws Throwable {
		driver.findElement(Name_Filter).click();
		
		utilities.webDriverWait(driver,Filter_Clear );		
		driver.findElement(Filter_Clear).click();
		utilities.MinimumWait(driver);	
		
		driver.findElement(Name_Filter).click();
		
	}

	public void User_Click_on_the_Cancel_button() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1766)", "");
		utilities.webDriverWait(driver,Cancel_button );		
		driver.findElement(Cancel_button).click();
		
	}

	public void Verify_whether_the_page_is_navigated_to_the_Roles_List_or_not() throws Throwable {
		utilities.webDriverWait(driver, Roles_list);
		Boolean isPresent = driver.findElements(Roles_list).size()>0;
		if (isPresent) {
			WebElement Data = driver.findElement(Roles_list);
			String test = Data.getText(); 
			String expectedData = "Roles List";
			if (expectedData.equals(test)) {
				System.out.println("Display Dashboard Module name is correct." + test);
			} else {
				System.out.println("Display Dashboard Module name is incorrect."+ test);
			}
		
	}
	}

	public void Validation_Message_is_displayed_or_not() {
		Boolean isPresent = !driver.findElements(Delete_Validation).isEmpty();

		if (isPresent) {
		    WebElement data = driver.findElement(Delete_Validation);

		    WebDriverWait wait = new WebDriverWait(driver, 10); 
		    wait.until(ExpectedConditions.visibilityOf(data));

		    String test = data.getText();
		    String expectedData = "Role Deactivate Successfully";

		    if (expectedData.equals(test)) {
		        System.out.println("Display Validation msg is correct: " + test);
		    } else {
		        System.out.println("Display Validation msg is incorrect: " + test);
		    }
		} else {
		    System.out.println("Delete message element not found");
		}
		
	}

	public void Verify_whether_the_page_is_navigating_to_the_Update_Role_or_not_on_clicking_the_Edit_button() throws Throwable {
		utilities.webDriverWait(driver,Edit_button );		
		driver.findElement(Edit_button).click();
		utilities.webDriverWait(driver, Update_Role);
		Boolean isPresent = driver.findElements(Update_Role).size()>0;
		if (isPresent) {
			WebElement Data = driver.findElement(Update_Role);
			String test = Data.getText(); 
			String expectedData = "Update Role";
			if (expectedData.equals(test)) {
				System.out.println("Display Form name is correct." + test);
			} else {
				System.out.println("Display Form name is incorrect."+ test);
			}
		}
		
	}

	public void Update_the_Reporting_manager() throws Throwable {
		driver.findElement(Reporting_manager).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
	}

	public void User_Click_on_the_Update_button() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1766)", "");
		
		utilities.webDriverWait(driver,Update_button);		
		driver.findElement(Update_button).click();
		utilities.MediumWait(driver);		
	}

	public void Validation_message_should_be_displayed_without_select_the_permissions() throws Throwable {

		driver.findElement(Req_Permission).click();
		utilities.webDriverWait(driver, Req_Permission);
		Boolean isPresent = driver.findElements(Req_Permission).size()>0;
		if (isPresent) {
			WebElement Data = driver.findElement(Req_Permission);
			String test = Data.getText(); 
			String expectedData = "Atleast one permission is required";
			if (expectedData.equals(test)) {
				System.out.println("Display validation msg is correct." + test);
			} else {
				System.out.println("Display validation msg is incorrect."+ test);
			}
			utilities.MediumWait(driver);
	}

	}

public void The_Added_Super_Amin_Role_should_be_displayed_in_the_roles_list() throws Throwable {

	utilities.webDriverWait(driver, table_grid);
	Boolean isPresent = driver.findElements(table_grid).size()>0;
	if (isPresent) {
		WebElement Data = driver.findElement(Super_Admin);
		String test = Data.getText(); 
		String expectedData = "SuperAdmin";
		if (expectedData.equals(test)) {
			System.out.println("SuperAdmin is displayed in the roles list." + test);
		} else {
			System.out.println("SuperAdmin is not displayed in the roles list."+ test);
		}
	}
}

public void User_Select_the_Sale_Head_approved_or_Reject_permission() throws Throwable {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,500)", "");
	utilities.webDriverWait(driver,Sale_Approve_Reject);		
	driver.findElement(Sale_Approve_Reject).click();
	
}

public void User_Add_the_Activity_rights_for_Create_Orders_and_View_Orders() throws Throwable {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,500)", "");
	utilities.webDriverWait(driver,View_Order);		
	driver.findElement(View_Order).click();
	
	utilities.webDriverWait(driver,Create_Order);		
	driver.findElement(Create_Order).click();
		
}

public void User_Add_the_Activity_rights_for_Create_Collections_and_View_Collections() throws Throwable {
	utilities.webDriverWait(driver,View_Collection);		
	driver.findElement(View_Collection).click();
	
	utilities.webDriverWait(driver,Create_Collection);		
	driver.findElement(Create_Collection).click();
	
}

public void User_Add_the_Activity_rights_for_Create_Return_Orders_and_View_Return_Orders() throws Throwable {
	utilities.webDriverWait(driver,View_return);		
	driver.findElement(View_return).click();
	
	utilities.webDriverWait(driver,Create_Return);		
	driver.findElement(Create_Return).click();
	
}

public void The_User_enter_the_data_in_Name_field() throws Throwable {
	utilities.webDriverWait(driver,Name_field );	
	driver.findElement(Name_field).sendKeys("Sales Manager");
	utilities.MediumWait(driver);
	
}

public void The_User_enter_the_data_in_the_Name_field() throws Throwable {
	utilities.webDriverWait(driver,Name_field );	
	driver.findElement(Name_field).sendKeys("Sales Head");
	utilities.MediumWait(driver);
}

public void User_enter_the_data_in_the_Name_field() throws Throwable {
	utilities.webDriverWait(driver,Name_field );	
	driver.findElement(Name_field).sendKeys("Sales Person");
	utilities.MediumWait(driver);
	
}

public void The_Added_Sales_Manager_Role_should_be_displayed_in_the_roles_list() throws Throwable {
	utilities.webDriverWait(driver, table_grid);
	Boolean isPresent = driver.findElements(table_grid).size()>0;
	if (isPresent) {
		WebElement Data = driver.findElement(Sales_manager);
		String test = Data.getText(); 
		String expectedData = "Sales Manager";
		if (expectedData.equals(test)) {
			System.out.println("Sales Manager is displayed in the roles list." + test);
		} else {
			System.out.println("Sales Manager is not displayed in the roles list."+ test);
		}
	}
	
}

public void The_Added_Sales_Head_Role_should_be_displayed_in_the_roles_list() throws Throwable {
	utilities.webDriverWait(driver, table_grid);
	Boolean isPresent = driver.findElements(table_grid).size()>0;
	if (isPresent) {
		WebElement Data = driver.findElement(Sales_head);
		String test = Data.getText(); 
		String expectedData = "Sales Head";
		if (expectedData.equals(test)) {
			System.out.println("Sales Head is displayed in the roles list." + test);
		} else {
			System.out.println("Sales Head is not displayed in the roles list."+ test);
		}
	}
	
}

public void The_Added_Sales_Person_Role_should_be_displayed_in_the_roles_list() throws Throwable {
	utilities.webDriverWait(driver, table_grid);
	Boolean isPresent = driver.findElements(table_grid).size()>0;
	if (isPresent) {
		WebElement Data = driver.findElement(Sales_Person);
		String test = Data.getText(); 
		String expectedData = "Sales Person";
		if (expectedData.equals(test)) {
			System.out.println("Sales Person is displayed in the roles list." + test);
		} else {
			System.out.println("Sales Person is not displayed in the roles list."+ test);
		}
	}
	
}

}

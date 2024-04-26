package Pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.DriverFactory;
import util.Utilities;

public class Roles_Pages extends DriverFactory{
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
		driver.findElement(Name_field).sendKeys("Sales Person");
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
	
	public void User_Select_the_Users_screen_Select_All_check_box() throws Throwable {
		utilities.webDriverWait(driver,Users_SelectAll);		
		driver.findElement(Users_SelectAll).click();
		utilities.MediumWait(driver);		
	}

	public void User_Select_the_View_User_Check_box() throws Throwable {
		utilities.webDriverWait(driver,View_Users);		
		driver.findElement(View_Users).click();

	}

	public void User_Select_the_Add_and_Update_User_Check_box() throws Throwable {
		utilities.webDriverWait(driver,ADD_Update_Users);		
		driver.findElement(ADD_Update_Users).click();
	}

	public void User_Select_the_Delete_User_Check_box() throws Throwable {
		utilities.webDriverWait(driver,Delete_Users);		
		driver.findElement(Delete_Users).click();
	}

	public void User_Select_the_Roles_screen_Select_All_check_box() throws Throwable {
		utilities.webDriverWait(driver,Roles_SelectAll);		
		driver.findElement(Roles_SelectAll).click();
	}

	public void User_Select_the_View_Roles_Check_box() throws Throwable {
		utilities.webDriverWait(driver,View_Roles);		
		driver.findElement(View_Roles).click();
	}
	public void User_Select_the_Add_and_Update_Roles_Check_box() throws Throwable {
		utilities.webDriverWait(driver,ADD_Update_Roles);		
		driver.findElement(ADD_Update_Roles).click();
	}

	public void User_Select_the_Delete_Roles_Check_box() throws Throwable {
		utilities.webDriverWait(driver,Delete_Roles);		
		driver.findElement(Delete_Roles).click();
		
	}

	public void User_Select_the_Item_Master_screen_Select_All_check_box() throws Throwable {
		utilities.webDriverWait(driver,Item_SelectAll);		
		driver.findElement(Item_SelectAll).click();
		
	}

	public void User_Select_the_View_Item_Master_Check_box() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");
		utilities.webDriverWait(driver,View_Item_Master);		
		driver.findElement(View_Item_Master).click();
		
	}

	public void User_Select_the_Add_and_Update_Item_Master_Check_box() throws Throwable {
		utilities.webDriverWait(driver,Add_Update_Item);		
		driver.findElement(Add_Update_Item).click();
	}

	public void User_Select_the_Delete_Item_Master_Check_box() throws Throwable {
		utilities.webDriverWait(driver,Delete_Item);		
		driver.findElement(Delete_Item).click();
	}

	public void User_Select_the_Banners_screen_Select_All_check_box() throws Throwable {
		utilities.webDriverWait(driver,Banners_SelectAll);		
		driver.findElement(Banners_SelectAll).click();
	}

	public void User_Select_the_View_Banners_Check_box() throws Throwable {
		utilities.webDriverWait(driver,View_Banners);		
		driver.findElement(View_Banners).click();
	}

	public void User_Select_the_Add_Banners_Check_box() throws Throwable {
		utilities.webDriverWait(driver,Add_Banners);		
		driver.findElement(Add_Banners).click();
	}

	public void User_Select_the_Delete_Banners_Check_box() throws Throwable {
		utilities.webDriverWait(driver,Delete_Banners);		
		driver.findElement(Delete_Banners).click();
	}

	public void User_Select_the_Confirm_Orders_screen_Select_All_check_box() throws Throwable {
		utilities.webDriverWait(driver,Confirm_SelectAll);		
		driver.findElement(Confirm_SelectAll).click();
	}

	public void User_Select_the_View_Orders() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		utilities.webDriverWait(driver,View_Order);		
		driver.findElement(View_Order).click();
		
	}

	public void User_Select_the_Create_orders() throws Throwable {
		utilities.webDriverWait(driver,Create_Order);		
		driver.findElement(Create_Order).click();
		
	}

	public void User_Select_the_Cancel_Orders() throws Throwable {
		utilities.webDriverWait(driver,Cancel_Order);		
		driver.findElement(Cancel_Order).click();
		
	}

	public void User_Select_the_Sale_Head_Approval_and_Reject_Order() throws Throwable {
		utilities.webDriverWait(driver,Sale_Approve_Reject);		
		driver.findElement(Sale_Approve_Reject).click();
		
	}

	public void User_Select_the_HO_Accept_and_Reject_Order() throws Throwable {
		utilities.webDriverWait(driver,HO_Accept_Reject);		
		driver.findElement(HO_Accept_Reject).click();
		utilities.MediumWait(driver);		
		
	}

	public void User_Select_the_Receive_Order() throws Throwable {
		utilities.webDriverWait(driver,Receive_Order);		
		driver.findElement(Receive_Order).click();
		utilities.MediumWait(driver);		
		
	}

	public void User_Select_the_Change_Warehouse() throws Throwable {
		utilities.webDriverWait(driver,Change_Warehouse);		
		driver.findElement(Change_Warehouse).click();
		utilities.MediumWait(driver);		
		
	}
	public void User_Select_the_View_Collection_screen_Select_All_check_box() throws Throwable {
		utilities.webDriverWait(driver,Collection_SelectAll);		
		driver.findElement(Collection_SelectAll).click();
		utilities.MediumWait(driver);		
		
	}

	public void User_Select_the_View_Collection_Check_box() throws Throwable {
		utilities.webDriverWait(driver,View_Collection);		
		driver.findElement(View_Collection).click();
		utilities.MediumWait(driver);		
		
	}

	public void User_Select_the_Create_Collection_Check_box() throws Throwable {
		utilities.webDriverWait(driver,Create_Collection);		
		driver.findElement(Create_Collection).click();
		utilities.MediumWait(driver);		
		
	}

	public void User_Select_the_Accept_and_Reject_Collection_Check_box() throws Throwable {
		utilities.webDriverWait(driver,Accept_reject_Coll);		
		driver.findElement(Accept_reject_Coll).click();
		utilities.MediumWait(driver);		
		
	}

	public void User_Select_the_View_return_order_screen_Select_All_check_box() throws Throwable {
		utilities.webDriverWait(driver,Return_SelectAll);		
		driver.findElement(Return_SelectAll).click();
		
	}

	public void User_Select_the_View_Return_Order() throws Throwable {
		utilities.webDriverWait(driver,View_return);		
		driver.findElement(View_return).click();
		
	}

	public void User_Select_the_Create_Return_Order() throws Throwable {
		utilities.webDriverWait(driver,Create_Return);		
		driver.findElement(Create_Return).click();
		
	}

	public void User_Select_the_Accept_and_Reject_Return_Order() throws Throwable {
		utilities.webDriverWait(driver,Accept_reject_Return);		
		driver.findElement(Accept_reject_Return).click();
		
	}

	public void User_Select_the_Create_Credit_Note() throws Throwable {
		utilities.webDriverWait(driver,Create_Credit);		
		driver.findElement(Create_Credit).click();
		
	}

	public void User_Select_the_Delete_Credit_Note() throws Throwable {
		utilities.webDriverWait(driver,Delete_credit);		
		driver.findElement(Delete_credit).click();
		
	}

	public void User_Select_the_Upload_Return_Attachments() throws Throwable {
		utilities.webDriverWait(driver,Upload_return);		
		driver.findElement(Upload_return).click();
		
	}

	public void The_User_Select_the_Change_Warehouse() throws Throwable {
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
}

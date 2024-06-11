package Pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class SBPL_View_Return_Order_Pages extends DriverFactory{
	
	Utilities utilities= new Utilities();
	
	By View_return_Order        = By.xpath("(//span[text()='View Return Order'])[1]");
	By View_Return_Order_Screen = By.xpath("//div[@class='d-flex justify-content-between align-items-center w-100']");
	By From_Date                = By.xpath("//input[@formcontrolname='fromDate']");
	By Order_details_Col        = By.xpath("(//td)[2]");
	By Party_details            = By.xpath("(//td)[3]");
	By LR_details               = By.xpath("(//td)[4]");
	By Status_Column            = By.xpath("(//td)[5]");
	By Data                     = By.xpath("(//button[@class='p-element p-button-text p-button-rounded p-button-plain p-button p-component p-button-icon-only'])[1]");
	By Text                     = By.xpath("//td[text()='No Data Found.']");
	By Item_Name1               = By.xpath("((//tr[@class='ng-star-inserted'])[4]//th)[2]");
	By Category                 = By.xpath("((//tr[@class='ng-star-inserted'])[4]//th)[3]");
	By Quantity1	            = By.xpath("((//tr[@class='ng-star-inserted'])[4]//th)[4]");
	By Par_Quantity             = By.xpath("((//tr[@class='ng-star-inserted'])[4]//th)[5]");
	By Remarks1                 = By.xpath("((//tr[@class='ng-star-inserted'])[4]//th)[6]");
	By Status1                  = By.xpath("((//tr[@class='ng-star-inserted'])[4]//th)[7]");
	By Price1                   = By.xpath("((//tr[@class='ng-star-inserted'])[4]//th)[8]");
	
//Expansion grid	
	By Item_Name                = By.xpath("((//tr[@class='ng-star-inserted'])[5]//td)[2]");      
	By Category_Names           = By.xpath("((//tr[@class='ng-star-inserted'])[5]//td)[3]");      
	By Quantity                 = By.xpath("((//tr[@class='ng-star-inserted'])[5]//td)[4]");      
	By Partial_Quantity         = By.xpath("((//tr[@class='ng-star-inserted'])[5]//td)[5]"); 
	By Remarks                  = By.xpath("((//tr[@class='ng-star-inserted'])[5]//td)[6]"); 
	By Status                   = By.xpath("((//tr[@class='ng-star-inserted'])[5]//td)[7]"); 
	By Price                    = By.xpath("((//tr[@class='ng-star-inserted'])[5]//td)[8]"); 
//Partial Received	
	By Item_Checkbox            = By.xpath("//div[@class='p-checkbox-box p-component']");
	By Partial_received_Icon    = By.xpath("//button[@title='Partial Received']");
	By partial_Rec_Page         = By.xpath("//h1[text()='Partially Received']");
	By Partial_Qty              = By.xpath("//input[@placeholder='Enter Partial Qty']");
	By par_Remarks              = By.xpath("(//textarea[@placeholder='Enter Remarks'])[1]");
	By partial_Save_button      = By.xpath("(//button[@class='btn btn-primary'])[1]");
	By Par_Close_button         = By.xpath("(//button[@class='btn btn-danger'])[2]");
	By par_close_Icon           = By.xpath("(//button[@class='btn-close'])[1]");
	By Validation_message       = By.xpath("//h2[text()='Mandatory Fields Are Required With  Valid Data.']");
	By Partial_Success_Vali     = By.xpath("//h2[text()='Item Partially Received Successfully']");
	By partial_Qty_vali         = By.xpath("//h2[text()='Partial Qty Should Not be More Than The Original Qty']");
	
//Reject details
	By Reject_icon              = By.xpath("//button[@title='Reject']");
	By Reject_icon2             = By.xpath("(//button[@title='Reject'])[2]");
	By Reject_details_Page      = By.xpath("//h1[text()='Reject Details']");
	By Reject_remarks_field     = By.xpath("(//textarea[@placeholder='Enter Remarks'])[1]");
	By Remarks_Validation_msg   = By.xpath("//h2[text()='Remarks Field is Required']");
	By Reject_Success_Vali      = By.xpath("//h2[text()='Item Not Received Successfully']");
//Received details	
	By Received_button          = By.xpath("//button[@title='Received']");
	By Received_details         = By.xpath("//h1[text()='Received Details']");
	By Received_Remarks         = By.xpath("(//textarea[@placeholder='Enter Remarks'])[2]");
	By Received_Save_Button     = By.xpath("(//button[@class='btn btn-primary'])[2]");
	By Received_Close_Button    = By.xpath("(//button[@class='btn btn-danger'])[3]");
	By Received_Close_Icon      = By.xpath("(//button[@class='btn-close'])[2]");
	By Partial                  = By.xpath("(//button[@title='Partial Received'])[2]");
	By Received_validation      = By.xpath("//h2[text()='Item Received Successfully']");
//Add Credit notes 
	By Filter_Status            = By.xpath("//select[@formcontrolname='statusId']");
	By Credit_Note_Icon         = By.xpath("(//button[@title='Credit Note'])[1]");
	By Credit_Note_List_Page    = By.xpath("//div[text()='Credit Note List']");
	By CreditPage_Party_details = By.xpath("(//h5[text()='Party Details'])[1]");
	By Credit_note_Add_button   = By.xpath("//button[@title='Add']");
	By Add_Credit_Note_Page     = By.xpath("//h1[text()='Add Credit Note']");
	By Credit_date              = By.xpath("//input[@formcontrolname='creditedDate']");
	By Credit_remarks           = By.xpath("//textarea[@formcontrolname='remarks']");
	By Credit_attachment        = By.xpath("(//label[@class='btn-browse'])[1]");
	By Save_button              = By.xpath("(//button[@type='submit'])[1]");
	By Close_Button             = By.xpath("(//button[text()=' Close'])[3]");
	By Close_Icon               = By.xpath("(//button[@class='btn-close'])[3]");
	By Toaster_message          = By.xpath("//h2[text()='Mandatory Fields Are Required With  Valid Data.']");
	By Attachment_validation    = By.xpath("//h2[text()='Attachment is Required']");
	By Save_Validation          = By.xpath("//h2[text()='Credit Note Created Successfully']");
	
	By Table                    = By.xpath("//tbody[@class='p-element p-datatable-tbody']");
	By To_Date                  = By.xpath("//input[@formcontrolname='toDate']");
	By Search                   = By.xpath("//button[@class='btn btn-secondary me-2']");
	

	public void User_click_on_the_View_Return_Order_under_the_Orders_Module() throws Throwable {
		utilities.webDriverWait(driver,View_return_Order );	
		driver.findElement(View_return_Order).click();
		utilities.MinimumWait(driver);
	}

	public void The_View_Return_Order_Screen_is_displayed_or_not() {
		WebElement Order = driver.findElement(View_Return_Order_Screen);
		String expectedOrder = "View Return Order";
		String actualOrder = Order.getText().trim();
		if (actualOrder.equals(expectedOrder)) {
		    System.out.println("The View Return Order screen is displayed: " + actualOrder);
		} else {
		    System.out.println("The View return Order screen is not displayed."+ actualOrder);
		}
				
	}

	public void User_Select_the_From_date_and_To_Date() throws Throwable {
		utilities.webDriverWait(driver, From_Date);
		driver.findElement(From_Date).sendKeys("01012024");
	}
	
	
	public void The_Search_related_data_is_displayed_in_the_main_grid() throws Throwable {
		    WebElement OrderData = driver.findElement(Table);
		  
		    WebElement Data = driver.findElement(Table);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(Table).size() > 0) {
	        utilities.MediumWait(driver);            
	        String OrderDataText1 = OrderData.getText();
			utilities.MediumWait(driver);	    
			            
	        String[] rows = OrderDataText1.split("\n");
			for (String row : rows) {
		     System.out.println(row);
		        System.out.println();
		        
		    }
		
		}	    
		
	}

	public void Verify_the_Return_Order_expansion_grid_header_section_names_are_displayed_or_not() {
		WebElement Item2 = driver.findElement(Item_Name1);
		String expectedProductName = "Item Name";
		String actualItemName = Item2.getText().trim();

		if (actualItemName.equals(expectedProductName)) {
		    System.out.println("The Item name is displayed: " + actualItemName);
		} else {
		    System.out.println("The Item name is not displayed.");
		}

		WebElement Category2 = driver.findElement(Category);
		String expectedCategoryName = "Category";
		String actualCategoryName = Category2.getText().trim();
		if (actualCategoryName.equals(expectedCategoryName)) {
		    System.out.println("The Category is displayed: " + actualCategoryName);
		} else {
		    System.out.println("The Category is not displayed.");
		}

		WebElement Quantity2 = driver.findElement(Quantity1);
		String expectedQuantity = "Quantity";
		String actualQuantity = Quantity2.getText().trim();
		if (actualQuantity.equals(expectedQuantity)) {
		    System.out.println("The Quantity is displayed: " + actualQuantity);
		} else {
		    System.out.println("The Quantity is not displayed.");
		}

		WebElement Par_Quantity2 = driver.findElement(Par_Quantity);
		String expectedPar_Quantity = "Partial Quantity";
		String actualPar_Quantity = Par_Quantity2.getText().trim();
		if (actualPar_Quantity.equals(expectedPar_Quantity)) {
		    System.out.println("The Partial Quantity is displayed: " + actualPar_Quantity);
		} else {
		    System.out.println("The Partial Quantity is not displayed."+ actualPar_Quantity);
		}

		WebElement Remarks = driver.findElement(Remarks1);
		String expectedRemarks = "Remarks";
		String actualRemarks = Remarks.getText().trim();
		if (actualRemarks.equals(expectedRemarks)) {
		    System.out.println("The Remarks is displayed: " + actualRemarks);
		} else {
		    System.out.println("The Remarks is not displayed.");
		}
		
		WebElement Status = driver.findElement(Status1);
		String expectedStatus = "Status";
		String actualStatus = Status.getText().trim();
		if (actualStatus.equals(expectedStatus)) {
		    System.out.println("The Status is displayed: " + actualStatus);
		} else {
		    System.out.println("The Status is not displayed.");
		}
		
		WebElement Price = driver.findElement(Price1);
		String expectedPrice = "Price";
		String actualPrice = Price.getText().trim();
		if (actualPrice.equals(expectedPrice)) {
		    System.out.println("The Price is displayed: " + actualPrice);
		} else {
		    System.out.println("The Price is not displayed.");
		}		
	}
	public void Verify_the_Return_Order_Items_are_displayed_in_the_expansion_grid_or_not() {
		
		WebElement Item = driver.findElement(Item_Name);
		String ItemText = Item.getText();
		System.out.println("The Item names are displayed: " + ItemText);

			
		WebElement CategoryData = driver.findElement(Category_Names);
		String CategoryDataText = CategoryData.getText();
		System.out.println("The category names are displayed: " + CategoryDataText);

		WebElement Quantity1 = driver.findElement(Quantity);
		String QuantityDataText = Quantity1.getText();
		System.out.println("The Quantity values are displayed: " + QuantityDataText);

		WebElement PartialQuantityData = driver.findElement(Partial_Quantity);
		String PartialDataText = PartialQuantityData.getText();
		System.out.println("The Partial Quantity values are displayed: " + PartialDataText);

		WebElement Remarks1 = driver.findElement(Remarks);
		String RemarksDataText = Remarks1.getText();
		System.out.println("The Remarks data is displayed: " + RemarksDataText);

		WebElement Statusname = driver.findElement(Status);
		String StatusnameText = Statusname.getText();
		System.out.println("The Status name is displayed: " + StatusnameText);

		WebElement PriceData = driver.findElement(Price);
		String PriceDataText = PriceData.getText();
		System.out.println("The Price values are displayed: " + PriceDataText);
		
	}	
	public void User_Select_the_Check_Box() throws Throwable {
		utilities.webDriverWait(driver,Item_Checkbox );	
		driver.findElement(Item_Checkbox).click();
		utilities.MinimumWait(driver);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,2500)", "");
//		utilities.MediumWait(driver);
	}
	public void User_Click_on_the_Partial_Received_Icon() throws Throwable {
	
	List<WebElement> partialReceivedButtons = driver.findElements(Partial_received_Icon);
		    
		 for (WebElement buttonElement : partialReceivedButtons) {
		     if (buttonElement.isEnabled()) {
		         // If the Partial Received button is enabled, click on it and perform actions
		         System.out.println("Button is enabled.");
		         buttonElement.click();
		          utilities.MediumWait(driver);
		            
		            // Perform further actions specific to the current data entry
		            
		            // Break out of the loop after handling the first enabled button
		            break;
		        }
		    }
				
	}
	public void The_Partial_Received_Popup_page_is_displayed_or_not_when_click_on_the_Partial_Received_Icon() {
		WebElement data = driver.findElement(partial_Rec_Page);
		String dataText = data.getText();
		System.out.println("The Partially Received Page is displayed: " + dataText);

		
	}
	public void User_Enter_the_data_in_the_Partial_Received_Qty_field() throws Throwable {
		driver.findElement(Partial_Qty).clear();
		utilities.webDriverWait(driver, Partial_Qty);
		driver.findElement(Partial_Qty).sendKeys("2");
		
	}
	public void User_enter_the_data_in_the_Remarks_field() throws Throwable {
		driver.findElement(par_Remarks).clear();
		utilities.webDriverWait(driver, par_Remarks);
		driver.findElement(par_Remarks).sendKeys("Partially Received");
		
	}
	public void The_User_enter_the_Partial_Qty_is_More_than_the_Original_Qty_the_validation_message_is_displayed() throws Throwable {
		utilities.webDriverWait(driver, Partial_Qty);
		driver.findElement(Partial_Qty).sendKeys("578473");
		utilities.MinimumWait(driver);	
		utilities.webDriverWait(driver, par_Remarks);
		driver.findElement(par_Remarks).sendKeys("Partially Received");
		utilities.MinimumWait(driver);	
		utilities.webDriverWait(driver,partial_Save_button );	
		driver.findElement(partial_Save_button).click();
		utilities.MinimumWait(driver);	
		Boolean isPresent = driver.findElements(partial_Qty_vali).size()>0;
		if (isPresent) {
		WebElement Data = driver.findElement(partial_Qty_vali);
		String test = Data.getText(); 
		String expectedData = "Partial Qty Should Not be More Than The Original Qty";
		if (expectedData.equals(test)) {
			System.out.println("Display validation msg is correct." + test);
		} else {
			System.out.println("Display validation msg is incorrect."+ test);
		}
	}
	}
	public void Click_on_the_Save_button_in_the_Partial_Received_popup_page() throws Throwable {
		utilities.webDriverWait(driver,partial_Save_button );	
		driver.findElement(partial_Save_button).click();
		utilities.MinimumWait(driver);
		
	}
	public void The_Validation_message_is_displayed_or_not() {
		Boolean isPresent = driver.findElements(Validation_message).size()>0;
		if (isPresent) {
		WebElement Data = driver.findElement(Validation_message);
		String test = Data.getText(); 
		String expectedData = "Mandatory Fields Are Required With Valid Data.";
		if (expectedData.equals(test)) {
			System.out.println("Display validation msg is correct." + test);
		} else {
			System.out.println("Display validation msg is incorrect."+ test);
		}
	}
		
	}
	public void Click_on_the_Close_button() throws Throwable {
		utilities.webDriverWait(driver,Par_Close_button );	
		driver.findElement(Par_Close_button).click();
		utilities.MinimumWait(driver);		
	}

	public void Click_on_the_Close_Icon() throws Throwable {
		utilities.webDriverWait(driver,par_close_Icon );	
		driver.findElement(par_close_Icon).click();
		utilities.MinimumWait(driver);		
	}

	public void Click_on_the_Item_Reject_Icon() throws Throwable {	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		List<WebElement> RejectButtons = driver.findElements(Reject_icon);
	    
		 for (WebElement buttonElement : RejectButtons) {
		     if (buttonElement.isEnabled()) {
		         // If the Partial Received button is enabled, click on it and perform actions
		         System.out.println("Button is enabled.");
		         buttonElement.click();
		         utilities.MediumWait(driver);
		            
		            // Perform further actions specific to the current data entry
		            
		            // Break out of the loop after handling the first enabled button
		          break;
		        }
		    }							
	}
	public void The_Reject_details_Page_is_displayed_or_not() {
		WebElement data = driver.findElement(Reject_details_Page);
		String dataText = data.getText();
		System.out.println("The Reject details Page is displayed: " + dataText);
		
	}
	public void User_Enter_the_data_in_th_Remarks_field() throws Throwable {
		utilities.webDriverWait(driver, Reject_remarks_field);
		driver.findElement(Reject_remarks_field).sendKeys("Item Rejected");
		utilities.MinimumWait(driver);
	}

	public void Click_on_the_Save_button_in_the_Reject_details_page() throws Throwable {
		utilities.webDriverWait(driver,partial_Save_button );	
		driver.findElement(partial_Save_button).click();
		utilities.MinimumWait(driver);	
	}

	public void Click_on_the_Close_button_in_the_Reject_details_page() throws Throwable {
		utilities.webDriverWait(driver,Par_Close_button );	
		driver.findElement(Par_Close_button).click();
		utilities.MinimumWait(driver);			
	}
	public void Click_on_the_Close_Icon_in_the_Reject_details_page() throws Throwable {
		utilities.webDriverWait(driver,par_close_Icon );	
		driver.findElement(par_close_Icon).click();
		utilities.MinimumWait(driver);	
		
	}	
	public void Click_on_the_Received_icon() throws Throwable {
		utilities.webDriverWait(driver,Received_button );	
		driver.findElement(Received_button).click();
		utilities.MinimumWait(driver);		
		
	}
	public void The_Received_details_Page_is_displayed_or_not() {
		WebElement data = driver.findElement(Received_details);
		String dataText = data.getText();
		System.out.println("The Received details Page is displayed: " + dataText);
				
	}
	public void User_enter_the_data_in_the_Remarks_field_in_the_Received_details_page() throws Throwable {
		utilities.webDriverWait(driver, Received_Remarks);
		driver.findElement(Received_Remarks).sendKeys("Item Received");
		
	}

	public void Click_on_the_Save_button_in_the_Received_details_page() throws Throwable {
		utilities.webDriverWait(driver,Received_Save_Button);	
		driver.findElement(Received_Save_Button).click();
		utilities.MinimumWait(driver);		
		
	}
	public void Click_on_the_Close_button_in_the_Received_details_page() throws Throwable {
		utilities.webDriverWait(driver,Received_Close_Button);	
		driver.findElement(Received_Close_Button).click();
		utilities.MinimumWait(driver);		
		
	}
	public void User_Click_on_the_Close_Icon_in_the_Received_details_page() throws Throwable {
		utilities.webDriverWait(driver,Received_Close_Icon);	
		driver.findElement(Received_Close_Icon).click();
		utilities.MinimumWait(driver);		
		
	}
	public void The_Reject_Successfull_validation_message_is_displayed() throws Throwable   {
		Thread.sleep(1500);
		Boolean isPresent = driver.findElements(Reject_Success_Vali).size()>0;
		if (isPresent) {
		WebElement Data = driver.findElement(Reject_Success_Vali);
		String test = Data.getText(); 
		String expectedData = "Item Not Received Successfully";
		if (expectedData.equals(test)) {
			System.out.println("Display validation msg is correct." + test);
		} else {
			System.out.println("Display validation msg is incorrect."+ test);
		}
	}
		
	}
	public void The_User_enter_the_data_in_all_field_and_Click_on_the_Save_button_Partial_received_Successfull_validation_message_is_displayed() {
		Boolean isPresent = driver.findElements(Partial_Success_Vali).size()>0;
		if (isPresent) {
		WebElement Data = driver.findElement(Partial_Success_Vali);
		String test = Data.getText(); 
		String expectedData = "Item Partially Received Successfully";
		if (expectedData.equals(test)) {
			System.out.println("Display validation msg is correct." + test);
		} else {
			System.out.println("Display validation msg is incorrect."+ test);
		}
	}
		
	}

	public void The_Remarks_field_Validation_message_is_displayed_or_not() {
		Boolean isPresent = driver.findElements(Remarks_Validation_msg).size()>0;
		if (isPresent) {
		WebElement Data = driver.findElement(Remarks_Validation_msg);
		String test = Data.getText(); 
		String expectedData = "Remarks Field is Required";
		if (expectedData.equals(test)) {
			System.out.println("Display validation msg is correct." + test);
		} else {
			System.out.println("Display validation msg is incorrect."+ test);
		}
	}
		
	}

	public void The_User_enter_the_data_in_all_field_and_Click_on_the_Save_button_Received_Successfull_validation_message_is_displayed() {
		Boolean isPresent = driver.findElements(Received_validation).size()>0;
		if (isPresent) {
		WebElement Data = driver.findElement(Received_validation);
		String test = Data.getText(); 
		String expectedData = "Item Received Successfully";
		if (expectedData.equals(test)) {
			System.out.println("Display validation msg is correct." + test);
		} else {
			System.out.println("Display validation msg is incorrect."+ test);
		}
	}
		
	}
	public void Select_the_Status_as_Partially_Received() throws Throwable {
		driver.findElement(Filter_Status).click();
		Thread.sleep(1000);
		utilities.MediumWait(driver);	
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		utilities.MinimumWait(driver);			
	}
	public void User_Click_on_the_Order_Credit_note_in_the_Actions_Column() throws Throwable {
		utilities.webDriverWait(driver,Credit_Note_Icon);	
		driver.findElement(Credit_Note_Icon).click();
		utilities.MinimumWait(driver);				
	}
	public void The_page_is_navigated_to_the_Credit_note_page() {
		WebElement data = driver.findElement(Credit_Note_List_Page);
		String dataText = data.getText();
		System.out.println("The Credit note list Page is displayed: " + dataText);
		
	}
	public void The_Order_details_are_displayed_in_the_credit_note_page() {
	
	}

	public void The_Party_details_are_displayed_in_the_credit_note_page() {
		WebElement data = driver.findElement(CreditPage_Party_details);
		String dataText = data.getText();
		System.out.println("The Credit note Party details Page is displayed: " + dataText);
		
	}
	public void The_User_Click_on_the_Add_button() throws Throwable {
		utilities.webDriverWait(driver,Credit_note_Add_button);	
		driver.findElement(Credit_note_Add_button).click();
		utilities.MinimumWait(driver);		
		
	}
	public void The_Add_Credit_note_form_is_displayed_when_Click_on_the_Add_button() {
		WebElement data = driver.findElement(Add_Credit_Note_Page);
		String dataText = data.getText();
		System.out.println("The Add Credit note Page is displayed: " + dataText);
				
	}
	public void User_Select_the_Credit_date() throws Throwable {
		utilities.webDriverWait(driver,Credit_date);	
		driver.findElement(Credit_date).sendKeys("20042024");
		utilities.MinimumWait(driver);		
		
	}
	public void User_Enter_the_data_in_the_Remarks_Field() throws Throwable {
		utilities.webDriverWait(driver,Credit_remarks);	
		
		boolean ElementPresent = driver.findElements(Credit_remarks).size()>0;
        if(ElementPresent) {
        driver.findElement(Credit_remarks).sendKeys(prop.getProperty("username"));
		Thread.sleep(1000);
		driver.findElement(Credit_remarks).sendKeys("Credit note");
		utilities.MinimumWait(driver);	
        }
	}
	public void User_Select_the_credit_note_attachment() throws Throwable {
		utilities.webDriverWait(driver,Credit_attachment);	
		driver.findElement(Credit_attachment).click();
		utilities.MinimumWait(driver);		
		
	}
	public void The_User_Click_on_the_Save_button() throws Throwable {
		utilities.webDriverWait(driver,Save_button);	
		driver.findElement(Save_button).click();
		utilities.MinimumWait(driver);		
		
	}
	public void User_enter_the_data_in_all_fields_and_Click_on_the_save_button_the_credit_note_saved_successfull_validation_text_is_displayed() throws  Throwable{
	
		Thread.sleep(1500);
		Boolean isPresent = driver.findElements(Save_Validation).size()>0;
		if (isPresent) {
		WebElement Data = driver.findElement(Save_Validation);
		String test = Data.getText(); 
		String expectedData = "Credit Note Created Successfully";
		if (expectedData.equals(test)) {
			System.out.println("Display validation msg is correct." + test);
		} else {
			System.out.println("Display validation msg is incorrect."+ test);
		}
	}
		
	}
	public void The_User_without_enter_the_data_in_all_fields_and_Click_on_the_Save_button_the_toaster_message_is_displayed() {
		Boolean isPresent = driver.findElements(Toaster_message).size()>0;
		if (isPresent) {
		WebElement Data = driver.findElement(Toaster_message);
		String test = Data.getText(); 
		String expectedData = "Mandatory Fields Are Required With  Valid Data.";
		if (expectedData.equals(test)) {
			System.out.println("Display validation msg is correct." + test);
		} else {
			System.out.println("Display validation msg is incorrect."+ test);
		}
	}
		
	}
	public void User_Click_on_the_Close_button() throws Throwable {
		utilities.webDriverWait(driver,Close_Button);	
		driver.findElement(Close_Button).click();
		utilities.MinimumWait(driver);		
		
	}
	public void User_Click_on_the_Close_Icon() throws Throwable {
		utilities.webDriverWait(driver,Close_Icon);	
		driver.findElement(Close_Icon).click();
		utilities.MinimumWait(driver);		
		
	}
	public void The_User_without_select_the_credit_attachment_the_validation_message_is_displayed_or_not() throws Throwable {
		Thread.sleep(1500);
		Boolean isPresent = driver.findElements(Attachment_validation).size()>0;
		if (isPresent) {
		WebElement Data = driver.findElement(Attachment_validation);
		String test = Data.getText(); 
		String expectedData = "Attachment is Required";
		if (expectedData.equals(test)) {
			System.out.println("Display validation msg is correct." + test);
		} else {
			System.out.println("Display validation msg is incorrect."+ test);
		}
		
	}

	}
	By Warehouse_field        = By.xpath("(//select[@formcontrolname='whsCode'])[2]");
	By Warehouse_Upd_failed   = By.xpath("//h2[text()='Updation Failed']");
	By Warehouse_SaveButton   = By.xpath("(//button[text()='Save'])[6]");
	public void The_User_click_on_the_Save_Button() throws Throwable {
		utilities.webDriverWait(driver, Warehouse_SaveButton);	
		driver.findElement(Warehouse_SaveButton).click();
		utilities.MinimumWait(driver);
		Boolean isPresent1 = driver.findElements(Warehouse_Upd_failed).size()>0;
		if (isPresent1) {
			WebElement Data = driver.findElement(Warehouse_Upd_failed);
			String test1 = Data.getText(); 
			String expectedData = "Updation Failed";
			if (expectedData.equals(test1)) {
				System.out.println("Display the name is correct." + test1);
			
				driver.findElement(Warehouse_field).click();
				Thread.sleep(1000);
				utilities.MediumWait(driver);	
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_DOWN);
				Thread.sleep(2000);
				r.keyPress(KeyEvent.VK_DOWN);
				Thread.sleep(2000);
				r.keyPress(KeyEvent.VK_ENTER);
				Thread.sleep(2000);
				utilities.MinimumWait(driver);
				utilities.webDriverWait(driver, Warehouse_SaveButton);	
				driver.findElement(Warehouse_SaveButton).click();
				utilities.MinimumWait(driver);
			}
		}
		
	}

	public void User_without_Select_the_From_date_and_To_Date() throws Throwable {
		driver.findElement(From_Date).clear();
		driver.findElement(Search).click();
		driver.findElement(To_Date).clear();
		driver.findElement(Search).click();
		utilities.MediumWait(driver);
		Thread.sleep(1500);
	}
		
	


}

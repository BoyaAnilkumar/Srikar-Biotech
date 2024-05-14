package Pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class SBPL_Confirm_Orders_Pages  extends DriverFactory{
	
	Utilities utilities = new Utilities();
	
	By Confirm_Orders         = By.xpath("(//span[text()='Confirm Orders'])[1]");
	By State                  = By.xpath("//label[text()='State']/..//div[@class='p-element p-multiselect-label-container']");
	By Sales_Person           = By.xpath("//label[text()='Sales Person']/..//div[@class='p-element p-multiselect-label-container']");
	By State_text_field       = By.xpath("//input[@class='p-multiselect-filter p-inputtext p-component']");
	By Sales_Person_field     = By.xpath("//input[@role='textbox']");
	By Select_States          = By.xpath("//ul/p-multiselectitem/li");
	By Select_Slp             = By.xpath("//div/ul/p-multiselectitem/li");
	By Orders                 = By.xpath("//div[@class='card-header']");
	By Sales_Icon             = By.xpath("//searchicon[contains(@class,'p-element p-icon-wrapper')]");
	By Warehouse              = By.xpath("(//select[@formcontrolname='whsCode'])[1]");
	By Party                  = By.xpath("//input[@placeholder='Enter Party Name/Code']");
	By Select_Party			  = By.xpath("//span[text()='Joshitha Traders - Bommilingam']");
	By Status                 = By.xpath("//select[@formcontrolname='statusId']");
	By Search                 = By.xpath("//button[@class='btn btn-secondary me-2']");
//Change Warehouse Functionality
	By Warehouse_Icon         = By.xpath("(//button[@title='Change Warehouse'])[1]");
	By Warehouse_field        = By.xpath("(//select[@formcontrolname='whsCode'])[2]");
	By Save_button            = By.xpath("//button[text()='Save']");
	By Warehouse_Update       = By.xpath("//h2[text()='Warehouse Updated Successfully']");
//Accept functionality
    By Check_Box              = By.xpath("(//td/span/p-tablecheckbox/div/div[@role='checkbox'])[1]");
	By Accept_Button          = By.xpath("//button[@title='Accepted']");
	By Accept_Remarks_field   = By.xpath("(//textarea[@placeholder='Enter Remarks'])[2]");
	By Accept_Save_Button     = By.xpath("(//button[text()=' Save'])[2]");
	By From_Date              = By.xpath("//input[@formcontrolname='formDate']");
	By Order_history          = By.xpath("(//button[@class='btn btn-sm btn-secondary me-1 ng-star-inserted'])[1]");
	By Order_details          = By.xpath("//h5[text()='Order Details']");
	By Party_details          = By.xpath("(//h5[text()='Party Details'])[1]");
	By A1                     = By.xpath("//span[@class='subHeader' and text()='Order Id']");
	By A2                     = By.xpath("(//p[@class='mb-0 text-secondary font-weight-bold'])[1]");
	By Back_button            = By.xpath("//button[text()='Back']");
//Reject functionality
	By Reject_button          = By.xpath("//button[@title='Rejected']");
	By Reject_remarks_field   = By.xpath("(//textarea[@placeholder='Enter Remarks'])[1]");
	By Reject_Save_Button     = By.xpath("(//button[text()=' Save'])[1]");
//Order history
	By Order_ID               = By.xpath("(//small[text()='Order Id'])[1]");
	By Date                   = By.xpath("(//small[text()='Date'])[1]");
	By No_of_Items            = By.xpath("(//small[text()='No. Of Items'])[1]");
	By Total_amount           = By.xpath("(//small[text()='Total Amount'])[1]");
	By Warehouse_name         = By.xpath("(//small[text()='Warehouse'])[1]");
	By Sales_Person3          = By.xpath("(//small[text()='Sales Person'])[1]");
	By Party_Code             = By.xpath("(//small[text()='Party Code'])[1]");
	By Party_name             = By.xpath("(//small[text()='Party Name'])[1]");
	By Proprietor_name        = By.xpath("(//small[text()='Proprietor Name'])[1]");
	By GST_no                 = By.xpath("(//small[text()='GST No'])[1]");
	By Address                = By.xpath("(//small[text()='Address'])[1]");
	By OrderID                = By.xpath("(//p[@class='mb-0 text-secondary font-weight-bold'])[1]");
	By Date_Value             = By.xpath("(//p[@class='mb-0 text-secondary font-weight-bold'])[2]");
	By Items_Value            = By.xpath("(//p[@class='mb-0 text-secondary font-weight-bold'])[3]");
	By Totalamount_value      = By.xpath("(//p[@class='mb-0 text-secondary font-weight-bold'])[4]");
	By Warehouse_Text         = By.xpath("(//p[@class='mb-0 text-secondary font-weight-bold'])[5]");
	By SalesPerson_Text       = By.xpath("(//p[@class='mb-0 text-secondary font-weight-bold'])[6]");
	By PartyCode_Value        = By.xpath("(//p[@class='mb-0 text-secondary font-weight-bold'])[7]");
	By Partyname_Text         = By.xpath("(//p[@class='mb-0 text-secondary font-weight-bold'])[8]");
	By Proprietor_Name_text   = By.xpath("(//p[@class='mb-0 text-secondary font-weight-bold'])[9]");
	By GST_value              = By.xpath("(//p[@class='mb-0 text-secondary font-weight-bold'])[10]");
	By Address_Text           = By.xpath("(//p[@class='mb-0 text-secondary font-weight-bold'])[11]");
//Expansion Icon
	By Expansion_Icon         = By.xpath("(//button[@class='p-element p-button-text p-button-rounded p-button-plain p-button p-component p-button-icon-only'])[1]");
	By Product_Name           = By.xpath("((//tr[@class='ng-star-inserted'])[4]//th)[1]");
	By Category               = By.xpath("((//tr[@class='ng-star-inserted'])[4]//th)[2]");
	By Price_Pcs	          = By.xpath("((//tr[@class='ng-star-inserted'])[4]//th)[3]");
	By Quantity               = By.xpath("((//tr[@class='ng-star-inserted'])[4]//th)[4]");
	By GST                    = By.xpath("((//tr[@class='ng-star-inserted'])[4]//th)[5]");
	By Invoice_Details        = By.xpath("((//tr[@class='ng-star-inserted'])[4]//th)[6]");
	By Total_Price            = By.xpath("((//tr[@class='ng-star-inserted'])[4]//th)[7]");
    By Product_Data           = By.xpath("((//tr[@class='ng-star-inserted'])[5]//td)[1]");      
    By Category_Names         = By.xpath("((//tr[@class='ng-star-inserted'])[5]//td)[2]");      
    By Price                  = By.xpath("((//tr[@class='ng-star-inserted'])[5]//td)[3]");      
    By Quantity_Value         = By.xpath("((//tr[@class='ng-star-inserted'])[5]//td)[4]"); 
    By GST_Value              = By.xpath("((//tr[@class='ng-star-inserted'])[5]//td)[5]"); 
    By Invoice_Details_Data   = By.xpath("((//tr[@class='ng-star-inserted'])[5]//td)[6]"); 
    By Total_Price_Value      = By.xpath("((//tr[@class='ng-star-inserted'])[5]//td)[7]"); 
	
	public void User_click_on_the_Confirm_Orders_under_the_Orders_Module() throws Throwable {
	utilities.webDriverWait(driver, Confirm_Orders);	
		driver.findElement(Confirm_Orders).click();
		utilities.MinimumWait(driver);
	}

	public void User_Select_the_State() throws Throwable {
		driver.findElement(State).click();
		driver.findElement(State_text_field).sendKeys("Andhra");
		driver.findElement(Select_States).click();
		utilities.MinimumWait(driver);
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_ENTER);
//		Thread.sleep(2000);
		driver.findElement(Orders).click();
		utilities.MinimumWait(driver);
		Thread.sleep(1000);
		utilities.MediumWait(driver);	
		
	}

	public void User_Select_the_Sales_Person() throws Throwable {
		driver.findElement(Sales_Person).click();
		Thread.sleep(2000);
		driver.findElement(Sales_Person_field).sendKeys("Super");
		driver.findElement(Select_Slp).click();
		utilities.MinimumWait(driver);
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_ENTER);
//		Thread.sleep(2000);
		driver.findElement(Orders).click();
		utilities.MinimumWait(driver);
		Thread.sleep(1000);
		utilities.MediumWait(driver);	
			
		
	}
	public void Select_the_Warehouse() throws Throwable {
		Thread.sleep(1000);
//		utilities.webDriverWait(driver, Warehouse);
		driver.findElement(Warehouse).click();
		utilities.MinimumWait(driver);
		utilities.MinimumWait(driver);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		utilities.MinimumWait(driver);
			
		
	}

	public void User_enter_the_partyname() throws Throwable {
		driver.findElement(Party).click();
		Thread.sleep(2000);
		driver.findElement(Party).sendKeys("Joshitha");
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
//		driver.findElement(Select_Party).click();
		utilities.MinimumWait(driver);
			
	}

	public void Select_the_Status() throws Throwable {
		driver.findElement(Status).click();
		Thread.sleep(1000);
		utilities.MediumWait(driver);	
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		utilities.MinimumWait(driver);
		
	}

	public void Select_the_From_date_and_ToDate() throws Throwable {
		utilities.webDriverWait(driver, From_Date);
		driver.findElement(From_Date).sendKeys("20022024");
	}

	public void Click_on_the_Search_button() throws Throwable {
		utilities.webDriverWait(driver, Search);	
		driver.findElement(Search).click();
		utilities.MinimumWait(driver);
	}

	public void Click_on_the_Warehouse_Icon() throws Throwable {
		utilities.webDriverWait(driver, Warehouse_Icon);	
		driver.findElement(Warehouse_Icon).click();
		utilities.MinimumWait(driver);
		
	}

	public void User_Select_the_Warehouse_in_the_Change_Warehouse_page() throws Throwable {
		driver.findElement(Warehouse_field).click();
		Thread.sleep(1000);
		utilities.MediumWait(driver);	
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		utilities.MinimumWait(driver);
		
	}
	By Warehouse_Upd_failed   = By.xpath("//h2[text()='Updation Failed']");
	public void User_click_on_the_Save_Button() throws Throwable {
		utilities.webDriverWait(driver, Save_button);	
		driver.findElement(Save_button).click();
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
				utilities.webDriverWait(driver, Save_button);	
				driver.findElement(Save_button).click();
				utilities.MinimumWait(driver);
			}
		}
	}

	public void User_Select_the_Status() throws Throwable {
		driver.findElement(Status).click();
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

	public void User_Click_on_the_Order_Check_box() throws Throwable {
		utilities.webDriverWait(driver, Check_Box);	
		driver.findElement(Check_Box).click();
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_the_Accept_button() throws Throwable {
		utilities.webDriverWait(driver, Accept_Button);	
		driver.findElement(Accept_Button).click();
		utilities.MinimumWait(driver);
		
	}

	public void User_enter_the_data_in_Remarks_field() throws Throwable {
		utilities.webDriverWait(driver, Accept_Remarks_field);	
		driver.findElement(Accept_Remarks_field).sendKeys("Order Accpted");
		utilities.MinimumWait(driver);
	}

	public void Click_on_the_save_button() throws Throwable {
		utilities.webDriverWait(driver, Accept_Save_Button);	
		driver.findElement(Accept_Save_Button).click();
		utilities.MinimumWait(driver);
	}

	public void Click_on_the_Order_history_Icon() throws Throwable {
		utilities.webDriverWait(driver, Order_history);	
		driver.findElement(Order_history).click();
		utilities.MinimumWait(driver);	
	}

	public void The_User_Select_the_Status() throws Throwable {
		driver.findElement(Status).click();
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
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		utilities.MinimumWait(driver);	
	}

	public void The_User_Select_the_Warehouse() throws Throwable {
		driver.findElement(Warehouse).click();
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
		
	}

	public void User_Select_the_From_date_and_ToDate() throws Throwable {
		utilities.webDriverWait(driver, From_Date);
		driver.findElement(From_Date).sendKeys("10022024");
		
	}

	public void Verify_the_Party_details_and_Order_details_are_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, Order_details);
		Boolean isPresent = driver.findElements(Order_details).size()>0;
		if (isPresent) {
			WebElement Data = driver.findElement(Order_details);
			String test = Data.getText(); 
			String expectedData = "Order Details";
			if (expectedData.equals(test)) {
				System.out.println("Display the name is correct." + test);
			} else {
				System.out.println("Display the name is incorrect."+ test);
			}
		}

			Boolean isPresent1 = driver.findElements(Party_details).size()>0;
			if (isPresent1) {
				WebElement Data = driver.findElement(Party_details);
				String test1 = Data.getText(); 
				String expectedData = "Party Details";
				if (expectedData.equals(test1)) {
					System.out.println("Display the name is correct." + test1);
				} else {
					System.out.println("Display the name is incorrect."+ test1);
				}
	}
}
  public void Verify_the_displayed_Order_ID_is_correct_or_not() throws Throwable {

  String element1 = "SBPLOPAP2024000165"; // Assuming this is a string you want to compare
//WebElement element1 = driver.findElement(A1); // commented out since not used

//utilities.webDriverWait(driver, Order_history);  
//driver.findElement(Order_history).click();
//utilities.MinimumWait(driver);    
WebElement element2 = driver.findElement(A2);

//Get the text content of the element2
String element2Text = element2.getText();

//Check if the text content of the elements are equal
if (element1.equals(element2Text)) {
   System.out.println("The elements have the same text content.");
} else {
   System.out.println("The elements have different text content.");
}

}
  public void The_User_enter_the_data_in_Remarks_field() throws Throwable {
		utilities.webDriverWait(driver, Reject_remarks_field);	
		driver.findElement(Reject_remarks_field).sendKeys("Order Rejected");
		utilities.MinimumWait(driver);
	}


public void Click_on_the_Reject_button() throws Throwable {
	utilities.webDriverWait(driver, Reject_button);
	driver.findElement(Reject_button).click();
}

public void The_User_Select_the_From_date_and_ToDate() throws Throwable {
	utilities.webDriverWait(driver, From_Date);
	driver.findElement(From_Date).sendKeys("02032024");
	
}

public void Verify_the_order_details_are_displayed_in_the_Order_history_page_or_not() throws Throwable {
String Order_ID1 = "Order Id"; 
WebElement Order_ID2 = driver.findElement(Order_ID);
WebElement Order = driver.findElement(OrderID);
String Order_ID2Text = Order_ID2.getText();
if (Order_ID1.equals(Order_ID2Text)) {
System.out.println("The Order ID is displayed: " + Order.getText());
} else {
System.out.println("The Order ID is not displayed.");
}
	 
String Date1 = "Date"; 
WebElement Date2 = driver.findElement(Date);
WebElement Date = driver.findElement(Date_Value);
String Date2Text = Date2.getText();
if (Date1.equals(Date2Text)) {
System.out.println("The Date is displayed: " + Date.getText());
} else {
  System.out.println("The Date is not displayed.");
}
  
  
String  Items1 = "No. Of Items"; 
WebElement Items2 = driver.findElement(No_of_Items);
WebElement Items = driver.findElement(Items_Value);
String Items2Text = Items2.getText();
if (Items1.equals(Items2Text)) {
System.out.println("The No.of Items are displayed: " + Items.getText());
} else {
 System.out.println("The No.of Items are not displayed.");
}
 
 
String Total_amount1 = "Total Amount"; 
WebElement Total_amount2 = driver.findElement(Total_amount);
WebElement Totalamount = driver.findElement(Totalamount_value);
String Total_amount2Text =Total_amount2.getText();
if (Total_amount1.equals(Total_amount2Text)) {
System.out.println("The Date is displayed:" + Totalamount.getText());
} else {
System.out.println("The Date is not displayed.");
}


String Warehouse1 = "Warehouse"; 
WebElement Warehouse2 = driver.findElement(Warehouse_name);
String Warehouse2Text = Warehouse2.getText();
WebElement Warehouse = driver.findElement(Warehouse_Text);
if (Warehouse1.equals(Warehouse2Text)) {
System.out.println("The Warehouse is displayed:" + Warehouse.getText());
} else {
System.out.println("The Warehouse is not displayed.");
}


String Sales_Person1 = "Sales Person"; 
WebElement Sales_Person2 = driver.findElement(Sales_Person3);
String Sales_Person2Text = Sales_Person2.getText();
WebElement SalesPerson = driver.findElement(SalesPerson_Text);
if (Sales_Person1.equals(Sales_Person2Text)) {
System.out.println("The Sales Person is displayed:" + SalesPerson.getText());
} else {
System.out.println("The Sales Person is not displayed.");
}
}

public void Verify_the_Party_details_are_displayed_in_the_Order_history_page_or_not() {
	String Party_Code1 = "Party Code"; 
	WebElement Party_Code2 = driver.findElement(Party_Code);
	WebElement PartyCode = driver.findElement(PartyCode_Value);
	String Party_Code2Text = Party_Code2.getText();
	if (Party_Code1.equals(Party_Code2Text)) {
	System.out.println("The Party Code is displayed:" + PartyCode.getText());
	} else {
	System.out.println("The Party Code is not displayed.");
	}	 	 
//	String Party_name1 = "Party Name"; 
//	WebElement Party_name2 = driver.findElement(Party_name);
//	WebElement Partyname = driver.findElement(Partyname_Text);
//	String Party_name2Text = Party_name2.getText();
//	if (Party_name1.equals(Party_name2Text)) {
//	System.out.println("The Party name is displayed:" + Partyname.getText());
//	} else {
//	  System.out.println("The Party name is not displayed.");
//	}
	{
	String partyNameExpected = "Party Name"; // Define the expected party name
	WebElement partyName = driver.findElement(Party_name); // Find the element containing the party name
	WebElement partyNameTextElement = driver.findElement(Partyname_Text); // Find the element containing the party name text
	String partyNameText = partyName.getText(); // Get the text of the party name element
	// Print whether the party name is displayed or not
	System.out.println("The Party name is " + (partyNameText.equals(partyNameExpected) ? "displayed: " + partyNameTextElement.getText() : "not displayed."));
}
	String Proprietor_Name1 = "Proprietor Name"; 
	WebElement Proprietor_Name2 = driver.findElement(Proprietor_name);
	WebElement Proprietorname = driver.findElement(Proprietor_Name_text);
	String Proprietor_Name2Text = Proprietor_Name2.getText();
	if (Proprietor_Name1.equals(Proprietor_Name2Text)) {
	System.out.println("The Proprietor Name is displayed:" + Proprietorname.getText());
	} else {
	 System.out.println("The Proprietor Name is not displayed.");
	}
	 
	 
	String GST_no1 = "GST No"; 
	WebElement GST_no2 = driver.findElement(GST_no);
	WebElement GST_Value = driver.findElement(GST_value);
	String GST_no2Text = GST_no2.getText();
	if (GST_no1.equals(GST_no2Text)) {
	    System.out.println("The GST_no is displayed: " + GST_Value.getText());
	} else {
	    System.out.println("The GST_no is not displayed.");
	}



	String Address1 = "Address"; 
	WebElement Address2 = driver.findElement(Address);
	WebElement Address = driver.findElement(Address_Text);
	String Address2Text = Address2.getText();
	if (Address1.equals(Address2Text)) {
	System.out.println("The Address is displayed:" + Address.getText());
	} else {
	System.out.println("The Address is not displayed.");
	}

	
}

public void User_Click_on_the_Back_button() throws Throwable {
	utilities.webDriverWait(driver, Back_button);	
	driver.findElement(Back_button).click();
	utilities.MinimumWait(driver);
	
}

public void Click_on_the_Order_Expansion_Icon() throws Throwable {
	utilities.webDriverWait(driver, Expansion_Icon);	
	driver.findElement(Expansion_Icon).click();
	utilities.MinimumWait(driver);
	
}

public void Verify_the_expansion_grid_header_section_names_are_displayed_or_not() {
	WebElement Product2 = driver.findElement(Product_Name);
	String expectedProductName = "Product Name";

	// Get the text content of the WebElement and trim leading/trailing whitespaces
	String actualProductName = Product2.getText().trim();

	// Compare the actual text with the expected text
	if (actualProductName.equals(expectedProductName)) {
	    System.out.println("The Product name is displayed: " + actualProductName);
	} else {
	    System.out.println("The Product name is not displayed.");
	}

	WebElement Category2 = driver.findElement(Category);
	String expectedCategoryName = "Category";
	String actualCategoryName = Category2.getText().trim();
	if (actualCategoryName.equals(expectedCategoryName)) {
	    System.out.println("The Category is displayed: " + actualCategoryName);
	} else {
	    System.out.println("The Category is not displayed.");
	}

	WebElement Price2 = driver.findElement(Price_Pcs);
	String expectedPrice = "Price/Pcs";
	String actualPrice = Price2.getText().trim();
	if (actualPrice.equals(expectedPrice)) {
	    System.out.println("The Price is displayed: " + actualPrice);
	} else {
	    System.out.println("The Price is not displayed.");
	}

	WebElement Quantity2 = driver.findElement(Quantity);
	String expectedQuantity = "Quantity";
	String actualQuantity = Quantity2.getText().trim();
	if (actualQuantity.equals(expectedQuantity)) {
	    System.out.println("The Quantity is displayed: " + actualQuantity);
	} else {
	    System.out.println("The Quantity is not displayed.");
	}

	WebElement GST2 = driver.findElement(GST);
	String expectedGST = "GST";
	String actualGST = GST2.getText().trim();
	if (actualGST.equals(expectedGST)) {
	    System.out.println("The GST is displayed: " + actualGST);
	} else {
	    System.out.println("The GST is not displayed.");
	}
	
	WebElement InvoiceDetails2 = driver.findElement(Invoice_Details);
	String expectedInvoiceDetails = "Invoice Details";
	String actualInvoiceDetails = InvoiceDetails2.getText().trim();
	if (actualInvoiceDetails.equals(expectedInvoiceDetails)) {
	    System.out.println("The Invoice Details is displayed: " + actualInvoiceDetails);
	} else {
	    System.out.println("The Invoice Details is not displayed.");
	}
	
	WebElement TotalPrice2 = driver.findElement(Total_Price);
	String expectedTotalPrice = "Total Price";
	String actualTotalPrice = TotalPrice2.getText().trim();
	if (actualTotalPrice.equals(expectedTotalPrice)) {
	    System.out.println("The Total Price is displayed: " + actualTotalPrice);
	} else {
	    System.out.println("The Total Price is not displayed.");
	}
}

public void Verify_the_Order_Items_are_displayed_in_the_expansion_grid_or_not() {
WebElement ProductData = driver.findElement(Product_Data);
String productDataText = ProductData.getText();
System.out.println("The Product names are displayed: " + productDataText);

	
WebElement CategoryData = driver.findElement(Category_Names);
String CategoryDataText = CategoryData.getText();
System.out.println("The category names are displayed: " + CategoryDataText);

WebElement PriceData = driver.findElement(Price);
String PriceDataText = PriceData.getText();
System.out.println("The Price values are displayed: " + PriceDataText);

WebElement QuantityData = driver.findElement(Quantity_Value);
String QuantityDataText = QuantityData.getText();
System.out.println("The Quantity values are displayed: " + QuantityDataText);

WebElement GSTData = driver.findElement(GST_Value);
String GSTDataText = GSTData.getText();
System.out.println("The GST values are displayed: " + GSTDataText);

WebElement InvoiceData = driver.findElement(Invoice_Details_Data);
String InvoiceDataText = InvoiceData.getText();
System.out.println("The Invoice details are displayed: " + InvoiceDataText);

WebElement TotalPriceData = driver.findElement(Total_Price_Value);
String TotalPriceDataText = TotalPriceData.getText();
System.out.println("The Total Price values are displayed: " + TotalPriceDataText);

}

public void Click_on_the_Reject_details_save_button() throws Throwable {
	utilities.webDriverWait(driver, Reject_Save_Button);	
	driver.findElement(Reject_Save_Button).click();
	utilities.MinimumWait(driver);
	
}

public void User_should_receive_a_confirmation_message_that_the_Warehouse_has_been_changed() throws Throwable {
		
		Boolean isPresent1 = driver.findElements(Warehouse_Update).size()>0;
		if (isPresent1) {
			WebElement Data = driver.findElement(Warehouse_Update);
			String test1 = Data.getText(); 
			String expectedData = "Warehouse Updated Successfully";
			if (expectedData.equals(test1)) {
				System.out.println("Display the confirmation msg correct." + test1);
			} else {
				System.out.println("Display the confirmation msg is incorrect."+ test1);
			}
}
}
}

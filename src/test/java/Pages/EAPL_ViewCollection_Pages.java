package Pages;



import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.DriverFactory;
import util.Utilities;

	public class EAPL_ViewCollection_Pages  extends DriverFactory{
			

			Utilities utilities = new Utilities();
			
			
			By View_Collection        = By.xpath("(//span[text()='View Collection'])[1]");
			By Collection_Screen      = By.xpath("//div[@class='text-secondary mb-0 fw-semibold']");
			By State                  = By.xpath("//label[text()='State ']/..//div[@class='p-element p-multiselect-label-container']");
			By Sales_Person           = By.xpath("//label[text()='Sales Person ']/..//div[@class='p-element p-multiselect-label-container']");
			By State_text_field       = By.xpath("//input[@class='p-multiselect-filter p-inputtext p-component']");
			By Sales_Person_field     = By.xpath("//input[@role='textbox']");
			By Select_States          = By.xpath("//ul/p-multiselectitem/li");
			By Select_Slp             = By.xpath("//div/ul/p-multiselectitem/li");
			By Sales_Icon             = By.xpath("//searchicon[contains(@class,'p-element p-icon-wrapper')]");
			By Party                  = By.xpath("//input[@placeholder='Enter Party Name/Code']");
			By Select_Party			  = By.xpath("//span[text()='Joshitha Traders - Bommilingam']");
			By Status                 = By.xpath("//select[@formcontrolname='statusId']");
			By Search                 = By.xpath("//button[@class='btn btn-secondary btn-sm me-2']");
			By Warehouse_field        = By.xpath("(//select[@formcontrolname='whsCode'])[2]");
			By Save_button1           = By.xpath("//button[text()='Save']");
			By ViewCollection         = By.xpath("//div[@class='card-header']");
			By Fromdate               = By.xpath("//input[@formcontrolname='fromDate']");
			By Todate                 = By.xpath("//input[@formcontrolname='toDate']");
			By Received_button        = By.xpath("//button[@title='Received']");
			By Reason_field           = By.xpath("//textarea[@placeholder='Enter Reason']");
			By Reject_Icon            = By.xpath("(//button[@title='Reject'])[1]");
			By Reject_Reason_field    = By.xpath("//textarea[@placeholder='Enter Reason']");
			By Val_Text               = By.xpath("//h2[text()='Reason is Required']");
			By Validation_text        = By.xpath("//h2[text()='Status Updated Successfully']");
			By Status_Received        = By.xpath("(//span[@class='badge rounded-pill text-bg-success'])[1]");
			By Status_Reject          =By.xpath("//span[@class='badge rounded-pill text-bg-danger']");
			By Table                  = By.xpath("//table[@role='table']");
			By Sort                   = By.xpath("//th[@role='columnheader']");
			By Status_filter          = By.xpath("(//p-columnfilter)[4]");
			By Status_filter_text     = By.xpath("//input[@class='p-inputtext p-component p-element ng-star-inserted']");
			By Status_filter_Apply    = By.xpath("//span[text()='Apply']");
			By Collection_details     = By.xpath("(//div[@class='d-flex align-items-center justify-content-start'])[1]");
			By View_Icon              = By.xpath("(//button[@class='btn btn-info btn-sm me-1'])[1]");	
			By Collection_details_Col = By.xpath("(//td)[2]");
			By Party_details          = By.xpath("(//td)[3]");
			By Payment_details        = By.xpath("(//td)[4]");
			By Status_Column          = By.xpath("(//td)[5]");
			By Collection_Details     = By.xpath("(//div[@class='d-flex align-items-center justify-content-start'])[1]");
			By Party_Details          = By.xpath("(//div[@class='d-flex align-items-center justify-content-start'])[2]");
			By Payment_Details        = By.xpath("(//div[@class='d-flex align-items-center justify-content-start'])[3]");
			By Status_Column_Grid     = By.xpath("(//div[@class='d-flex align-items-center justify-content-start'])[4]");
			By Remarks_Column         = By.xpath("(//div[@class='d-flex align-items-center justify-content-start'])[5]");
			By Action_Column          = By.xpath("//th[text()='Actions']");
			By Pagination_records     = By.xpath("//span[@class='p-element p-dropdown-label p-inputtext ng-star-inserted']");
			By Next_Page             = By.xpath("//button[@class='p-ripple p-element p-paginator-next p-paginator-element p-link']");
			By Before_Page            = By.xpath("//button[@class='p-ripple p-element p-paginator-prev p-paginator-element p-link']");
			By Last_page              = By.xpath("//button[@class='p-ripple p-element p-paginator-last p-paginator-element p-link ng-star-inserted']");
			By First_Page             = By.xpath("//button[@class='p-ripple p-element p-paginator-first p-paginator-element p-link ng-star-inserted']");
			

			public void User_click_on_the_View_Collection_under_the_Orders_Module() throws Throwable {
				utilities.webDriverWait(driver, View_Collection);	
				driver.findElement(View_Collection).click();
				utilities.MinimumWait(driver);
			}
			public void The_View_Collection_Screen_is_displayed_or_not() {
				WebElement Collection = driver.findElement(Collection_Screen);
				String expectedCollection = "View Collection";
				String actualCollection = Collection.getText().trim();
				if (actualCollection.equals(expectedCollection)) {
				    System.out.println("The View Collection screen is displayed: " + actualCollection);
				} else {
				    System.out.println("The View Collection screen is not displayed."+ actualCollection);
				}
				
			}

			public void Select_the_State() throws Throwable {
				driver.findElement(State).click();
				driver.findElement(State_text_field).sendKeys("Andhra");
				driver.findElement(Select_States).click();
				utilities.MinimumWait(driver);
//				Robot r = new Robot();
//				r.keyPress(KeyEvent.VK_DOWN);
//				Thread.sleep(2000);
//				r.keyPress(KeyEvent.VK_ENTER);
//				Thread.sleep(2000);
				driver.findElement(ViewCollection).click();
				utilities.MinimumWait(driver);
				Thread.sleep(1000);
				utilities.MediumWait(driver);	
				
			}

			public void The_User_Select_the_Sales_Person() throws Throwable {
				driver.findElement(Sales_Person).click();
				Thread.sleep(2000);
				driver.findElement(Sales_Person_field).sendKeys("Super");
				driver.findElement(Select_Slp).click();
				utilities.MinimumWait(driver);
//				Robot r = new Robot();
//				r.keyPress(KeyEvent.VK_DOWN);
//				Thread.sleep(2000);
//				r.keyPress(KeyEvent.VK_ENTER);
//				Thread.sleep(2000);
				driver.findElement(ViewCollection).click();
				utilities.MinimumWait(driver);
				Thread.sleep(1000);
				utilities.MediumWait(driver);	
			}

			public void The_User_enter_the_partyname() throws Throwable {
				driver.findElement(Party).click();
				Thread.sleep(2000);
				driver.findElement(Party).sendKeys("Sri ");
				Thread.sleep(2000);
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_DOWN);
				Thread.sleep(2000);
				r.keyPress(KeyEvent.VK_ENTER);
//				driver.findElement(Select_Party).click();
				utilities.MinimumWait(driver);
				
			}

			public void The_user_Select_the_From_date_and_ToDate() throws Throwable {
				utilities.webDriverWait(driver, Fromdate);
				driver.findElement(Fromdate).sendKeys("01012024");
				utilities.MinimumWait(driver);
				
				
			}

			public void The_user_Click_on_the_Search_button() throws Throwable {
				utilities.webDriverWait(driver, Search);	
				driver.findElement(Search).click();
				utilities.MinimumWait(driver);
//				driver.findElement(Collection_details).click();
				
			}

			public void Click_on_the_Received_button() throws Throwable {
				utilities.webDriverWait(driver, Received_button);	
				driver.findElement(Received_button).click();
				utilities.MinimumWait(driver);
				
			}

			public void The_user_enter_the_data_in_Reason_field() throws Throwable {
				utilities.webDriverWait(driver, Reason_field);	
				driver.findElement(Reason_field).sendKeys("Reason");
				utilities.MinimumWait(driver);
				
			}

			public void User_Click_on_the_save_button() throws Throwable {
				utilities.webDriverWait(driver, Save_button1);	
				driver.findElement(Save_button1).click();
				utilities.MinimumWait(driver);
				
			}

			public void Click_on_the_Reject_Icon() throws Throwable {
				utilities.webDriverWait(driver, Reject_Icon);	
				driver.findElement(Reject_Icon).click();
				utilities.MinimumWait(driver);
				driver.findElement(Save_button1).click();
				WebElement QuantityData = driver.findElement(Val_Text);
				String QuantityDataText = QuantityData.getText();
				System.out.println("The validation text is displayed: " + QuantityDataText);
					
			}
		  public void The_user_enter_the_data_in_Remarks_field() throws Throwable {
			  utilities.webDriverWait(driver, Reject_Reason_field);	
				driver.findElement(Reject_Reason_field).sendKeys("Collection Rejected");
				utilities.MinimumWait(driver);
				
			}
			public void Verify_the_Collection_Accepted_Validation_msg_is_displayed_or_not() {
				Boolean isPresent = !driver.findElements(Validation_text).isEmpty();

				if (isPresent) {
				    WebElement data = driver.findElement(Validation_text);

				    WebDriverWait wait = new WebDriverWait(driver, 10); 
				    wait.until(ExpectedConditions.visibilityOf(data));

				    String test = data.getText();
				    String expectedData = "Status Updated Successfully";

				    if (expectedData.equals(test)) {
				        System.out.println("Display Validation msg is correct: " + test);
				    } else {
				        System.out.println("Display Validation msg is incorrect: " + test);
				    }
				} else {
				    System.out.println("Display message element not found");
				
			}
			
			
			}
			public void Verify_the_Status_is_updated_or_not() {
			Boolean isPresent = !driver.findElements(Status_Received).isEmpty();

			if (isPresent) {
			    WebElement data = driver.findElement(Status_Received);

			    WebDriverWait wait = new WebDriverWait(driver, 10); 
			    wait.until(ExpectedConditions.visibilityOf(data));

			    String test = data.getText();
			    String expectedData = "Received";

			    if (expectedData.equals(test)) {
			        System.out.println("Display Status is correct: " + test);
			    } else {
			        System.out.println("Display Status is incorrect: " + test);
			    }
			} else {
			    System.out.println("Display Status element not found");
			
		}
			}

			public void Verify_the_Collection_Rejected_Validation_msg_is_displayed_or_not() {
				Boolean isPresent = !driver.findElements(Validation_text).isEmpty();

				if (isPresent) {
				    WebElement data = driver.findElement(Validation_text);

				    WebDriverWait wait = new WebDriverWait(driver, 10); 
				    wait.until(ExpectedConditions.visibilityOf(data));

				    String test = data.getText();
				    String expectedData = "Status Updated Successfully";

				    if (expectedData.equals(test)) {
				        System.out.println("Display Validation msg is correct: " + test);
				    } else {
				        System.out.println("Display Validation msg is incorrect: " + test);
				    }
				} else {
				    System.out.println("Display message element not found");
				
			}
				
			}

			public void Verify_the_Rejected_Status_is_updated_or_not() {
				Boolean isPresent = !driver.findElements(Status_Reject).isEmpty();

				if (isPresent) {
				    WebElement data = driver.findElement(Status_Reject);

				    WebDriverWait wait = new WebDriverWait(driver, 10); 
				    wait.until(ExpectedConditions.visibilityOf(data));

				    String test = data.getText();
				    String expectedData = "Reject";

				    if (expectedData.equals(test)) {
				        System.out.println("Display Validation msg is correct: " + test);
				    } else {
				        System.out.println("Display Validation msg is incorrect: " + test);
				    }
				} else {
				    System.out.println("Delete message element not found");
				
			}
				
			}

			public void Verify_the_Collection_details_grid_headers_and_Sorting() throws Throwable {
				
				WebElement grid = driver.findElement(Table);
				WebElement tableHeaderRow = grid.findElement(By.tagName("thead"));
				List<WebElement> tableHeaders = tableHeaderRow.findElements(By.tagName("th"));

				// Define expected header values
				String[] expectedHeaders = {"", "Collection Details", "Party Details", "Payment Details", "Status", "Remarks"};

				// Verify table headers and click sorting for each header
				for (int i = 0; i < expectedHeaders.length; i++) {
				    WebElement columnHeader = tableHeaders.get(i);
				    
				    // Click on the header to sort
				    columnHeader.click();
				    // Assuming utilities.MaximumWait(driver) and utilities.MinimumWait(driver) are defined elsewhere
				    
				    // Verify sorting by checking if the table has changed its order
				    // You can implement a method to check the order of elements in the table here
				    
				    // Click again to revert sorting
				    columnHeader.click();
				    // Assuming utilities.MaximumWait(driver) and utilities.MinimumWait(driver) are defined elsewhere
				    
				    // Verify header text
				    String columnName = columnHeader.getText(); 
				    Assert.assertEquals(columnName, expectedHeaders[i]);
				    System.out.println(columnName);
				}

		}	
				
			public void Click_on_the_Status_Filter_Icon() throws Throwable {
				utilities.webDriverWait(driver, Status_filter);
				driver.findElement(Status_filter).click();
				driver.findElement(Status_filter_text).sendKeys("Pen");
				driver.findElement(Status_filter_Apply).click();
					
			}

			public void Click_on_the_collection_View_Icon_in_the_Action_Column() throws Throwable {
				WebElement CollectionData = driver.findElement(Collection_details_Col);
				String CollectionDataText = CollectionData.getText();
				System.out.println("The Collection details are displayed: " + CollectionDataText);
				
				WebElement PartyData = driver.findElement(Party_details);
				String PartyDataText = PartyData.getText();
				System.out.println("The Party details are displayed: " + PartyDataText);
						
				WebElement PaymentData = driver.findElement(Payment_details);
				String PaymentDataText = PaymentData.getText();
				System.out.println("The Payment details are displayed: " + PaymentDataText);
						
				WebElement Status = driver.findElement(Status_Column);
				String StatusText = Status.getText();
				System.out.println("The Status is displayed: " + StatusText);
						
				utilities.webDriverWait(driver, View_Icon);
				driver.findElement(View_Icon).click();
				
			}
			
			public void Verify_Column_names_are_displayed_or_not() {
				WebElement Collection2 = driver.findElement(Collection_Details);
				String expectedCollection = "Collection Details";
				String actualCollection = Collection2.getText().trim();
				if (actualCollection.equals(expectedCollection)) {
				    System.out.println("The Collection details Column name is displayed correct: " + actualCollection);
				} else {
				    System.out.println("The Collection details Column name is displayed incorrect." +actualCollection);
				}
				
				WebElement Party2 = driver.findElement(Party_Details);
				String expectedParty = "Party Details";
				String actualParty = Party2.getText().trim();
				if (actualParty.equals(expectedParty)) {
				    System.out.println("The Party details Column name is displayed correct: " + actualParty);
				} else {
				    System.out.println("The Party details Column name is displayed incorrect."+ actualParty);
				}
				
				WebElement Payment2 = driver.findElement(Payment_Details);
				String expectedPayment = "Payment Details";
				String actualPayment = Payment2.getText().trim();
				if (actualPayment.equals(expectedPayment)) {
				    System.out.println("The Payment details Column name is displayed correct: " + actualPayment);
				} else {
				    System.out.println("The Payment details Column name is displayed incorrect."+ actualPayment);
				}
				
				WebElement Status2 = driver.findElement(Status_Column_Grid);
				String expectedStatus = "Status";
				String actualStatus = Status2.getText().trim();
				if (actualStatus.equals(expectedStatus)) {
				    System.out.println("The Status Column name is displayed correct: " + actualStatus);
				} else {
				    System.out.println("The Status Column name is displayed incorrect." + actualStatus);
				}
				
				WebElement Remarks2 = driver.findElement(Remarks_Column);
				String expectedRemarks = "Remarks";
				String actualRemarks = Remarks2.getText().trim();
				if (actualRemarks.equals(expectedRemarks)) {
				    System.out.println("The Remarks Column name is displayed correct: " + actualRemarks);
				} else {
				    System.out.println("The Remarks Column name is displayed incorrect." + actualRemarks);
				}
				
				WebElement Action2 = driver.findElement(Action_Column);
				String expectedAction = "Actions";
				String actualAction = Action2.getText().trim();
				if (actualAction.equals(expectedAction)) {
				    System.out.println("The Action Column name is displayed Correct: " + actualAction);
				} else {
				    System.out.println("The Action Column is displayed incorrect." + actualAction);
				}
				
				
			}
			public void By_default_ten_records_are_displayed() throws Throwable {
				WebElement Page = driver.findElement(Pagination_records);
				String expectedPage = "10";
				String actualPage = Page.getText().trim();
				if (actualPage.equals(expectedPage)) {
				    System.out.println("The ten records are displayed: " + actualPage);
				} else {
				    System.out.println("The ten records are not displayed." + actualPage);
				}
				utilities.MediumWait(driver);
				
			}
			public void check_whether_it_is_navigating_to_the_after_page_records_when_the_user_clicks_on_Next_page_icon() throws Throwable {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,1766)", "");
				
				utilities.MediumWait(driver);
				utilities.webDriverWait(driver, Next_Page);
				driver.findElement(Next_Page).click();
				
			}
			public void check_whether_it_is_navigating_to_the_before_page_records_when_the_user_clicks_on_before_page_icon() throws Throwable {
				utilities.webDriverWait(driver, Before_Page);
				driver.findElement(Before_Page).click();
				
			}
			
			public void check_whether_it_is_displaying_the_last_page_records_when_the_user_clicks_on_last_page_icon() throws Throwable {
				utilities.webDriverWait(driver, Last_page);
				driver.findElement(Last_page).click();
			}
			public void The_Search_related_data_is_displayed_in_the_grid() {
			
				WebElement CollectionData = driver.findElement(Collection_details_Col);
				String CollectionDataText = CollectionData.getText();
				System.out.println("The Collection details are displayed: " + CollectionDataText);
				
				WebElement PartyData = driver.findElement(Party_details);
				String PartyDataText = PartyData.getText();
				System.out.println("The Party details are displayed: " + PartyDataText);
						
				WebElement PaymentData = driver.findElement(Payment_details);
				String PaymentDataText = PaymentData.getText();
				System.out.println("The Payment details are displayed: " + PaymentDataText);
			
			}
			public void check_whether_it_is_displaying_the_first_page_records_when_the_user_clicks_on_first_page_icon() throws Throwable {
				utilities.webDriverWait(driver, First_Page);
				driver.findElement(First_Page).click();
			}

}

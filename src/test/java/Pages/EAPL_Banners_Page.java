package Pages;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;

	import util.DriverFactory;
	import util.Utilities;

	public class EAPL_Banners_Page extends DriverFactory{
		Utilities utilities = new Utilities();

		By Banners_Screen    = By.xpath("(//span[text()='Banners'])[1]");
		By Banners_page_name = By.xpath("//div[text()='Banners']");
		By Add_Banner_Button = By.xpath("//button[text()=' Add Banner']");
		By Add_Banner_Page   = By.xpath("//div[text()='Add Banner']");
		By Banner_name       = By.xpath("//input[@placeholder='Enter Banner Name']");
		By Save_button       = By.xpath("//button[@class='btn btn-md btn-primary px-5']");
		By Cancel_button     = By.xpath("//button[@class='btn btn-md btn-danger btn-active-light-primary me-2']");
		By Delete_button     = By.xpath("(//button[@class='btn btn-danger btn-sm'])[4]");
		By Toaster_message   = By.xpath("//h2[text()='Mandatory Fields Are Required With  Valid Data.']");
		By Confirmation_message = By.xpath("//h2[text()='Banner Uploaded Successfully']");
		By Yes_Button        = By.xpath("//button[text()='Yes']");
		By No_button         = By.xpath("(//button[text()='No'])[2]");
		By Delete_msg        = By.xpath("//h2[text()='Banner Deleted Successfully']");
		By File_msg          = By.xpath("//h2[text()='This File is not allowed. Allowed File Extensions are .jpg, .png, ']");
		By Attachment_Validation  = By.xpath("//h2[text()='Attachment is Required']");
		
		public void User_click_on_the_Banners_under_the_Masters_Module() throws Throwable {
			utilities.webDriverWait(driver, Banners_Screen);
			driver.findElement(Banners_Screen).click();
		}
		public void the_Banners_Screen_should_be_displayed() throws Throwable {
			utilities.webDriverWait(driver, Banners_page_name);
			WebElement data = driver.findElement(Banners_page_name);
			String dataText = data.getText();
			System.out.println("Should display the Banners Screen name: " + dataText);
		}
		public void User_Click_on_the_Add_Banner_button() throws Throwable {
			utilities.webDriverWait(driver, Add_Banner_Button);
			driver.findElement(Add_Banner_Button).click();		
		}
		public void the_Add_Banners_Page_Should_be_displayed() throws Throwable {
			utilities.webDriverWait(driver, Add_Banner_Page);
			WebElement data = driver.findElement(Add_Banner_Page);
			String dataText = data.getText();
			System.out.println("Should display the Add Banner Page: " + dataText);	
			
		}
		public void the_User_enters_data_in_the_Banner_name_field() throws Throwable {
			utilities.webDriverWait(driver, Banner_name);
			driver.findElement(Banner_name).sendKeys("Banner5");	
			
		}
		public void User_Select_the_Banner_attachment() {
			
			
		}
		public void User_Click_on_the_Save_button_in_the_Add_banner_page() throws Throwable {
			utilities.webDriverWait(driver, Save_button);
			driver.findElement(Save_button).click();		
		}
		public void User_clicks_on_the_Save_button_without_entering_any_data() throws Throwable {
			utilities.webDriverWait(driver, Save_button);
			driver.findElement(Save_button).click();		
			
		}
		public void User_Should_Receive_an_error_message() {
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
		public void the_User_clicks_on_the_Delete_button() throws Throwable {
			utilities.webDriverWait(driver, Delete_button);
			driver.findElement(Delete_button).click();	
			utilities.webDriverWait(driver,Yes_Button );
			driver.findElement(Yes_Button).click();	
		}
		public void the_User_should_receive_a_deleted_message_and_the_banner_should_be_deleted() {
			Boolean isPresent = driver.findElements(Delete_msg).size()>0;
			if (isPresent) {
			WebElement Data = driver.findElement(Delete_msg);
			String test = Data.getText(); 
			String expectedData = "Banner Deleted Successfully";
			if (expectedData.equals(test)) {
				System.out.println("Display validation msg is correct." + test);
			} else {
				System.out.println("Display validation msg is incorrect."+ test);
			}
		}
			
		}
		public void the_User_clicks_on_the_Cancel_button() throws Throwable {
			utilities.webDriverWait(driver, Cancel_button);
			driver.findElement(Cancel_button).click();	
			
		}
		public void the_Add_Banners_Page_should_be_closed() throws Throwable {
			utilities.webDriverWait(driver, Banners_page_name);
			WebElement data = driver.findElement(Banners_page_name);
			String dataText = data.getText();
			System.out.println("Should display the Banners Screen name: " + dataText);
			
		}
		public void User_should_receive_a_confirmation_message_that_the_Banner_has_been_Created() {
			Boolean isPresent = driver.findElements(Confirmation_message).size()>0;
			if (isPresent) {
			WebElement Data = driver.findElement(Confirmation_message);
			String test = Data.getText(); 
			String expectedData = "Banner Uploaded Successfully";
			if (expectedData.equals(test)) {
				System.out.println("Display Confirmation msg is correct." + test);
			} else {
				System.out.println("Display Confirmation msg is incorrect."+ test);
			}
		}
			
		}
		public void User_Select_the_Pdf_file_in_the_Banner_attachment() throws Throwable {
			Thread.sleep(1500);
			utilities.MediumWait(driver);
		}
		public void The_User_Should_Receive_an_error_message() {
			Boolean isPresent = driver.findElements(File_msg).size()>0;
			if (isPresent) {
			WebElement Data = driver.findElement(File_msg);
			String test = Data.getText(); 
			String expectedData = "This File is not allowed. Allowed File Extensions are .jpg, .png,";
			if (expectedData.equals(test)) {
				System.out.println("Display validation msg is correct." + test);
			} else {
				System.out.println("Display validation msg is incorrect."+ test);
			}
		}
			
		}
		public void User_clicks_on_the_Save_button_without_select_the_attachment() throws Throwable {
			utilities.webDriverWait(driver, Save_button);
			driver.findElement(Save_button).click();	
			
		}
		public void The_user_Should_Receive_an_error_message() {
			Boolean isPresent = driver.findElements(Attachment_Validation).size()>0;
			if (isPresent) {
			WebElement Data = driver.findElement(Attachment_Validation);
			String test = Data.getText(); 
			String expectedData = "Attachment is Required";
			if (expectedData.equals(test)) {
				System.out.println("Display validation msg is correct." + test);
			} else {
				System.out.println("Display validation msg is incorrect."+ test);
			}
		}
			
		}



}

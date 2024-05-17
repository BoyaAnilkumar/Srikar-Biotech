package Pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.DriverFactory;
import util.Utilities;

public class SBPL_Item_master_Pages extends DriverFactory{
	Utilities utilities = new Utilities();
    String Company;
    
	By Item_Master             = By.xpath("(//span[text()='Item Master'])[1]");
	By Save_Button             = By.xpath("//button[@type='submit']");
	By Company_name            = By.xpath("//select[@formcontrolname='companyId']");
	By Category                = By.xpath("//select[@formcontrolname='itemGrpCod']");
	By Items                   = By.xpath("//div[text()='Select Items']");
	By Items_click	           = By.xpath("//div[@class='p-element p-multiselect-label-container']");
	By Text_field              = By.xpath("//input[@role='textbox']");
	By Select_Items	           = By.xpath("//ul/p-multiselectitem/li");
	By Browse_File	           = By.xpath("//label[text()='Browse for file']");
	By Filter_Text_field       = By.xpath("//input[@class='p-inputtext p-component p-element ng-star-inserted']");
	By filter_icon             = By.xpath("(//p-table/div/div/table/thead/tr/th/p-columnfilter)[2]");
	By Filter_Clear            = By.xpath("//span[text()='Clear']");
	By delete_icon             = By.xpath("(//button[@title='Delete'])[1]");
	By Yes_button              = By.xpath("//button[text()='Yes']");
	By Edit_Icon               = By.xpath("(//button[@title='Edit'])[1]");
	By Active                  = By.xpath("(//label[text()='Active'])[2]");
	
	public void User_click_on_the_Item_Master_under_the_Masters_Module() throws Throwable {
		utilities.webDriverWait(driver, Item_Master);
		driver.findElement(Item_Master).click();
		
	}
	public void User_Click_on_the_Save_Button() throws Throwable {
		utilities.webDriverWait(driver, Save_Button);
		driver.findElement(Save_Button).click();
		utilities.MediumWait(driver);
		
	}
	public void User_Select_the_Company_name() throws Throwable {
		driver.findElement(Company_name).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
	}
	public void User_Select_the_Category() throws Throwable {
		driver.findElement(Category).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);		
		
	}
	public void User_Select_the_Items()throws Throwable {
		driver.findElement(Items).click();
		driver.findElement(Text_field).sendKeys("Sri");
		driver.findElement(Select_Items).click();
		utilities.MinimumWait(driver);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.findElement(Items_click).click();
		utilities.MinimumWait(driver);
		Thread.sleep(1000);
		utilities.MediumWait(driver);
	}
	public void upload_the_file_in_Items_attachment() throws Throwable {
//		utilities.webDriverWait(driver, Browse_File);
//		//driver.findElement(Browse_File).click();
//		utilities.MinimumWait(driver);
//		WebElement uploadField = driver.findElement(Browse_File);
//
//        // Provide the path of the file to upload
//        String filePath = "D:\\\\Srikar Images";
//        uploadField.sendKeys(filePath);
		try {
		By browseFile = By.id("Browse_File"); // Replace with the correct locator for your input element

		driver.findElement(Browse_File).click();
      
		FluentWait<WebDriver> wait = null;
		@SuppressWarnings("null")
		WebElement uploadField = wait.until(ExpectedConditions.elementToBeClickable(browseFile));

        
        String filePath = "D:\\Srikar Images\\1 - Acetop.jpg"; // Ensure the path and file name are correct
        uploadField.sendKeys(filePath);

        
        Thread.sleep(2000); // Consider removing or adjusting as needed

       
        By uploadButton = By.id("upload-button"); // Replace with the correct locator for the upload button
        wait.until(ExpectedConditions.elementToBeClickable(uploadButton)).click();

       
    } catch (InterruptedException e) {
        e.printStackTrace();
    } finally {
        // Close the browser
        driver.quit();
    }
		
}

    
	public void User_enter_the_Data_in_the_filter_field() throws Throwable {
		utilities.webDriverWait(driver, Filter_Text_field);
		driver.findElement(Filter_Text_field).sendKeys("Pesticide");
		utilities.MinimumWait(driver);	
		
	}
	public void User_Click_on_the_Filter_icon() throws Throwable {
			utilities.webDriverWait(driver,filter_icon );		
			driver.findElement(filter_icon).click();
			
		}
	public void User_Click_on_the_Clear_Button() throws Throwable {
		driver.findElement(filter_icon).click();
		utilities.webDriverWait(driver,Filter_Clear );		
		driver.findElement(Filter_Clear).click();
		utilities.MinimumWait(driver);	
		driver.findElement(filter_icon).click();
	
	}
	public void Click_on_the_Delete_Icon() throws Throwable {
		
		WebElement buttonElement = driver.findElement(delete_icon);
		if (buttonElement.isEnabled()) {
			System.out.println("Button is enabled.");
			driver.findElement(delete_icon).click();
			utilities.MediumWait(driver);
			utilities.webDriverWait(driver,Yes_button );		
			driver.findElement(Yes_button).click();	
	//		driver.findElement(No).click();

		} else {
			driver.findElement(Edit_Icon).click();
			utilities.MinimumWait(driver);
			driver.findElement(Active).click();
			driver.findElement(Save_Button).click();
		}
				
	}
	public void Click_on_the_Edit_Icon() throws Throwable {
		utilities.webDriverWait(driver,Edit_Icon );		
		driver.findElement(Edit_Icon).click();
		
	}
	public void Update_the_category() throws Throwable {
		driver.findElement(Category).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
	}
	public void Update_the_Items() throws Throwable {
		driver.findElement(Items).click();
//		driver.findElement(Text_field).sendKeys("Sri");
		driver.findElement(Select_Items).click();
		utilities.MinimumWait(driver);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		driver.findElement(Items_click).click();
		utilities.MinimumWait(driver);	
		driver.findElement(Active).click();
	}
	public void Click_on_the_Update_button() throws Throwable {
		utilities.webDriverWait(driver, Save_Button);
		driver.findElement(Save_Button).click();
		
	}
	

}

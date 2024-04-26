package Stepdefinition;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import util.DriverFactory;
import util.Utilities;



public class Hooks extends DriverFactory{
	
	@Before
	public void setUp(Scenario scenario) throws Throwable {
		//Driver initialization
		initialization();
		Utilities.scenario = scenario;
	}
	@AfterStep
	public void as(Scenario scenario) throws IOException {
		scenario.attach(Utilities.getByteScreenshot(driver), "image/png", "");
	}
	

	
//	Optional screenshot code
	
//	public void TakeScreenShot() throws IOException{
//    TakesScreenshot scrShot =((TakesScreenshot) driver);
//    File SourceFile=scrShot.getScreenshotAs(OutputType.FILE);
//    File DestFile=new File("yourpath/screenshot1.png");
//    FileUtils.copyFile(SourceFile, DestFile);
//}
	
//	public void as(Scenario scenario) throws IOException {
//		
//		if(scenario.isFailed()) {
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
//		scenario.attach(screenshot, "image/png", "Screenshot");
//		}else {
//			TakesScreenshot ts = (TakesScreenshot) driver;
//			byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
//			scenario.attach(screenshot, "image/png", "Passed Screentshot");
//		}
//		
//	}
	
	
	
	@After
	public void CloseBrowser() throws Throwable {
		Thread.sleep(1000);
		driver.close();
		driver.quit();
	}
	
}
package pages;
import java.io.IOException;

//import util.excl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base_File.base_code;
import excel.excel;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement; 
public class sms__messaging extends base_code
{
	 public sms__messaging() throws InterruptedException {
	        this.wd = (AppiumDriver<MobileElement>) wd;
	        PageFactory.initElements(wd, this);
	        Thread.sleep(5000);
	    }
	 
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[8]")
	WebElement os;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[4]")
	WebElement sms_messaging;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[1]/android.widget.EditText")
	WebElement recipient_name;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[2]/android.widget.EditText")
	WebElement message;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[3]/android.widget.Button")
	WebElement send ;
	 @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup")
	 WebElement MessagingPage;
	 excel excel; 
	public void clicks_os()
	 {
		 os.click();
	 }
	
	public void hit_sms_messaging()
	 {
		 sms_messaging.click();
		 Assert.assertTrue(this.MessagingPage.isDisplayed());
	 }
	
	public void enters_recipient_name() throws IOException
	 {
		excel = new excel();
	    recipient_name.sendKeys(excel.get_name());
	 }
	
	public void write_message() throws InterruptedException, IOException
	 {
		
		 message.sendKeys(excel.get_message());
		 Thread.sleep(10000);
		 
	 }
	public void send_message() throws InterruptedException
	 {
		 send.click();
		 Thread.sleep(5000);
		 wd.quit();
	 }
}




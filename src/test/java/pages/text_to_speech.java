package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base_File.base_code;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement; 
public class text_to_speech extends base_code
{
	 public text_to_speech() throws InterruptedException {
	        this.wd = (AppiumDriver<MobileElement>) wd;
	        PageFactory.initElements(wd, this);
	        Thread.sleep(5000);
	    }
	 @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[3]")
	 WebElement app;
	 @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[12]")
	 WebElement text_to_speech;	 
	 @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup")
	 WebElement textToSpeechPage;

	public void click_app()
	 {
		 app.click();
	 }
	
	public void swipe_down() throws InterruptedException{
		Thread.sleep(4000);
		swipeDown(0.70,0.10,0.50); 
		Thread.sleep(3000);
	 }
	
	public void click_text_to_speech() throws InterruptedException
	 {
		 text_to_speech.click();
		 Assert.assertTrue(this.textToSpeechPage.isDisplayed());
		 Thread.sleep(5000);
		 wd.quit();
	 }
	
}




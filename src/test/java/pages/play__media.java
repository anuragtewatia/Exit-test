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
public class play__media extends base_code
{
	 public play__media() throws InterruptedException {
	        this.wd = (AppiumDriver<MobileElement>) wd;
	        PageFactory.initElements(wd, this);
	        Thread.sleep(5000);
	    }
	 @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[6]")
	 WebElement media;
	 @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]")
	 WebElement media_player;
	 @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.Button[4]")
	 WebElement play_audio_from_resource;
	 @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
	 WebElement mediaPlayerPage;
	
	public void click_media()
	 {
		media.click();
	 }
	
	public void click_media_player()
	 {
		media_player.click();
		Assert.assertTrue(this.mediaPlayerPage.isDisplayed());
	 }
	
	public void play_audio_from_resource() throws InterruptedException
	 {
		play_audio_from_resource.click();
		 Thread.sleep(10000);
		 wd.quit();
	 }
	
}




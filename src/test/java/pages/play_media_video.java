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
public class play_media_video extends base_code
{
	 public play_media_video() throws InterruptedException {
	        this.wd = (AppiumDriver<MobileElement>) wd;
	        PageFactory.initElements(wd, this);
	        Thread.sleep(5000);
	    }
	 
	 @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[6]")
	 WebElement media;
	 @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]")
	 WebElement media_player;
	 @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.Button[1]")
	 WebElement playVideo_from_local_file;
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
	
	public void play_video_from_local_file() throws InterruptedException
	 {
		 playVideo_from_local_file.click();
		 Thread.sleep(5000);
		 wd.quit();
	 }
	
}




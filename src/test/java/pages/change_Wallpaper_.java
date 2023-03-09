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
public class change_Wallpaper_ extends base_code
{
	 public change_Wallpaper_() throws InterruptedException {
	        this.wd = (AppiumDriver<MobileElement>) wd;
	        PageFactory.initElements(wd, this);
	        Thread.sleep(5000);
	    }
	 @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[3]")
	 WebElement app;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]")
	 WebElement activity;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[9]")
	WebElement setNewWallpaper;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button[1]")
	WebElement newWallpaper;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button[2]")
	WebElement setWallpaper;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
	WebElement wallPaper_Page;
	 
	public void click_app()
	 {
		app.click();
	 }
	
	public void click_activity()
	 {
		activity.click();
	 }
	
	public void click_Set_new_wallpaper() throws InterruptedException
	 {
		Thread.sleep(8000);
		swipeDown(0.70,0.10,0.50); 
		Thread.sleep(7000);
		setNewWallpaper.click();
		Thread.sleep(8000);
	 }
	
	public void new_wallpaper() throws InterruptedException
	 {
		Assert.assertTrue(this.wallPaper_Page.isDisplayed());
		 newWallpaper.click();
		 Thread.sleep(6000);
	 }
	
	public void set_new_wallpaper() throws InterruptedException
	 {
		 setWallpaper.click();
		 Thread.sleep(5000);
		 wd.quit();
	 }
}
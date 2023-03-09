package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base_File.base_code;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class alarm1 extends base_code {

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[3]")
    WebElement app;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[3]")
    WebElement alarm;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[1]")
    WebElement alarmController;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.Button[1]")
    WebElement one_shot_alarm;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
    WebElement alarmPage;

    public alarm1() throws InterruptedException {
        this.wd = (AppiumDriver<MobileElement>) wd;
        PageFactory.initElements(wd, this);
        Thread.sleep(5000);
    }

    public void click_app() throws InterruptedException {
       // Thread.sleep(15000);
        app.click();
    }

    public void click_alarm() {
        alarm.click();
    }

    public void click_alarm_controller() {
        alarmController.click();
        Assert.assertTrue(this.alarmPage.isDisplayed());
    }

    public void one_Shot_alarm() throws InterruptedException {
        one_shot_alarm.click();
        Thread.sleep(4000);
        wd.quit();
    }
}

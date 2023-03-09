package Base_File;
import java.net.URL;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofMillis;
import java.io.IOException;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
public class base_code {
	
	public base_code() throws InterruptedException {
		DesiredCapabilities capabilities = new DesiredCapabilities(); 
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability ("platformVersion", "8.1");
		capabilities.setCapability ("appPackage", "com.hmh.api"); 
		capabilities.setCapability("appActivity", ".ApiDemos");
		capabilities.setCapability ("deviceName", "Android");
		capabilities.setCapability ("app", "C:\\Users\\anurag03\\Downloads\\APIDemosapkcombo.apk");
		capabilities.setCapability("isHeadless", false);
	try {
		wd = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
	}catch(Exception e) {
	 e.printStackTrace();
	}
	Thread.sleep(5000);
	}
	public AppiumDriver<MobileElement> wd = null;
	
// Scroll Function
public int swipeDown(double startpercentage, double endpercentage, double anchorpercentage) {   
	Dimension size = wd.manage().window().getSize();
	int anchor = (int) (size.width * anchorpercentage);
	int startpoint = (int) (size.height * startpercentage);
	int endpoint = (int) (size.height * endpercentage);
	new TouchAction (wd).press (point (anchor, startpoint))
	.waitAction (waitOptions(ofMillis(1000))).moveTo(point (anchor, endpoint)).release().perform();
	return 1;
}

	@AfterTest
	public void stopappium() {
		wd.quit();
	}
}
package Step_defination;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import Base_File.base_code;
public class hooks {

	@Before
	public void Hook() {
		System.out.print("...................Inside before hook..................");
	}

	@After
	public void Hook1(Scenario scenario) throws InterruptedException {
		System.out.print("................Inside after hook.................");
		if(scenario.isFailed())
		{
			base_code yt =new base_code();
			final byte[] screenshot = ((TakesScreenshot) yt.wd).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "image");
			System.out.print(" ....SCREENSHOT TAKEN!..... ");
		}
	}		
}

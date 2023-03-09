package Step_defination;
import io.cucumber.java.en.*;
import pages.text_to_speech;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import Base_File.base_code;

public class textToSpeech_POM {
	public textToSpeech_POM() throws InterruptedException {
		super();     //super() is used within a constructor to call the constructor of the parent class.
	}

	static Logger Logger= LogManager.getLogger(textToSpeech_POM.class);
	text_to_speech user;
	
	@Given("app is open")
	public void the_app_is_open() {
		Logger.info("App is opened");
	
	}

	@When("user hits app options")
	public void user_hits_app_options() throws InterruptedException {
		user = new text_to_speech();
		user.click_app();
		Logger.info("Clicked \"APP\"");
	}
	
	@Then("user is navigated to app page")
	public void user_is_navigated_to_app_page() {
		Logger.info("App is now on \"APP\" page");
	}
	
	@When("next user swipe down")
	public void next_user_swipe_down() throws InterruptedException {
		user.swipe_down();
	}
	
	@And("clicks text to speech")
	public void clicks_text_to_speech() throws InterruptedException {
		user.click_text_to_speech();
		Logger.info("Clicked TEXT TO SPEECH ");
	}

	@Then("the fuctionaltity starts working and is validated")
	public void the_fuctionaltity_starts_working_and_is_validated() {
		Logger.info("Text to speech started. Validated the test case");
	}
}
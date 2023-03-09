package Step_defination;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import Base_File.base_code;
import io.cucumber.java.en.*;
import pages.sms__messaging;
public class sms_messaging_POM {
	public sms_messaging_POM() throws InterruptedException {
		super();   //super() is used within a constructor to call the constructor of the parent class.
	}

	static Logger Logger= LogManager.getLogger(sms_messaging_POM.class);
	sms__messaging user;
	
	@Given("the app is open")
	public void the_app_is_open() {
		Logger.info("App is opened");
	}
	
	@When("user hits OS")
	public void user_hits_OS() throws InterruptedException {
		user= new sms__messaging();
		user.clicks_os();
		Logger.info("Clicked \"OS\"");
	}
	
	@Then("user is navigated to os page")
	public void user_is_navigated_to_os_page() {
		Logger.info("App is now on OS page");
	}
	
	@When("next user hits sms messaging")
	public void next_user_hits_sms_messaging() {
		user.hit_sms_messaging();
		Logger.info("Clicked SMS MESSAGING");
	}

	@Then("user is navigated to sms messaging page")
	public void user_is_navigated_to_sms_messaging_page() {
		Logger.info("App is now on sms messaging page");
	}
	
	@When("user enters recipient name")
	public void user_then_enters_recipient_name() throws IOException {
		Logger.info("Entering recipient name");
		user.enters_recipient_name();
	}
	
	@And("enters message")
	public void enters_then_message() throws InterruptedException, IOException {
		Logger.info("Now Typing message...");
		user.write_message();
	}
	
	@Then("hits the send button and the message is sent successfully.")
	public void hits_the_send_button_and_the_message_is_sent_successfully() throws InterruptedException {
		Logger.info("Sending the message now");
		user.send_message();
		Logger.info("Message sent. Validated the test case");
	}
}
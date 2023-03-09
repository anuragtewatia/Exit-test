package Step_defination;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import pages.alarm1;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import Base_File.base_code;

public class alarm_POM {
	public alarm_POM() throws InterruptedException {
		super();      //super() is used within a constructor to call the constructor of the parent class.
	}

	static Logger Logger= LogManager.getLogger(alarm_POM.class);
	alarm1 user;
	
	@Given("user is on the homepage")
	public void user_is_on_the_homepage() {
		Logger.info("App is opened");
	}
	
	@When("user hits app")
	public void user_hits_app() throws InterruptedException {
	    user = new alarm1();
		user.click_app();
		Logger.info("Clicked \"APP\"");	
	}

	@Then("user is navigated to next page")
	public void user_is_navigated_to_next_page() {
		Logger.info("App is now on \"APP\" page");
	}
	
	@When("next user hits alarm")
	public void next_user_hits_alarm() {
		user.click_alarm();
		Logger.info("Clicked ALARM");
	}

	@Then("user is navigated to alarm page")
	public void user_is_navigated_to_alarm_page() {
		Logger.info("App is now on alarm page");
	}
	
	@When("user next hits Alarm Controller")
	public void user_next_hits_Alarm_Controller() {
		user.click_alarm_controller();
		Logger.info("Clicked ALARM CONTROLLER");
	}
	
	@Then("user is navigated to Alarm controller page")
	public void user_is_navigated_to_Alarm_controller_page() {
		Logger.info("App is now on ALARM CONTROLLER page");
	}
	
	@And("user next hits one shot alarm")
	public void user_next_hits_one_shot_alarm() throws InterruptedException {
		user.one_Shot_alarm();
		Logger.info("Clicked ONE SHOT ALARM");	
	}
	
	@Then("the alarm is set succesfully")
	public void the_alarm_is_set_succesfully() {
		Logger.info("The alram is set succesfully. Validated the test case");
	}	
}
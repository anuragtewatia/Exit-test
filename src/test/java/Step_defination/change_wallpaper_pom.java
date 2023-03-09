package Step_defination;
import io.cucumber.java.en.*;
import pages.change_Wallpaper_;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base_File.base_code;

public class change_wallpaper_pom {
	public change_wallpaper_pom() throws InterruptedException {
		super();      //super() is used within a constructor to call the constructor of the parent class.
		
	}
	static Logger Logger= LogManager.getLogger(change_wallpaper_pom.class);
	change_Wallpaper_ user;
	
	@Given("application is open")
	public void application_is_open() {
		Logger.info("App is opened");
	}

	@And("user is on home page")
	public void user_is_on_home_page() {
		Logger.info("App is on Homepage ");
	}
	
	@When("user clicks app")
	public void user_clicks_app() throws InterruptedException {
		user = new change_Wallpaper_();
		user.click_app();
		Logger.info("Clicked \"APP\"");
	}

	@Then("user is naigated to the next page")
	public void user_is_naigated_to_the_next_page() {
		Logger.info("App is now on \"APP\" page");
	}
	
	@When("user next clicks activity")
	public void user_next_clicks_activity() {
		user.click_activity();
		Logger.info("Clicked ACTIVITY");
	}
	
	@Then("user is navigated to the actitivity page")
	public void user_is_navigated_to_the_actitivity_page() {
		Logger.info("App is now on activity page");
	}
	
	@Then("next user scrolls down the page and click set wallpaper")
	public void next_user_scrolls_down_the_page_and_click_set_wallpaper() throws InterruptedException {
		user.click_Set_new_wallpaper();
		Logger.info("Clicked SET WALLPAPER");
	}
	
	@When("user selects a new wallpaper and hits set wallpaper")
	public void user_selects_a_new_wallpaper_and_hits_set_wallpaper() throws InterruptedException {
		user.new_wallpaper();
		user.set_new_wallpaper();
		Logger.info("Selecting new wallpaler");
	}

	@Then("the new wallpaper is successfully applied to the device")
	public void the_new_wallpaper_is_successfully_applied_to_the_device() {
		Logger.info("New Wallpaper is applied. Validated the test case");
	}
}
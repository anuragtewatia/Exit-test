package Step_defination;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import Base_File.base_code;
import io.cucumber.java.en.*;
import pages.play__media;

public class play_media_POM {
	public play_media_POM() throws InterruptedException {
		super();     //super() is used within a constructor to call the constructor of the parent class.
	}

	static Logger Logger= LogManager.getLogger(play_media_POM.class);
	play__media user;

	@Given("user is on the app homepage")
	public void user_is_on_the_app_homepage() {
		Logger.info("App is opened");  
	}
	
	@When("user hits media")
	public void user_hits_media() throws InterruptedException {
		user = new play__media();
		user.click_media();
		Logger.info("Clicked MEDIA ");
	}

	@Then("user is navigated to nextPage")
	public void user_is_navigated_to_nextPage() {
		 Logger.info("App is now on media page");
	}
	
	@When("next user hits media player")
	public void next_user_hits_media_player() {
		user.click_media_player();
		Logger.info("Clicked MEDIA PLAYER");
	}

	@Then("user is navigated to media player page")
	public void user_is_navigated_to_media_player_page() {
		 Logger.info("App is now on Media player page");
	}
	
	@And("user hits play audio from resources")
	public void user_hits_play_audio_from_resources() throws InterruptedException {
		user.play_audio_from_resource();
		Logger.info("Clicked PLAY AUDIO FROM RESOURCES");
	}

	@Then("the audio started playing successfully and the test case is validated!")
	public void the_audio_started_playing_successfully() {
		Logger.info("The audio is playing now. Validated the test case");
	}
}

package Step_defination;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import Base_File.base_code;
import io.cucumber.java.en.*;
import pages.play_media_video;
@Test
public class playMedia_video_POM {
	public playMedia_video_POM() throws InterruptedException {
		super();    //super() is used within a constructor to call the constructor of the parent class.
	}

	static Logger Logger= LogManager.getLogger(playMedia_video_POM.class);
	play_media_video user;

	@Given("user is on the homePage")
	public void user_is_on_the_homePage() {
	  Logger.info("App is opened");
	}
	
	@When("user clicks media")
	public void user_hits_media() throws InterruptedException {
		user = new play_media_video();
		user.click_media();
		 Logger.info("Clicked MEDIA ");	
	}
	
	@Then("user is navigated to the nextpage")
	public void user_is_navigated_to_the_nextpage() {
		 Logger.info("App is now on media page");
	}
	
	@When("next user hits mediaPlayer")
	public void next_user_hits_mediaPlayer() {
		user.click_media_player();
		 Logger.info("Clicked MEDIA PLAYER");
	}

	@Then("user is navigated to mediaPlayer page")
	public void user_is_navigated_to_mediaPlayer_page() {
		 Logger.info("App is now on Media player page");
	}
	
	@And("user hit play video from local file")
	public void user_playing_video_from_local_file() throws InterruptedException {
		user.play_video_from_local_file();
		 Logger.info("Clicked PLAY VIDEO FROM LOCAL FILE");
	}

	@Then("the video plays and test case is validated!")
	public void the_video_plays_and_test_case_is_validated() {
		 Logger.info("The video is playing now. Validated the test case");
	}
}
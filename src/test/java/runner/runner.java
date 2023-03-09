package runner;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
   features = "C:\\Users\\anurag03\\Downloads\\assginment3\\exit_test\\src\\test\\java\\feature_file",
   glue = {"Step_defination"},
   monochrome=true,
   plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","html:target/cucumber-report"}
  // ,tags= "@fifthTC"
   )
public class runner extends AbstractTestNGCucumberTests{
}

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty" , "html:target/ManageAccessRunner",
        "rerun:target/Rerun_Failed/ManageAccessRunner.txt"}, //rerun plugin generates .txt file
        features = "src/main/resources/features/manageAccess.feature",
//            features = "@target/Rerun_Failed/ManageAccessRunner.txt",    //Running failed txt file
        glue = {"steps"},
        stepNotifications = true,
      //  tags="@rerun",
        //   tags="@regression and @shakeout",
        dryRun=false
)


public class ManageAccessRunner {

}

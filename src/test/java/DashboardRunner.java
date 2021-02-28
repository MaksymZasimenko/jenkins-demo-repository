import io.cucumber.junit.Cucumber;
        import io.cucumber.junit.CucumberOptions;
        import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty" , "html:target/DashboardRunner",
                "rerun:target/Rerun_Failed/DashboardRunner.txt"},
        features = "src/main/resources/features/manageAccess.feature",
        glue = {"steps"}
        , stepNotifications = true
       // tags="@regression"
        //   tags="@regression and @shakeout"
)


public class DashboardRunner {

}

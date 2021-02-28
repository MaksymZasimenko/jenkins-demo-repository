import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty" , "html:target/LoginRunner",
                "rerun:target/Rerun_Failed/LoginRunner.txt"},           //Generates html report in target folder
        features = "src/main/resources/features/excel.feature:3",    //path to the .feature file
//      features = "@target/Rerun_Failed/LoginRunner.txt",
        glue = {"steps"}                                           //path to the step definitions
    //    ,tags="@regression"
        , stepNotifications = true                                  //displays each steps in the console
        ,  dryRun=false                                             //generate step defs

)



public class LoginRunner {

}


package steps;


import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.CucumberLogUtils;
import utils.WebdriverUtils;

public class Hooks {

    @Before
    public void setUp(Scenario currentScenario){
        System.out.println("=============Setting up");
        CucumberLogUtils.initScenario(currentScenario);
    }

    @After
    public void tearDown(){

        System.out.println("=============tearing down");
        WebdriverUtils.closeWebDriver();
    }


}

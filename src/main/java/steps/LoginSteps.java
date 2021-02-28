package steps;

import impls.LoginImpl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginSteps {


    @Given("I navigate to Interview Prep")
    public void iNavigateToInterviewPrep() {
        LoginImpl impl = new LoginImpl();
        impl.navigateToPage();
    }

    @Then("I should see the {string} page")
    public void iShouldSeeThePage(String pageName) {
        LoginImpl impl = new LoginImpl();
        impl.validateCurrentPage(pageName);
    }
//============
    @Then("I enter {string} in the {string} input box")
    public void iEnterInTheInputBox(String value, String inputBoxName) {
        LoginImpl impl = new LoginImpl();
        impl.enterInInputBox(value, inputBoxName);
    }

    @Then("I click {string} button")
    public void iClickButton(String buttonName) {
        LoginImpl impl = new LoginImpl();
        impl.clickButton(buttonName);
    }

    @And("I click {string} button in {string}")
    public void iClickButtonIn(String buttonName, String windowName) {
        LoginImpl impl = new LoginImpl();
        impl.clickButton(buttonName, windowName);
    }
}


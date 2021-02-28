package steps;


import impls.ManageAccessImpl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import utils.MiscUtils;

import java.util.List;
import java.util.Map;

public class ManageAccessSteps {

    @And("I click {string} link")
    public void iClickLink(String linkText) {
        ManageAccessImpl impl = new ManageAccessImpl();
        impl.clickLink(linkText);
    }

    @Then("I enter the following values in the following fields")
    public void iEnterTheFollowingValuesInTheFollowingFields(Map<String, String> userDetails) {
        ManageAccessImpl impl = new ManageAccessImpl();
        impl.enterUserDetails(userDetails);
    }

    @And("I choose {string} from dropdown {string}")
    public void iChooseFromDropdown(String value, String dropdownName) {
        ManageAccessImpl impl = new ManageAccessImpl();
        impl.selectFromDropdown(value, dropdownName);
    }


    @Then("verify the following user exists in the table")
    public void verifyTheFollowingUserExistsInTheTable(Map<String, String> userDetails) {

        ManageAccessImpl impl = new ManageAccessImpl();
        impl.validateUserExists(userDetails);
    }

    @Then("verify the following user does NOT exist in the table")
    public void verifyTheFollowingUserDoesNOTExistInTheTable(Map<String, String> userDetails) {
        ManageAccessImpl impl = new ManageAccessImpl();
        impl.validateUserDoesNotExist(userDetails);
    }

    @And("I click {string} button of user {string}")
    public void iClickButtonOfUser(String buttonName, String email) {
        ManageAccessImpl impl = new ManageAccessImpl();
        impl.clickAction(buttonName, email);
    }

    @Then("I edit the user with following")
    public void iEditTheUserWithFollowing(Map<String,String> newUserDetails) {
        ManageAccessImpl impl = new ManageAccessImpl();
        impl.editUser(newUserDetails);
    }
}


package steps;

        import impls.DashboardImpl;
        import io.cucumber.java.en.And;
        import io.cucumber.java.en.Then;

        import java.util.List;

public class DashboardSteps {

    @Then("I verify the following dashboards are displayed:")
    public void iVerifyTheFollowingDashboardsAreDisplayed(List<String> dashboardList) {
        DashboardImpl impl = new DashboardImpl();
        impl.verifyDashboards(dashboardList);

    }

    @Then("I should see {string} error message")
    public void iShouldSeeErrorMessage(String errorMessage) {
        DashboardImpl impl = new DashboardImpl();
        impl.validateErrorMsg(errorMessage);
    }

    @Then("I delete the following dashboard:")
    public void iDeleteTheFollowingDashboard() {
    }

    @Then("I should see {string} section")
    public void iShouldSeeSection(String sectionName) {
        DashboardImpl impl = new DashboardImpl();
        impl.ifDoDontDisplayed(sectionName);
    }

    @And("I validate {string} is displayed in {string} window")
    public void iValidateIsDisplayedInWindow(String text, String sectionName) {
        DashboardImpl impl = new DashboardImpl();
        impl.validateDoDontTextExist(text, sectionName);
    }

    @And("I validate {string} is  Not displayed in {string} window")
    public void iValidateIsNotDisplayedInWindow(String text, String sectionName) {
        DashboardImpl impl = new DashboardImpl();
        impl.validateDoDontTextNotExist(text, sectionName);
    }

    @Then("I click {string} button of {string}")
    public void iClickButtonOf(String button, String message) {
        DashboardImpl impl = new DashboardImpl();
        impl.iClickButtonOf(button, message);
    }
}

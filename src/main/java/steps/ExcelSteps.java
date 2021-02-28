package steps;

        import impls.ExcelImpl;
        import io.cucumber.java.en.Then;

        import java.util.List;

public class ExcelSteps {

    @Then("I validate the following row exists in {string} of {string}:")
    public void iValidateTheFollowingRowExistsInOf(String sheetName, String fileName, List<String> expectedData) {
        ExcelImpl impl = new ExcelImpl();
        impl.validateExcelFileRow(sheetName, fileName, expectedData);
    }
}

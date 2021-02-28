package impls;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.ui.Select;
        import pages.CommonPage;
        import pages.ManageAccessPage;
        import utils.CucumberLogUtils;
        import utils.MiscUtils;
        import utils.WebdriverUtils;

        import java.util.*;

public class ManageAccessImpl {

    public void clickLink(String linkText) {
        MiscUtils.sleep(3000);
        String elementXpath = String.format(CommonPage.XPATH_TEMPLATE_LINK, linkText);
        WebElement element = WebdriverUtils.getWebDriver().findElement(By.xpath(elementXpath));
        element.click();
        CucumberLogUtils.logPass(linkText + " was successfully clicked ", false);
    }

    public void enterUserDetails(Map<String, String> userDetails) {
        for (Map.Entry<String, String> eachEntry : userDetails.entrySet()) {
            //first name    :  will
            LoginImpl impl = new LoginImpl();
            impl.enterInInputBox(eachEntry.getValue(), eachEntry.getKey());
        }
    }

    public void selectFromDropdown(String value, String dropdownName) {
        String elementXpath = String.format(CommonPage.XPATH_TEMPLATE_XPATH_BY_ID, dropdownName);
        WebElement element = WebdriverUtils.getWebDriver().findElement(By.xpath(elementXpath));
        // element.sendKeys(value);

        Select select = new Select(element);
        select.selectByVisibleText(value);

        CucumberLogUtils.logPass(value + " was successfully selected from dropdown " + dropdownName, true);
    }

    public void validateUserExists(Map<String, String> userDetails) {
        List<String> userDetailList = new ArrayList<>(userDetails.values());

        boolean exists = ifUserExists(userDetailList);
        if (exists) {
            CucumberLogUtils.logPass("The user exists", true);
        } else {
            CucumberLogUtils.logFail("The user does NOT exist", false);
        }
    }

    public void validateUserDoesNotExist(Map<String, String> userDetails) {
        List<String> userDetailList = new ArrayList<>(userDetails.values());

        boolean exists = ifUserExists(userDetailList);

        if (!exists) {
            CucumberLogUtils.logPass("The user does not exist as expected", true);
        } else {
            CucumberLogUtils.logFail("The user exists", true);
        }
    }


    private boolean ifUserExists(List<String> userDetailList) {
        MiscUtils.sleep(5000);

        List<WebElement> webElementsList = WebdriverUtils.getWebDriver().findElements(By.xpath(ManageAccessPage.XPATH_TABLE_ROWS));
        int rowCount = webElementsList.size();

        /* Row loop */
        for (int i = 1; i <= rowCount; i++) {
            List<String> eachRowData = new ArrayList<>();
            /* Cell loop */
            int columnCount = 5;
            for (int j = 1; j <= columnCount; j++) {
                String cellXpath = String.format(CommonPage.XPATH_TEMPLATE_TABLE_CELL, i, j);
                String cellText = WebdriverUtils.getWebDriver().findElement(By.xpath(cellXpath)).getText();
                eachRowData.add(cellText);
            }

            boolean exists = userDetailList.equals(eachRowData);
            if (exists) {
                CucumberLogUtils.logPass("The user exists in row " + i, false);
                return true;
            }

        }


        return false;
    }


    public void clickAction(String buttonName, String email) {
        if(email.equals("*") && buttonName.equals("*")){
            CucumberLogUtils.logFail("Invalid entry, cannot accept wild card", false);
        }

        String elementXpath = String.format(CommonPage.XPATH_TEMPLATE_USER_BUTTON,email, buttonName );
        WebElement element = WebdriverUtils.getWebDriver().findElement(By.xpath(elementXpath));
        element.click();


        CucumberLogUtils.logPass("Successfully clicked the button " + buttonName + " for " + email, false);
    }

    public void editUser(Map<String, String> newUserDetails) {
        for(String each : newUserDetails.keySet()) {
            String elementXpath = String.format(CommonPage.XPATH_TEMPLATE_EDIT_USER, each);
            WebElement element = WebdriverUtils.getWebDriver().findElement(By.xpath(elementXpath));
            if(element.getTagName().equals("input")) element.clear();
            element.sendKeys(newUserDetails.get(each));
        }
        CucumberLogUtils.logPass("All entries have updated" , false);
    }
}

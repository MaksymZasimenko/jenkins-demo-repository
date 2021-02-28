package impls;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebElement;
        import pages.CommonPage;
        import utils.CucumberLogUtils;
        import utils.MiscUtils;
        import utils.WebdriverUtils;

        import java.util.List;


public class DashboardImpl {

    public void verifyDashboards(List<String> dashboardList) {

        for (String eachDashboard : dashboardList) {
            String elementXpath = String.format(CommonPage.XPATH_TEMPLATE_BUTTON, eachDashboard);

            try {
                WebElement webElement = WebdriverUtils.getWebDriver().findElement(By.xpath(elementXpath));

                if (webElement.isDisplayed()) {
                    CucumberLogUtils.logPass(eachDashboard + " dashboard is displayed as expected", false);
                }


            } catch (Exception e) {
                CucumberLogUtils.logFail(eachDashboard + " dashboard is NOT displayed", false);
            }

        }
        CucumberLogUtils.logPass("All the dashboards are displayed as expected: " + dashboardList, true);

    }

    public void validateErrorMsg(String errorMessage) {
        String elementXpath = String.format(CommonPage.XPATH_TEMPLATE_TEXT, errorMessage);
        WebElement webElement = WebdriverUtils.getWebDriver().findElement(By.xpath(elementXpath));

        if (webElement.isDisplayed()) {
            CucumberLogUtils.logPass("'" + errorMessage + "' is displayed as expected ", true);
        }
    }

    public void deleteDashboards(List<String> dashbaordList) {
        for (String each : dashbaordList) { //Khali //Cucumber
            String elementXpath = String.format(CommonPage.XPATH_TEMPLATE_DELETE_DASHBAORD_BUTTON, each);
            WebElement webElement = WebdriverUtils.getWebDriver().findElement(By.xpath(elementXpath));

            webElement.click();

            CucumberLogUtils.logPass("Clicked " + each + " delete button", true);
        }

    }

    public void ifDoDontDisplayed(String sectionName) {
        String elementXpath = String.format(CommonPage.XPATH_TEMPLATE_DO_DONT_SECTION, sectionName);
        try {
            WebElement webElement = WebdriverUtils.getWebDriver().findElement(By.xpath(elementXpath));

            if (webElement.isDisplayed()) {
                CucumberLogUtils.logPass("The section is displayed: " + sectionName, true);
            }
        }catch (Exception e){
            CucumberLogUtils.logFail("The section is NOT displayed: " + sectionName, true);
        }
    }

    public void validateDoDontTextExist(String text, String sectionName) {
        if(ifDoDontTextExist(text, sectionName)){
            CucumberLogUtils.logPass("The text exists in section: " +sectionName, true);
        }else{
            CucumberLogUtils.logFail("The text does NOT exist in section: " +sectionName, true);
        }
    }

    public void validateDoDontTextNotExist(String text, String sectionName) {
        if(!ifDoDontTextExist(text, sectionName)){
            CucumberLogUtils.logPass("The text does not exist as expected in section: "+sectionName, true);
        }else{
            CucumberLogUtils.logFail("The text DOES exist in section: " +sectionName, true);
        }
    }

    public boolean ifDoDontTextExist(String expected, String sectionName) {
        int index = sectionName.equals("Do's") ? 1 : 2;

        String elementXpath = String.format(CommonPage.XPATH_TEMPLATE_DO_DONT_TEXTS, index);

        List<WebElement> webElementsTextList = WebdriverUtils.getWebDriver().findElements(By.xpath(elementXpath));

        for(WebElement each : webElementsTextList){
            String actual = each.getText();
            if (actual.equals(expected)) {
                return true;
            }
        }

        return false;
    }


    public void iClickButtonOf(String button, String message) {
        String elementXpath = String.format(CommonPage.XPATH_TEMPLATE_DELETE_DODONT_MESSAGE,message);
        WebElement element = WebdriverUtils.getWebDriver().findElement(By.xpath(elementXpath));
        //        MiscUtils.click(element);
        MiscUtils.highlightElement(element).click();
        CucumberLogUtils.logPass(button + " was clicked successfully ", true);
    }
}

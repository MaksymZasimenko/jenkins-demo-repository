package pages;

public class CommonPage {

    public static final String XPATH_TEMPLATE_BUTTON = "//button[contains(text(),\"%s\")]";
    public static final String XPATH_TEMPLATE_INPUT_BOX = "//*[@placeholder='%s']";
    public static final String XPATH_TEMPLATE_TEXT = "//div[contains(text(), '%s')]";
    public static final String XPATH_TEMPLATE_DELETE_DASHBAORD_BUTTON = "//button[text()='%s']/parent::a/parent::div//div[@id='x']";
    public static final String XPATH_TEMPLATE_XPATH_BY_ID = "//*[@id='%s']";
    public static final String XPATH_TEMPLATE_LINK = "//a/*[contains(text(), '%s')]";
    public static final String XPATH_TEMPLATE_DELETE_USER = "//div[@id='myModal']//button[contains(text(),'%s')]";
    public static final String XPATH_TEMPLATE_TABLE_CELL = "//table//tbody//tr[%s]//td[%s]";
    public static final String XPATH_TEMPLATE_USER_BUTTON = "//td[contains(text(),'%s')]/parent::tr//button[text()='%s']";
    public static final String XPATH_TEMPLATE_EDIT_USER = "//h5[text()='Update User']/parent::div//*[@id='%s']";
    public static final String XPATH_TEMPLATE_DO_DONT_SECTION =  "//div[text()=\"%s\"]";
    public static final String XPATH_TEMPLATE_DO_DONT_TEXTS =  "(//div[@class='anyClass'])[%s]//div[@class='row']/div[2]";
    public static final String XPATH_TEMPLATE_DELETE_DODONT_MESSAGE = "//div[contains(text(),'%s')]//following::button[@class='btn btn-outline-danger ml-1']";

}

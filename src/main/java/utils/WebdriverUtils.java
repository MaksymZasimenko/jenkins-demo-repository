package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class WebdriverUtils {

    private static String sauceUser = LocalConfigUtils.getProperty("sauceUser");
    private static String sauceKey = LocalConfigUtils.getProperty("sauceKey");
    private static String URL = "https://"+sauceUser+":"+sauceKey+ "@ondemand.us-west-1.saucelabs.com:443/wd/hub";


    //SINGLETON WEBDRIVER

    private static WebDriver driver;

    private WebdriverUtils(){

    }


    public static WebDriver getWebDriver(){
        if(driver==null) {
            if (LocalConfigUtils.getProperty("runInSaucelabs").equalsIgnoreCase("true")) {
                driver = getRemoteDriver();
            } else {
                String browserType = LocalConfigUtils.getProperty("browser");
                System.out.println("broswer::: " + browserType);

                switch (browserType.toLowerCase()) {
                    case "firefox":
                        System.setProperty("webdriver.gecko.driver", "C:\\Users\\zasim\\OneDrive\\Desktop\\Automation\\chromedriver_win32\\geckodriver.exe");
                        driver = new FirefoxDriver();
                        break;
                    default:
                        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zasim\\OneDrive\\Desktop\\Automation\\chromedriver_win32\\chromedriver.exe");
                        driver = new ChromeDriver();
                        break;
                }

            }

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }
        return driver;

    }




    public static void closeWebDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }

    public static WebDriver getRemoteDriver(){
        WebDriver driver = null;
        try {
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            capabilities.setCapability("browserName","chrome");
            capabilities.setCapability("version", LocalConfigUtils.getProperty("browser_version"));
            capabilities.setCapability("platform", LocalConfigUtils.getProperty("os"));
            driver = new RemoteWebDriver(new URL(URL), capabilities);
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
        return driver;
    }




}








































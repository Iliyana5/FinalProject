package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
    public static WebDriver driver;

    public static WebDriver startBrowser(String browserName) {

        if (browserName.equals("firefox")) {
            driver = new FirefoxDriver();
        } else if(browserName.equals("chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equals("IE")) {
            driver = new InternetExplorerDriver();
        }

        return driver;

        }
    }








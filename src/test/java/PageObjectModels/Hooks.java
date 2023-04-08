package PageObjectModels;


import helpers.BrowserFactory;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks{

   public static WebDriver driver;


    @Before

    public void Open(){
        System.setProperty("webdriver.chrome.driver","/D://chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.getTitle();

    }


    @After
    public void Close() {
        driver.close();
    }
}


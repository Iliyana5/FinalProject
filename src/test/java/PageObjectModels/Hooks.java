package PageObjectModels;



import org.junit.After;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks  {

  public static WebDriver driver;


    @Before

    public void Open(){

        System.setProperty("webdriver.chrome.driver","/D://chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://ultimateqa.com//");

    }


    @After
    public void Close() {
        driver.close();
    }
}


package PageObjectModels;


import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class SecondPage {

    public static WebDriver driver;

    @FindBy(xpath = "//*[@id=post-217439]/h2/a")
    WebElement txt;

    public SecondPage(WebDriver driver) {
        SecondPage.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void Results() {
        System.out.println("Test passed");
    }
}
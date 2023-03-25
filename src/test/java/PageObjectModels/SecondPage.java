package PageObjectModels;


import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class SecondPage extends Hooks{

    public static WebDriver driver;

    @FindBy(xpath = "//*[@id=post-217275]/div[1]/h1")
    WebElement txt;

    public SecondPage(WebDriver driver) {
        SecondPage.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void Results(String Uname){
        this.Results("Appium with Java and Sauce Labs");
    }
}
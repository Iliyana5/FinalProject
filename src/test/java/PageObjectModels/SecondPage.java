package PageObjectModels;


import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SecondPage extends Hooks{

    public static WebDriver driver;

    @FindBy(xpath = "//*[@id=post-217275]/div[1]/h1")
    WebElement txt;

    public SecondPage(WebDriver driver) {
        SecondPage.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public String results(){
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=post-217275]/div[1]/h1")));
        Assert.assertEquals(true, driver.findElement(By.xpath("//*[@id=post-217275]/div[1]/h1")));
        return txt.getText();


    }
}
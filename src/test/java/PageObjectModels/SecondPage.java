package PageObjectModels;


import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;


public class SecondPage extends Hooks{

    public static WebDriver driver;

    @FindBy(xpath = "//*[@id=post-217439]/h2/a")
             WebElement resOne;

    @FindBy(xpath = "//*[@id=post-217279]/h2/a")
             WebElement resTwo;
    public SecondPage(WebDriver driver) {
        SecondPage.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void resultOne(){
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=post-217439]/h2/a")));
        String ExpectedText ="Java SDET Bootcamp";
        Assert.assertEquals(ExpectedText, resOne.getText());
        System.out.println("Assert passed");
    }
    public void resultsTwo(){
        Actions actions = new Actions(driver);
        actions.doubleClick(resTwo).perform();

    }

}
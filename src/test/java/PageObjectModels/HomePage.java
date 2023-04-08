package PageObjectModels;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


    public class HomePage extends Hooks {
        WebDriver driver;

        @FindBy(className = "et_pb_s")
        WebElement searchTextBox;

        @FindBy(className = "et_pb_searchsubmit")
        WebElement btn;


        public HomePage(WebDriver driver) {
            this.driver = driver;
             PageFactory.initElements(driver,this);
        }

        public void search (String SearchTerm) {
            WebDriverWait wait = new WebDriverWait(driver,10);
            wait.until(ExpectedConditions.elementToBeClickable(By.className("et_pb_s")));
            Assert.assertTrue(driver.findElement(By.className("et_pb_searchsubmit")).isEnabled());
            searchTextBox.clear();
            searchTextBox.sendKeys("SearchTerm");

        }




        public void enterBtn() {
            Assert.assertEquals(true,btn.isDisplayed());
            btn.click();


       }

    }



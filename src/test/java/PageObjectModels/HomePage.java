package PageObjectModels;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


    public class HomePage extends Hooks{
        WebDriver driver;

        @FindBy(xpath = "//*[@id=post-217173]/div/div[1]/div/div[1]/div/div/div[2]/form/div/input[1]")
        WebElement searchField;

        @FindBy(xpath = "//*[@id=post-217173]/div/div[1]/div/div[1]/div/div/div[2]/form/div/input[5]")
        WebElement btn;


        public HomePage(WebDriver driver) {
            this.driver = driver;
             PageFactory.initElements(driver,this);
        }

        public void setName(String java){
            System.out.println("The result with java");
        }


        public void EnterBtn() {
            btn.click();

        }
       public void Search(String StrName){
            this.setName("java");
            this.EnterBtn();
       }

    }



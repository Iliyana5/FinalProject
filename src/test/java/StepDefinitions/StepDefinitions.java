package StepDefinitions;

import PageObjectModels.HomePage;
import PageObjectModels.Hooks;
import PageObjectModels.SecondPage;
import io.cucumber.java.en.*;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class StepDefinitions extends Hooks{
     WebDriver driver;
     HomePage homePage;
     SecondPage secondPage;




   @Given("That I have gone to search page")
   public void thatIHaveGoneToSearchPage() {
       driver = new ChromeDriver();
       driver.get("https://ultimateqa.com");
       String URL = driver.getCurrentUrl();
       Assert.assertEquals(URL, "https://ultimateqa.com");
   }





    @When("User enters a text in search box")
    public void userEntersATextInSearchBox() {
        homePage = new HomePage(driver);
        homePage.search("java");


    }

    @Then("User is navigated to  the Search Results page")
    public void userIsNavigatedToTheSearchResultsPage() {
        secondPage.resultOne();
        secondPage.resultsTwo();
    }
}








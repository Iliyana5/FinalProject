package StepDefinition;



import PageObjectModels.HomePage;
import PageObjectModels.SecondPage;
import io.cucumber.java.en.*;



import org.openqa.selenium.WebDriver;




public class StepDefinition {
   WebDriver driver;
   HomePage homePage;
   SecondPage secondPage;


    @Given("^That I have gone to search page$")
    public void that_I_have_gone_to_search_page(){
        System.out.println("Search tool is displayed");
    }


    @When("^Users enters a text in search box$")
    public void users_enters_a_text_in_search_box(){
        homePage=new HomePage(driver);
        homePage.setName("java");



    }

    @Then("^User is navigated to  the Search Results page$")
    public void user_is_navigated_to_the_Search_Results_page(){
        driver.getPageSource().contains("Java SDET Bootcamp");

    }
}








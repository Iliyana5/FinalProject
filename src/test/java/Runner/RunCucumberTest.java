package Runner;


import PageObjectModels.Hooks;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
        features ={"classpath:features/"},
        tags = {"@search"},
        glue={"StepDefinition"},

        plugin = {"pretty", "html:target/cucumber-reports"},
        monochrome = true
)
public class RunCucumberTest extends Hooks{

}

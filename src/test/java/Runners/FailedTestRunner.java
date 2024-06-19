package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;




    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {"html:target/failed-html-report"},
            features = "@target/rerun.txt",
            glue ="Step_Definitions"

    )

    public class FailedTestRunner {

}

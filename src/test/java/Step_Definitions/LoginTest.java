package Step_Definitions;

import Pages.Login;
import Utilities.ConfigurationReader;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginTest {

    Login login = new Login(); //Pages
protected WebDriver driver = Driver.getDriver();
    @Given("User goes the login page")
    public void user_goes_the_login_page() {
driver.get(ConfigurationReader.get("login_url"));
    }
    @When("user enters the inputs")
    public void user_enters_the_inputs() {

login.usernameInput.sendKeys(ConfigurationReader.get("username"));
login.passwordInput.sendKeys(ConfigurationReader.get("password"));
login.LoginButton.click();

    }

    @When("user enters the fault inputs")
    public void user_enters_the_fault_inputs() {
        login.usernameInput.sendKeys(ConfigurationReader.get("username")+"1");
        login.passwordInput.sendKeys(ConfigurationReader.get("password")+"1");
        login.LoginButton.click();
    }

    @Then("user should be in {string}")
    public void user_should_be_in(String string) {

        String actualTitle = driver.getTitle();
        System.out.println(driver.getTitle());
        System.out.println(string);
        Assert.assertEquals(string,actualTitle);

    }

    @Then("user should be at {string}")
    public void user_should_be_at(String string) {
        String actualTitle = driver.getTitle();
        System.out.println(driver.getTitle());
        System.out.println(string);
        Assert.assertNotEquals(string,actualTitle);
    }


}

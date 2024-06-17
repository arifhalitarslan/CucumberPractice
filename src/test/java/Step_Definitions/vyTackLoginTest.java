package Step_Definitions;
import Pages.VyTrackLogin;
import Utilities.ConfigurationReader;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class vyTackLoginTest {

    VyTrackLogin vyTrackLogin = new VyTrackLogin();

    @Given("user at login page")
    public void user_at_login_page() {

        Driver.getDriver().get(ConfigurationReader.get("vyTrack_url"));
    }
    @When("user provide {string} information")
    public void user_provide_information(String string) {
String username = null;
String password = null;

        switch (string) {
            case "driver":
                username = ConfigurationReader.get("driver_username");
                password = ConfigurationReader.get("driver_password");
                break;
            case "sales manager":
                username = ConfigurationReader.get("sales_manager_username");
                password = ConfigurationReader.get("sales_manager_password");
                break;
            case "store manager":
                username = ConfigurationReader.get("store_manager_username");
                password = ConfigurationReader.get("store_manager_password");
                break;
        }

        vyTrackLogin.usernameInput.sendKeys(username);
        vyTrackLogin.passwordInput.sendKeys(password);
        vyTrackLogin.LoginButton.click();


    }
    @Then("user should be able to login")
    public void user_should_be_able_to_login() throws InterruptedException {
       Thread.sleep(3000);
       String actualTitle= Driver.getDriver().getTitle();
       Assert.assertEquals("Dashboard",actualTitle);

    }


}

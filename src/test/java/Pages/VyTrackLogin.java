package Pages;
import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class VyTrackLogin {

    public VyTrackLogin(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"prependedInput\"]")
    public WebElement usernameInput;

    @FindBy(xpath = "//*[@id=\"prependedInput2\"]")
    public WebElement passwordInput;

    @FindBy(xpath = "//*[@id=\"_submit\"]")
    public WebElement LoginButton;



}

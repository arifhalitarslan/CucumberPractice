package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    public Login(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "/html/body/div/div[2]/div/div/form/div[1]/div/input")
    public WebElement usernameInput;

    @FindBy(xpath = "/html/body/div/div[2]/div/div/form/div[2]/div/input")
    public WebElement passwordInput;

    @FindBy(xpath = "/html/body/div/div[2]/div/div/form/button")
    public WebElement LoginButton;


}
